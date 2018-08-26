package com.example.demo.dao;

import org.apache.ibatis.annotations.Param;
import java.util.List;
import com.example.demo.entity.BridgeSite;

public interface BridgeSiteDao {

    int insert(@Param("pojo") BridgeSite pojo);

    int insertList(@Param("pojos") List< BridgeSite> pojo);

    List<BridgeSite> select(@Param("pojo") BridgeSite pojo);

    int update(@Param("pojo") BridgeSite pojo);

}
