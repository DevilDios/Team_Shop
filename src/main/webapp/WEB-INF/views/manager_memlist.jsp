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

	<c:forEach items="${list}" var="dto">
		<tr> 
			<td><a href="manager_memmodify_form?id=${dto.id}">${dto.id}</a></td> 
			<td>${dto.name}</td> 
			<td>${dto.tel}</td> 
			<td>${dto.email}</td> 
			<td>${dto.address}</td> 
			<td><a href="manager_memdelete?id=${dto.id}">삭제</a></td>
		</tr>
	</c:forEach>

</table>

</body>
</html>