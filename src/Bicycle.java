public class Bicycle extends Transport{
    public Bicycle(String name, int wheelsCount) {
        super(name,wheelsCount);
    }
    @Override
    public String toString(){
        return super.toString() + getModelName();
    }
}
