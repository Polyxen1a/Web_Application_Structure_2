package com.example.web_application_structure_2.model;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Positive;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter

public class Ingredient {
    @NotBlank (message = "Имя обязательно")
    private String name;
    @Positive
    private Integer count;
    private String measureUnit;
}