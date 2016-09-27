<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<style>
.cssError {
	color: #f00;
}

.shoppingHead {
	text-align: left;
}
</style>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Online Web Store</title>
</head>
<script
	src="//ajax.googleapis.com/ajax/libs/jquery/1.11.0/jquery.min.js"></script>
<script type="text/javascript">
	$(document).ready(
			function() {
				
				$('#bttnsubmit').attr('disabled', 'disabled');
				$('input[type="text"]').keyup(
						function() {
							if (parseInt($('#firstProduct').val())
									+ parseInt($('#secondProduct').val()) > 0) {

								$('input[type="submit"]')
										.removeAttr('disabled');
							} else if (parseInt($('#firstProduct').val())
									+ parseInt($('#secondProduct').val()) == 0)
								$('#bttnsubmit').attr('disabled', 'disabled');
						});
			});
</script>
<body>
	<h3>Products Details In The Store</h3>

	<hr size="6" color="gray" />
	<c:set var="noOfProducts"
		value="${products.firstProductCount + products.secondProductCount}"></c:set>
		
	 <c:if test="${products.productSummary == null }">
		<c:if test="${noOfProducts > 0}"> 

			<table>
				<%--  <c:forEach items="${products}" var="p"> --%>
				<thead>
					<tr>
						<th>Product</th>
						<th>Availability</th>
					</tr>
				</thead>
				<tr>
					<td><c:out value="${products.firstProductName}" /></td>
					<td>: <c:out value="${products.firstProductCount}" /> left
					</td>
				</tr>
				<tr>
					<td><c:out value="${products.secondProductName}" /></td>
					<td>: <c:out value="${products.secondProductCount}" /> left
					</td>
				</tr>
			</table>

			<form:form method="POST" action="/OnlineWebStore/buyProducts"
				modelAttribute="products" id="productForm">
				<hr size="5" color="gray" />
				<table>

					<tr>
						<th class=shoppingHead>Your Shopping:</th>
					</tr>
					<tr>
						<td><c:out
								value="${products.firstProductName}" /></td>
						<td><form:input id="firstProduct"
								path="firstProductSold" /></td>
					</tr>
					<tr>
						<td><c:out
								value="${products.secondProductName}" /></td>
						<td><form:input id="secondProduct"
								path="secondProductSold" /></td>
					</tr>
					<%-- 	 </c:forEach> --%>
					<tr>
						<td><input id='bttnsubmit' type="submit" value="Buy" /></td>

					</tr>
				</table>

			</form:form>
	 	</c:if>
	</c:if> 


	<c:if
		test="${(noOfProducts == 0) && (products.productSummary == null)}">
		<div id="Error" class=cssError>Error Occured . No Products
			Available At The Store</div>
	</c:if>


	<c:if test="${products.productSummary != null}">
		<div id="divSummary">

			<table>

				<tr>
					<th class=shoppingHead>Your Shopping Summary:</th>
				</tr>

				<c:if test="${products.productSummary.firstProduct > 0 }">
					<tr>
						<td><td><c:out value="${products.firstProductName}" /></td></td>

						<td>: <c:out value="${products.productSummary.firstProduct}" /></td>

					</tr>
				</c:if>
				<c:if test="${products.productSummary.secondProduct > 0 }">
					<tr>
						<td><td><c:out value="${products.secondProductName}" /></td></td>

						<td>: <c:out value="${products.productSummary.secondProduct}" /></td>

					</tr>
				</c:if>
				<tr>
					<td><a href="/OnlineWebStore/products">Continue Shopping</a></td>
				</tr>

			</table>
		</div>
	</c:if>
</body>
</html>