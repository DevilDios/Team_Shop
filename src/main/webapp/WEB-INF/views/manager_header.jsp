<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<style type="text/css">
div.container-fluid{
 	text-align: center;
	font-size: 20px;
}
.navbar .navbar-nav {
	text-align: center;
  	display: inline-block;
  	vertical-align: bottom;
  	float: none;
}


</style>
<title>Insert title here</title>
</head>
<header>

<%-- 
<nav class="navbar navbar-expand-sm bg-dark navbar-dark">
  <div class="container-fluid">
    <ul class="navbar-nav">
      <li class="nav-item">
        <a class="nav-link active" href="gift_input">상품 등록</a>
      </li>&emsp;&emsp;&emsp;
      <li class="nav-item">
        <a class="nav-link active" href="gift_list">상품 관리</a>
      </li>&emsp;&emsp;&emsp;
      <li class="nav-item">
        <a class="nav-link active" href="#">매출액</a>
      </li>&emsp;&emsp;&emsp;
      <li class="nav-item">
        <a class="nav-link active" href="manager_memlist">회원 관리</a>
      </li>&emsp;&emsp;&emsp;
      <li class="nav-item">
        <a class="nav-link active" href="index">홈으로</a>
      </li>
    </ul>
  </div>
</nav>
--%>

<nav class="navbar navbar-inverse" >
  <div class="container-fluid" >
    <ul class="nav navbar-nav">
      <li><a href="gift_input"><span class="glyphicon glyphicon-pencil"></span>  상품 등록&emsp;&emsp;&emsp;</a></li>
      <li><a href="gift_list"><span class="glyphicon glyphicon-list-alt"></span>  상품 관리&emsp;&emsp;&emsp;</a></li>
      <li><a href="manager_memlist"><span class="glyphicon glyphicon-user"></span>  회원 관리&emsp;&emsp;&emsp;</a></li>
      <li><a href="managerindex"><span class="glyphicon glyphicon-wrench"></span>  관리자 페이지로&emsp;&emsp;&emsp;</a></li>
      <li><a href="index"><span class="glyphicon glyphicon-home"></span>홈화면으로&emsp;&emsp;&emsp;</a></li>
    </ul>
  </div>
</nav>


</header>
</html>
