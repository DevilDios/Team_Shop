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


<%-- 
<h1 align="center">${dto.id} 회원 정보 수정</h1>
<form action="manager_memmodify_update" method="post">
<table border="1" width="300" align="center">
<tr><th>ID</th><td><input type="text" name="id" value="${dto.id}" readonly> </td></tr>
<tr><th>PW</th><td><input type="password" name="pw"> </td></tr>
<tr><th>이름</th><td><input type="text" name="name" value="${dto.name}"> </td></tr>
<tr><th>전화</th><td><input type="text" name="tel" value="${dto.tel}"> </td></tr>
<tr><th>이메일</th><td><input type="text" name="email" value="${dto.email}"> </td></tr>
<tr><th>주소</th><td><input type="text" name="address" value="${dto.address}"> </td></tr>

<tr>
<td colspan="2" style="text-align: center;">
<input type="button" onclick="location.href='manager_memlist'" value="취소">
<input type="submit" value="수정"> 
</td>
</tr>
</table>
</form>
--%>






<center>
<h1>회원 정보 수정</h1>
 <div class="card align-middle" style="width:27rem; border-radius:20px;" >
   <div class="card-title" style="margin-top:30px;">
   
<form action="manager_memmodify_update" method="post">
 
  <h4> 원하시는 정보를 수정해 주세요. </h4>
  <div class="row" style="text-align: center;" >

  <input type="text" name="id" value="${dto.id}" readonly class="form-control input-lg" placeholder="ID" />
  <br>
  <input type="password" name="pw"  class="form-control input-lg" placeholder="PW" />
  <br>
  <input type="text" name="name" value="${dto.name}" class="form-control input-lg" placeholder="Name" />
  <br>
   <input type="text" name="tel" value="${dto.tel}" class="form-control input-lg" placeholder="Tel" />
  <br>
  <input type="text" name="email" value="${dto.email}" class="form-control input-lg" placeholder="Email" />
  <br>
  <input type="text" name="address" value="${dto.address}" class="form-control input-lg" placeholder="Address" />
  <br>
  <button class="btn btn-lg btn-primary btn-block signup-btn" type="submit">수정</button>
  </div>
</form>

</div>
</div>
</center>













</body>
</html>