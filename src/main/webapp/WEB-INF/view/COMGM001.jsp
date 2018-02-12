<!DOCTYPE html>

<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>

<html>
	<head>
		<meta charset="utf-8">
		<link href="<c:url value="/resources/bootstrap/css/bootstrap.min.css" />" rel="stylesheet">
		<link href="${pageContext.request.contextPath}/resources/css/style.css" type="text/css" rel="stylesheet">
		<script src="<c:url value="/resources/bootstrap/js/bootstrap.min.js" />"></script>
		<script src="<c:url value="/resources/js/COMGM001.js" />"></script>
		<title>COMGM001 ログイン画面</title>
	</head>
	<body>

		<div align="center">
			<p>Arise member information management system</p>
		<h1>社員情報管理システム</h1>
		<br> <br>
		<br>
    	<form:form modelAttribute="COMGM001Form">
			<p>	ユーザーID：
				<form:input path="user_id" maxlength="8"/>
			</p>
			<p>	パスワード：
				<form:password path="password" maxlength="8"/>
			</p>
			<p  class="red">
				<c:forEach var="error_hyoji" items="${COMGM001Form.error_hyoji}">
					・<c:out value="${error_hyoji}" />
					<br>
				</c:forEach>
			</p>
			<p>
				<input type="submit" class="btn btn-primary" value="ログイン"	name="entryComGm001">
			</p>
    	</form:form>
	</div>
	</body>

</html>
