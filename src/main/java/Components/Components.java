package Components;

public abstract class Components {

    private String name;
    private String model;
    private int price;

    public Components(String name, String model, int price){
        this.name = name;
        this.model = model;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public String getModel() {
        return model;
    }

    public int getPrice() {
        return price;
    }
}
