public class Car extends Transport {
    public Car(String name, int wheelsCount) {
        super(name,wheelsCount);
    }

    public void checkEngine() {
        System.out.println("Проверяем двигатель");
    }
    @Override
    public String toString(){
        return super.toString() + getModelName();
    }
}
