<%@page language="java" contentType="text/html"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<form action="<c:url value="${PageContext}/UpdateSupplier"/>" method="post">
<table align="center">
	<tr bgcolor="pink">
		<td align="center" colspan="2"><h3>Supplier Detail</h3></td>
	</tr>
	<tr bgcolor="cyan">
		<td>Supplier Id</td>
		<td><input type="text" name="suppId" value="${supplier.supplierId}" readonly/></td>
	</tr>
	<tr bgcolor="cyan">
		<td>Supplier Name</td>
		<td><input type="text" name="suppName" value="${supplier.supplierName}"/></td>
	</tr>
	<tr bgcolor="cyan">
		<td>Supplier Desc</td>
		<td><textarea rows="5" cols="30" name="suppDesc">${supplier.supplierDesc}</textarea></td>
	</tr>
	<tr bgcolor="pink">
		<td colspan="2" align="center">
			<input type="submit" value="UpdateSupplier"/>
		</td>
	</tr>
</table>
</form>

</body>
</html>