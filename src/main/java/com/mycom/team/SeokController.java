package com.mycom.team;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;






@Controller
public class SeokController {

	@Autowired
	public SqlSession sqlSession;

	//�쉶�썝媛��엯 �뤌
	@RequestMapping(value = "/memberinput")
	public String memberinput()
	{
		return "member_input";
	}
	
	//�쉶�썝媛��엯�셿猷�
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
	
	//�긽�뭹�옄�꽭�엳蹂닿린	
	@RequestMapping(value="/sangdetail")
	public String sdetail(HttpServletRequest request,Model mo) {
		
		int giftnum = Integer.parseInt(request.getParameter("giftnum"));		
		Service dao = sqlSession.getMapper(Service.class);
		ArrayList<Gift_DTO> dlist = dao.sangdetail(giftnum);
		readcnt(giftnum);
		mo.addAttribute("dlist",dlist);
		return "sang_detail";
	}
	
	//Best�긽�뭹由ъ뒪�듃
	@RequestMapping(value="/bestlist")
	public String ko3(HttpServletRequest request, Model mo)
	{  			
	
		Service dao = sqlSession.getMapper(Service.class);	
		ArrayList<Gift_DTO> list  = dao.sanglist();
		mo.addAttribute("list", list);		
		return "sang_list";	
	}
	
	//part由ъ뒪�듃
		@RequestMapping(value="/partlist")
		public String ko33(HttpServletRequest request, Model model) 
		{  
			ArrayList<Gift_DTO> list =null;
			Service dao = sqlSession.getMapper(Service.class);
			String part = request.getParameter("part");	
			dao.partlist(part);
			
			if(part.equals("best"))
			{
			 list  = dao.sanglist();
			}
			else
			{
			  list  = dao.partlist(part);
			}
			
			/*									
			int total = dao.cntNo();//count �뀒�씠釉� �븞�뿉 �쟾泥� �뻾 媛쒖닔 諛섑솚
			
			if (nowPage == null && cntPerPage == null) {
				nowPage = "1";
				cntPerPage = "12";
			} else if (nowPage == null) {
				nowPage = "1";
			} else if (cntPerPage == null) { 
				cntPerPage = "12";
			}
			
			vo = new PageVO(total, Integer.parseInt(nowPage), Integer.parseInt(cntPerPage));
			
			model.addAttribute("list", list);
			model.addAttribute("part",part);
			model.addAttribute("paginga", vo);
			model.addAttribute("viewAlla", dao.selectNo(vo));
			return "sang_list";	
			
			
			*/
			model.addAttribute("list", list);			
			model.addAttribute("part",part);
			
			return "sang_list";	
		}
			
		
		//part�넂��媛�寃⑹닚
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
		
		//part�궙��媛�寃⑹닚
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
		//part�씤湲곗닚(議고쉶�닔)
		@RequestMapping(value="/sang_readcnt")
		public String ko6(HttpServletRequest request, Model mo) 
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

    //議고쉶�닔
		public void readcnt(int giftnum)
		{
			Service dao = sqlSession.getMapper(Service.class);
			dao.readcnt(giftnum);
		}
		//결제 페이지 결제하는곳
		@RequestMapping(value = "/orderr",method = RequestMethod.GET)
		public String order1(HttpServletRequest re,Model mo)
		{
			//Giftimg, gifttitle, orders, orderm, orderl, ordertotalprice
			//데이터 전송해야함
			//결제하기
			Service dao = sqlSession.getMapper(Service.class);
		
			String gifttitle= re.getParameter("gifttitle");
			int giftprice = Integer.parseInt(re.getParameter("giftprice"));
			System.out.println("상품번호"+gifttitle);
			//String giftsize = re.getParameter("giftsize");
			int amount = Integer.parseInt(re.getParameter("amount"));
			String giftsize = re.getParameter("giftsize");
			int tot= amount*giftprice;
			
			String giftimg = re.getParameter("giftimg");
		     
			ArrayList<Gift_DTO> list = dao.ordero(gifttitle);
			
			mo.addAttribute("list", list);
			mo.addAttribute("amount",amount);
			mo.addAttribute("giftimg",giftimg);
			mo.addAttribute("tot",tot);
			mo.addAttribute("giftsize",giftsize);
			return "order";
		}	
		// �긽�뭹 �럹�씠吏�
		/*
		@RequestMapping("/sang_list")
		public String noticeListt(PageVO vo, Model model
				, @RequestParam(value="nowPage", required=false)String nowPage
				, @RequestParam(value="cntPerPage", required=false)String cntPerPage) 
		{
			
			Service dao = sqlSession.getMapper(Service.class);	
			ArrayList<Gift_DTO> list  = dao.sanglist();										
			int total = dao.cntNo();//count �뀒�씠釉� �븞�뿉 �쟾泥� �뻾 媛쒖닔 諛섑솚
			
			if (nowPage == null && cntPerPage == null) {
				nowPage = "1";
				cntPerPage = "12";
			} else if (nowPage == null) {
				nowPage = "1";
			} else if (cntPerPage == null) { 
				cntPerPage = "12";
			}
			
			vo = new PageVO(total, Integer.parseInt(nowPage), Integer.parseInt(cntPerPage));
			model.addAttribute("paginga", vo);
			model.addAttribute("viewAlla", dao.selectNo(vo));
						
			return "sang_list";			
		}
	*/
}
