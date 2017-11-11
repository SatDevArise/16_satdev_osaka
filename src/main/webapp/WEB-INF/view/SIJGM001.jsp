<!DOCTYPE html>

<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>

<html>
<head>
<meta charset="utf-8">
<link
	href="<c:url value="/resources/bootstrap/css/bootstrap.min.css" />"
	rel="stylesheet">
<script src="<c:url value="/resources/bootstrap/js/bootstrap.min.js" />"></script>
<script src="<c:url value="/resources/js/SIJGM001.js" />"></script>
<title>SIJGM001 社員情報一覧表示画面</title>
</head>
<body>

	<p class="text-center"
		style="margin-top: 30px; font-size: xx-large;">
		社員情報一覧表示画面</p>


	<spring:url value="/initSijGm001" var="actionUrl" />

	<form:form modelAttribute="SIJGM001Form" class="text-center" style="margin-top: 30px;" >
		<input type="button" class="btn btn-default" value="検索"
			onclick="openCOMGM003();" style="margin-left: 10px;">
		<input type="submit" class="btn btn-warning" value="戻る"
			name="backComGm002" formaction="${actionUrl}" style="margin-left: 10px;">

	</form:form>

</body>
</html>
