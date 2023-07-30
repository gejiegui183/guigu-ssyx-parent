package com.atguigu.ssyx.user.mapper;

import com.atguigu.ssyx.model.user.UserDelivery;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.fasterxml.jackson.databind.ser.Serializers;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDeliveryMapper extends BaseMapper<UserDelivery> {
}
