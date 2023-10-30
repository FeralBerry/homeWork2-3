public abstract class Transport implements MeansOfTransportation{
    private String modelName;
    private int wheelsCount;
    public int getWheelsCount() {
        return wheelsCount;
    }
    public String getModelName() {
        return modelName;
    }
    public void setModelName(String modelName) {
        this.modelName = modelName;
    }
    public void setWheelsCount(int wheelsCount) {
        this.wheelsCount = wheelsCount;
    }
    public void updateTyre() {
        System.out.println("Меняем покрышку");
    }
    public String toString(){
        return "Обслуживаем ";
    }
}
