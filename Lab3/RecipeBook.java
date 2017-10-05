import java.util.ArrayList;

public class RecipeBook {
    String name;
    ArrayList<CookingRecipe> recipes = new ArrayList<CookingRecipe>();

    public RecipeBook(String bookName) {
        name = bookName;
    }

    public String getName() { return name; }

    public CookingRecipe addRecipe(String name, RecipeIngredient[] ingredients) {
        for (CookingRecipe i : recipes) {
            // no duplicate names
            if (i.getName().equals(name)) return null;
        }

        // Create new recipe with the given ingredients
        CookingRecipe newRecipe = new CookingRecipe(name);
        for (RecipeIngredient i : ingredients) {
            newRecipe.addOrUpdateRecipeIngredient(i, i.getQuantity());
        }
        recipes.add(newRecipe);
        return newRecipe;

    }

    public CookingRecipe removeRecipe(String name) {
        for (int i = 0; i < recipes.size(); i++) {
            // if its the same name, remove and return
            if (recipes.get(i).getName().equals(name)) {
                return recipes.remove(i);
            }
        }
        return null;
    }
    // removes the cooking recipe from the coocking book and returns it. If recipe book does not contain a recipe withthe specified name, then return null.
    public CookingRecipe getCookingRecipe(CookingRecipe recipe) {
        for (CookingRecipe i : recipes) {
            if (i.equals(recipe)) return i;
        }
        return null;
    }

    public CookingRecipe[] findRecipes(RecipeIngredient[] ingredients) {
        ArrayList<CookingRecipe> results = new ArrayList<CookingRecipe>();
        // Adds all matching recipes to an ArrayList
        for (CookingRecipe i : recipes) {
            if (i.containsIngredients(ingredients)) results.add(i);
        }
        // null if no matches
        if (results.size() == 0) return null;
        return (CookingRecipe[]) results.toArray();
    }
    // returns all cooking recipes from the cooking book that contain all the ingredients passed as parameters. If recipebook does not contain any recipe with the specified ingredients, then return null.

    public CookingRecipe[] findRecipesWithFewIngredients(int numberOfIngredients) {
        ArrayList<CookingRecipe> results = new ArrayList<CookingRecipe>();
        // Adds all matching recipes to an ArrayList
        for (CookingRecipe i : recipes) {
            if (i.getNumberOfIngredients() < numberOfIngredients) results.add(i);
        }
        // null if no matches
        if (results.size() == 0) return null;
        return (CookingRecipe[]) results.toArray();
    }
    // returns all cooking recipes from the cooking book that contain less then the number of ingredients passed asparameter. If recipe book does not contain any recipe with the specified number of ingredients, then return null.

    public CookingRecipe[] findRecipesLowCalories() {
        ArrayList<CookingRecipe> results = new ArrayList<CookingRecipe>();
        float lowestCalories = Float.MAX_VALUE;
        for (CookingRecipe i : recipes) {
            float cals = i.calculateCalories();
            // Same calories
            if (cals == lowestCalories) results.add(i);
            // New lowest calories
            if (cals < lowestCalories) {
                results.clear(); results.add(i);
                lowestCalories = cals;
            }
        }
        return (CookingRecipe[]) results.toArray();
    }

    public boolean equals(RecipeBook book) {
        if (name != book.getName()) return false;
        for (CookingRecipe i : recipes) {
            CookingRecipe j = book.getCookingRecipe(i);
            if (j == null) return false;
        }
        return true;
    }

    public String toString() {
        //Name:
        String result = "RecipeBook\n"
            + "name=" + name;
        for (CookingRecipe i : recipes) {
            // Ingredient count, calories, and recipe name
            result += "\nCookingRecipe="
                + i.getName() + " with " + i.getNumberOfIngredients()
                + " ingredients, " + i.calculateCalories() + " cal.";
        }
        return result;
    }
}
