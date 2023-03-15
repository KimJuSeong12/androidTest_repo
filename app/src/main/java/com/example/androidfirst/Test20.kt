package com.example.androidfirst

fun main() {

    var data: String? = null
    data = "문자열"
    println(data.length ?: 10)

//    val length = if (data == null) {
//        0
//    } else {
//        data.length
//    }
//
//    println("data length ${length}")
}