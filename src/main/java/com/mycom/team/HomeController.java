package com.mycom.team;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.ibatis.session.SqlSession;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;


/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);

	@Autowired
	public SqlSession sqlSession;
	
	//메인
	@RequestMapping(value = "/index")
	public String index()
	{
		return "main";
	}
	
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
	
	@RequestMapping(value = "/gift_input")
	public String gift_input()
	{
		return "gift_input";
	}
	
	//상품 등록
	@RequestMapping(value = "/giftsave")
	public String giftsave(HttpServletRequest request,Model mo)
	{
		Service dao = sqlSession.getMapper(Service.class);
		String giftnum = request.getParameter("giftnum");
		String gifttitle = request.getParameter("gifttitle");
		String giftpart = request.getParameter("giftpart");
		String giftimg = request.getParameter("giftimg");
		String giftprice = request.getParameter("giftprice");
		String giftstocks = request.getParameter("giftstocks");
		String giftstockm = request.getParameter("giftstockm");
		String giftstockl = request.getParameter("giftstockl");		
		String giftstockxl = request.getParameter("giftstockxl");
		String gifttumimg = request.getParameter("gifttumimg");
		
		dao.giftinsert(giftnum, gifttitle, giftpart, giftimg, giftprice, giftstocks, giftstockm, giftstockl, giftstockxl, gifttumimg);

		return "redirect:index";
	}
	
	

	
	
	/*
	//상품리스트
	@RequestMapping(value="/sanglist")
	public String slist(HttpServletRequest request,Model mo) {	
	Service dao = sqlSession.getMapper(Service.class);
	ArrayList<SangDTO> list =  dao.out();
	mo.addAttribute("list",list);
	return "sang_list";
	}
	*/
	//상품자세히보기
	/*
	@RequestMapping(value="/sangdetail")
	public String sdetail(HttpServletRequest request,Model mo) {
		
		String gifttitle = request.getParameter("gifttitle");		
		Service dao = sqlSession.getMapper(Service.class);
		ArrayList<SangDTO> dlist = dao.detail("gifttitle");
		mo.addAttribute("dlist",dlist);
		return "sang_detail";
	}
	*/
	@RequestMapping(value = "/sangdetail")
	public String detail()
	{
		return "sang_detail";
	}
	
	

	
}














