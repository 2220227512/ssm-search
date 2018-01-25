package com.taotao.search.controller;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.taotao.common.pojo.TaotaoResult;
import com.taotao.common.utils.ExceptionUtil;
import com.taotao.search.pojo.SearchResult;
import com.taotao.search.service.SearchService;

@Controller
public class SearchController {
	//请求url localhost:8083/search/query?q=手机&page=1&rows=10
	@Autowired
	private SearchService searchService;
	
	@RequestMapping(value="/query", method=RequestMethod.GET)
	@ResponseBody
    public TaotaoResult search(@RequestParam(value="q")String queryString,
		@RequestParam(defaultValue="1")int page,
		@RequestParam(defaultValue="60")int rows){
	//查询条件不能为空
	if(StringUtils.isBlank(queryString)){
		return TaotaoResult.build(400, "查询条件不能为空");
	}
	
	SearchResult Searchresult=null;
	try {
		queryString=new String(queryString.getBytes("iso8859-1"),"utf-8");
		Searchresult = searchService.getALlSearch(queryString, page, rows);
	} catch (Exception e) {
		
		e.printStackTrace();
		System.out.println("contro 500");
		return TaotaoResult.build(500, ExceptionUtil.getStackTrace(e));
	}
	return TaotaoResult.ok(Searchresult);
}
	
}
