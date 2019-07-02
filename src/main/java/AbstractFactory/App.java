package AbstractFactory;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public class App {

    static final Logger Logger = LogManager.getLogger(App.class);

    private Car car;
    private Truck truck;

    public void createCompany(final AutomobileCompany company) {
        setCar(company.createCar());
        setTruck(company.createTruck());

    }

    Car getCar(final AutomobileCompany company) {
        return company.createCar();
    }

    public Car getCar() {
        return car;
    }

    private void setCar(final Car car) {
        this.car = car;
    }

    Truck getTruck(final AutomobileCompany company) {
        return company.createTruck();
    }

    public Truck getTruck() {
        return truck;
    }

    private void setTruck(final Truck truck) {
        this.truck = truck;
    }


    public static class CompanyMaker {

        public enum CompanyType {
            Ford, Renault
        }

        public static AutomobileCompany makeCompany(CompanyType type) {
            switch (type) {
                case Ford:
                    return new FordAutomobileCompany();
                case Renault:
                    return new RenaultAutomobileCompany();
                default:
                    throw new IllegalArgumentException("AutomobileCompany not supported.");
            }
        }
    }

    public static void main(String[] args) {

        App app = new App();

        Logger.info("Create Ford Company:");
        app.createCompany(CompanyMaker.makeCompany(CompanyMaker.CompanyType.Ford));
        Logger.info(app.getCar().getDescription());
        Logger.info(app.getTruck().getDescription());

        Logger.info("Create Renault Company:");
        app.createCompany(CompanyMaker.makeCompany(CompanyMaker.CompanyType.Renault));
        Logger.info(app.getCar().getDescription());
        Logger.info(app.getTruck().getDescription());
    }
}
