<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<style type="text/css">
th,td{
text-align: center;
}
</style>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<h1 style="text-align: center;" > 회원가입 </h1>
<body>
<form action="membersave" method="post">
<table border="1" width="300" align="center">
<tr><th>ID</th><td><input type="text" name="id"> </td></tr>
<tr><th>PW</th><td><input type="password" name="pw"> </td></tr>
<tr><th>이름</th><td><input type="text" name="name"> </td></tr>
<tr><th>전화</th><td><input type="text" name="tel"> </td></tr>
<tr><th>이메일</th><td><input type="text" name="email"> </td></tr>
<tr><th>주소</th><td><input type="text" name="address"> </td></tr>

<tr>
<td colspan="2" style="text-align: center;">
<input type="submit" value="회원가입"> 
<input type="reset" value="취소"> 
</td>
</tr>
</table>
</form>
</body>
</html>