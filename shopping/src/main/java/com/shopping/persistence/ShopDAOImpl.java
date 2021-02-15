package com.shopping.persistence;

import java.util.HashMap;
import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.shopping.domain.GoodsViewVO;

@Repository
public class ShopDAOImpl implements ShopDAO {

	@Inject
	private SqlSession sql;
	
	private static String namespace = "com.shopping.mappers.shopMapper";

	@Override
	public List<GoodsViewVO> list(int cateCode, int cateCodeRef) throws Exception {
		HashMap<String, Object> map = new HashMap<String, Object>();
		
		map.put("cateCode",  cateCode);
		map.put("cateCodeRef", cateCodeRef);
		
		return sql.selectList(namespace + ".list_1", map);
	}
	
	@Override
	public List<GoodsViewVO> list(int cateCode) throws Exception {
		return sql.selectList(namespace + ".list_2", cateCode);
	}

	@Override
	public GoodsViewVO goodsView(int gdsNum) throws Exception {
		return sql.selectOne("com.shopping.mappers.adminMapper" + ".goodsView", gdsNum);
	}

}
