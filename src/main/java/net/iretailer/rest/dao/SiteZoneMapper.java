package net.iretailer.rest.dao;

import net.iretailer.rest.model.SiteZone;

public interface SiteZoneMapper {
    int deleteByPrimaryKey(Short id);

    int insert(SiteZone record);

    int insertSelective(SiteZone record);

    SiteZone selectByPrimaryKey(Short id);

    int updateByPrimaryKeySelective(SiteZone record);

    int updateByPrimaryKey(SiteZone record);
}