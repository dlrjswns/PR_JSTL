<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<ol>
<c:forTokens var="v" items="23234-1231-123123-123213-1321-123" delims="-">
	<li>${v}</li>
</c:forTokens>
</ol>
</body>
</html>