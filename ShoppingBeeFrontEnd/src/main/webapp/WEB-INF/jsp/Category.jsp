<%@page language="java" contentType="text/html"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@include file="CommonHeader.jsp" %>

</br></br>
<form action="InsertCategory" method="post">
<table  class="table table-bordered " width ="50%">
	<tr bgcolor="grey">
		<td align="center" colspan="2"><h3>Category Detail</h3></td>
	</tr>
	<tr bgcolor="lightblue">
		<td>Category Name</td>
		<td><input type="text" name="catName"/></td>
	</tr>
	<tr bgcolor="lightblue">
		<td>Category Desc</td>
		<td><textarea rows="5" cols="30" name="catDesc"></textarea></td>
	</tr>
	<tr bgcolor="cyan">
		<td colspan="2" align="center">
			<input type="submit" value="Insert Category"/>
		</td>
	</tr>
</table>
</form>

<table  align="center" class="table">
	<tr bgcolor="pink">
		<td>Category ID</td>
		<td>Category Name</td>
		<td>Category Desc</td>
		<td>Operation</td>
	</tr>
	<c:forEach items="${categoryList}" var="category">
	<tr bgcolor="cyan">
		<td>${category.categoryId}</td>
		<td>${category.categoryName}</td>
		<td>${category.categoryDesc}</td>
		<td>
			<a href="deleteCategory/${category.categoryId}">Delete</a>&nbsp;&nbsp;/&nbsp;&nbsp;
			<a href="editCategory/${category.categoryId}">Edit</a>
		</td>
	</tr>
	</c:forEach>
</table>

</body>
</html>