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
				<h1 class="text-center mb-3 mt-3 text-warning">Update customer Details</h1>
				<form action="${pageContext.request.contextPath}/handle-customer" method="post" >
                  <div class="form-group">
                    <input type="hidden" value="${customer.id}" name="id" class="form-control" >
                   </div> 
					<div class="form-group">
						<label for="name"> Name </label> <input type="text"
							class="form-control" id="name" name="name"
							placeholder="Enter Your  Name" value="${customer.name}">
					</div>
					<div class="form-group">
						 <input type="hidden" class="form-control" name="customerDetail.id" id="customerDetail.id"
							placeholder="Enter the type" value="${customer.customerDetail.id}">
					</div>
					<div class="form-group">
						<label for="email"> email </label>
						 <input type="text" class="form-control" name="customerDetail.email" id="customerDetail.email"
							placeholder="Enter the type" value="${customer.customerDetail.email}">
					</div>
					<div class="form-group">
						<label for="number">  </label>
						 <input type="text" class="form-control" name="customerDetail.number" id="customerDetail.number"
							placeholder="Enter the type" value="${customer.customerDetail.number}">
					</div>

					<div class="container text-center mb-4">
						<a href="${pageContext.request.contextPath}/" class="btn btn-outline-danger"> Back </a>
						<button type="submit" class="btn btn-danger">Update customer</button>
					</div>

				</form>
			</div>
		</div>
	</div>

</body>
</html>