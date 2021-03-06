package com.shopping.persistence;

import java.util.List;

import com.shopping.domain.GoodsViewVO;
import com.shopping.domain.ReplyListVO;
import com.shopping.domain.ReplyVO;


public interface ShopDAO {

	public List<GoodsViewVO> list(int cateCode, int cateCodeRef) throws Exception;

	public List<GoodsViewVO> list(int cateCode) throws Exception;
	
	public GoodsViewVO goodsView(int gdsNum) throws Exception;
	
	public void registReply(ReplyVO reply) throws Exception;
	
	public List<ReplyListVO> replyList(int gdsNum) throws Exception;

	public String idCheck(int repNum) throws Exception;
	
	public void deleteReply(ReplyVO reply) throws Exception;
	
	public void modifyReply(ReplyVO reply) throws Exception;
}
