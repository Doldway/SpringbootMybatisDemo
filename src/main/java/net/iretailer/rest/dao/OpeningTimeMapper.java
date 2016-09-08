package net.iretailer.rest.dao;

import net.iretailer.rest.model.OpeningTime;

public interface OpeningTimeMapper {
    int deleteByPrimaryKey(Short id);

    int insert(OpeningTime record);

    int insertSelective(OpeningTime record);

    OpeningTime selectByPrimaryKey(Short id);

    int updateByPrimaryKeySelective(OpeningTime record);

    int updateByPrimaryKey(OpeningTime record);
}