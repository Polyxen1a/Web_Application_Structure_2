package com.example.web_application_structure_2.servive;


import com.example.web_application_structure_2.model.Recipe;

public interface RecipeService {
    Recipe addRecipe(Recipe recipe);

    Recipe getRecipe(Integer id);
}
