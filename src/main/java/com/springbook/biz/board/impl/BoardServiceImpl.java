package com.springbook.biz.board.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springbook.biz.board.BoardService;
import com.springbook.biz.board.BoardVO;

@Service("boardService")
public class BoardServiceImpl implements BoardService{
	@Autowired
//	private BoardDAO boardDAO;
	private BoardDAOSpring boardDAO;
	
	public void insertBoard(BoardVO vo) {
//		System.out.println(vo.getSeq());
//		if(vo.getSeq()==0)throw new IllegalArgumentException("[Error]: (error in boardServiceImp) seq=0 cannot be accepted.");
		boardDAO.insertBoard(vo);	
//		boardDAO.insertBoard(vo);	
	}

	public void updateBoard(BoardVO vo) {
		boardDAO.updateBoard(vo);
	}

	public void deleteBoard(BoardVO vo) {
		boardDAO.deleteBoard(vo);
	}

	public BoardVO getBoard(BoardVO vo) {
		return boardDAO.getBoard(vo);
	}

	public List<BoardVO> getBoardList(BoardVO vo) {
		return boardDAO.getBoardList(vo);
	}
}
