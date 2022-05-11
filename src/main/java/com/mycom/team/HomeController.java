package com.mycom.team;

import javax.servlet.http.HttpServletRequest;

import org.apache.ibatis.session.SqlSession;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

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
	//로그인폼
	@RequestMapping(value = "/login")
	public String login()
	{
		return "login";

	}
	
}
