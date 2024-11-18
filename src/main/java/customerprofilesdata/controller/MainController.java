package customerprofilesdata.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.view.RedirectView;

import customerprofilesdata.dao.CustomerDao;
import customerprofilesdata.model.Customer;
import customerprofilesdata.model.CustomerDetails;

@Controller
public class MainController {
	
	@Autowired
	private CustomerDao customerDao;
	
	@RequestMapping("/home")
	public String ViewUsers(Model model) {
		List<Customer> customer=customerDao.getCustomers();
		model.addAttribute("customer",customer);
		return "home";
	}
	
	@RequestMapping("/addCustomer")
	public String addCustomer(Model model) {
		model.addAttribute("title","Add your Details");
		return "add_customer";
		
	}
	
	@RequestMapping(value = "/handle-customer", method = RequestMethod.POST)
	public RedirectView handleCustomer(@ModelAttribute Customer customer,HttpServletRequest request) {
		System.out.println(customer);
		customerDao.createCustomer(customer);
		RedirectView redirectView = new RedirectView();
		redirectView.setUrl(request.getContextPath()+"/");
		return redirectView;
	}
	
	@RequestMapping("/delete/{customerId}")
	public RedirectView deleteCustomer(@PathVariable("customerId") int customerId, HttpServletRequest request) {
		this.customerDao.deleteCustomer(customerId);
		RedirectView redirectView = new RedirectView();
		redirectView.setUrl(request.getContextPath() + "/");
		return redirectView;
		
	}
	
	@RequestMapping("/update/{customerId}")
	public String updateCustomer(@PathVariable("customerId")int cid,Model model) {
		model.addAttribute("title","Update Customer");
		Customer customer=this.customerDao.getCustomer(cid);
		model.addAttribute("customer",customer);
		return "update_customer";
	}
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
