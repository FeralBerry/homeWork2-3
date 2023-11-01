public class Truck extends Transport{
    public Truck(String name, int wheelsCount) {
        super(name,wheelsCount);
    }
    // инкапсуляция
    private String checkEngine(){
        return "Проверяем двигатель грузовика";
    }
    // инкапсуляция
    private String checkTrailer() {
        return "Проверяем прицеп грузовика";
    }
    // полиморфизм и перегрузка
    @Override
    public String toString(){
        return super.toString() + "\n"
                + checkEngine() + "\n"
                + checkTrailer() + "\n"
                + super.updateTyre();
    }
}
