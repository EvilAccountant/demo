package com.example.demo.service;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;
import com.example.demo.entity.BridgeSite;
import com.example.demo.dao.BridgeSiteDao;

@Service
public class BridgeSiteService {

    @Resource
    private BridgeSiteDao bridgeSiteDao;

    public int insert(BridgeSite pojo){
        return bridgeSiteDao.insert(pojo);
    }

    public int insertList(List< BridgeSite> pojos){
        return bridgeSiteDao.insertList(pojos);
    }

    public List<BridgeSite> select(BridgeSite pojo){
        return bridgeSiteDao.select(pojo);
    }

    public int update(BridgeSite pojo){
        return bridgeSiteDao.update(pojo);
    }

}
