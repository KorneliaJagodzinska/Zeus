package com.example.zeus.module.news.sopot;

import com.example.zeus.module.news.NewsService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SopotNewsService implements NewsService {

    @Override
    public List<String> getLastNews() {
        return List.of(
                "1- News from Sopot",
                "2- News from Sopot",
                "3- News from Sopot"
        );
    }
}
