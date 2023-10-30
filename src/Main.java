// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        Car car2 = new Car();
        car.setModelName("car1");
        car2.setModelName("car2");
        car.setWheelsCount(4);
        car2.setWheelsCount(4);

        Truck truck = new Truck();
        Truck truck2 = new Truck();
        truck.setModelName("truck1");
        truck2.setModelName("truck2");
        truck.setWheelsCount(6);
        truck2.setWheelsCount(8);

        Bicycle bicycle = new Bicycle();
        Bicycle bicycle2 = new Bicycle();
        bicycle.setModelName("bicycle1");
        bicycle2.setModelName("bicycle2");
        bicycle.setWheelsCount(2);
        bicycle2.setWheelsCount(2);

        ServiceStation station = new ServiceStation();
        station.check(car);
        System.out.println();
        station.check(car2);
        System.out.println();
        station.check(bicycle);
        System.out.println();
        station.check(bicycle2);
        System.out.println();
        station.check(truck);
        System.out.println();
        station.check(truck2);
    }
}