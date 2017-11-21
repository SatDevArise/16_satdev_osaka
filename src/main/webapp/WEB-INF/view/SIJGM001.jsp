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
	<!-- タイトル -->
	<div align="center">
		<h1>社員情報一覧表示画面</h1>

		<spring:url value="/initSijGm001" var="actionUrl" />

		<form:form modelAttribute="SIJGM001Form" class="text-center"
			style="margin-top: 30px;">
			<input type="button" class="btn btn-default" value="検索"
				onclick="openCOMGM003();" style="margin-left: 10px;">
			<input type="submit" class="btn btn-warning" value="戻る"
				name="backComGm002" formaction="${actionUrl}"
				style="margin-left: 10px;">
		</form:form>
		<!-- 社員情報一覧表示 -->
		<table class="table table-bordered">
			<!-- ヘッダ -->
			<thead style="color: #FFFFFF; background-color: #191970;">
				<tr>
					<th>社員ID</th>
					<th>氏名</th>
					<th>役職</th>
					<th>生年月日</th>
					<th>チーム</th>
					<th>現場名</th>
					<th>経過年数</th>
					<th>フェーズ</th>
					<th>使用路線</th>
					<th>社歴</th>
					<th>単価</th>
				</tr>
			</thead>

			<!-- 明細 -->
			<tbody>
				<tr class="active">
					<th>0001</th>
					<th>河野賢資</th>
					<th>リーダー</th>
					<th>19860812</th>
					<th>デベロップメントチーム</th>
					<th>VINX</th>
					<th>1年3ヶ月</th>
					<th>PG</th>
					<th>JR学研都市線</th>
					<th>4年7か月</th>
					<th>〇〇〇</th>
				</tr>
			</tbody>
		</table>
	</div>
</body>
</html>
