public class Bicycle extends Transport{
    @Override
    public String toString(){
        return super.toString() + getModelName();
    }
}
