<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>

<style type="text/css">
input[type=text] {
	width: 27rem;
	margin : 0px auto;
}
</style>
<meta charset="UTF-8">
<title>상품</title>
</head>
<body>

<div class="form-group">
<form action="Gift_Insert" method="post" enctype="multipart/form-data" align="center">

  <label class="col-form-label" for="inputDefault">상품코드(수정불가)</label>
  <input type="text" class="form-control" placeholder="ex)14" id="giftnum">
    <label class="col-form-label" for="inputDefault">상품명(필수)</label>
  <input type="text" class="form-control" placeholder="" id="gifttitle">
    <label class="col-form-label" for="inputDefault">상품분류</label>
  <input type="text" class="form-control" placeholder="반팔,맨투맨" id="giftpart">
    <label class="col-form-label" for="inputDefault">썸네일 이미지</label>
  <input type="text" class="form-control" placeholder="" id="gifttumimg">
    <label class="col-form-label" for="inputDefault">가격</label>
  <input type="text" class="form-control" placeholder="숫자만 적으세요 ex)5000" id="giftprice">
    <label class="col-form-label" for="inputDefault">S사이즈재고</label>
  <input type="text" class="form-control" placeholder="" id="giftstocks">   
  <label class="col-form-label" for="inputDefault">M사이즈재고</label>
  <input type="text" class="form-control" placeholder="" id="giftstockm">    
  <label class="col-form-label" for="inputDefault">L사이즈재고</label>
  <input type="text" class="form-control" placeholder="" id="giftstockl">    
  <label class="col-form-label" for="inputDefault">XL사이즈재고</label>
  <input type="text" class="form-control" placeholder="" id="giftstockxl">    
  <label class="col-form-label" for="inputDefault">설명 이미지 추가</label>
  <input type="text" class="form-control" placeholder="" id="giftimg">
  <button type="submit" class="btn btn-primary">등록하기</button>
  </form>
</div>
<a href="index">메인화면</a>
</body>
</html>