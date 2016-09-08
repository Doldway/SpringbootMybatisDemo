package net.iretailer.rest.dao;

import net.iretailer.rest.model.Location;

public interface LocationMapper {
    int deleteByPrimaryKey(Short id);

    int insert(Location record);

    int insertSelective(Location record);

    Location selectByPrimaryKey(Short id);

    int updateByPrimaryKeySelective(Location record);

    int updateByPrimaryKey(Location record);
}