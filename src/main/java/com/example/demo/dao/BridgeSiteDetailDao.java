package com.example.demo.dao;

import org.apache.ibatis.annotations.Param;
import java.util.List;
import com.example.demo.entity.BridgeSiteDetail;

public interface BridgeSiteDetailDao {

    int insert(@Param("pojo") BridgeSiteDetail pojo);

    int insertList(@Param("pojos") List< BridgeSiteDetail> pojo);

    List<BridgeSiteDetail> select(@Param("pojo") BridgeSiteDetail pojo);

    int update(@Param("pojo") BridgeSiteDetail pojo);

}
