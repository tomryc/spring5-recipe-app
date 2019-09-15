package com.tomryc.services;

import com.tomryc.commands.RecipeCommand;
import com.tomryc.domain.Recipe;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public interface RecipeService {
    Set<Recipe> getRecipes();

    Recipe findById(Long l);

    RecipeCommand saveRecipeCommand(RecipeCommand command);

}
