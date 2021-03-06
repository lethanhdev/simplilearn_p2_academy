<%@ page language="java" contentType="text/html; charset=UTF-8"    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Delete Class</title>
</head>
<body>

<%
  // check for error 
  if (request.getParameter("error") != null)
          out.println("<b>Your session has expired or is invalid. Inputs maybe null</b><br><p>");
%>

<form action="deleteClass" method="post">
<table>
	<tr>
		<th colspan="2" style="background-color:grey"><font color=white>Delete Class</font></th>
	</tr>	
	<tr>
		<td align=right>Class Name</td>
		<td><input type="text" name="className" id="className"></td>
	</tr>

	<tr>
		<td></td>
		<td>  <button>Submit</button></td>
	</tr>
</table>
  
</form>

</body>
</html>