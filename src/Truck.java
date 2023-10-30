public class Truck extends Transport{
    public Truck(String name, int wheelsCount) {
        super(name,wheelsCount);
    }
    public void checkEngine() {
        System.out.println("Проверяем двигатель");
    }
    public void checkTrailer() {
        System.out.println("Проверяем прицеп");
    }
    @Override
    public String toString(){
        return super.toString() + getModelName();
    }
}
