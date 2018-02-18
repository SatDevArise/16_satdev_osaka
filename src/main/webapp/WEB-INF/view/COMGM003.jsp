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
		<script src="<c:url value="/resources/js/COMGM003.js" />"></script>
		<title>COMGM003 検索共通画面</title>
	</head>
	<body>
	<div align="center">
		<h3>検索共通画面</h3>
		<spring:url value="/initComGm003" var="actionUrl" />
		<form:form modelAttribute="COMGM003Form">
			<table>
			<tr>
    			<td class = "tdcustom">
    				<span class = "spancustom">社員ID：</span><form:input type = "text" name = "syain_id" path = "syain_id" class="textfiled" maxlength="4"	readonly="readonly" />
				</td>
				<td class = "tdcustom">
				 	生年月日：<form:input type = "text" name = "seinengappi_from" path = "seinengappi_from" readonly="readonly" />
				 </td>
				<td class = "tdcustom">
					～&emsp;<form:input type = "text" name = "seinengappi_to" path = "seinengappi_to" readonly="readonly" />
				</td>
			</tr>
			<tr>
				<td class = "tdcustom">
    				<span class = "spancustom">前職：</span><form:input type = "text" name = "previous" path = "previous" class="textfiled" readonly="readonly"/>
    			</td>
    			<td colspan="2">
    				役職：<form:input type = "text" name = "position" path = "position" readonly="readonly"/>
    			</td>
    		</tr>
			<tr>
				<td class = "tdcustom">
    				<span class = "spancustom">入社日：</span><form:input type = "text" name = "nyusyabi_from" path = "nyusyabi_from" readonly="readonly"/>
    			</td>
				<td class = "tdcustom">
    				～&emsp;<form:input type = "text" name = "nyusyabi_to" path = "nyusyabi_to" readonly="readonly"/>
    			</td>
				<td class = "tdcustom">
    				チーム：<form:input type = "text" name = "team_na" path = "team_na" readonly="readonly"/>
    			</td>
    		</tr>
			<tr>
				<td colspan="3">
    				<span class = "spancustom">現場名：</span><form:input type = "text" name = "genba_na" path = "genba_na" />
    			</td>
    		</tr>
			<tr>
				<td class = "tdcustom">
    				<span class = "spancustom">フェーズ：</span><form:input type = "text" name = "phase" path = "phase" />
    			</td>
				<td colspan="2">
    					単価：<form:input type = "text" name = "tanka" path = "tanka" readonly="readonly"/>
    			</td>
    		</tr>
			<tr>
				<td colspan="3">
    				<span class = "spancustom">最寄り駅：</span><form:input type = "text" name = "moyori_1_station" path = "moyori_1_station" />
    				<form:input type = "text" name = "moyori_2_station" path = "moyori_2_station" />
    				<form:input type = "text" name = "moyori_3_station" path = "moyori_3_station" />
    			</td>
    		</tr>
			<tr>
				<td class = "tdcustom">
    				<span class = "spancustom">住所：</span><form:input type = "text" name = "syain_address" path = "syain_address" />
    			</td>
    		</table>
			<p class="red">
				<c:forEach var="error_hyoji" items="${COMGM003Form.error_hyoji}">
					・<c:out value="${error_hyoji}" />
					<br>
				</c:forEach>
			</p>
			<input type="submit" class="btn btn-primary" value="検索" name="searchComGm003">

			<!--隠し項目  -->
			<form:hidden name = "disp_id"  path="disp_id" />
			<!--<form:hidden name = "resultList"  path="resultList" /> -->
    	</form:form>
    	</div>
	</body>
</html>
