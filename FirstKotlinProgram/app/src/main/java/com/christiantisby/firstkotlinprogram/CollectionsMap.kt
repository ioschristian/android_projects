package com.christiantisby.firstkotlinprogram

fun main(args: Array<String>) {

    //immutable, maps are immutable
    println("-------------------Immutable map of-------------------")
    var age = mapOf<String, Int>("David" to 20, "Ronaldo" to 25)
    println("Age of David: " + age["David"])
    println("Age of Ronaldo: " + age["Ronaldo"])

    //mutable
    var mutableAge = mutableMapOf<String, Int>("David" to 20, "Ronaldo" to 25)

    mutableAge.put("Buffon", 30)

    println("-------------------Mutable map of-------------------")
    println("Age of David: " + age["David"])
    println("Age of Ronaldo: " + age["Ronaldo"])
    println("Age of Buffon: " + age["Buffon"])
}