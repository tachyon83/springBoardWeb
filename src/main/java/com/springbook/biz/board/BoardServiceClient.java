package com.springbook.biz.board;

import java.util.List;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class BoardServiceClient {

	public static void main(String[] args) {
		// 1. initiate Spring Container
		AbstractApplicationContext container=new GenericXmlApplicationContext("applicationContext.xml");
		
		// 2. look up BoardServiceImpl
		BoardService boardService=(BoardService)container.getBean("boardService");
		
		// 3. function test
		BoardVO vo=new BoardVO();
//		vo.setSeq(0);
		vo.setSeq(100);
		vo.setTitle("test title6");
		vo.setWriter("test writer6");
		vo.setContent("test content6");
		boardService.insertBoard(vo);
		
		List<BoardVO> boardList=boardService.getBoardList(vo);
		for(BoardVO board:boardList)System.out.println("=> "+board.toString());
		
		// 4. close Spring Container
		container.close();
	}
}
