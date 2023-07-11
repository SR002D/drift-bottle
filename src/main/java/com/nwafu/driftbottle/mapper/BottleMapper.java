package com.nwafu.driftbottle.mapper;

import com.nwafu.driftbottle.pojo.Bottle;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface BottleMapper {

    void insert(Bottle bottle);

    Bottle getNoTakeBottle();

    void update(Bottle bottle);
}
