<!DOCTYPE html>

<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>

<html>
	<head>
		<meta charset="utf-8">
		<link href="<c:url value="/resources/bootstrap/css/bootstrap.min.css" />" rel="stylesheet">
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
    	<div align="right">
    		<input type="submit" class="btn btn-logout" value="ログアウト" name="">
    	</div>

		 	<input type="submit" class="btn btn-default" value="社員情報一覧表示" name="goSijGm001"
		 		style="WIDTH: 240px; HEIGHT: 35px" formaction="${actionUrl}">
		 			　　　　　　　　　　<u>社員情報を一覧表示します</u><br><br>
			<input type="submit" class="btn btn-success" value="社員情報新規登録" name="goSijGm002"
				style="WIDTH: 240px; HEIGHT: 35px" formaction="${actionUrl}">
					　　　　　　　　　　<u>社員情報の新規登録を行います</u><br><br>
			<input type="submit" class="btn btn-info" value="現場情報一覧表示" name="goGbjGm001"
				style="WIDTH: 240px; HEIGHT: 35px" formaction="${actionUrl}">
					　　　　　　　　　　<u>現場情報を一覧表示します</u><br><br>
			<input type="submit" class="btn btn-warning" value="現場情報新規登録" name="goGbjGm002"
				style="WIDTH: 240px; HEIGHT: 35px" formaction="${actionUrl}">
					　　　　　　　　　　<u>現場情報の新規登録を行います</u><br><br>
			<input type="submit" class="btn sys-kanri" value="システム管理" name="goSysComGm"
				style="WIDTH: 240px; HEIGHT: 35px" formaction="${actionUrl}">
					　　　　　　　　　　<u>システム情報を管理します</u><br><br>

    	</form:form>
	</body>
</html>
