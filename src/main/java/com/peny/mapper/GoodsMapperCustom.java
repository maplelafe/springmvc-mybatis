package com.peny.mapper;



import com.peny.po.GoodQueryVo;
import com.peny.po.Goods;
import com.peny.po.GoodsCustom;
import com.peny.po.GoodsExample;


import java.util.List;
import org.apache.ibatis.annotations.Param;
/**
 * @author acer
 *
 */
public interface GoodsMapperCustom {
   public List<GoodsCustom> findGoodsList(GoodQueryVo v);
}