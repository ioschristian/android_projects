package com.christiantisby.firstkotlinprogram

fun main(args: Array<String>) {
    var age = arrayOf(24, 14, 8, 12, 16, 19, 36)
    println("First element of Array = " + age[0])
    println("Second element of Array = " + age.get(1))
    println("Third element of Array = " + age[2])


    var cars = arrayOf("Mercedes", "BMW", "Opel")

    println("--------------------------------")

    println("First element of Array = " + cars[0])
    println("Second element of Array = " + cars.get(1))
    println("Third element of Array = " + cars[2])

    cars.set(2, "Audi")

    println("--------------------------------")

    println("First element of Array = " + cars[0])
    println("Second element of Array = " + cars.get(1))
    println("Third element of Array = " + cars[2])

    println("Size of cars array = " + cars.size)

    var carsAndAge = arrayOf("Mercedes", 5, "Opel", 10)

    println("--------------------------------")

    println("First element of Array = " + carsAndAge[0])
    println("Second element of Array = " + carsAndAge.get(1))
    println("Third element of Array = " + carsAndAge[2])
    println("Fourth element of Array = " + carsAndAge.get(3))



}