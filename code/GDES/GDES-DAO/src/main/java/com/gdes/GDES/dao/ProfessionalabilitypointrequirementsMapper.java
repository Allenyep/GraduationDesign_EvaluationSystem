package com.gdes.GDES.dao;

import com.gdes.GDES.model.Professionalabilitypointrequirements;
import com.gdes.GDES.model.ProfessionalabilitypointrequirementsExample;
import com.gdes.GDES.model.ProfessionalabilitypointrequirementsKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ProfessionalabilitypointrequirementsMapper {
    long countByExample(ProfessionalabilitypointrequirementsExample example);

    int deleteByExample(ProfessionalabilitypointrequirementsExample example);

    int deleteByPrimaryKey(ProfessionalabilitypointrequirementsKey key);

    int insert(Professionalabilitypointrequirements record);

    int insertSelective(Professionalabilitypointrequirements record);

    List<Professionalabilitypointrequirements> selectByExample(ProfessionalabilitypointrequirementsExample example);

    Professionalabilitypointrequirements selectByPrimaryKey(ProfessionalabilitypointrequirementsKey key);

    int updateByExampleSelective(@Param("record") Professionalabilitypointrequirements record, @Param("example") ProfessionalabilitypointrequirementsExample example);

    int updateByExample(@Param("record") Professionalabilitypointrequirements record, @Param("example") ProfessionalabilitypointrequirementsExample example);

    int updateByPrimaryKeySelective(Professionalabilitypointrequirements record);

    int updateByPrimaryKey(Professionalabilitypointrequirements record);
}