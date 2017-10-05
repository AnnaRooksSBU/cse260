import java.util.ArrayList;

public class CookingRecipe {
    String name;
    ArrayList<RecipeIngredient> ingredients = new ArrayList<RecipeIngredient>();

    public CookingRecipe(String name) {
        this.name = name;
    }

    public void addOrUpdateRecipeIngredient(Ingredient ingredient, float quantity) {
        for (RecipeIngredient i : ingredients) {
            // if the ingredient is already in recipe
            if (i.equals(ingredient)) {
                // just update the quantity
                i.setQuantity(quantity);
                return;
            }
        }
        // otherwise add a new recipe ingredient
        ingredients.add(new RecipeIngredient(ingredient, quantity));
    }

    public String getName() { return name; }

    public RecipeIngredient getRecipeIngredient(Ingredient ingredient) { 
        for (RecipeIngredient i : ingredients) {
            if (((Ingredient) i).equals(ingredient)) return i;
        }
        return null;
    }
    public RecipeIngredient getRecipeIngredient(String ingredientName) {
        for (RecipeIngredient i : ingredients) {
            // return the RecipeIngredient object with the same name
            if (i.getName().equals(ingredientName)) return i;
        }
        // return null if the ingredient is not in the recipe.
        return null;
    }

    public RecipeIngredient removeRecipeIngredient(Ingredient ingredient) {
        for (int i = 0; i < ingredients.size(); i++) {
            if (((Ingredient) ingredients.get(i)).equals(ingredient)) {
                return ingredients.remove(i);
            }
        }
        return null;
    }
    public RecipeIngredient removeRecipeIngredient(String ingredientName) {
        for (int i = 0; i < ingredients.size(); i++) {
            if (ingredients.get(i).getName().equals(ingredientName)) {
                return ingredients.remove(i);
            }
        }
        return null;
    }
    // remove the given ingredient from the recipe. If the ingredient is part of the recipe return it, else return null.

    public float calculateCalories() {
        float totalCalories = 0;
        for (RecipeIngredient i : ingredients) {
            // add the specific ingredient's calorie count
            totalCalories += i.getCaloriesPerUnit() * i.getQuantity();
        }
        return totalCalories;
    }

    public boolean containsIngredients(RecipeIngredient[] ingredients) {
        for (RecipeIngredient i : ingredients) {
            if (getRecipeIngredient(i) == null) return false;
        }
        return true;
    }

    public int getNumberOfIngredients() { return ingredients.size(); }

    public boolean equals(CookingRecipe recipe) {
        if (name != recipe.getName()) return false;
        for (RecipeIngredient i : ingredients) {
            RecipeIngredient j = recipe.getRecipeIngredient(i);
            if (j == null) return false;
            if (!i.equals(j)) return false;
        }
        // If all of this recipe is present in the other recipe,
        // The ingredients of the recipes are the same iff they have the same number of ingredients.
        return ingredients.size() == recipe.getNumberOfIngredients();
    }
    public String toString() {
        // Name:
        String result = "CookingRecipe\n"
            + "name=" + name;
        for (RecipeIngredient i : ingredients) {
            // Quantity, unit and ingredient name
            result += "\nIngredient="
                + i.getQuantity() + i.getMeasuringUnit()
                + " of " + i.getName();
        }
        return result;
    }
}
