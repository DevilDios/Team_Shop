package com.mycom.team;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class BlossomController {

	@Autowired
	public SqlSession sqlSession;
	
	//유저-회원정보수정폼
	@RequestMapping(value = "/user_modify_form")
	public String user_modify()
	{
		return "user_modify_form";
	}
	
	//유저-회원정보수정
	@RequestMapping(value = "/user_modify_update")
	public String user_modify_update(Member_DTO dto)
	{
		Service dao = sqlSession.getMapper(Service.class);
		dao.setUserModify(dto.getId(), dto.getPw(), dto.getName(), dto.getTel(), dto.getEmail(), dto.getAddress());
		return "redirect: index";
	}
	
	//유저-회원탈퇴
	@RequestMapping(value = "/user_delete")
	public String user_delete(Member_DTO dto)
	{
		String id = dto.getId();
		Service dao = sqlSession.getMapper(Service.class);
		dao.userDelete(id);
		return "redirect: logout";
	}
		
	//관리자-index_header/main
	@RequestMapping(value = "/managerindex")
	public String manager()
	{
		return "managerindex";
	}

	//관리자-회원관리
	@RequestMapping(value = "/manager_memlist")
	public String memmanager(Model model)
	{
		Service dao = sqlSession.getMapper(Service.class);
		ArrayList<Member_DTO> list = dao.getMemSelectAll();
		model.addAttribute("list", list);
				
		return "manager_memlist"; 
	}
	

	//관리자-회원정보수정폼
	@RequestMapping(value = "/manager_memmodify_form")
	public String member_modify(HttpServletRequest request, Model model)
	{
		String id = request.getParameter("id");
		Service dao = sqlSession.getMapper(Service.class);
		Member_DTO dto = dao.getMemModify(id);
		model.addAttribute("dto", dto);
		return "manager_memmodify_form";
	}
	
	//관리자-회원정보삭제
	@RequestMapping(value = "/manager_memdelete")
	public String manager_memdelete(HttpServletRequest request)
	{
		String id = request.getParameter("id");
		Service dao = sqlSession.getMapper(Service.class);
		dao.memberDelete(id);
		return "redirect: manager_memlist";	
	}
	
	//관리자-회원정보수정
	@RequestMapping(value = "/manager_memmodify_update")
	public String manager_memmodify_update(Member_DTO dto)
	{
		Service dao = sqlSession.getMapper(Service.class);
		dao.setMemModify(dto.getId(), dto.getPw(), dto.getName(), dto.getTel(), dto.getEmail(), dto.getAddress());
		return "redirect: manager_memlist";
	}
			
	//로그인폼
	@RequestMapping(value = "/loginform")
	public String login()
	{
		return "loginform";
	}
			
	//로그인처리
	@RequestMapping(value = "/loginproc", method=RequestMethod.POST)
	public String loginproc(HttpServletRequest request, RedirectAttributes res)
	{	
		String id=request.getParameter("id");
		String pw=request.getParameter("pw");
		Service dao = sqlSession.getMapper(Service.class);
		Member_DTO member =dao.getLoginMember(id,pw);
			
		if(member !=null) 
		{
			HttpSession hs =request.getSession();
			hs.setAttribute("loginmember", member);
			hs.setAttribute("islogon", true);
			return "login_succeed"; 
		}
		else
		{
			res.addAttribute("result","loginfail");
			return "redirect:loginform"; 
		}	
	}
			
	//로그아웃
	@RequestMapping(value = "/logout")
	public String logout(HttpServletRequest request , Model mo) 
	{
		HttpSession hs = request.getSession();
		hs.removeAttribute("loginmember");
		hs.removeAttribute("islogon");
		return "redirect: index";		
	}
		
}
