package com.mycom.team;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;




@Controller
public class SeokController {

	@Autowired
	public SqlSession sqlSession;

	//회원가입 폼
	@RequestMapping(value = "/memberinput")
	public String memberinput()
	{
		return "member_input";
	}
	
	//회원가입완료
	@RequestMapping(value = "/membersave")
	public String membersave(HttpServletRequest request,Model mo)
	{
		Service dao = sqlSession.getMapper(Service.class);
		String id = request.getParameter("id");
		String pw = request.getParameter("pw");
		String name = request.getParameter("name");
		String tel = request.getParameter("tel");
		String email = request.getParameter("email");
		String address = request.getParameter("address");
		
		dao.insert(id,pw,name,tel,email,address);
		
		return "redirect:index";
	}
	
	//상품자세히보기	
	@RequestMapping(value="/sangdetail")
	public String sdetail(HttpServletRequest request,Model mo) {
		
		String gifttitle = request.getParameter("gifttitle");		
		Service dao = sqlSession.getMapper(Service.class);
		ArrayList<Gift_DTO> dlist = dao.sangdetail("gifttitle");
		mo.addAttribute("dlist",dlist);
		return "sang_detail";
	}
	
	//상품리스트
	@RequestMapping(value="/bestlist")
	public String ko3(Model mo)
	{  
				
		Service dao = sqlSession.getMapper(Service.class);
		ArrayList<Gift_DTO> list = dao.sanglist();		
		mo.addAttribute("list", list);
		
		return "sang_list";
		
	}

	
	
}
