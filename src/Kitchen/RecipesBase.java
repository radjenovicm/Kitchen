package Kitchen;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RecipesBase extends Recipe {
    private double totalPrice;

    public RecipesBase(String name, Enum lvl) {
        super(name, lvl);
        this.ingredientsList = new ArrayList<>();
        totalPrice = getTotalPrice();
    }

    public List<WeightedIngredient> getIngredientList() {
        return ingredientsList;
    }


    public void addIngredient() {
        var ingredient = new WeightedIngredient();
        ingredient.addIngredient();
        ingredientsList.add(ingredient);
    }

    Scanner sc = new Scanner(System.in);

    public void getScaledRecipe() {
        System.out.println("Enter scaling amount");
        double scalingAmount = sc.nextDouble();
        for (var ingredient : ingredientsList) {
            ingredient.setWeight(Math.round((ingredient.getWeight() * (scalingAmount / 100)) * 100.0) / 100.0);
        }
    }


    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public double getTotalPrice() {
        totalPrice = 0;
        for (var element : ingredientsList) {
            totalPrice += element.getPrice();
        }
        return Math.round(totalPrice * 100.0) / 100.0;
    }

    public void modifyIngredient() {
        int count = 0;
        System.out.println("Enter the name of an Ingredient you want to modify amount of: ");
        String ingredient = sc.nextLine();
        for (int i = 0; i < ingredientsList.size(); i++) {
            if (ingredientsList.get(i).getName().equalsIgnoreCase(ingredient)) {
                count++;
                System.out.println("Enter the amount (+/-  for  addition/substraction)");
                double weight = sc.nextDouble();
                if ((ingredientsList.get(i).getWeight() + weight) > 0) {
                    ingredientsList.get(i).setWeight(ingredientsList.get(i).getWeight() + weight);
                } else if
                ((ingredientsList.get(i).getWeight() + weight) == 0) {
                    ingredientsList.remove(i);
                } else if ((ingredientsList.get(i).getWeight() + weight) < 0) {
                    System.out.println("Invalid amount, you only need " + ingredientsList.get(i).getWeight() + " of " + ingredientsList.get(i).getName() + " for this recipe");
                }
            }
        }
        if (count == 0) System.out.println("This recipe does not contain given ingredient, you need to add it first.");
    }


    public static RecipeLevel sortByLevel(int n) {
        RecipeLevel lvl = null;
        switch (n) {
            case 1 -> lvl = RecipeLevel.BEGINNER;
            case 2 -> lvl = RecipeLevel.EASY;
            case 3 -> lvl = RecipeLevel.MEDIUM;
            case 4 -> lvl = RecipeLevel.HARD;
            case 5 -> lvl = RecipeLevel.PRO;
            default -> System.out.println("Wrong input");
        }
        return lvl;
    }

    @Override
    public String toString() {
        return "Recipe: " + super.getName() + ", lvl=" + lvl + '\n' +
                "ingredientsList = " + this.getIngredientList() + " Total ingredients cost " + getTotalPrice() + '\n';
    }
}
