<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>   
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<h1 style="text-align: center;">상품상세</h1>
<body onload="init();">
  
<c:forEach items="${dlist}" var="d"> 
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
   
   var test = $("select[name = giftsize]").val(); 

   alert(test+"사이즈 추가합니다");
   
   $("#appenditem").append("<li>"+test+"</li>");
}

</script> 
 <div>
 
  
  <table class="table table-hover,table-condensed,table-responsive" width="50%" align="center" >  
        
      <tr> <td rowspan="9" style="text-align: center;"><img  src="${pageContext.request.contextPath}/image/${d.giftimg}" width="300" height="300">  </td></tr>
        
       <tr><th>상품제목</th><td>${d.gifttitle}</td></tr>
       <tr><th>배송정보</th><td>대한통운</td></tr>
       <tr><th>배송비</th><td>2500원</td></tr>
       <tr><th>판매가</th><td>${d.giftprice}원</td></tr>
       
       <tr><th>필수옵션</th><td>
                              <select name="giftsize" onchange="changeitem()">
					    <option value="">사이즈선택</option>
					    <option value="S">S / ${d.giftprice} 원</option>
					    <option value="M">M / ${d.giftprice} 원</option>
					    <option value="L">L / ${d.giftprice} 원</option>
					     <option value="XL">XL / ${d.giftprice} 원</option>
					    </select>
                                </td></tr>
                             
         <tr><th>주문현황</th><td> <li id="appenditem">
							
							         </li>
							         
         </td></tr>                        
          <tr><th>총 합계금액</th>
          <td>
          <form name="form" method="post">
            
				수량 : <input type=hidden name="sell_price" value="${d.giftprice}">
				       <input type="text" name="amount" value="1" size="3" onchange="change();">
				       <input type="button" value=" + " onclick="add();"><input type="button" value=" - " onclick="del();"><br>				
				총금액 : <input type="text" name="sum" size="11" readonly>원<br>
				<p style="text-align: center;">
				   <input type="button" value="장바구니" onclick="location.href='#'">
                <input type="button" value="바로구매" onclick="location.href='order'">
                </p>
				</form>
          </td></tr>      
 
       
  </table>
	
  
  <div style="text-align: center;">
  <input type="button" value="상품목록" onclick="location.href='bestlist'">
                <input type="button" value="홈으로" onclick="location.href='index'">
  </div>
	  <p align="center" style="text-align: center;" >
	    <img  src="${pageContext.request.contextPath}/image/${d.gifttumimg}">
	  </p>
	 
 
</div>

</c:forEach>
	
</body>
 
</html>
