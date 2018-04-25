package com.peny.service.impl;

import java.util.Date;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.peny.mapper.GoodsMapper;
import com.peny.mapper.GoodsMapperCustom;
import com.peny.po.GoodQueryVo;
import com.peny.po.Goods;
import com.peny.po.GoodsCustom;
import com.peny.po.GoodsExample;
import com.peny.service.GoodsService;
@Service
public class GoodsServiceImple implements GoodsService{
	
	@Autowired
	private GoodsMapperCustom goodsMapperCustom;
	@Autowired
	private GoodsMapper goodsMapper;
	
	@Override
	public List<GoodsCustom> findGoodsList(GoodQueryVo v) {
		// TODO Auto-generated method stub
		return goodsMapperCustom.findGoodsList(v) ;
	}

	@Override
	public GoodsCustom findGoodsById(int i) {
		// TODO Auto-generated method stub
		Goods g=goodsMapper.selectByPrimaryKey(i);
		GoodsCustom gc = new GoodsCustom();
		BeanUtils.copyProperties(g, gc);
		return gc;
	}

	@Override
	public boolean updateGoods(int id, GoodsCustom c) {
		// TODO Auto-generated method stub
		Boolean flag =false;
		c.setGoodsid(id);
		c.setUptime(new Date());
		int i =goodsMapper.updateByPrimaryKeyWithBLOBs(c);
		if (i>0) {
			flag=true;
		}
		return flag;
	}

}
