package com.example.zeus.module.home;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
//data transfer object
public class PersonDto {
    private String name;
    private String surname;
    private int age;

}

