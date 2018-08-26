package com.example.demo.service;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;
import com.example.demo.entity.BridgeSiteDetail;
import com.example.demo.dao.BridgeSiteDetailDao;

@Service
public class BridgeSiteDetailService {

    @Resource
    private BridgeSiteDetailDao bridgeSiteDetailDao;

    public int insert(BridgeSiteDetail pojo){
        return bridgeSiteDetailDao.insert(pojo);
    }

    public int insertList(List< BridgeSiteDetail> pojos){
        return bridgeSiteDetailDao.insertList(pojos);
    }

    public List<BridgeSiteDetail> select(BridgeSiteDetail pojo){
        return bridgeSiteDetailDao.select(pojo);
    }

    public int update(BridgeSiteDetail pojo){
        return bridgeSiteDetailDao.update(pojo);
    }

}
