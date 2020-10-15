<%@page language="java" contentType="text/html"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<form action="<c:url value="${PageContext}/UpdateProduct"/>" method="post">
<table align="center">
	<tr bgcolor="pink">
		<td align="center" colspan="2"><h3>Product Detail</h3></td>
	</tr>
	<tr bgcolor="cyan">
		<td>Product Id</td>
		<td><input type="text" name="proId" value="${product.productId}" readonly/></td>
	</tr>
	<tr bgcolor="cyan">
		<td>Product Name</td>
		<td><input type="text" name="proName" value="${product.productName}"/></td>
	</tr>
	<tr bgcolor="cyan">
		<td>Product Desc</td>
		<td><textarea rows="5" cols="30" name="proDesc">${product.productDesc}</textarea></td>
	</tr>
	<tr bgcolor="cyan">
		<td>Category Id</td>
		<td><input type="text" name="catId" value="${product.categoryId}" readonly/></td>
	</tr>
	<tr bgcolor="cyan">
		<td>Supplier Id</td>
		<td><input type="text" name="suppId" value="${product.supplierId}"/></td>
	</tr>
	<tr bgcolor="cyan">
		<td>price</td>
		<td><textarea rows="2" cols="30" name="price">${product.price}</textarea></td>
	</tr>
	<tr bgcolor="pink">
		<td colspan="2" align="center">
			<input type="submit" value="UpdateProduct"/>
		</td>
	</tr>
</table>
</form>

</body>
</html>