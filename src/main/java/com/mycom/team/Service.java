package com.mycom.team;

import java.util.ArrayList;

public interface Service {
	
   public void insert(String id,String pw,String name,String tel,String email,String address);






   /*
   public ArrayList<SangDTO> out();
   public ArrayList<SangDTO> detail(String gifttitle);  
   */

   public void giftinsert(int giftnum ,String gifttitle ,String giftpart ,String giftimg ,int giftprice,
		   int giftstocks,int giftstockm,int giftstockl,int giftstockxl,String gifttumimg);


   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
  
   
   
   
   
   
   
   
//100 영석 시작   
   
   
   
   public ArrayList<Gift_DTO> sanglist(); //상품리스트(기본 최신순)
   public ArrayList<Gift_DTO> sanglistprice(); //상품리스트(가격높은순)
   public ArrayList<Gift_DTO> sanglistpricedown(); //상품리스트(가격낮은순)
   public ArrayList<Gift_DTO> sanglistreadcnt(); //상품리스트(인기조회순)
   public ArrayList<Gift_DTO> sangdetail(int giftnum); //상품상세보기
   public ArrayList<Gift_DTO> outerlist(); //상품리스트(Outer list)
   public ArrayList<Gift_DTO> toplist(); //상품리스트(Outer list)
   public ArrayList<Gift_DTO> bottomlist(); //상품리스트(Outer list)
   public ArrayList<Gift_DTO> sangoutprice(); //outer 높은가격순(Outer list)
   public ArrayList<Gift_DTO> sangoutpricedown(); //outer 낮은가격순(Outer list)
   public ArrayList<Gift_DTO> sangoutread(); //outer 조회순(Outer list)
   public void readcnt(int giftnum);//조회수   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
//199 영석 끝   
//200 민호 시작
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
    
   
//299 민호 끝 
//300 성욱 시작
	public ArrayList<Member_DTO> getMemSelectAll();
	public Member_DTO getMemModify(String id);
	public void setMemModify(String id, String pw, String name, String tel, String email, String address);
	public void memberDelete(String id);
	public Member_DTO getLoginMember(String id, String pw);
	public void setUserModify(String id, String pw, String name, String tel, String email, String address);
	public void userDelete(String id);   
	int cntNotice();
	public ArrayList<Member_DTO> selectNotice(PageVO vo);
<<<<<<< HEAD
	public void setGiftOrder(String id, int giftnum, String orderstatus, int orders, int orderm, int orderl);
	public ArrayList<Order_list_DTO> getOrderListDTO(String id); //join 데이터 저장   
=======
	public void setOrder(String id, Gift_DTO dto);
	public void setOrder(String id, String giftnum, String orderstatus, String gifts, String giftm, String giftl);






	
>>>>>>> 5dc21212afe90b5e6eef080f67e3733aa5ffe77e
	   
	   

   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
//399 성욱 끝
   
 
   
   
   
}
















