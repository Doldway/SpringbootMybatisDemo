package net.iretailer.rest.controller;

import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import net.iretailer.rest.model.Site;
import net.iretailer.rest.service.SiteService;

@RestController
public class BusinessSettingController {
	
	@Autowired
	private SiteService siteService;
	
	@RequestMapping(value="/test",method= RequestMethod.GET)
	public String test(@Param(value = "id") Short id){
		Site site = siteService.testSelect(id);
		return site.getDisplayName();
	}
}
