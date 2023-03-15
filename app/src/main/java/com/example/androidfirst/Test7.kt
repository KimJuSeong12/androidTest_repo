package com.example.androidfirst

fun main() {
    //배열표현
    val data71: Array<Int> = Array(3, { 0 })
    println("data71.size = ${data71.size}")
    data71.set(1,100)
    for (i in 0..2) {
        print("${data71.get(i)} \t")
        println(data71[i])
    }
}