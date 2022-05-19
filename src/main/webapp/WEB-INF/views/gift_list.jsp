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

<h1 align="center">상품 관리</h1>
<body>
<div class="container">
<table class="table table-hover">
  <thead>
    <tr>
      <th scope="col" width="300" align="center">상품번호<br>(누르면 수정)</th>
      <th scope="col" width="100">상품명</th>
      <th scope="col" width="100">종류</th>
      <th scope="col" width="200">썸네일이미지</th>
      <th scope="col" width="100">가격</th>
      <th scope="col" width="200">S사이즈 재고</th>
      <th scope="col" width="200">M사이즈 재고</th>
      <th scope="col" width="200">L사이즈 재고</th>
      <th scope="col" width="200">XL사이즈 재고</th>
      <th scope="col" width="200">설명이미지</th>
      <th scope="col" width="100">삭제</th> 
    </tr>
  </thead>
  <tbody>
    <tr class="table-dark">
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
    </tr>
  </tbody>
</table>
</div>

</body>
</html>