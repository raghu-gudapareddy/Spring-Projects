package hotelmanagementsystem.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.hibernate.cache.spi.support.AbstractReadWriteAccess.Item;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.view.RedirectView;
import hotelmanagementsystem.dao.Itemdao;
import hotelmanagementsystem.model.Hotel;



@Controller
public class MainController {
	@Autowired
	private Itemdao itemDao;
	
	@RequestMapping("/home")
	public String viewHome(Model model) {
		List<Hotel> product=itemDao.getItems();
		model.addAttribute("item",product);
		return "home";
	}
	
	@RequestMapping("/addproduct")
	public String addProduct(Model model) {
		model.addAttribute("title","Add Your Product");
		return "add_product";
	}
	
	@RequestMapping(value="/handle-product",method=RequestMethod.POST)
	public RedirectView handleProduct(@ModelAttribute Hotel item, HttpServletRequest request){
		System.out.println(item);
		itemDao.createItem(item);
		RedirectView redirectView = new RedirectView();
		redirectView.setUrl(request.getContextPath()+"/");
		return redirectView;
	}
	
	@RequestMapping("/delete/{productId}")
	public RedirectView deleteProduct(@PathVariable("productId")int productId,HttpServletRequest request) {
		this.itemDao.deleteItem(productId);
		RedirectView redirectView = new RedirectView();
		redirectView.setUrl(request.getContextPath()+"/");
		return redirectView;
	}
	
	@RequestMapping("/update/{productId}")
	public String updateProduct(@PathVariable("productId")int pid,Model model) {
		model.addAttribute("title","Update Product");
		Hotel item=this.itemDao.getItem(pid);
		model.addAttribute("product",item);
		return "update_product";
	}
}
