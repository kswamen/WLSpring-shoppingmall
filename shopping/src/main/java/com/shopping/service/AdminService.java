package com.shopping.service;

import java.util.List;

import com.shopping.domain.CategoryVO;
import com.shopping.domain.GoodsVO;

public interface AdminService {

	public List<CategoryVO> category() throws Exception;
	
	// 상품등록
	public void register(GoodsVO vo) throws Exception;
	
}
