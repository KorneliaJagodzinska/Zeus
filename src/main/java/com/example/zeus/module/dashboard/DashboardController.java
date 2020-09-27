package com.example.zeus.module.dashboard;

import com.example.zeus.module.dashboard.dto.ArticleDto;
import com.example.zeus.module.dashboard.dto.CommentDto;
import com.example.zeus.module.dashboard.dto.MenuDto;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class DashboardController {
    @RequestMapping("/dashboard")
    public String getDashboard(Model model) {
        model.addAttribute("menu", getMenu());
        model.addAttribute("article", getArticle());
        return "dashboard";
    }

    private List<MenuDto> getMenu() {
        return List.of(
                new MenuDto("http://michalszalkowski.com/aws/", "AWS"),
                new MenuDto("http://michalszalkowski.com/security/", "Security"),
                new MenuDto("http://michalszalkowski.com/java/", "Java")
        );
    }

    private ArticleDto getArticle() {
        return new ArticleDto()
                .setTitle("AWS Certified Cloud Practitioner (CLF-C01)")
                .setText("lorem ipsum...")
                .setComments(
                        List.of(
                                new CommentDto("admin", "text1"),
                                new CommentDto("admin", "text2"),
                                new CommentDto("admin", "text3")
                        )
                );
    }
}
