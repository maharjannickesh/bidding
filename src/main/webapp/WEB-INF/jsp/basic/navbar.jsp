<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<div class="header">
	Change Language <a href="?language=en">English</a> |
	<a href="?language=np">Nepali</a>
</div>
<div class="menu">
	<div class="link">
		<a href="#home">Home</a>
	</div>
	<div class="link">
		<a href="#home">User</a>
	</div>
	<div class="link">
		<a href="#home">Product</a>
	</div>
	<div class="link">
		<a href="<c:url value='j_spring_security_logout' />">Logout</a>
	</div>
</div>