package Kitchen;

import java.util.ArrayList;

public class Recipe implements Priceable {
    private String name;
    private double totalPrice;
    public Enum lvl;

    ArrayList<WeightedIngredient> ingredientsList = new ArrayList<>();

    public Recipe() {
    }

    public Recipe(String name, Enum lvl) {
        this.name = name;
        this.lvl = lvl;
    }

    public void addIngredient() {
        var ingredient = new WeightedIngredient();
        ingredient.addIngredient();
        ingredientsList.add(ingredient);
    }

    public String getName() {
        return name;
    }

    public Enum getLvl() {
        return lvl;
    }

    @Override
    public double getPrice() {
        return 0;
    }

    public double getTotalPrice() {
        for (var element : ingredientsList) {
            totalPrice += element.getPrice();
        }
        return Math.round(totalPrice * 100.0) / 100.0;
    }

    @Override
    public String toString() {
        return "Recipe{" +
                "name='" + name + '\'' +
                ", lvl=" + lvl + '\n' +
                "ingredientsList=" + ingredientsList + "\n" + totalPrice + '}';
    }
}


