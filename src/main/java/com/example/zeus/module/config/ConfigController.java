package com.example.zeus.module.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ConfigController {
    @Autowired
    private ConfigService configService;
    @RequestMapping("/config")
    public String getConfig(Model model){
        model.addAttribute(
                "user",
                configService.getUser()
        );
        return "config";
    }
}
