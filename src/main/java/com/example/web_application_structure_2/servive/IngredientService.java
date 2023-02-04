package com.example.web_application_structure_2.servive;


import com.example.web_application_structure_2.model.Ingredient;

public interface IngredientService {
    Ingredient addIngredient(Ingredient ingredient);

    Ingredient getIngredient(Integer id);
}
