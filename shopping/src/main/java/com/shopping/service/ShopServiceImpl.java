package com.shopping.service;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.shopping.domain.GoodsViewVO;
import com.shopping.persistence.ShopDAO;

@Service
public class ShopServiceImpl implements ShopService {

	@Inject 
	private ShopDAO dao;
	
	@Override
	public List<GoodsViewVO> list(int cateCode, int level) throws Exception {
		 int cateCodeRef = 0;  // 카테고리 참조 코드. 없어도 무관
		 
		 if(level == 1) {  
		  
		  cateCodeRef = cateCode;
		  return dao.list(cateCode, cateCodeRef);
		  // 두가지 모두 cateCode로 해도 무관
		  
		 } else {  
		  return dao.list(cateCode);
		 }
	}

	@Override
	public GoodsViewVO goodsView(int gdsNum) throws Exception {
		return dao.goodsView(gdsNum);
	}

}
