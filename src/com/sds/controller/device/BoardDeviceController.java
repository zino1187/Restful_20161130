package com.sds.controller.device;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.sds.domain.Board;

@Controller
public class BoardDeviceController {
	//UI �ʿ���� ������� ���������� �ϴ� ���� ����̽��� ���..
	@RequestMapping(value="/board", method=RequestMethod.GET)
	@ResponseBody
	public List getList(){
		System.out.println("����̽��� selectAll ȣ��");
		
		List list = new ArrayList<Board>();
		
		for(int i=0;i<10;i++){
			Board board = new Board();
			board.setBoard_id(1);
			board.setTitle("�����̳׿�");
			board.setWriter("ö��");
			board.setContent("�����̳׿�");
			
			list.add(board);
		}
		
		return list;
	}
	
}










