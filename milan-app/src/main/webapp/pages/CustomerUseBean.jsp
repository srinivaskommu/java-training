<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

	<jsp:useBean id="customer" class="com.milan.sym.domain.Customer" scope="page"></jsp:useBean>

	<jsp:setProperty property="firstName" name="customer" />

	You have enterted below details:
	<br>
	<jsp:getProperty property="firstName" name="customer" /><br>
	<jsp:getProperty property="lastName" name="customer" /><br>
	<jsp:getProperty property="isAMember" name="customer" /><br>
	<jsp:getProperty property="memberType" name="customer" /><br>


</body>
</html>