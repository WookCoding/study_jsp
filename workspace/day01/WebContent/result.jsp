<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>        
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<c:set var="number1" value="${param.numberFirst}"/>
	<c:set var="number2" value="${param.numberSecond}"/>
	<h1>
		<c:out value="${number1}"/> + <c:out value="${number2}"/> = ${number1 + number2}
	</h1>
</body>
</html>