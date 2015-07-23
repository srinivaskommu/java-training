<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<style>
table, th, td {
text-align:center;
    border: 1px solid black;
    border-collapse: collapse;
}
th,td {
    padding: 15px;
}
</style>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Welcome</title>
</head>
<body>
<form>
<title>Welcome to srini schools</title>
<form action="welcomeServlet">

<table border="1" style="width:100%">

 <caption>Course Details </caption>
  <tr>
    <th>coursename </th>
    
    <th>courseid</th>
    <th>professorname></th>
  </tr>
    <td><input  type="text" name="coursename" value=""/></td>
    <td><input type="text" name="courseid" value=""/></td>
    <td><input type="text" name="professorname" value=""/></td><br><br>
    
</table>
<table border="1" style="width":100%>

<caption>Professor Details </caption>
  <tr>
    <th> name</th>
    <th>Professorid</th>
    <th> subjectid></th>
  </tr>
    <td><input type="text" name="name" value=""/></td>
    <td><input type="text" name="professorid" value=""/></td> 
    <td><input type="text" name="subjectid" value=""/></td>
  </tr>
 </table>
Submit : <input type ="submit" value="submit"/>
</form>
</body>
</html>