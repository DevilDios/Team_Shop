package com.mycom.team;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class MinhoController {

	@Autowired
	public SqlSession sqlSession;
	
}