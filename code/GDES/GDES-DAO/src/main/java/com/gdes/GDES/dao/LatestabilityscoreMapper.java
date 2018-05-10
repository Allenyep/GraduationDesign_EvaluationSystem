package com.gdes.GDES.dao;

import com.gdes.GDES.model.Latestabilityscore;
import com.gdes.GDES.model.LatestabilityscoreExample;
import com.gdes.GDES.model.LatestabilityscoreKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface LatestabilityscoreMapper {
    long countByExample(LatestabilityscoreExample example);

    int deleteByExample(LatestabilityscoreExample example);

    int deleteByPrimaryKey(LatestabilityscoreKey key);

    int insert(Latestabilityscore record);

    int insertSelective(Latestabilityscore record);

    List<Latestabilityscore> selectByExample(LatestabilityscoreExample example);

    Latestabilityscore selectByPrimaryKey(LatestabilityscoreKey key);

    int updateByExampleSelective(@Param("record") Latestabilityscore record, @Param("example") LatestabilityscoreExample example);

    int updateByExample(@Param("record") Latestabilityscore record, @Param("example") LatestabilityscoreExample example);

    int updateByPrimaryKeySelective(Latestabilityscore record);

    int updateByPrimaryKey(Latestabilityscore record);
}