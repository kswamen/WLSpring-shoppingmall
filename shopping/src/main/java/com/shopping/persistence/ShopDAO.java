package com.shopping.persistence;

import java.util.List;

import com.shopping.domain.GoodsViewVO;


public interface ShopDAO {

	public List<GoodsViewVO> list(int cateCode, int cateCodeRef) throws Exception;

	public List<GoodsViewVO> list(int cateCode) throws Exception;
	
	public GoodsViewVO goodsView(int gdsNum) throws Exception;
}
