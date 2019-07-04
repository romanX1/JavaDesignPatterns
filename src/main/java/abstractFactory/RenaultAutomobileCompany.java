package abstractFactory;

public class RenaultAutomobileCompany implements AutomobileCompany {

    public Car createCar() {
        return new RenaultCar();
    }

    public Truck createTruck() {
        return new RenaultTruck();
    }
}
