<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<%@include file="./base.jsp" %>
</head>
<body>
	<div class="container mt-5 bg-light">
		<div class="row">
			<div class="col-md-6 offset-md-3">
				<h1 class="text-center mb-3 mt-3 text-warning">Fill the customer Details</h1>
				<form action="handle-customer" method="post">
					
					<div class="form-group">
						<label for="id"> id </label> <input type="text"
							class="form-control" id="id" name="id"
							placeholder="Enter Your id">
					</div>
					
					<div class="form-group">
						<label for="name"> Name </label> <input type="text"
							class="form-control" id="name" name="name"
							placeholder="Enter Your Name">
					</div>
					
					<div class="form-group">
						<label for="id"> Customer Details Id </label>
						<input type="text"class="form-control" name="customerDetail.id" id="customerDetail.id"
							 placeholder="Enter the Customer Details Id">
					</div>
					
					<div class="form-group">
						<label for="email"> email </label>
						<input type="text"class="form-control" name="customerDetail.email" id="customerDetail.email"
							 placeholder="Enter the email">
					</div>

					<div class="form-group">
						<label for="number"> number </label> <input type="text"
							class="form-control" id="customerDetail.number" name="customerDetail.number"
							placeholder="Enter Your number">
					</div>
					

					<div class="container text-center mb-4">
						<a href="${pageContext.request.contextPath}/" class="btn btn-outline-danger"> Back </a>
						<button type="submit" class="btn btn-primary">Add Customer</button>
					</div>

				</form>
			</div>
		</div>
	</div>
</body>
</html>