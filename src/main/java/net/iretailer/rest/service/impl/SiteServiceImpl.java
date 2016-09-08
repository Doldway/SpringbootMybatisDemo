package net.iretailer.rest.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import net.iretailer.rest.dao.SiteMapper;
import net.iretailer.rest.model.Site;
import net.iretailer.rest.service.SiteService;

@Service
public class SiteServiceImpl implements SiteService {
	
	@Autowired
	private SiteMapper siteMapper;
	
	@Override
	public Site testSelect(Short id) {
		return siteMapper.selectByPrimaryKey(id);
	}
	
}
