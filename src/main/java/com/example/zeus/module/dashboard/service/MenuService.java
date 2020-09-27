package com.example.zeus.module.dashboard.service;

import com.example.zeus.module.dashboard.dto.MenuDto;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class MenuService {
    public List<MenuDto> getMenu() {
        return List.of(
                new MenuDto("http://michalszalkowski.com/aws/", "AWS"),
                new MenuDto("http://michalszalkowski.com/security/", "Security"),
                new MenuDto("http://michalszalkowski.com/java/", "Java"),
                new MenuDto("http://michalszalkowski.com/java/", "Spring"),
                new MenuDto("http://michalszalkowski.com/java/", "Java"),
                new MenuDto("http://michalszalkowski.com/java/", "Java"),
                new MenuDto("http://michalszalkowski.com/java/", "Java")
        );
    }
}
