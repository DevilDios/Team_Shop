package com.mycom.team;

import java.util.ArrayList;

public interface Service {
	







   /*
   public ArrayList<SangDTO> out();
   public ArrayList<SangDTO> detail(String gifttitle);  
   */


   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
  
   
   
	
	
	
   
//100 �쁺�꽍 �떆�옉   
	public void insert(String id,String pw,String name,String tel,String email,String address);
   
   
   public ArrayList<Gift_DTO> sanglist(); //�긽�뭹由ъ뒪�듃(湲곕낯 理쒖떊�닚)
   
   
   
   
   public ArrayList<Gift_DTO> sanglistprice(String part); //�긽�뭹由ъ뒪�듃(媛�寃⑸넂���닚)
   
   
   public ArrayList<Gift_DTO> sangbestprice();//best �넂��媛�寃⑹닚
   
   public ArrayList<Gift_DTO> sangbestdprice();//best �궙��媛�寃⑹닚
   
   public ArrayList<Gift_DTO> sangbestreadcnt();//best �씤湲�(議고쉶)�닚
   
   
   
   public ArrayList<Gift_DTO> sanglistpricedown(String part); //�긽�뭹由ъ뒪�듃(媛�寃⑸궙���닚)   
   
   
   public ArrayList<Gift_DTO> sanglistreadcnt(String part); //�긽�뭹由ъ뒪�듃(�씤湲곗“�쉶�닚)  
   
   
   public ArrayList<Gift_DTO> sangdetail(int giftnum); //�긽�뭹�긽�꽭蹂닿린
  
   public ArrayList<Gift_DTO> partlist(String part); 
   public void readcnt(int giftnum);//議고쉶�닔   
   
   int cntNo();
	public ArrayList<Gift_DTO> selectNo(PageVO vo);
	
	public ArrayList<Gift_DTO> ordero(String gifttitle);
	
	
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
//199 �쁺�꽍 �걹   
//200 誘쇳샇 �떆�옉
   
	public Gift_DTO getGiftModify(int giftnum);
	public void setGiftModify(int giftnum ,String gifttitle ,String giftpart ,String giftimg ,int giftprice,
			   int giftstocks,int giftstockm,int giftstockl,int giftstockxl,String gifttumimg,int readcnt);
	public void GiftDelete(int giftnum);
	public void GiftInsert(int giftnum ,String gifttitle ,String giftpart ,String giftimg ,int giftprice,
		   int giftstocks,int giftstockm,int giftstockl,int giftstockxl,String gifttumimg,int readcnt);

   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
 
	
	
	
	
	
	
	
	
	
	
	
	
	
//299 誘쇳샇 �걹 
//300 �꽦�슧 �떆�옉
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
	public ArrayList<Order_list_DTO> getOrderListDTO(String id); //join �뜲�씠�꽣 ���옣   
	public void cartUserSet(String id, int giftnum, String giftstatus, int orders, int orderm, int orderl);
	public ArrayList<Order_list_DTO> getCartListDTO(String id);
	public void cartDelete(String id, int giftnum);

	   
	   

   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
//399 �꽦�슧 �걹
   
 
   
   
   
}
















