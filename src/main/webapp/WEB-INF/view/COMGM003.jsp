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
		<script src="<c:url value="/resources/js/COMGM003.js" />"></script>
		<title>COMGM003 検索共通画面</title>
	</head>
	<body>
	   <spring:url value="/initComGm003" var="actionUrl"/>
    	<form:form modelAttribute="COMGM003Form">
    		<form:input path="user" />
  			<!--
    		<p>社員ID：<input type = "text" name = "連絡先"> 生年月日：<input type = "text" name = "生年月日">～<input type = "text" name = "生年月日"></p>
    		<p>前職：<input type = "text" name = "前職"> 役職：<input type = "text" name = "役職"></p>
    		<p>入社日：<input type = "text" name = "入社日">～<input type = "text" name = "入社日1"> チーム：<input type = "text" name = "チーム"</p>
    		<p>現場名：<input type = "text" name = "現場名"></p>
    		<p>フェーズ：<input type = "text" name = "フェーズ"></p> 単価：<input type = "text" name = "単価"></p>
    		<p>最寄り駅：<input type = "text" name = "最寄り駅"> <input type = "text" name = "最寄り駅"> <input type = "text" name = "最寄り駅"></p>
    		<p>住所：<input type = "text" name = "住所"></p>
    		-- >
		 	<input type="submit" class="btn btn-default" value="検索" name="searchComGm003">
    	</form:form>
	</body>
</html>
