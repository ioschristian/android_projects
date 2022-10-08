package com.christiantisby.firstkotlinprogram

fun main(args: Array<String>) {

}

fun show(num1: Int, num2: Int) {
    println("You entered $num1 and $num2")
}

fun add(num1: Int, num2: Int): Int {
    var sum: Int = 0
    sum = num1 + num2
    return sum
}