package com.example.androidfirst

fun main() {
    var data: Array<Int> = arrayOf<Int>(10, 20, 30)
    var sum: Int = 0
    for ((index, value) in data.withIndex()) {
        sum += value
        print("${value}")
        if (index != data.size - 1) {
            print("\t|\t")
        }
    }
    print("\n sum = ${sum}")
}