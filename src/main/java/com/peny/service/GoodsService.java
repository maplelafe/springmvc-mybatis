package com.peny.service;

import java.util.List;

import com.peny.po.GoodQueryVo;
import com.peny.po.GoodsCustom;


public interface GoodsService {
	/**
	 * 多条件查询商品列表
	 * <p>Title: findGoodsList</p>  
	 * <p>Description: </p>  
	 * @param v
	 * @return
	 */
	   public List<GoodsCustom> findGoodsList(GoodQueryVo v);
	   /**
	    * 根据ID，查案讯单个商品
	    * <p>Title: findGoodsById</p>  
	    * <p>Description: </p>  
	    * @param i
	    * @return
	    */
	   public GoodsCustom findGoodsById(int i);
	   /**
	    * 更新商品
	    * <p>Title: updateGoods</p>  
	    * <p>Description: </p>  
	    * @param i
	    * @return
	    */
	   public boolean updateGoods(int id,GoodsCustom c);
}
