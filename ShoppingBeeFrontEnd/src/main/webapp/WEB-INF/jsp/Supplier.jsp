<%@ page language="java" contentType="text/html"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@include file="CommonHeader.jsp" %>
<form action="InsertSupplier" method="post">
<table  class="table table-bordered " width ="50%">
	<tr bgcolor="grey">
		<td align="center" colspan="2"><h3>Supplier Detail</h3></td>
	</tr>
	<tr bgcolor="lightblue">
		<td>Supplier Name</td>
		<td><input type="text" name="suppName"/></td>
	</tr>
	<tr bgcolor="lightblue">
		<td>Supplier Desc</td>
		<td><textarea rows="5" cols="30" name="suppDesc"></textarea></td>
	</tr>
	<tr bgcolor="cyan">
		<td colspan="2" align="center">
			<input type="submit" value="Insert Supplier"/>
		</td>
	</tr>
</table>
</form>

<table  align="center" class="table">
	<tr bgcolor="pink">
		<td>Supplier ID</td>
		<td>Supplier Name</td>
		<td>Supplier Desc</td>
		<td>Operation</td>
	</tr>
	<c:forEach items="${supplierList}" var="supplier">
	<tr bgcolor="cyan">
		<td>${supplier.supplierId}</td>
		<td>${supplier.supplierName}</td>
		<td>${supplier.supplierDesc}</td>
		<td>
			<a href="deleteSupplier/${supplier.supplierId}">Delete</a>&nbsp;&nbsp;/&nbsp;&nbsp;
			<a href="editSupplier/${supplier.supplierId}">Edit</a>
		</td>
	</tr>
	</c:forEach>
</table>

</body>
</html>
</html>