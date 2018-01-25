package com.taotao.search.mapper;

import java.util.List;

import com.taotao.search.pojo.Item;

/**
 * solr 获得商品信息mapper
* <p>Title: ItemMapper</p>  
* <p>Description: </p>  
* @author 唯  
* @date 2018-1-14
 */
public interface ItemMapper {

    List<Item> getItemAll();
}
