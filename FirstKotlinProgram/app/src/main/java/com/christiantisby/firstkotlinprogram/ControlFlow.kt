package com.christiantisby.firstkotlinprogram

fun main(args: Array<String>) {
    print("please enter a number: ")
    var number: Int = readLine()!!.toInt()

    if(number % 2 == 0) {
        println("$number is an even number.")
    } else {
        println("$number is not an even number.")
    }
}