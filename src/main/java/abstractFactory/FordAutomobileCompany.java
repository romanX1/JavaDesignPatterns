package abstractFactory;

public class FordAutomobileCompany implements AutomobileCompany {

    public Car createCar() {
        return new FordCar();
    }

    public Truck createTruck() {
        return new FordTruck();
    }
}
