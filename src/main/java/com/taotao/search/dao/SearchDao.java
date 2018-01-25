package com.taotao.search.dao;

import org.apache.solr.client.solrj.SolrQuery;

import com.taotao.search.pojo.SearchResult;

/**
 * 搜索dao接口
* <p>Title: SearchDao</p>  
* <p>Description: </p>  
* @author 唯  
* @date 2018-1-14
 */
public interface SearchDao {

	/**
	 * 根据查询条件获得所有搜索内容
	 * <p>Title: getAllSearch</p>  
	 * <p>Description: </p>  
	 * @param query
	 * @return
	 */
	SearchResult getAllSearch(SolrQuery query)throws Exception;
}
