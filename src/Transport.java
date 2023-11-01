public abstract class Transport implements TypesOfWork{
    // инкапсуляция
    private final String modelName;
    private final int wheelsCount;
    public Transport(String name, int wheelsCount){
        this.modelName = name;
        this.wheelsCount = wheelsCount;
    }
    // наследование
    public String updateTyre() {
        // создаем переменную типа String
        String str = "";
        // создаем объект типа StringBuilder на основе пустой строки
        StringBuilder strBuilder = new StringBuilder(str);
        // добавляем в массив StringBuilder записи в зависимости от полученого числа колес
        for(int i = 0; i < wheelsCount; i++) {
            strBuilder.append("Меняем покрышку").append("\n");
        }
        // преобразуем полученый массив в строку и сохраняем в переменную
        str = strBuilder.toString();
        // возвращаем строку для использования в наследуюемых методах
        return str;
    }
    public String toString(){
        return "Обслуживаем " + modelName;
    }
}
