package com.gdes.GDES.controller;

import com.gdes.GDES.model.Abilitypoint;
import com.gdes.GDES.model.Professionalabilitypointrequirements;
import com.gdes.GDES.service.AbilityPointService;
import com.gdes.GDES.service.ProfessionalabilitypointrequirementsService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by 96906 on 2018/5/21.
 */
@Controller
@RequestMapping("/papr/")
public class ProfessionalabilitypointrequirementsController {

    @Resource
    private AbilityPointService abilityPointService;

    @Resource
    private ProfessionalabilitypointrequirementsService professionalabilitypointrequirementsService;

    @RequestMapping("getall")
    public String queryAll(Model model) throws Exception {
        List<Abilitypoint> abilitypointList = abilityPointService.queryAll();
        model.addAttribute("aplist", abilitypointList);
        List<Professionalabilitypointrequirements> professionalabilitypointrequirementsList = professionalabilitypointrequirementsService.queryAll();
        model.addAttribute("all", professionalabilitypointrequirementsList);
        return "teacher/abilitypoint";
    }
}
