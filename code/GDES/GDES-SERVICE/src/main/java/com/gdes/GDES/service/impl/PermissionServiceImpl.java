package com.gdes.GDES.service.impl;

import com.gdes.GDES.dao.FeaturesMapper;
import com.gdes.GDES.model.Features;
import com.gdes.GDES.service.IPermissionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PermissionServiceImpl implements IPermissionService {

    @Autowired
    private FeaturesMapper featuresMapper;

    public List<String> getPermissionResourceByUserId(String idU) {
        return featuresMapper.selectPermissionByUserName(idU);
    }

    public List<String> getAllResources() {
        return featuresMapper.getAllResources();
    }

    public void save(Features features) {
        featuresMapper.savaFeatures(features);
    }
}
