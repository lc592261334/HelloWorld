package com.controls;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.daos.test.DataSearch;


@Controller
@RequestMapping(value="DataConnection")
public class DataConnection {
	@Autowired
	private DataSearch dataSearch;
	@ResponseBody
	@RequestMapping(value="countDownload")
	public String countDownload() {
		return dataSearch.count();
	}
	@ResponseBody
	@RequestMapping(value="testMongoDB")
	public String testMongoDB() {
		return dataSearch.testMongoDB();
	}
	
}
