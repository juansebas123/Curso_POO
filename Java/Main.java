class Main {
    public static void main(String[] args) {
        System.out.println("hola mundo");
        //tipo de clase-obejto-nwe(palabra reservada)-metodo constructor
        UberX UberX = new UberX("AMQ123", new Account("Andres Herrera", "AND123"), "Chevroler", "Sonic");
        //empecemos con atributos
        //car.license = "AMQ123"; se ahorro esto
        //car.driver = "Andres Herrera"; se ahorro esto
        //UberX.passegenger = 4;
        UberX.setPassenger(4);
        //con esta ay tengo acceso a imprimir de car
        UberX.printDataCar();

        UberVan uberVan = new UberVan("FGH345", new Account("Andres Herrera", "AND123"));
        uberVan.setPassenger(6);
        uberVan.printDataCar();

        /*Car car2 = new Car("QWE567", new Account("Andrea Herrera", "ANDA876"));
        //car2.license = "qwe567";
        //car2.driver = "Andrea herrera";
        car2.passegenger = 3;
        car2.printDataCAr();*/
    }
}