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

	<c:set var="result" value="${param.result}"/>
	<c:if test="${result=='loginfail'}">
		<script type="text/javascript">
			window.onload=function()
			{
				alert("아이디 또는 비밀번호가 틀렸습니다.");
			}
		</script>
	</c:if>

<form action="loginproc" method="post" align="center">
	아이디 <input type="text" name="id"><br>
	비밀번호 <input type="text" name="pw"><br>
	<input type="button" value="reset"> &emsp;
	<input type="submit" value="login">
</form>

</body>
</html>