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
    		<form:input path="user" />
		 	<input type="submit" class="btn btn-default" value="画面1" name="entrySijGm001" formaction="${actionUrl}">
			<input type="submit" class="btn btn-success" value="画面2" name="entrySijGm002" formaction="${actionUrl}">
			<input type="submit" class="btn btn-info" value="画面3" name="entryGbjGm001" formaction="${actionUrl}">
			<input type="submit" class="btn btn-warning" value="画面4" name="entryGbjGm002" formaction="${actionUrl}">
    	</form:form>
	</body>
</html>
