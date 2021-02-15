package com.shopping.service;

import java.util.List;

import com.shopping.domain.GoodsViewVO;

public interface ShopService {
	public List<GoodsViewVO> list(int cateCode, int level) throws Exception;

	public GoodsViewVO goodsView(int gdsNum) throws Exception;
}
