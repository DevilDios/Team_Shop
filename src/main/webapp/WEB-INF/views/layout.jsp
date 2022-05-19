<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">

<%-- ↓↓↓부트스트랩 다른곳에서 추가no↓↓↓ --%>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
<%-- ↑↑↑부트스트랩 다른곳에서 추가no↑↑↑ --%>



<title><tiles:insertAttribute name="title" /></title>
</head>
<body>
	<div id="container">
		<div id="header"><tiles:insertAttribute name="header"/></div>
		<hr>
		<div id="content"><tiles:insertAttribute name="content"/></div>
		<div id="footer"><tiles:insertAttribute name="footer"/></div>
	</div>
</body>
</html>