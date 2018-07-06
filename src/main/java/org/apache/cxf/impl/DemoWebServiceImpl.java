package org.apache.cxf.impl;


import org.apache.cxf.DemoWebservice;
import org.springframework.beans.factory.annotation.Autowired;

import com.peny.po.GoodsCustom;
import com.peny.service.GoodsService;

public class DemoWebServiceImpl implements DemoWebservice{

	@Autowired
	private GoodsService goodsserice;
	
	@Override
	public String queryBaseTx() {
		// TODO Auto-generated method stub
		return "queryBaseTx";
	}

	@Override
	public String queryBaseTxById(Integer id) {
		// TODO Auto-generated method stub
		GoodsCustom goods=goodsserice.findGoodsById(id);
		return "queryBaseTxById";		
	}
	
}
