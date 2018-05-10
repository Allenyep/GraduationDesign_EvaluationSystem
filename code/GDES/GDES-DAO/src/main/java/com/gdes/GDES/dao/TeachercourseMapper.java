package com.gdes.GDES.dao;

import com.gdes.GDES.model.Teachercourse;
import com.gdes.GDES.model.TeachercourseExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TeachercourseMapper {
    long countByExample(TeachercourseExample example);

    int deleteByExample(TeachercourseExample example);

    int insert(Teachercourse record);

    int insertSelective(Teachercourse record);

    List<Teachercourse> selectByExample(TeachercourseExample example);

    int updateByExampleSelective(@Param("record") Teachercourse record, @Param("example") TeachercourseExample example);

    int updateByExample(@Param("record") Teachercourse record, @Param("example") TeachercourseExample example);
}