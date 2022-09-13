package Kitchen;

import java.util.*;
public class Fridge {

    ArrayList<WeightedIngredient> ingredientsList = new ArrayList<>();
    Scanner sc = new Scanner(System.in);

    public Fridge() {
    }

    public void addToFridge() {
        int count = 0;
        var ingredient = new WeightedIngredient();
        ingredient.addIngredient();
        for (var element : ingredientsList) {
            if (element.getName().equalsIgnoreCase(ingredient.getName())) {
                element.setWeight(element.getWeight() + ingredient.getWeight());
            } else count++;
        }
        if (count == ingredientsList.size()) {
            ingredientsList.add(ingredient);
        }
    }

    public void removeFromFridge() {
        print();
        System.out.println("Enter number of ingredient to be removed: ");
        int n = Integer.parseInt(sc.nextLine());
        System.out.println("Enter amount of " + ingredientsList.get(n - 1).getName() + " to be removed: ");
        double m = sc.nextDouble();
        ingredientsList.get(n - 1).setWeight(ingredientsList.get(n - 1).getWeight() - m);
        if (ingredientsList.get(n - 1).getWeight() == 0) {
            System.out.println("You spent all your " + ingredientsList.get(n - 1).getName());
            ingredientsList.remove(n - 1);
        } else if (ingredientsList.get(n - 1).getWeight() < 0) {
            ingredientsList.get(n - 1).setWeight(ingredientsList.get(n - 1).getWeight() + m);
            System.out.println("Not enough " + ingredientsList.get(n - 1).getName() + ", you only have " + ingredientsList.get(n - 1).getWeight() + " left");

        }
        print();
    }

    public boolean checkIfCan(RecipesBase recipe) {
        int count = 0;
        for (var ingr : recipe.ingredientsList) {
            for (WeightedIngredient weightedIngredient : ingredientsList) {
                if (weightedIngredient.getName().equalsIgnoreCase(ingr.getName())
                        && weightedIngredient.getWeight() >= ingr.getWeight()) {
                    count++;
                }
            }
            if (count == recipe.ingredientsList.size())
                return true;
        }
        return false;
    }

    public void print() {
        System.out.println("---------------------------------------------------------------------");
        for (int i = 0; i < ingredientsList.size(); i++) {
            System.out.println((i + 1) + ". " + ingredientsList.get(i));
        }
        System.out.println("---------------------------------------------------------------------");
    }


    @Override
    public String toString() {
        return "Fridge{" + "ingredientsList=" + ingredientsList + '}';
    }
}
