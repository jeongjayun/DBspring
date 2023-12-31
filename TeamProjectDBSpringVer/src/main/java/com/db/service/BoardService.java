package com.db.service;

import java.util.List;

import com.db.model.BoardVO;
import com.db.model.Criteria;


public interface BoardService {
	
	//게시판 등록
		public void enroll(BoardVO board);
		
		//게시판 목록
		public List<BoardVO> getList();
		
		//게시판 조회
		public BoardVO getPage(int num);
		
		//게시판 수정
		public int modify(BoardVO board);
	 

		//게시판 삭제
		public int delete(int num);

		//게시판 목록(페이징)
		public List<BoardVO>getListPaging(Criteria cri);
		
		/* 게시판 총 갯수 */
		public int getTotal(Criteria cri);	
		

		// 게시판 조회수 업데이트
		public void updateReadCount(int num);
		
		//댓글 수 
		public int getReplyCount(int num);
		
		
		
	
		
	
}
