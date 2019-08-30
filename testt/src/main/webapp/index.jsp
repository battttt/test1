<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8" isELIgnored="false"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
<script type="text/javascript">
	function del(id) {
		if (confirm("是否删除？")) {
			open("delete.action?id=" + id, "_self");
		}
	}
</script>
</head>
<body>
	<a href="edit.action">增加</a>
	<form action="index.action">
		<input name="txt"></input> <input type="submit" value="查询"></input>
	</form>
	<td>id</td>&nbsp&nbsp
	<td>name</td>
	</br>
	<c:forEach items="${list}" var="row">
		<td>${row.id}</td>&nbsp&nbsp<td>${row.name}</td>
		<td><a href="javascript:del(${row.id})">删除</a>
		<a href="edit.action?id=${row.id}">修改</a></td> 
		</br>
	</c:forEach>
</body>
</html>