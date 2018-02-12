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
		<script src="<c:url value="/resources/js/COMGM002.js" />"></script>
		<title>COMGM002 メニュー画面</title>
	</head>
	<body>
	   <spring:url value="/initComGm002" var="actionUrl"/>
    	<form:form modelAttribute="COMGM002Form">
    	<div align="center">
    		<h1>メニュー画面</h1>
    	</div>
		<br>
		<div align="right" style="margin-right: 20px;">
			<input type="submit" class="btn btn-danger" value="ログアウト" name="goComGm001" formaction="${actionUrl}" onClick="return logout();">
		</div>
		<br>
		<div class="doubleBox">
			<c:forEach var="news" items="${COMGM002Form.news}">
				・<c:out value="${news.osirase_info}" />
				<br>
			</c:forEach>
		</div>
		<br>
		<br>
		<br>
		<div align="left"  style="margin-left: 20%;">
			<input type="submit" class="btn btn-primary" value="社員情報一覧表示" name="goSijGm001" style="WIDTH: 240px; HEIGHT: 50px" formaction="${actionUrl}">
			<span style="text-decoration: underline; margin-left: 200px;">社員情報を一覧表示します</span>
			<br>
		    <br>
			<br>
			<input type="submit" class="btn btn-primary" value="社員情報新規登録" name="goSijGm002" style="WIDTH: 240px; HEIGHT: 50px" formaction="${actionUrl}">
			<span style="text-decoration: underline; margin-left: 200px;">社員情報の新規登録を行います</span>
			<br>
			<br>
			<br>
			<input type="submit" class="btn btn-primary" value="現場情報一覧表示" name="goGbjGm001" style="WIDTH: 240px; HEIGHT: 50px" formaction="${actionUrl}">
			<span style="text-decoration: underline; margin-left: 200px;">現場情報を一覧表示します</span>
			<br>
			<br>
			<br>
			<input type="submit" class="btn btn-primary" value="現場情報新規登録" name="goGbjGm002" style="WIDTH: 240px; HEIGHT: 45px" formaction="${actionUrl}">
			<span style="text-decoration: underline; margin-left: 200px;">現場情報の新規登録を行います</span>
			<br>
			<br>
			<br>
			<input type="submit" class="btn btn-primary" value="システム管理" name="goSysComGm" style="WIDTH: 240px; HEIGHT: 50px" formaction="${actionUrl}">
			<span style="text-decoration: underline; margin-left: 200px;">管理者用画面です</span>
    	</div>
    	</form:form>
	</body>
</html>
