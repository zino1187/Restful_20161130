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
	//UI 필요없는 결과물을 가져가고자 하는 각종 디바이스의 경우..
	@RequestMapping(value="/board", method=RequestMethod.GET)
	@ResponseBody
	public List getList(){
		System.out.println("디바이스의 selectAll 호출");
		
		List list = new ArrayList<Board>();
		
		for(int i=0;i<10;i++){
			Board board = new Board();
			board.setBoard_id(1);
			board.setTitle("연습이네요");
			board.setWriter("철수");
			board.setContent("내용이네요");
			
			list.add(board);
		}
		
		return list;
	}
	
}










