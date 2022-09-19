<?php
class UberX extends CAr {
    public $brand;
    public $model;

    //costructor
    function __construct($license,  $driver, $brand, $model){
        parent::__construct($license,$driver);
        $this->brand = $brand;
        $this->model = $model;
    }
}
?>