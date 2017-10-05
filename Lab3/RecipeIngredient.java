public class RecipeIngredient extends Ingredient {
    float quantity;
    public RecipeIngredient(String name, String measuringUnit, int caloriesPerUnit, float quantity) {
        super(name, measuringUnit, caloriesPerUnit);
        this.quantity = quantity;
    }

    public RecipeIngredient(Ingredient ing, float quantity) {
        super(ing.getName(), ing.getMeasuringUnit(), ing.getCaloriesPerUnit());
        this.quantity = quantity;
    }

    public float getQuantity() { return quantity; }
    public void setQuantity(float newValue) { quantity = newValue; }

    public boolean equals(RecipeIngredient ingredient) {
        if (!super.equals(ingredient)) return false;
        return quantity == ingredient.getQuantity();
    }
    public String toString() {
        return super.toString() 
            + "\nquantity=" + quantity;
    }
}
