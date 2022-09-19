<?php
require_once "account.php";
class Car{
    public $id;
    public $license;
    public $driver;
    public $passenger;

    function __construct($license, $driver){
        $this->license = $license;
        $this->driver = $driver;
    }

    public function printDataCAr(){
        echo "licence: $this->licence Driver: ".$this->driver->name;
    } 
}

?>