package Kitchen;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Test {

    public static void main(String[] args) {

        var omelette = new RecipesBase("Omelette", RecipeLevel.EASY);
        omelette.ingredientsList.add(new WeightedIngredient("Eggs", 0.15, 4.0));
        omelette.ingredientsList.add(new WeightedIngredient("Onion", 1, 0.1));

        var pancakes = new RecipesBase("Pancakes", RecipeLevel.EASY);
        pancakes.ingredientsList.add(new WeightedIngredient("Flour", 0.5, 0.1));
        pancakes.ingredientsList.add(new WeightedIngredient("Eggs", 0.15, 2));
        pancakes.ingredientsList.add(new WeightedIngredient("Milk", 1.05, 0.3));

        var meatBalls = new RecipesBase("Meatballs", RecipeLevel.MEDIUM);
        meatBalls.ingredientsList.add(new WeightedIngredient("Beef", 8, 0.5));
        meatBalls.ingredientsList.add(new WeightedIngredient("Onion", 1, 0.06));
        meatBalls.ingredientsList.add(new WeightedIngredient("Carrot", 1.0, 0.05));
        meatBalls.ingredientsList.add(new WeightedIngredient("Parmesan", 9, 0.05));
        meatBalls.ingredientsList.add(new WeightedIngredient("Eggs", 0.15, 1.0));

        var oats = new RecipesBase("Oats", RecipeLevel.BEGINNER);
        oats.ingredientsList.add(new WeightedIngredient("Oats", 0.5, 0.15));
        oats.ingredientsList.add(new WeightedIngredient("Nuts", 10, 0.2));
        oats.ingredientsList.add(new WeightedIngredient("Milk", 1.05, 0.15));

        var carbonare = new RecipesBase("Carbonare", RecipeLevel.MEDIUM);
        carbonare.ingredientsList.add(new WeightedIngredient("Spaghetti", 1.5, 0.15));
        carbonare.ingredientsList.add(new WeightedIngredient("Eggs", 0.15, 2));
        carbonare.ingredientsList.add(new WeightedIngredient("Bacon", 6, 0.1));
        carbonare.ingredientsList.add((new WeightedIngredient("Parmesan", 9, 0.03)));

        var gnocchi = new RecipesBase("Gnocchi", RecipeLevel.PRO);
        carbonare.ingredientsList.add(new WeightedIngredient("Potato Gnocchi", 12, 0.5));
        carbonare.ingredientsList.add(new WeightedIngredient("Butter", 3.0, 0.125));
        carbonare.ingredientsList.add(new WeightedIngredient("Spaghetti", 1.5, 0.15));
        carbonare.ingredientsList.add(new WeightedIngredient("Sage leaves", 24.95, 0.03));
        carbonare.ingredientsList.add(new WeightedIngredient("Garlic", 4.5, 0.01));
        carbonare.ingredientsList.add(new WeightedIngredient("Baby Spinach", 2, 0.12));
        carbonare.ingredientsList.add(new WeightedIngredient("Parmesan", 9, 0.1));
        carbonare.ingredientsList.add(new WeightedIngredient("Walnuts", 8.85, 0.05));

        var salmon = new RecipesBase("Salmon Wellington", RecipeLevel.HARD);
        carbonare.ingredientsList.add(new WeightedIngredient("Salmon", 12.95, 0.5));
        carbonare.ingredientsList.add(new WeightedIngredient("Dijon Mustard", 2.0, 0.025));
        carbonare.ingredientsList.add(new WeightedIngredient("Pastry", 5.47, 0.45));
        carbonare.ingredientsList.add(new WeightedIngredient("Eggs", 0.15, 1));
        carbonare.ingredientsList.add(new WeightedIngredient("Butter", 3.0, 0.125));
        carbonare.ingredientsList.add(new WeightedIngredient("Parmesan", 9, 0.1));


        ArrayList<RecipesBase> theCookBook = new ArrayList<>();
        theCookBook.add(omelette);
        theCookBook.add(pancakes);
        theCookBook.add(meatBalls);
        theCookBook.add(oats);
        theCookBook.add(carbonare);
        theCookBook.add(salmon);
        theCookBook.add(gnocchi);


        var fridge1 = new Fridge();
        fridge1.ingredientsList.add(new WeightedIngredient("Eggs", 0.15, 10));
        fridge1.ingredientsList.add(new WeightedIngredient("Tomato", 1.5, 1));
        fridge1.ingredientsList.add(new WeightedIngredient("Milk", 1.05, 1.0));
        fridge1.ingredientsList.add(new WeightedIngredient("Butter", 3.0, 0.45));
        fridge1.ingredientsList.add(new WeightedIngredient("Banana", 1.4, 1));
        fridge1.ingredientsList.add(new WeightedIngredient("Yogurt", 1, 1));
        fridge1.ingredientsList.add(new WeightedIngredient("Carrot", 1.0, 0.2));
        fridge1.ingredientsList.add(new WeightedIngredient("Oats", 0.5, 0.35));
        fridge1.ingredientsList.add(new WeightedIngredient("Nuts", 10, 0.2));
        fridge1.ingredientsList.add(new WeightedIngredient("Flour", 0.5, 0.2));
        fridge1.ingredientsList.add(new WeightedIngredient("Salmon", 12.95, 0.5));
        fridge1.ingredientsList.add(new WeightedIngredient("Dijon Mustard", 2.0, 0.75));
        fridge1.ingredientsList.add(new WeightedIngredient("Pastry", 5.47, 1.2));
        fridge1.ingredientsList.add(new WeightedIngredient("Parmesan", 9.0, 0.35));
        fridge1.ingredientsList.add(new WeightedIngredient("Beef", 8.0, 0.75));
/////////////////////////////////////////////////////////////////////////////////

        int num;
        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("---------MAIN MENU---------");
            System.out.println("0 --- EXIT PROGRAM ");
            System.out.println("1 --- Enter Fridge Menu ");
            System.out.println("2 --- Enter Recipes Menu ");
            System.out.println("3 --- Check what you can make with available ingredients ");
            System.out.println("4 --- Check what you can make with your budget ");

            num = Integer.parseInt(sc.nextLine());
            switch (num) {
                case 1:
                    do {
                        System.out.println("---------FRIDGE MENU---------");
                        System.out.println("1 --- CHECK LIST ");
                        System.out.println("2 --- ADD ITEM TO FRIDGE ");
                        System.out.println("3 --- REMOVE ITEM FROM FRIDGE ");
                        System.out.println("4 --- BACK TO MAIN MENU ");
                        num = Integer.parseInt(sc.nextLine());
                        switch (num) {
                            case 1 -> fridge1.print();
                            case 2 -> fridge1.addToFridge();
                            case 3 -> fridge1.removeFromFridge();
                            case 4 -> System.out.println("You got back to ");
                            default -> {
                            }
                        }
                    } while (num != 4);
                    continue;

                case 2:
                    do {
                        System.out.println("---------RECIPE MENU---------");
                        System.out.println("1 --- CHECK THE COOKBOOK ");
                        System.out.println("2 --- ADD INGREDIENT TO A RECIPE ");
                        System.out.println("3 --- MODIFY RECIPE ");
                        System.out.println("4 --- SCALE RECIPE ");
                        System.out.println("5 --- FILTER BY RECIPE COMPLEXITY  ");
                        System.out.println("6 --- SORT BY RECIPE COMPLEXITY  ");
                        System.out.println("7 --- SORT BY RECIPE PRICE  ");
                        System.out.println("8 --- BACK TO MAIN MENU  ");
                        num = Integer.parseInt(sc.nextLine());
                        switch (num) {
                            case 1 -> System.out.println(theCookBook);
                            case 2 -> {
                                System.out.println("Enter recipe name for adding ingredient");
                                String findName = sc.nextLine();
                                int invalidCount = 0;
                                for (var element : theCookBook) {
                                    if (!element.getName().equalsIgnoreCase(findName)) {
                                        invalidCount++;
                                    } else element.addIngredient();
                                    if (invalidCount == theCookBook.size()) {
                                        System.out.println("Can't find recipe with that name in the Cookbook");
                                    }
                                }
                            }
                            case 3 -> {
                                int countRecepies = 0;
                                System.out.println("Type recipe name: ");
                                String recipeNameInput = sc.nextLine();
                                for (var recepie : theCookBook) {
                                    if (recepie.getName().equalsIgnoreCase(recipeNameInput)) {
                                        System.out.println(recepie);
                                        recepie.modifyIngredient();
                                        countRecepies++;
                                        System.out.println(recepie);
                                    }
                                }
                                if (countRecepies == 0)
                                    System.out.println("There's no recipe by that name in the Cookbook");
                            }
                            case 4 -> {
                                int countScaled = 0;
                                System.out.println("Type recipe name: ");
                                String recipeName = sc.nextLine();
                                for (var recipe : theCookBook) {
                                    if (recipe.getName().equalsIgnoreCase(recipeName)) {
                                        System.out.println(recipe);
                                        recipe.getScaledRecipe();
                                        System.out.println(recipe);
                                    }
                                    countScaled++;
                                }
                                if (countScaled == 0)
                                    System.out.println("There's no recipe by that name in the Cookbook");
                            }
                            case 5 -> {
                                System.out.println("Enter number for filtering by complexity from 1 through 5: ");
                                int n = Integer.parseInt(sc.nextLine());
                                List<RecipesBase> easy = theCookBook.stream()
                                        .filter(recipe -> recipe.getLvl().equals(RecipesBase.sortByLevel(n))).toList();
                                easy.forEach(System.out::println);
                            }
                            case 6 -> {
                                System.out.println(" * * * Recipes are sorted by complexity: * * * ");
                                List<RecipesBase> sortedByComplexity = theCookBook.stream()
                                        .sorted(Comparator.comparing(RecipesBase::getLvl)).toList();
                                sortedByComplexity.forEach(System.out::println);
                            }
                            case 7 -> {
                                System.out.println(" * * * Recipes are sorted by price: * * * ");
                                List<RecipesBase> sortedByPrice = theCookBook.stream()
                                        .sorted(Comparator.comparing(RecipesBase::getTotalPrice)).toList();
                                sortedByPrice.forEach(System.out::println);
                            }
                            default -> {
                            }
                        }
                    } while (num != 8);
                case 3:
                    System.out.println(" * * * You can make: * * * ");
                    for (var recipe : theCookBook) {
                        if (fridge1.checkIfCan(recipe)) {
                            System.out.println(recipe);
                        }
                    }
                    break;
                case 4:
                    System.out.println("What is your budget in EURO: ");
                    double budget = Double.parseDouble(sc.nextLine());
                    System.out.println(" * * * You can make: * * * ");
                    for (var recipe : theCookBook) {
                        if (recipe.getTotalPrice() <= budget) {
                            System.out.println(recipe);
                        }
                    }
                    break;
            }
        } while (num != 0);


    }
}





