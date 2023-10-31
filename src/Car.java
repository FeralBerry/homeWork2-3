public class Car extends Transport {
    public Car(String name, int wheelsCount) {
        super(name,wheelsCount);
    }
    @Override
    public void checkEngine(){
        System.out.println("Проверяем двигатель");
    }

    @Override
    public void checkTrailer() {

    }

    @Override
    public String toString(){
        return super.toString() + getModelName();
    }
}
