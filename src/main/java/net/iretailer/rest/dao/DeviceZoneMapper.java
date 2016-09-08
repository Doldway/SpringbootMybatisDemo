package net.iretailer.rest.dao;

import net.iretailer.rest.model.DeviceZone;

public interface DeviceZoneMapper {
    int deleteByPrimaryKey(Short id);

    int insert(DeviceZone record);

    int insertSelective(DeviceZone record);

    DeviceZone selectByPrimaryKey(Short id);

    int updateByPrimaryKeySelective(DeviceZone record);

    int updateByPrimaryKey(DeviceZone record);
}