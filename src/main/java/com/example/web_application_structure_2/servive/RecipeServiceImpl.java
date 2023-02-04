package com.example.web_application_structure_2.servive;


import com.example.web_application_structure_2.model.Recipe;
import org.springframework.stereotype.Service;


import java.util.HashMap;
import java.util.Map;

@Service
public class RecipeServiceImpl {
    private final Map<Integer, Recipe> recipeMap = new HashMap<>();
    private static Integer id = 0;



@Override
    public Recipe addRecipe(Recipe recipe) {
        recipeMap.put(id++, recipe);
        return recipe;
    }
@Override
    public Recipe getRecipe(Integer id) {
        return recipeMap.getOrDefault(id, null);
    }
}
