package com.example.zeus.module.home;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class HomeController {
    @RequestMapping("/")
    public String getHome(Model model) {
        PersonDto person = new PersonDto(
                "Kornelia",
                "Jagodzińska",
                17
        );
        model.addAttribute("person", person);

        PersonDto person1= new PersonDto("Basia", "Kowalska", 18);
        PersonDto person2= new PersonDto("Kasia", "Kowalska", 19);
        PersonDto person3= new PersonDto("Asia", "Kowalska", 20);

        List<PersonDto> list= List.of(person1,person2,person3);
        model.addAttribute("list", list);
        return "home";
    }

}
