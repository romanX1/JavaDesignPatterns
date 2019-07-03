package builder;

public class App {
    public static void main(String[] args) {
        CarBuilder builder = new CarBuilder();
        Director director = new Director();
        director.constructCityCar(builder);

        Car car = builder.getResult();
        System.out.println(car.getType());
    }
}
