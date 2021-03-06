<%@ page language="java" contentType="text/html; charset=UTF-8"    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Delete Instructor</title>
</head>
<body>

<%
  // check for error 
  if (request.getParameter("error") != null)
          out.println("<b>Your session has expired or is invalid. Inputs maybe null</b><br><p>");
%>

<form action="deleteInstructor" method="post">
<table>
	<tr>
		<th colspan="2" style="background-color:grey"><font color=white>Delete Instructor</font></th>
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
		<td></td>
		<td>  <button>Submit</button></td>
	</tr>
</table>
  
</form>

</body>
</html>