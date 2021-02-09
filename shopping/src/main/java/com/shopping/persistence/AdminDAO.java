package com.shopping.persistence;

import java.util.List;

import com.shopping.domain.CategoryVO;
import com.shopping.domain.GoodsVO;

public interface AdminDAO {
	
	// 카테고리
	public List<CategoryVO> category() throws Exception;

	public void register(GoodsVO vo) throws Exception;
}