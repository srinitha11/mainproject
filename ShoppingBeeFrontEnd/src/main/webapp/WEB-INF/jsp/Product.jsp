<%@ page language="java" contentType="text/html"%>
   
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@include file="CommonHeader.jsp" %>

</br></br>
<form action="InsertProduct" method="post">
<table  class="table table-bordered " width ="50%">
	<tr bgcolor="grey">
		<td align="center" colspan="2"><h3>Product Detail</h3></td>
	</tr>
	<tr bgcolor="lightblue">
		<td>Product Name</td>
		<td><input type="text" name="proName"/></td>
	</tr>
	<tr bgcolor="lightblue">
		<td>Product Desc</td>
		<td><textarea rows="2" cols="30" name="proDesc"></textarea></td>
	</tr>
	<tr bgcolor="lightblue">
		<td>category Id</td>
		<td><input type="text" name="catId"/></td>
	</tr>
	<tr bgcolor="lightblue">
		<td>Supplier Id</td>
		<td><textarea rows="2" cols="30" name="suppId"></textarea></td>
	</tr>
	<tr bgcolor="lightblue">
		<td>Price</td>
		<td><input type="text" name="price"/></td>
	</tr>
	
	
	<tr bgcolor="cyan">
		<td colspan="2" align="center">
			<input type="submit" value="Insert Product"/>
		</td>
	</tr>
</table>
</form>

<table  align="center" class="table">
	<tr bgcolor="pink">
		<td>Product ID</td>
		<td>Product Name</td>
		<td>Product Desc</td>
		<td>Category ID</td>
		<td>Supplier ID</td>
		<td>Price</td>
		
		<td>Operation</td>
	</tr>
	<c:forEach items="${productList}" var="product">
	<tr bgcolor="cyan">
		<td>${product.productId}</td>
		<td>${product.productName}</td>
		<td>${product.productDesc}</td>
		<td>${product.categoryId}</td>
		<td>${product.supplierId}</td>
		<td>${product.price}</td>
		<td>
			<a href="deleteProduct/${product.productId}">Delete</a>&nbsp;&nbsp;/&nbsp;&nbsp;
			<a href="editProduct/${product.productId}">Edit</a>
		</td>
	</tr>
	</c:forEach>
</table>

</body>
</html>