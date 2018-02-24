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
		<script src="<c:url value="/resources/js/SIJGM002.js" />"></script>
		<title>SIJGM002 社員情報新規登録・編集画面</title>
	</head>
	<body>
	    <spring:url value="/initSijGm002" var="actionUrl"/>
    	<form:form modelAttribute="SIJGM002Form">
    		<form:input path="user" />
    		<input type="submit" class="btn btn-default" value="新規登録" name="entrySijGm002" formaction="${actionUrl}">
    		<input type="submit" class="btn btn-success" value="更新" name="updateSijGm002" formaction="${actionUrl}">
    		<input type="submit" class="btn btn-success" value="削除" name="deleteSijGm002" formaction="${actionUrl}">
    		<input type="submit" class="btn btn-info" value="戻る" name="backComGm002" formaction="${actionUrl}">
    		<input type="submit" class="btn btn-warning" value="戻る" name="backSijGm001" formaction="${actionUrl}">
    		<p>社員ID：<form:input path="syain_id" type = "text" name = "社員ID" maxlength="4"/></p>
			<p>氏名：<form:input path="name" type = "text" name = "氏名" maxlength="20"/>
			   生年月日：<form:input path="birth" type ="text" name = "生年月日" maxlength="8"/></p>
    		<p>最寄り駅：<form:input path="moyori_1_station" type = "text" name = "最寄り駅" maxlength="10"/>
    					 <form:input path="moyori_2_station" type = "text" name = "最寄り駅2" maxlength="10"/>
    					 <form:input path="moyori_3_station" type = "text" name = "最寄り駅3" maxlength="10"/></p>
    		<p>連絡先：<form:input path ="phoneNumber" type = "text" name = "連絡先" maxlength="10"/></p>
    		<p>前職：<form:input path="previous" type = "text" name = "前職" maxlength="20"/>
    		   	出身地：<form:input path="birth_place" type = "text" name = "出身地" maxlength="20"/></p>
    		<p>役職：<form:input path="position" type = "text" name = "役職" maxlength="2"/>
    		   入社日：<form:input path="nyusya_dt" type = "text" name = "入社日" maxlength="10"/></p>
    		<p>チーム：<form:input path ="team_na" type = "text" name = "チーム" maxlength="30"/></p>
    		<p>フェーズ：<form:input path="phase_kb" type = "text" name = "フェーズ" maxlength="8"/>
    		   単価：<form:input path = "tanka" type = "text" name = "単価" maxlength="5"/></p>
    		<p>現場名：<form:input path="genba_na" type = "text" name = "現場名" maxlength="30"/></p>
    		<p>参画日：<form:input path="sankaku_dt" type = "text" name = "参画日" maxlength="10"/></p>
			<p  class="red">
				<c:forEach var="error_hyoji" items="${SIJGM002Form.error_hyoji}">
					・<c:out value="${error_hyoji}" />
					<br>
				</c:forEach>
			</p>

    	</form:form>
	</body>
</html>
