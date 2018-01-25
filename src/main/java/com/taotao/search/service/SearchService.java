package com.taotao.search.service;

import com.taotao.search.pojo.SearchResult;

/**
 * 搜索服务service接口
* <p>Title: SearchService</p>  
* <p>Description: </p>  
* @author 唯  
* @date 2018-1-14
 */
public interface SearchService {

	/**
	 * 根据搜索条件获得内容
	 * <p>Title: getALlSearch</p>  
	 * <p>Description: </p>  
	 * @param queryString
	 * @param page
	 * @param rows
	 * @return
	 * @throws Exception
	 */
	SearchResult getALlSearch(String queryString, int page, int rows) throws Exception;
}
