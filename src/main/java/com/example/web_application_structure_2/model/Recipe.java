package com.example.web_application_structure_2.model;


import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Positive;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data

public class Recipe {
    @NotBlank
    private String name;
    @Positive
    private Integer cookingTime;
    @NotEmpty
    private List<Ingredient> ingredients;
    @NotEmpty
    private List<String> steps;
}
