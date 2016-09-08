package net.iretailer.rest.dao;

import net.iretailer.rest.model.RSitezoneDevicezone;

public interface RSitezoneDevicezoneMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(RSitezoneDevicezone record);

    int insertSelective(RSitezoneDevicezone record);

    RSitezoneDevicezone selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(RSitezoneDevicezone record);

    int updateByPrimaryKey(RSitezoneDevicezone record);
}