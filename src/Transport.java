public abstract class Transport implements TypesOfWork{
    private String modelName;
    private int wheelsCount;
    public Transport(String name, int wheelsCount){
        this.modelName = name;
        this.wheelsCount = wheelsCount;
    }
    public int getWheelsCount() {
        return wheelsCount;
    }
    public String getModelName() {
        return modelName;
    }
    public void updateTyre() {
        System.out.println("Меняем покрышку");
    }
    public String toString(){
        return "Обслуживаем ";
    }
}
