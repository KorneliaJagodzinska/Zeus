package com.example.zeus.module.dashboard.service;

import com.example.zeus.module.dashboard.dto.ArticleDto;
import com.example.zeus.module.dashboard.dto.CommentDto;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ArticleService {
    public ArticleDto getArticle() {
        return new ArticleDto()
                .setTitle("AWS Certified Cloud Practitioner (CLF-C01)")
                .setText("Cloud computing is the on-demand delivery of IT resources over the Internet with pay-as-you-go pricing. Instead of buying, owning, and maintaining physical data centers and servers, you can access technology services, such as computing power, storage, and databases, on an as-needed basis from a cloud provider like Amazon Web Services (AWS).")
                .setComments(
                        List.of(
                                new CommentDto("admin", "text1"),
                                new CommentDto("admin", "text2"),
                                new CommentDto("admin", "text3")
                        )
                );
    }
}
