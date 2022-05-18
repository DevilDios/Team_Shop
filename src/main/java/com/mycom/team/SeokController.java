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
		
		int giftnum = Integer.parseInt(request.getParameter("giftnum"));		
		Service dao = sqlSession.getMapper(Service.class);
		ArrayList<Gift_DTO> dlist = dao.sangdetail(giftnum);
		readcnt(giftnum);
		mo.addAttribute("dlist",dlist);
		return "sang_detail";
	}
	
	//Best상품리스트
	@RequestMapping(value="/bestlist")
	public String ko3(HttpServletRequest request, Model mo)
	{  			
	
		Service dao = sqlSession.getMapper(Service.class);	
		ArrayList<Gift_DTO> list  = dao.sanglist();
		mo.addAttribute("list", list);		
		return "sang_list";	
	}
	
	//part리스트
		@RequestMapping(value="/partlist")
		public String ko33(HttpServletRequest request, Model mo)
		{  
			ArrayList<Gift_DTO> list =null;
			Service dao = sqlSession.getMapper(Service.class);	
			String part = request.getParameter("part");
			if(part.equals("best"))
			{
			 list  = dao.sanglist();
			}
			else
			{
			  list  = dao.partlist(part);
			}
			
			mo.addAttribute("list", list);
			mo.addAttribute("part",part);
			return "sang_list";	
		}
			
		
		//part높은가격순
		@RequestMapping(value="/sanglist_price")
		public String ko4(HttpServletRequest request, Model mo)
		{  	
			ArrayList<Gift_DTO> list =null;
			String part = request.getParameter("part");			
			Service dao = sqlSession.getMapper(Service.class);			
			
			if(part.equals("best"))
			{
			 list  = dao.sangbestprice();
			}
			else
			{
			 list = dao.sanglistprice(part);	
			}
			mo.addAttribute("list", list);	
			mo.addAttribute("part",part);
			return "sang_list";		
		}
		
		//part낮은가격순
		@RequestMapping(value="/sanglist_dprice")
		public String ko5(HttpServletRequest request,Model mo)		
		{  	
			ArrayList<Gift_DTO> list =null;
			String part = request.getParameter("part");				
			Service dao = sqlSession.getMapper(Service.class);
			
			if(part.equals("best"))
			{
				 list = dao.sangbestdprice();
			}
			else
			{
				list = dao.sanglistpricedown(part);
			}
			mo.addAttribute("list", list);	
			mo.addAttribute("part",part);
			return "sang_list";		
		}
		//part인기순(조회수)
		@RequestMapping(value="/sang_readcnt")
		public String ko6(HttpServletRequest request,Model mo)
		{  	
			ArrayList<Gift_DTO> list = null;	
		String part = request.getParameter("part");		
		Service dao = sqlSession.getMapper(Service.class);		
		if(part.equals("best"))
		{
			list = dao.sangbestreadcnt();
		}
		else
		{
			list = dao.sanglistreadcnt(part);
		}
		mo.addAttribute("list", list);	
		mo.addAttribute("part",part);
		return "sang_list";		
		}

		
		
		
		
    //조회수
		public void readcnt(int giftnum)
		{
			Service dao = sqlSession.getMapper(Service.class);
			dao.readcnt(giftnum);
		}
		
	
	
}
