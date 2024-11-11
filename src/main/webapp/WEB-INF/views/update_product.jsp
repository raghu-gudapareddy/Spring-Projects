<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false" %>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<%@include file="./base.jsp"%>
</head>
<body>
	<div class="container mt-5 bg-light">
		<div class="row">
			<div class="col-md-6 offset-md-3">
				<h1 class="text-center mb-3 mt-3 text-warning">Update Item Details</h1>
				<form action="${pageContext.request.contextPath}/handle-product" method="post" >
                  <div class="form-group">
                    <input type="hidden" value="${product.sno}" name="id"class="form-control" >
                   </div> 
					<div class="form-group">
						<label for="itemName">item Name </label> <input type="text"
							class="form-control" id="itemName" name="itemName"
							placeholder="Enter Your item Name" value="${product.itemName}">
					</div>

					<div class="form-group">
						<label for="type"> item type </label>
						 <input type="text" class="form-control" name="type" id="type"
							placeholder="Enter the type" value="${product.type}">
					</div>

					<div class="form-group">
						<label for="halfprice">Half Price </label> <input type="text"
							class="form-control" id="halfprice" name="halfprice"
							placeholder="Enter half Price" value="${product.halfprice}">
					</div>
					
					<div class="form-group">
						<label for="fullprice">full Price </label> <input type="text"
							class="form-control" id="fullprice" name="fullprice"
							placeholder="Enter full Price" value="${product.fullprice}">
					</div>

					<div class="container text-center mb-4">
						<a href="${pageContext.request.contextPath}/" class="btn btn-outline-danger"> Back </a>
						<button type="submit" class="btn btn-danger">Update item</button>
					</div>

				</form>
			</div>
		</div>
	</div>

</body>
</html>