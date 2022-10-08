package com.christiantisby.firstkotlinprogram

fun main(args: Array<String>) {

    print("What is your name? ")

    var name: String? = readLine()
    println("How old are you? ")

    var age: Int = readLine()!!.toInt()

    println("Your name is $name and your age is $age")
}