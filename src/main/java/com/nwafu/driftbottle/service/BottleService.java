package com.nwafu.driftbottle.service;

import com.nwafu.driftbottle.pojo.Bottle;


public interface BottleService {

    void put(Bottle bottle);

    Bottle take();
}
