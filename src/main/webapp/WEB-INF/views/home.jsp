<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" isELIgnored="false"%>
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
			<div class="col-md-12">
				<h1 class="text-center mb-3 mt-4 text-warning">Customer Details</h1>
				<table class="table table-light">
					<thead class="thead-dark">
						<tr>
							<th scope="col">Id</th>
							<th scope="col"> Name</th>
							<th scope="col"> email </th>
							<th scope="col">number</th>
							<th scope="col">Update</th>
							<th scope="col">Delete</th>
						</tr>
					</thead>
					<tbody>
						<c:forEach items="${customer}" var="c">

							<tr class="table-light">
								<th scope="row">${c.id}</th>
								<td>${c.name}</td>
								<td class="font-weight-bold"> ${c.customerDetail.email}</td>
								<td class="font-weight-bold"> ${c.customerDetail.number}</td>
								<td> <a	href="update/${c.id}"><i
										class="fa-sharp fa-solid fa-pen-to-square text-success"></i></a></td>
								<td><a href="delete/${c.id}"><i
										class="fa-sharp fa-solid fa-trash text-danger"></i></a></td>
							</tr>
						</c:forEach>
					</tbody>
				</table>
				<div class="container text-center mb-3">
					<a href="addCustomer" class="btn btn-outline-success"> Add Customer </a>
				</div>
			</div>

		</div>
	</div>

</body>
</html>