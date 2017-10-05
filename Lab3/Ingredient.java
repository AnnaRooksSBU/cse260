public class Ingredient {
    String name;
    String measuringUnit;
    int caloriesPerUnit;

    public Ingredient(String name, String measuringUnit, int caloriesPerUnit) {
        this.name = name;
        this.measuringUnit = measuringUnit;
        this.caloriesPerUnit = caloriesPerUnit;
    }

    public String getName() { return name; }
    public String getMeasuringUnit() { return measuringUnit; }
    public int getCaloriesPerUnit() { return caloriesPerUnit; }


    public boolean equals(Ingredient ingredient) { 
        if (name != ingredient.getName()) return false;
        if (measuringUnit != ingredient.getMeasuringUnit()) return false;
        if (caloriesPerUnit != ingredient.getCaloriesPerUnit()) return false;
        return true;
    }
    public String toString() {
        return "Ingredient\n"
            + "name=" + name + "\n"
            + "measuringUnit=" + measuringUnit + "\n"
            + "caloriesPerUnit=" + caloriesPerUnit;
    }
}

