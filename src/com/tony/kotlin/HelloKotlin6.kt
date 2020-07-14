package com.tony.kotlin

fun main(args: Array<String>) {

    var array: IntArray = intArrayOf(1, 2, 3, 4, 5)
    for (item in array) {
        print("$item ")
    }
    println()
    for (i in array.indices) {
        println("array[$i]=${array[i]}")
    }
    println("__________________________________")
    for ((index, value) in array.withIndex()) {
        println("array[$index]=$value")
    }
}