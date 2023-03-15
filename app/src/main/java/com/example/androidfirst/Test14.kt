package com.example.androidfirst

fun main() {
    val objval:Super = Child("길동")
    println(objval.superData)
    objval.superFun()
}

open class Super constructor(var name: String) {
    open var superData : Int = 10
    open fun superFun(){
        println("Im super class function ${superData}")
    }
}

class Child constructor(var name1: String): Super(name1) {
    override var superData: Int = 20
    override fun superFun() {
        println("Im child class function: ${superData}")
    }

}