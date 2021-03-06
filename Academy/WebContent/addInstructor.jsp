<%@ page language="java" contentType="text/html; charset=UTF-8"    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Add Instructor</title>
</head>
<body>
<div align="center">

<form action="addInstructor" method="post">
<table>
	<tr>
		<th colspan="2" style="background-color:tomato"><font color=white>Add Instructor</font></th>
	</tr>	
	<tr>
		<td align=right>First Name</td>
		<td><input type="text" name="firstName" id="firstName"></td>
	</tr>
	<tr>
		<td align=right>Last Name</td>
		<td><input type="text" name="lastName" id="lastName"></td>
	</tr>
	<tr>
		<td align=right>UserName</td>
		<td><input type="text" name="username" id="username"></td>
	</tr>
	<tr>
		<td align=right>Password</td>
		<td><input type="text" name="password" id="password"></td>
	</tr>
		<tr>
		<td align=right>Address</td>
		<td><input type="text" name="address" id="address"></td>
	</tr>
	<tr>
		<td align=right>Contact No</td>
		<td><input type="text" name="contact" id="contact"></td>
	</tr>
	<tr>
		<td></td>
		<td>  <button>Submit</button></td>
	</tr>
</table>
  
</form>

</div>
</body>
</html>