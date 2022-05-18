<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<style type="text/css">
th,td,div{
text-align: center;
}
</style>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<h1 style="text-align: center;" > 회원가입 </h1>
<body>
<center>
 <div class="card align-middle" style="width:27rem; border-radius:20px;" >
   <div class="card-title" style="margin-top:30px;">
<form action="membersave" method="post">
 
  <h4> 가입정보를 입력해주세요 </h4>
  <div class="row" style="text-align: center;" >
    
  <input type="text" name="id" class="form-control input-lg" placeholder="ID" />    
  <br>
  <input type="password" name="pw" class="form-control input-lg" placeholder="PW" />
  <br>
  <input type="text" name="name" class="form-control input-lg" placeholder="Name" />
  <br>
   <input type="text" name="tel" class="form-control input-lg" placeholder="Tel" />
  <br>
  <input type="text" name="email" class="form-control input-lg" placeholder="Email" />
  <br>
  <input type="text" name="address" class="form-control input-lg" placeholder="Address" />
  <br>
  <button class="btn btn-lg btn-primary btn-block signup-btn" type="submit">회원가입</button>
  </div>
</form>

</div>
</div>
</center>
</body>
</html>