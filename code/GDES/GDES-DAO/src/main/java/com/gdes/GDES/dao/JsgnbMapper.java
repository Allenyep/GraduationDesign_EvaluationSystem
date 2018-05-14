package com.gdes.GDES.dao;

import com.gdes.GDES.model.Jsgnb;
import com.gdes.GDES.model.JsgnbExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface JsgnbMapper {
    long countByExample(JsgnbExample example);

    int deleteByExample(JsgnbExample example);

    int insert(Jsgnb record);

    int insertSelective(Jsgnb record);

    List<Jsgnb> selectByExample(JsgnbExample example);

    int updateByExampleSelective(@Param("record") Jsgnb record, @Param("example") JsgnbExample example);

    int updateByExample(@Param("record") Jsgnb record, @Param("example") JsgnbExample example);
}