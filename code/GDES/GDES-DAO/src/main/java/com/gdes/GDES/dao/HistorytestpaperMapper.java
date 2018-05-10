package com.gdes.GDES.dao;

import com.gdes.GDES.model.Historytestpaper;
import com.gdes.GDES.model.HistorytestpaperExample;
import com.gdes.GDES.model.HistorytestpaperKey;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface HistorytestpaperMapper {
    long countByExample(HistorytestpaperExample example);

    int deleteByExample(HistorytestpaperExample example);

    int deleteByPrimaryKey(HistorytestpaperKey key);

    int insert(Historytestpaper record);

    int insertSelective(Historytestpaper record);

    List<Historytestpaper> selectByExampleWithBLOBs(HistorytestpaperExample example);

    List<Historytestpaper> selectByExample(HistorytestpaperExample example);

    Historytestpaper selectByPrimaryKey(HistorytestpaperKey key);

    int updateByExampleSelective(@Param("record") Historytestpaper record, @Param("example") HistorytestpaperExample example);

    int updateByExampleWithBLOBs(@Param("record") Historytestpaper record, @Param("example") HistorytestpaperExample example);

    int updateByExample(@Param("record") Historytestpaper record, @Param("example") HistorytestpaperExample example);

    int updateByPrimaryKeySelective(Historytestpaper record);

    int updateByPrimaryKeyWithBLOBs(Historytestpaper record);

    int updateByPrimaryKey(Historytestpaper record);
}