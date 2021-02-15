package com.shopping.service;

import java.util.List;

import com.shopping.domain.CategoryVO;
import com.shopping.domain.GoodsVO;
import com.shopping.domain.GoodsViewVO;

public interface AdminService {

	public List<CategoryVO> category() throws Exception;
	
	// 상품등록
	public void register(GoodsVO vo) throws Exception;
	
	// 상품조회
	public List<GoodsViewVO> goodslist() throws Exception;
	
	// 상품 조회
	public GoodsViewVO goodsView(int gdsNum) throws Exception;

	// 상품 수정
	public void goodsModify(GoodsVO vo) throws Exception;

	// 상품 삭제
	public void goodsDelete(int gdsNum) throws Exception;
}
