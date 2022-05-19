package com.mycom.team;

import java.util.ArrayList;

public interface Service {
	







   /*
   public ArrayList<SangDTO> out();
   public ArrayList<SangDTO> detail(String gifttitle);  
   */


   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
  
   
   
	
	
	
   
//100 영석 시작   
	public void insert(String id,String pw,String name,String tel,String email,String address);
   
   
   public ArrayList<Gift_DTO> sanglist(); //상품리스트(기본 최신순)
   
   
   
   
   public ArrayList<Gift_DTO> sanglistprice(String part); //상품리스트(가격높은순)
   
   
   public ArrayList<Gift_DTO> sangbestprice();//best 높은가격순
   
   public ArrayList<Gift_DTO> sangbestdprice();//best 낮은가격순
   
   public ArrayList<Gift_DTO> sangbestreadcnt();//best 인기(조회)순
   
   
   
   public ArrayList<Gift_DTO> sanglistpricedown(String part); //상품리스트(가격낮은순)   
   
   
   public ArrayList<Gift_DTO> sanglistreadcnt(String part); //상품리스트(인기조회순)  
   
   
   public ArrayList<Gift_DTO> sangdetail(int giftnum); //상품상세보기
  
   
   public ArrayList<Gift_DTO> partlist(String part); 
   public void readcnt(int giftnum);//조회수   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
//199 영석 끝   
//200 민호 시작
   
	public Gift_DTO getGiftModify(int giftnum);
	public void setGiftModify(int giftnum ,String gifttitle ,String giftpart ,String giftimg ,int giftprice,
			   int giftstocks,int giftstockm,int giftstockl,int giftstockxl,String gifttumimg,int readcnt);
	public void GiftDelete(int giftnum);
	public void GiftInsert(int giftnum ,String gifttitle ,String giftpart ,String giftimg ,int giftprice,
		   int giftstocks,int giftstockm,int giftstockl,int giftstockxl,String gifttumimg,int readcnt);

   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
 
	
	
	
	
	
	
	
	
	
	
	
	
	
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
	public void setGiftOrder(String id, int giftnum, String orderstatus, int orders, int orderm, int orderl);
	public ArrayList<Order_list_DTO> getOrderListDTO(String id); //join 데이터 저장   
	public void cartUserSet(String id, int giftnum, String giftstatus, int orders, int orderm, int orderl);
	public ArrayList<Order_list_DTO> getCartListDTO(String id);
	public void cartDelete(String id, int giftnum);

	   
	   

   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
//399 성욱 끝
   
 
   
   
   
}
















