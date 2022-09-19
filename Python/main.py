#importamos el elemento
from car import Car
from account import Account

if __name__ == "__main__":
    print("hola mundo")
    car = Car("AMS234", Account("Andres Herrera", "Anda799"))
    ##car.license = "AMS234"
    ##car.driver = "Andres Herrera"
    print(vars(car))
    print(vars(car.driver))

    car2 = Car("QWE567", Account("Martha Herrera", "252588"))
    #car2.license = "QWE567"
    #car2.driver = "Martha Herrera"
    print(vars(car2))
    print(vars(car.driver))



