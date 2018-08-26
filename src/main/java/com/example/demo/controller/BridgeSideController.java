package com.example.demo.controller;

import com.example.demo.entity.BridgeSide;
import com.example.demo.service.BridgeSideService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * Creator: LayWinZeng
 * CreateTime: 2018/8/21
 * Description:
 */

@RestController
public class BridgeSideController {

    @Autowired
    private BridgeSideService bridgeSideService;

    @PostMapping(value = "/importData")
    public String importData(){
        return bridgeSideService.doImportData();
    }

    @PostMapping(value = "/addData")
    public void addData(){
        bridgeSideService.doAdd();
    }

    @PostMapping(value = "/listData")
    public List<BridgeSide> listData(BridgeSide bridgeSide){
        return bridgeSideService.getData(bridgeSide);
    }

    @PostMapping(value = "/readData")
    public void readData(){
        bridgeSideService.readData();
    }

}
