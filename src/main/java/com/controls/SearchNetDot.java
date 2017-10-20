package com.controls;

import java.util.Date;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.help.ConfigConstants;
import com.help.HttpRequest;
@Controller
@RequestMapping(value = "SerachNetDot")
public class SearchNetDot {
	@ResponseBody
	@RequestMapping(value = "getNetDot", produces = "text/html;charset=UTF-8")
	public String getNetDot(HttpServletRequest httpRequest){
		String areaId = httpRequest.getParameter("area_id");
		long time = new Date().getTime();
		String param = ConfigConstants.NetMethodUrl+"&access_token="+ConfigConstants.AccessToken+"&timestamp="+time+"&area_id="+areaId;
		String result = HttpRequest.sendGet(ConfigConstants.NetInfoBaseUrl, param);
		System.out.println(result);
		return result;
	}
	@ResponseBody
	@RequestMapping(value = "getNetDotInfo", produces = "text/html;charset=UTF-8")
	public String getNetDotInfo(HttpServletRequest httpRequest){
		String areaId = httpRequest.getParameter("area_id");
		String netId = httpRequest.getParameter("net_id");
		long time = new Date().getTime();
		String param = ConfigConstants.NetInfoMethodUrl+"&access_token="+ConfigConstants.AccessToken+"&timestamp="+time+"&area_id="+areaId+"&net_id="+netId;
		String result = HttpRequest.sendGet(ConfigConstants.NetInfoBaseUrl, param);
		System.out.println(result);
		return result;
	}
}
