<?php

require_once "car.php";
require_once "account.php";


$car1 = new Car("ABC123", new Account("Alguien", "doc123"));
$car1->printDataCar();

?>