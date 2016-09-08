package net.iretailer.rest.dao;

import net.iretailer.rest.model.SiteTag;

public interface SiteTagMapper {
    int deleteByPrimaryKey(Short id);

    int insert(SiteTag record);

    int insertSelective(SiteTag record);

    SiteTag selectByPrimaryKey(Short id);

    int updateByPrimaryKeySelective(SiteTag record);

    int updateByPrimaryKey(SiteTag record);
}