<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">

<script src="https://code.jquery.com/jquery-3.6.0.min.js" integrity="sha256-/xUj+3OJU5yExlq6GSYGSHk7tPXikynS7ogEvDej/m4=" crossorigin="anonymous"></script>


<title>Insert title here</title>
</head>
<h1 style="text-align: center;">상품상세</h1>
<body onload="init();"> 
  <!-- 수량추가 총금액   -->
  
  
 <script language="JavaScript" >
var sell_price;
var amount;

function init () {
	sell_price = document.form.sell_price.value;
	amount = document.form.amount.value;
	document.form.sum.value = sell_price;
	change();
}

function add () {
	hm = document.form.amount;
	sum = document.form.sum;
	hm.value ++ ;

	sum.value = parseInt(hm.value) * sell_price;
}

function del () {
	hm = document.form.amount;
	sum = document.form.sum;
		if (hm.value > 1) {
			hm.value -- ;
			sum.value = parseInt(hm.value) * sell_price;
		}
}

function change () {
	hm = document.form.amount;
	sum = document.form.sum;

		if (hm.value < 0) {
			hm.value = 0;
		}
	sum.value = parseInt(hm.value) * sell_price;
} 


function changeitem() {
	
	var test = $("select[name = gitfsize]").val(); 

	alert(test+"사이즈 추가합니다");
	
	$("#appenditem").append("<li>"+test+"</li>");
}

</script> 
  <table border="0" width="800" align="center" >        
      <tr> <td rowspan="9"><img  src="./image/m-404.jpeg" width="300" height="400">  </td></tr>
        
       <tr><th>상품제목</th><td>아이유 옷</td></tr>
       <tr><th>배송정보</th><td>대한통운</td></tr>
       <tr><th>배송비</th><td>2500원</td></tr>
       <tr><th>판매가</th><td>99990원</td></tr>
       
       <tr><th>필수옵션</th><td>
                              <select name="gitfsize" onchange="changeitem()">
					    <option value="">사이즈선택</option>
					    <option value="S">S / 99990 원</option>
					    <option value="M">M / 99990 원</option>
					    <option value="L">L / 99990 원</option>
					     <option value="XL">XL / 99990 원</option>
					    </select>
                                </td></tr>
                             
         <tr><th>주문현황</th><td> <li id="appenditem">
							   
							         </li>
							         
         </td></tr>                        
          <tr><th>총 합계금액</th>
          <td>
          <form name="form" method="get">
				수량 : <input type=hidden name="sell_price" value="99990">
				       <input type="text" name="amount" value="1" size="3" onchange="change();">
				       <input type="button" value=" + " onclick="add();"><input type="button" value=" - " onclick="del();"><br>				
				총금액 : <input type="text" name="sum" size="11" readonly>원
				</form>
          </td></tr>      
          

          
          
        <tr><td colspan="2" style="text-align: center;">
                <input type="button" value="장바구니" onclick="location.href='#'">
                <input type="button" value="바로구매" onclick="location.href='#'">
            </td></tr>

    
  </table>
		 
  
  <div style="text-align: center;">
  <input type="button" value="상품목록" onclick="location.href='sanglist'">
                <input type="button" value="홈으로" onclick="location.href='index'">
  </div>
	  <p align="center" style="text-align: center;" >
	     <img  src="./image/sdetail.jpg">
	  </p>
</body>
</html>