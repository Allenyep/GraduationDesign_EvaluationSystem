package com.gdes.GDES.dao;

import com.allen.model.Jsgnb;
import com.allen.model.JsgnbExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface JsgnbMapper {
    long countByExample(JsgnbExample example);

    int deleteByExample(JsgnbExample example);

    int insert(Jsgnb record);

    int insertSelective(Jsgnb record);

    List<Jsgnb> selectByExample(JsgnbExample example);

    int updateByExampleSelective(@Param("record") Jsgnb record, @Param("example") JsgnbExample example);

    int updateByExample(@Param("record") Jsgnb record, @Param("example") JsgnbExample example);
}