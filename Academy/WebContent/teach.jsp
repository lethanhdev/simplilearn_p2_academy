<%@ page language="java" contentType="text/html; charset=UTF-8"    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Teaching Assignment Class</title>
</head>
<body>
<div align="center">

<form action="teach" method="post">
<table>
	<tr>
		<th colspan="2" style="background-color:tomato"><font color=white>Teaching Assignment</font></th>
	</tr>	
	<tr>
		<td align=right>Instructor FIRST Name</td>
		<td><input type="text" name="firstName" id="firstName"></td>
	</tr>
	<tr>
		<td align=right>Class Name</td>
		<td><input type="text" name="className" id="className"></td>
	</tr>
		<tr>
		<td align=right>Subject Name</td>
		<td><input type="text" name="subjectName" id="subjectName"></td>
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