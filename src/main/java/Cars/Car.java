package Cars;

public abstract class Car {
    private String make;
    private String model;
    private String engine;
    private String gearbox;

    public Car(String make, String model, String engine, String gearbox){
        this.make = make;
        this.model = model;
        this.engine = engine;
        this.gearbox = gearbox;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public String getEngine() {
        return engine;
    }

    public String getGearbox() {
        return gearbox;
    }
}
