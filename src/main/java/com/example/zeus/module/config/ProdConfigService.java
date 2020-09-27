package com.example.zeus.module.config;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service
@Primary
public class ProdConfigService implements ConfigService{

    @Override
    public String getUser() {
        return "admin-prod-user";
    }
}
