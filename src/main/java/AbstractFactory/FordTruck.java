package AbstractFactory;

public class FordTruck implements Truck {

    private String description = "Ford trucks up to 3.8 and 270 hp";

    public String getDescription() {
        return this.description;
    }
}
