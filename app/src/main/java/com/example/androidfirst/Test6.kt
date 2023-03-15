package com.example.androidfirst

fun main() {
    //내부함수
    fun sum(no: Int): Int {
        var sum = 0
        for (i in 0..no) {
            sum += i
        }

        return sum
    }
    //지역변수
    val name: String = "Hong Gil Dong"
    println("name = ${name}")
    println(sum(10))

}
