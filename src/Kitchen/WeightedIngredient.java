package Kitchen;

import java.util.Scanner;

public class WeightedIngredient extends Ingredient {
    private double weight;
    private double pricePerUnit;
    private int id;


    public WeightedIngredient() {
    }

    public WeightedIngredient(String name, double pricePerUnit, double weight) {
        super(name);
        this.weight = weight;
        this.id = super.getId();
        this.pricePerUnit = pricePerUnit;
    }

    public void addIngredient() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Ingredient: ");
        super.setName(sc.nextLine());
        System.out.println("Enter amount: ");
        weight = sc.nextDouble();
        System.out.println("Enter price $$$ per unit of measure: ");
        pricePerUnit = sc.nextDouble();
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public double getPrice() {
        return weight * pricePerUnit;
    }

    @Override
    public String toString() {
        return super.getName() + " --- " + "weight=" + weight + ", price per unit=" + pricePerUnit + "  | Total price=" + getPrice() + '|';
    }

    @Override
    public int getId() {
        return id;
    }

    public String getName() {
        return super.name;
    }

}

