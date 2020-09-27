package com.example.zeus.module.config;

import org.springframework.stereotype.Service;

@Service
public class ProdConfigService implements ConfigService{

    @Override
    public String getUser() {
        return "admin-prod-user";
    }
}
