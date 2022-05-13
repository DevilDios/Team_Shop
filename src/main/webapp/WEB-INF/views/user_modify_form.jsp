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

<h1 align="center">회원 정보 수정</h1>
<form action="user_modify_update" method="post">
<table border="1" width="300" align="center">
<tr><th>ID</th><td><input type="text" name="id" value="${loginmember.id}" readonly> </td></tr>
<tr><th>PW</th><td><input type="password" name="pw"> </td></tr>
<tr><th>이름</th><td><input type="text" name="name" value="${loginmember.name}"> </td></tr>
<tr><th>전화</th><td><input type="text" name="tel" value="${loginmember.tel}"> </td></tr>
<tr><th>이메일</th><td><input type="text" name="email" value="${loginmember.email}"> </td></tr>
<tr><th>주소</th><td><input type="text" name="address" value="${loginmember.address}"> </td></tr>

<tr>
<td colspan="2" style="text-align: center;">
<input type="button" onclick="location.href='index'" value="취소">
<input type="submit" value="수정"> 
</tr>

<tr>
</td>
<td colspan="2" style="text-align: center;">
<input type="button" onclick="location.href='user_delete?id=${loginmember.id}'" value="회원탈퇴">
</td>
</tr>

</table>
</form>

</body>
</html>