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
	public String ko3(Model mo)
	{  				
		Service dao = sqlSession.getMapper(Service.class);
		ArrayList<Gift_DTO> list = dao.sanglist();		
		mo.addAttribute("list", list);		
		return "sang_list";
		
	}
	//outer상품리스트
		@RequestMapping(value="/outlist")
		public String to3(HttpServletRequest request, Model mo)
		{  				
			Service dao = sqlSession.getMapper(Service.class);
			ArrayList<Gift_DTO> list = dao.outerlist();		
			mo.addAttribute("list", list);		
			return "sang_outer";			
		}
		//top상품리스트
		@RequestMapping(value="/toplist")
		public String oo3(HttpServletRequest request, Model mo)
		{  				
			Service dao = sqlSession.getMapper(Service.class);
			ArrayList<Gift_DTO> list = dao.toplist();		
			mo.addAttribute("list", list);		
			return "sang_list";			
		}
		//bottom상품리스트
		@RequestMapping(value="/bottomlist")
		public String bo3(HttpServletRequest request, Model mo)
		{  				
			Service dao = sqlSession.getMapper(Service.class);
			ArrayList<Gift_DTO> list = dao.bottomlist();		
			mo.addAttribute("list", list);		
			return "sang_list";			
				}
	//best높은가격순
	@RequestMapping(value="/sanglist_price")
	public String ko4(Model mo)
	{  				
		Service dao = sqlSession.getMapper(Service.class);
		ArrayList<Gift_DTO> list = dao.sanglistprice();		
		mo.addAttribute("list", list);		
		return "sang_list";		
	}
	//outer높은가격순
		@RequestMapping(value="/out_price")
		public String ii4(Model mo)
		{  				
			Service dao = sqlSession.getMapper(Service.class);
			ArrayList<Gift_DTO> list = dao.sangoutprice();		
			mo.addAttribute("list", list);		
			return "sang_outer";			
		}
		//outer낮은가격순
		@RequestMapping(value="/out_dprice")
		public String i4(Model mo)
		{  				
			Service dao = sqlSession.getMapper(Service.class);
			ArrayList<Gift_DTO> list = dao.sangoutpricedown();		
			mo.addAttribute("list", list);		
			return "sang_outer";			
		}
		//outer 인기순(조회수)
		@RequestMapping(value="/out_readcnt")
		public String u6(Model mo)
		{  				
			Service dao = sqlSession.getMapper(Service.class);
			ArrayList<Gift_DTO> list = dao.sangoutread();		
			mo.addAttribute("list", list);		
			return "sang_list";		
		}
		
	//best낮은가격순
		@RequestMapping(value="/sanglist_dprice")
		public String ko5(Model mo)
		{  				
			Service dao = sqlSession.getMapper(Service.class);
			ArrayList<Gift_DTO> list = dao.sanglistpricedown();		
			mo.addAttribute("list", list);		
			return "sang_list";		
		}
		
		
	//best인기순(조회수)
		@RequestMapping(value="/sang_readcnt")
		public String ko6(Model mo)
		{  				
			Service dao = sqlSession.getMapper(Service.class);
			ArrayList<Gift_DTO> list = dao.sanglistreadcnt();		
			mo.addAttribute("list", list);		
			return "sang_list";		
		}
		
		
		
    //조회수
		public void readcnt(int giftnum)
		{
			Service dao = sqlSession.getMapper(Service.class);
			dao.readcnt(giftnum);
		}
		
	
	
}
