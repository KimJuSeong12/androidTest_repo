package com.example.androidfirst

fun main() {
    var map:Map<String, String> = mapOf<String,String>(Pair("one","길동"),"two" to "구동")
    println(map.size)
    println(map.get("one"))
    println(map.get("two"))
}