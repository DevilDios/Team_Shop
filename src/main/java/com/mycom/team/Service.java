package com.mycom.team;

import java.util.ArrayList;

public interface Service {
	
   public void insert(String id,String pw,String name,String tel,String email,String address);

   /*
   public ArrayList<SangDTO> out();
   public ArrayList<SangDTO> detail(String gifttitle);  
   */

   
   public void giftinsert(String giftnum ,String gifttitle ,String giftpart ,String giftimg ,String giftprice ,String giftsize,
		  					String giftstocks,String giftstockm,String giftstockl,String giftstockxl);



}
