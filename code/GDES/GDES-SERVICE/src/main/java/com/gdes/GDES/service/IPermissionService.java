package com.gdes.GDES.service;

import com.gdes.GDES.model.Features;
import com.gdes.GDES.model.Permission;

import java.util.List;

public interface IPermissionService {

    Permission selectPermissions();




//    -----------------------------------------------------
    List<String> getPermissionResourceByUserId(String idU);


    List<String> getAllResources();

    void save(Features features);
}
