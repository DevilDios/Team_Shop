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
	<table border="1" >
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
		</tr>
		<c:choose>
			<c:when test="${!empty GiftList}">
				<c:forEach items="${GiftList }" var="gift">
					<tr>
						<td>${gift.idx }</td>
						<td align="left"><a href="getContent.do?idx=${gift.idx }">
								${gift.title }</a></td>
						<td>${gift.writer }</td>
						<td><fmt:formatDate value="${gift.regDate }" pattern="yyyy-MM-dd"/></td>
						<td>${gift.cnt }</td>
					</tr>
				</c:forEach>
			</c:when>
			<c:otherwise>
				<tr>
					<td colspan="5">등록된 글이 없습니다.</td>
				</tr>
			</c:otherwise>
		</c:choose>
	</table>
	<br>
	<a href="moveInsertBoard.do">글 쓰기</a>
</body>
</html>