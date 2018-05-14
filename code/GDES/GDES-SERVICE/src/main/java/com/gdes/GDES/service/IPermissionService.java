package com.gdes.GDES.service;

import com.gdes.GDES.model.Features;

import java.util.List;

public interface IPermissionService {
    List<String> getPermissionResourceByUserId(String idU);


    List<String> getAllResources();

    void save(Features features);
}
