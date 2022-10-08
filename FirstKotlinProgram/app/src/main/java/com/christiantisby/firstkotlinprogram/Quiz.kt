package com.christiantisby.firstkotlinprogram

fun main(args: Array<String>) {
//    print(13 / 2)
//    print(13 / 2.0)
//    print(13 % 2)
//    print(13 % 2.0)

    var a = 8
    val b = ++a - --a
    if (a < b) {
        println("a < b")
    } else  {
        println("a > b")

    }
}
