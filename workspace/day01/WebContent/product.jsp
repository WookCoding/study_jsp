<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>     
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>실습 -1</title>
</head>
<body>
	<h1>상품명 :<c:out value ="${param.name}"/></h1>
	<h1>상품가격 :<c:out value ="${param.price}"/></h1>
</body>
</html>