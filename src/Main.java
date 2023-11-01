import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        /* 1 реализация полиморфизма через интерфейс
        TypesOfWork car1 = new Car("car1", 4);
        TypesOfWork car2 = new Car("car2", 4);
        TypesOfWork truck1 = new Truck("truck1", 6);
        TypesOfWork truck2 = new Truck("truck2", 8);
        TypesOfWork bicycle1 = new Bicycle("bicycle1", 2);
        TypesOfWork bicycle2 = new Bicycle("bicycle2", 2);

        List<TypesOfWork> transport = Arrays.asList(car1, car2, truck1, truck2, bicycle1, bicycle2);
        for (TypesOfWork value : transport) {
            System.out.println(value.updateTyre());
        }*/
        // 2 реализация полиморфизма через toString
        Transport[] transport = {
                new Car("car1", 4),
                new Car("car2", 4),
                new Truck("truck1", 6),
                new Truck("truck2", 8),
                new Bicycle("bicycle1", 2),
                new Bicycle("bicycle2", 2),
        };
        for (Transport value : transport) {
            String string = value.toString();
            System.out.println(string);
        }
    }
}