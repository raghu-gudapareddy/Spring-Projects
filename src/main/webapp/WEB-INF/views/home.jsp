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
				<h1 class="text-center mb-3 mt-4 text-warning">Hotel Menu Card</h1>
				<table class="table table-light">
					<thead class="thead-dark">
						<tr>
							<th scope="col">S.NO</th>
							<th scope="col">item Name</th>
							<th scope="col">Item Type</th>
							<th scope="col">Half Price</th>
							<th scope="col">Full Price</th>
							<th scope="col">Action</th>
						</tr>
					</thead>
					<tbody>
						<c:forEach items="${item}" var="p">

							<tr class="table-light">
								<th scope="row">${p.sno}</th>
								<td>${p.itemName}</td>
								<td>${p.type}</td>
								<td class="font-weight-bold">&#x20B9; ${p.halfprice}</td>
								<td class="font-weight-bold">&#x20B9; ${p.fullprice}</td>
								<td><a href="delete/${p.sno}"><i
										class="fa-sharp fa-solid fa-trash text-danger"></i></a> <a
									href="update/${p.sno}"><i
										class="fa-sharp fa-solid fa-pen-to-square text-success"></i></a></td>
							</tr>
						</c:forEach>
					</tbody>
				</table>
				<div class="container text-center mb-3">
					<a href="addproduct" class="btn btn-outline-success"> Add
						Item </a>
				</div>
			</div>

		</div>
	</div>

</body>
</html>