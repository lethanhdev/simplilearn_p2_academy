<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<style>
table, th, td {
  border: 0px solid grey;
  border-collapse: collapse;
}
</style>

<meta charset="UTF-8">
<title>Dashboard: Learner's Academy</title>
</head>
<body>
	<table> 
	<tr>
		<td></td>
		<td></td>
		<td><a href="logout">logout</a></td>
		</tr>
	</table>
	<h2 style="color:teal">Administrator Management</h2>
	<hr></hr>
	<h4>Instructors  : <a href=addInstructor.jsp>add</a>, <a href=deleteInstructor.jsp>delete</a>, <a href=viewInstructor>view</a></h4>	
	<h4>Students    : <a href=addStudent.jsp>add</a>, <a href=deleteStudent.jsp>delete</a>, <a href=viewStudent>view</a></h4>
	<h4>Classes     : <a href=addClass.jsp>add</a>, <a href=deleteClass.jsp>delete</a>, <a href=viewClass>view</a></h4>
	<h4>Subjects    : <a href=addSubject.jsp>add</a>, <a href=deleteSubject.jsp>delete</a>, <a href=viewSubject>view</a></h4>
	<h4>Teaching Assignments : <a href=teach.jsp>Instructor to Class</a></h4>
	<h4>Learning Assignments : <a href=learn.jsp>Student to Class</a></h4>
	<h4>Class Report: <a href=viewTeach>Instructors' Assigned Classes-Subjects</a></h4>
	<h4>Class Report: <a href=viewLearn>Students' Assigned Classes</a></h4>
</body>
</html>