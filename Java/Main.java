class Main {
    public static void main(String[] args) {
        System.out.println("hola mundo");
        //tipo de clase-obejto-nwe(palabra reservada)-metodo constructor
        Car car = new Car();
        //empecemos con atributos
        car.license = "AMQ123";
        car.driver = "Andres Herrera";
        car.passegenger = 4;
        //con esta ay tengo acceso a imprimir de car
        car.printDataCAr();

        Car car2 = new Car();
        car2.license = "qwe567";
        car2.driver = "Andrea herrera";
        car2.passegenger = 3;
        car2.printDataCAr();
    }
}