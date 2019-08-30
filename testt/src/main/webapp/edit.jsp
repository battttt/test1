<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8" isELIgnored="false"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>

</head>
<body>
	<c:if test="${info==null}">
		<form action="insert.action">
			<input name="name"></input> <input type="submit" value="增加"></input>
		</form>
	</c:if>
	<c:if test="${info!=null}">
		<form action="update.action">
			<input type="hidden" name="id" value="${info.id}"></input> 
			<input name="name" value="${info.name}"></input>
			<input type="submit"value="update"></input>
		</form>
	</c:if>
</body>
</html>