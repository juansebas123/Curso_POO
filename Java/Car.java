class Car {
    Integer id;
    String license;
    Account driver;
    Integer passegenger;

    //declarando contructores
    public Car(String license, Account driver){
        this.license = license;
        this.driver = driver;
    }

    //declaremos un metodo para que traiga lso datos del a clase
    void printDataCAr(){
        System.out.println("License: " + license + " Name Driver: " + driver.name);
    }
}

