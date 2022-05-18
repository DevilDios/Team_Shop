<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jstl/core_rt" prefix="c"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>글 목록</title>

</head>
<body>
	<table border="1" align = "center">
		<tr>
			<th>no</th>
			<th>상품명</th>
			<th>종류</th>
			<th>썸네일이미지</th>
			<th>가격</th>		
			<th>S사이즈 재고</th>
			<th>M사이즈 재고</th>
			<th>L사이즈 재고</th>
			<th>XL사이즈 재고</th>
			<th>설명이미지</th>
			<th>삭제</th>
		</tr>
			<c:forEach items="${list}" var="dto">
		<tr> 
			<td><a href="gift_modify_form?giftnum=${dto.giftnum}">${dto.giftnum}</a></td> 
			<td>${dto.gifttitle}</td> 
			<td>${dto.giftpart}</td> 
			<td>${dto.gifttumimg}</td>
			<td>${dto.giftprice}</td> 
			<td>${dto.giftstocks}</td> 		
			<td>${dto.giftstockm}</td> 	
			<td>${dto.giftstockl}</td> 	
			<td>${dto.giftstockxl}</td> 
			<td>${dto.giftimg}</td>
			<td><a href="gift_delete?giftnum=${dto.giftnum}">삭제</a></td>  		
		</tr>
	</c:forEach>		
	</table>
	<br>
	<a href="">글 쓰기</a>
</body>
</html>