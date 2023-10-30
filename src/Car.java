public class Car extends Transport {
    public void checkEngine() {
        System.out.println("Проверяем двигатель");
    }
    @Override
    public String toString(){
        return super.toString() + getModelName();
    }
}
