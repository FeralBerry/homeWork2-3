public class Truck extends Transport{
    public Truck(String name, int wheelsCount) {
        super(name,wheelsCount);
    }
    @Override
    public void checkEngine(){
        System.out.println("Проверяем двигатель");
    }
    @Override
    public void checkTrailer() {
        System.out.println("Проверяем прицеп");
    }
    @Override
    public String toString(){
        return super.toString() + getModelName();
    }
}
