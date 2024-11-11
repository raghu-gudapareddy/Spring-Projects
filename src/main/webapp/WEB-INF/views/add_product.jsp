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
				<h1 class="text-center mb-3 mt-3 text-warning">Fill the Item Details</h1>
				<form action="handle-product" method="post">

					<div class="form-group">
						<label for="name">Item Name </label> <input type="text"
							class="form-control" id="itemName" name="itemName"
							placeholder="Enter Your item Name">
					</div>

					<div class="form-group">
						<label for="type"> Item Type </label>
						<input type="text"class="form-control" name="type" id="type"
							 placeholder="Enter the item type">
					</div>

					<div class="form-group">
						<label for="halfprice">Half Price </label> <input type="text"
							class="form-control" id="halfprice" name="halfprice"
							placeholder="Enter Your Product Price">
					</div>
					
					<div class="form-group">
						<label for="fullprice">Full Price </label> <input type="text"
							class="form-control" id="fullprice" name="fullprice"
							placeholder="Enter Your Product Price">
					</div>

					<div class="container text-center mb-4">
						<a href="${pageContext.request.contextPath}/" class="btn btn-outline-danger"> Back </a>
						<button type="submit" class="btn btn-primary">Add Item</button>
					</div>

				</form>
			</div>
		</div>
	</div>
</body>
</html>