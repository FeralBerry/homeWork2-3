public class ServiceStation {
    public void check(Transport transport) {
        checkTransport(transport);
        if (transport instanceof Car) {
            // вызываем метод, только если объект является экземпляром класса Car
            ((Car) transport).checkEngine();
        } else if(transport instanceof Truck){
            ((Truck) transport).checkEngine();
            ((Truck) transport).checkTrailer();
        }
    }
    private void checkTransport(Transport transport){
        System.out.println(transport.toString());
        for (int i = 0; i < transport.getWheelsCount(); i++) {
            transport.updateTyre();
        }
    }
}
