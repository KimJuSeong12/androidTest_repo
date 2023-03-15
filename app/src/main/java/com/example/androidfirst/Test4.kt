package com.example.androidfirst

val data41: Int by lazy {
    println("In lazy data41")
    10
}

fun main() {
    println("In main start")
    println(data41 + 10)

    var data45: Int = 10
    var data46: Int? = null

    data45 = data45 + 10
    data45 = data45.plus(20)
    data46 = data46?.plus(10)
    println(data45)
    println(data46)
}