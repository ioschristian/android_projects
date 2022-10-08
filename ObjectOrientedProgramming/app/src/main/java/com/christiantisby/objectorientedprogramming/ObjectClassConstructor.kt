package com.christiantisby.objectorientedprogramming

fun main(args: Array<String>) {


    // creating an object from class
    /*var myCar = Cars()
    myCar.model = 535
    myCar.name = "BMW"

    var myCar2 = Cars()
    myCar2.model = 750
    myCar2.name = "BMW"

    println("My first car's name is ${myCar.name} and is model is ${myCar.model}")
    println("My second car's name is ${myCar2.name} and is model is ${myCar2.model}")
     */

    /*
    var myNewCar = MyCars("Ferrari", 2022)
    //println("My car's name is ${myNewCar.name} and its model is ${myNewCar.model}")

     */

    var mySecondCar = MySecondCars("Mercedes", 2020)
    println("My second car's name is ${mySecondCar.name} and its model is ${mySecondCar.model}")
}