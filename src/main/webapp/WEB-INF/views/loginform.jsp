<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body style="text-align: center;">

<%-- 
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
--%>

<%-- 
<div class="container">
  <h1>로그인</h1>
  <form action="/action_page.php">
    <div class="form-group">
      <label for="email">아이디:</label>
      <input type="text" class="form-control" id="email" placeholder="Enter ID" name="id">
    </div>
    <div class="form-group">
      <label for="pwd">비밀번호:</label>
      <input type="password" class="form-control" id="pwd" placeholder="Enter password" name="pw">
    </div>
    <div class="checkbox">
      <label><input type="checkbox" name="remember"> Remember me</label>
    </div>
    <button type="submit" class="btn btn-default">Submit</button>
  </form>
</div>
--%>












	<c:set var="result" value="${param.result}"/>
	<c:if test="${result=='loginfail'}">
		<script type="text/javascript">
			window.onload=function()
			{
				alert("아이디 또는 비밀번호가 틀렸습니다.");
			}
		</script>
	</c:if>
	
<center>
<div class="card align-middle" style="width:27rem; border-radius:20px;">
		<div class="card-title" style="margin-top:30px;">
			<h2 class="card-title text-center" style="color:#113366;">로그인</h2>
		</div>
		<div class="card-body">
      <form class="form-signin" method="POST" action="loginproc" ><%-- 예외처리용 onSubmit="logincall();return false" --%>
        <h5 class="form-signin-heading">로그인 정보를 입력하세요</h5>
        <input type="text" id="uid" class="form-control" name="id" placeholder="Your ID" required autofocus><BR>
        <input type="password" id="upw" class="form-control" name="pw" placeholder="Password" required><br>
        <div class="checkbox">
          <label>
            <input type="checkbox" value="remember-me"> 기억하기
          </label>
        </div>
        <button id="btn-Yes" class="btn btn-lg btn-primary btn-block" type="submit">로 그 인</button>
      </form>
      
		</div>
	</div>

</center>


</body>
</html>