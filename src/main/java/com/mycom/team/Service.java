package com.mycom.team;

import java.util.ArrayList;

public interface Service {
	
   public void insert(String id,String pw,String name,String tel,String email,String address);
   public ArrayList<Member_DTO> getMemSelectAll();
   public Member_DTO getMemModify(String id);
   public void setMemModify(String id, String pw, String name, String tel, String email, String address);
   public void memberDelete(String id);
   public Member_DTO getLoginMember(String id, String pw);
   public void setUserModify(String id, String pw, String name, String tel, String email, String address);
   public void userDelete(String id);



   

}
