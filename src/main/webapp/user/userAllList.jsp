<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta name="description" content="">
<meta name="author" content="">
<title>Jsp - iks</title>
<link rel="icon" href="https://ssl.gstatic.com/docs/documents/images/kix-favicon6.ico">
<%@ include file="../common/basicLib.jsp" %>
</head>

<body>
<%@ include file="../common/header.jsp" %>
<div class="container-fluid">
	<div class="row">
		<%@ include file="../common/left.jsp" %>
		<div class="col-sm-9 col-sm-offset-3 col-md-10 col-md-offset-2 main">
			<div class="row">
	<div class="col-sm-8 blog-main" style="width:100%;">
		<h2 class="sub-header">사용자</h2>
		<div class="table-responsive">
			<style type="text/css">
				.table > tbody > tr > th {text-align:center}
				.table > tbody > tr > td {text-align:center}
			</style>
			<table class="table table-striped">
				<tr>
					<th>번호</th>
					<th>아이디</th>
					<th>이름</th>
					<th>생일</th>
				</tr>
				<!-- userList loop 이용하여 출력 -->
				<% SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd"); %>
				<% List<UserVo> user = (List<UserVo>)request.getAttribute("userList"); %>
				<%
					int i = 1;
					for(UserVo serviceVo : user){
				%>
				<tr>
					<td><%=i++ %></td>
					<td><%=serviceVo.getUserId() %></td>
					<td><%=serviceVo.getName() %></td>
					<td><%=sdf.format(serviceVo.getBirth()) %></td>
				</tr>
				<% } %>
			</table>
		</div>

		<a class="btn btn-default pull-right">사용자 등록</a>

		<div class="text-center">
			<ul class="pagination">
				<li><a href="#">1</a></li>
				<li><a href="#">2</a></li>
				<li><a href="#">3</a></li>
				<li><a href="#">4</a></li>
				<li><a href="#">5</a></li>
			</ul>
		</div>
	</div>
</div>

		</div>
	</div>
</div>
</body>
</html>