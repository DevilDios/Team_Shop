<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>

<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<h1 style="text-align: center;" > 회원가입 </h1>
<body>
<script type="text/javascript">
function seok () {
var myid = document.getElementById("myid");
var mypw = document.getElementById("mypw");
var myname = document.getElementById("myname");
var mytel = document.getElementById("mytel");
var myemail = document.getElementById("myemail");
var myaddress = document.getElementById("myaddress");

if ((myid.value) == ""){
    alert("아이디를 입력하지 않았습니다.");
    myid.focus();
    return false;
}
if ((mypw.value) == ""){
    alert("패스워드를 입력하지 않았습니다.");
    mypw.focus();
    return false;
}
if ((myname.value) == ""){
    alert("이름를 입력하지 않았습니다.");
    myname.focus();
    return false;
}
if ((mytel.value) == ""){
    alert("전화번호를 입력하지 않았습니다.");
    mytel.focus();
    return false;
}
if ((myemail.value) == ""){
    alert("이메일을 입력하지 않았습니다.");
    myemail.focus();
    return false;
}
if ((myaddress.value) == ""){
    alert("주소를 입력하지 않았습니다.");
    myaddress.focus();
    return false;
}
alert("회원가입이 완료되었습니다.");
}
</script>
<center>
 <div class="card align-middle" style="width:27rem; border-radius:20px;" >
   <div class="card-title" style="margin-top:30px;">
<form action="membersave" method="post" onsubmit="return seok()">
 
  <h4> 가입정보를 입력해주세요 </h4>
  <div class="row" style="text-align: center;" >
    
  <input type="text" name="id" id="myid" class="form-control input-lg" placeholder="ID" required />    
  <br>
  <input type="password" name="pw" id="mypw" class="form-control input-lg" placeholder="PW" />
  <br>
  <input type="text" name="name" id="myname" class="form-control input-lg" placeholder="Name" />
  <br>
   <input type="text" name="tel" id="mytel" class="form-control input-lg" placeholder="Tel" />
  <br>
  <input type="text" name="email" id="myemail" class="form-control input-lg" placeholder="Email" />
  <br>
  <input type="text" name="address" id="myaddress" class="form-control input-lg" placeholder="Address" />
  <br>
  <button class="btn btn-lg btn-primary btn-block signup-btn" type="submit" name="submit">회원가입</button>
  </div>
</form>

</div>
</div>
</center>
</body>
</html>