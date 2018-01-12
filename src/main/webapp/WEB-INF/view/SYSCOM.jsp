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
		<title>SYSCOM システム管理メニュー画面</title>
	</head>
	<body>
	   <spring:url value="/initSysComGm" var="actionUrl"/>
    	<form:form modelAttribute="SYSCOMForm">
    	<div align="center">
    		<h1>システム管理メニュー画面</h1>
    	</div>
    	<div align="right">
    		<input type="submit" class="btn btn-logout" value="メニューに戻る" name="goComGm002">
    	</div>

		 	<input type="submit" class="btn btn-default" value="ユーザーマスタ登録" name="goSysComGm001"
		 		style="WIDTH: 240px; HEIGHT: 35px" formaction="${actionUrl}">
		 			　　　　　　　　　　<u>ユーザーを登録します</u><br><br>
			<input type="submit" class="btn btn-success" value="お知らせマスタ登録" name=""
				style="WIDTH: 240px; HEIGHT: 35px" formaction="${actionUrl}">
					　　　　　　　　　　<u>お知らせ情報を登録します</u><br><br>
			<input type="submit" class="btn btn-info" value="路線マスタ登録" name=""
				style="WIDTH: 240px; HEIGHT: 35px" formaction="${actionUrl}">
					　　　　　　　　　　<u>路線情報を登録します</u><br><br>
			<!--  <input type="submit" class="btn btn-warning" value="現場情報新規登録" name=""
				style="WIDTH: 240px; HEIGHT: 35px" formaction="${actionUrl}">
					　　　　　　　　　　<u>現場情報の新規登録を行います</u><br><br>
			<input type="submit" class="btn sys-kanri" value="システム管理" name=""
				style="WIDTH: 240px; HEIGHT: 35px" formaction="${actionUrl}">
					　　　　　　　　　　<u>システム情報を管理します</u><br><br>-->

    	</form:form>
	</body>
</html>
