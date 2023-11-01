public class Bicycle extends Transport{
    public Bicycle(String name, int wheelsCount) {
        super(name,wheelsCount);
    }
    // полиморфизм и перегрузка
    @Override
    public String toString(){
        return super.toString() + "\n"
                + super.updateTyre();
    }
}
