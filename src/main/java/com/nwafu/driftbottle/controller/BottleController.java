package com.nwafu.driftbottle.controller;

import com.nwafu.driftbottle.pojo.Bottle;
import com.nwafu.driftbottle.pojo.Result;
import com.nwafu.driftbottle.service.BottleService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class BottleController {
    @Autowired
    private BottleService bottleService;

    @PostMapping("/put")
    public Result put(@RequestBody Bottle bottle){
        bottleService.put(bottle);
        return Result.sucess();
    }

    @GetMapping("/take")
    public Result take(){
        return Result.success(bottleService.take());
    }
}
