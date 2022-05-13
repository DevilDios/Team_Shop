<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1 align="center">회원관리</h1>


<table align="center" width="400">
	<tr> <th>id</th> <th>이름</th> <th>전화번호</th> <th>이메일</th> <th>주소</th> </tr>
	<c:forEach items="${viewAll}" var="dto">
		<tr> 
			<td><a href="manager_memmodify_form?id=${dto.id}">${dto.id}</a></td> 
			<td>${dto.name}</td> 
			<td>${dto.tel}</td> 
			<td>${dto.email}</td> 
			<td>${dto.address}</td> 
			<td><a href="manager_memdelete?id=${dto.id}">삭제</a></td>
		</tr>
	</c:forEach>
	<tr>		
		<td colspan="6" style="text-align: center;">
			<c:if test="${paging.startPage != 1 }">
				<a href="manager_memlist?nowPage=${paging.startPage - 1 }&cntPerPage=${paging.cntPerPage}">&lt;&lt;</a>
			</c:if>
			<c:forEach begin="${paging.startPage }" end="${paging.endPage }" var="p">
				<c:choose>
					<c:when test="${p == paging.nowPage}">
						<b style="font-size: 27px;">${p}</b>&emsp;
					</c:when>
					<c:when test="${p != paging.nowPage}">
						<a href="manager_memlist?nowPage=${p}&cntPerPage=${paging.cntPerPage}" style="text-decoration:none">${p }&emsp;</a>
					</c:when>
				</c:choose>
			</c:forEach>
			<c:if test="${paging.endPage != paging.lastPage}">
				<a  href="manager_memlist?nowPage=${paging.endPage+1}&cntPerPage=${paging.cntPerPage}" style="text-decoration:none">&gt;&gt;</a>
			</c:if>
		</td>
	</tr>
</table>

</body>
</html>