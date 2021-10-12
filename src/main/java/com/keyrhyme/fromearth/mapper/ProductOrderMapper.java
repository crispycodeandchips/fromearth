package com.keyrhyme.fromearth.mapper;

import com.keyrhyme.fromearth.model.Order;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface ProductOrderMapper {
        Order selectOrderById();
}
