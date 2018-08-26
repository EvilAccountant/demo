package com.example.demo.dao;

import org.apache.ibatis.annotations.Param;
import java.util.List;
import com.example.demo.entity.BridgeSide;

public interface BridgeSideDao {

    int insert(@Param("pojo") BridgeSide pojo);

    int insertList(@Param("pojos") List< BridgeSide> pojo);

    List<BridgeSide> findData(@Param("pojo") BridgeSide pojo);

    int update(@Param("pojo") BridgeSide pojo);

    String findBridgeIdByNo(@Param("bridgeNo") String bridgeNo);

    String findGroupIdByField(@Param("field")String field);

    String findSideTypeByGroupIdAndName(@Param("groupId")String groupId , @Param("name") String name);

    String findTypeIdByName(@Param("name") String name);

}
