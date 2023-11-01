public class Car extends Transport {
    public Car(String name, int wheelsCount) {
        super(name,wheelsCount);
    }
    // инкапсуляция
    private String checkEngine(){
        return "Проверяем двигатель машины";
    }
    // полиморфизм и перегрузка
    @Override
    public String toString(){
        return super.toString() + "\n"
                + checkEngine() + "\n"
                + super.updateTyre();
    }
}
