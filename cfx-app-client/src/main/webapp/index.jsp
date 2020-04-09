<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
</head>
<body>
	<%
		fr.insa.service.Product product = (new fr.insa.client.MyClass()).getResult();
	fr.insa.client.ProductSearch products = new fr.insa.client.ProductSearch();
	%>

	<div>
		Product Id :<%= product.getProductId()%></div>
	<div>
		Product Name :<%= product.getProductName()%></div>
	<div>
		Product Cat :<%= product.getProductCatg()%></div>
	<div>
		List[Product] :<%= products.getResult("Bannana","Fruits")%></div>
</body>
</html>