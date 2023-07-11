package com.nwafu.driftbottle.service.BottleServiceImp;

import com.nwafu.driftbottle.mapper.BottleMapper;
import com.nwafu.driftbottle.pojo.Bottle;
import com.nwafu.driftbottle.service.BottleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

import java.util.Objects;


@Service
public class BottleServiceImp implements BottleService {
    @Autowired
    private BottleMapper bottleMapper;

    @Override
    public void put(Bottle bottle){
        if(Objects.equals(bottle.getPutName(), "")||bottle.getPutName()==null)
          bottle.setPutName("#");
        bottle.setPutTime(LocalDateTime.now());
        bottle.setStatus((short)0);
        bottleMapper.insert(bottle);
    }

    @Override
    public Bottle take(){
        Bottle bottle =  bottleMapper.getNoTakeBottle();
        bottle.setTakeTime(LocalDateTime.now());
        bottle.setStatus((short)1);
        bottleMapper.update(bottle);
        return bottle;
    }
}
