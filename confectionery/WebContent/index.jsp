<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>CONFECTIONERY</title>
</head>
<body>
 <h2>Confectionery Details!!!!</h2>
 <form action="index" method="post">
		<table cellpadding="3pt">
			<tr>
				<td>Customer Name :</td>
				<td><input type="text" name="customerName" size="30" /></td>
			</tr>
			<tr>
				<td>Item :</td>
				<td><input type="text" name="item" size="30" /></td>
			</tr>

			<tr>
				<td>Quantity :</td>
				<td><input type="text" name="quantity" size="30" /></td>
			</tr>
			<tr>
				<td>Price Per Item :</td>
				<td><input type="text" name="pricePerItem" size="30" /></td>
			</tr>
			<tr>
				<td>Total Cost :</td>
				<td><input type="text" name="totalCost" size="30" /></td>
			</tr>
			</table>
		<p />
		<input type="submit" value="Register" />
	</form>
</body>
</html>