package com.christiantisby.objectorientedprogramming.abstract

class Car(override var model: Int) : Vehicle() {
    override fun vehicleName(name: String): String {
        return name
    }

}