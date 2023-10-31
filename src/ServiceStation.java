public class ServiceStation {
    public void check(Transport transport) {
        printCheckTransport(transport);
    }
    private void printCheckTransport(Transport transport){
        System.out.println(transport.toString());
        for (int i = 0; i < transport.getWheelsCount(); i++) {
            transport.updateTyre();
        }
        transport.checkEngine();
        transport.checkTrailer();
    }
}
