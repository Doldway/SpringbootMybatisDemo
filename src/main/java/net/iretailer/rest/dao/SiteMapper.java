package net.iretailer.rest.dao;

import net.iretailer.rest.model.Site;

public interface SiteMapper {
    int deleteByPrimaryKey(Short id);

    int insert(Site record);

    int insertSelective(Site record);

    Site selectByPrimaryKey(Short id);

    int updateByPrimaryKeySelective(Site record);

    int updateByPrimaryKey(Site record);
}