package Kitchen;

public abstract class Ingredient implements Priceable {
    private static int counter = 0;
    private int id;
    public String name;

    public Ingredient() {
    }

    public Ingredient(String name) {
        this.name = name;
        this.id = counter++;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }


}
