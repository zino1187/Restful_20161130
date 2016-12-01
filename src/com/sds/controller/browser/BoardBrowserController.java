package com.sds.controller.browser;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.sds.domain.Board;

@Controller
public class BoardBrowserController {
	
	//UI �� �������̽��� �ִ� ������� ������ �ϴ� �������� ��û�� ���ö�..
	@RequestMapping(value="/board", method=RequestMethod.GET)
	public String selectAll(){
		System.out.println("�������� selectAll ȣ��");
		return "board/list";
	}
	
}










