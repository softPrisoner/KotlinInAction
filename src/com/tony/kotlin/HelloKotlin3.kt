package com.tony.kotlin

fun main(args: Array<String>) {
    var x = 10
    var y = 20
    var maxValue: Int
    var minValue: Int
    if (x > y) {
        maxValue = x
        minValue = y
    } else {
        maxValue = y
        minValue = x
    }
    println("maxValue=${maxValue},minValue=${minValue}")

    var min = if (x < y) x else y
    var max = if (x > y) x else y

    println("max=${max},min=${min}")
    max = if (x > y) {
        println("x > y")
        x
    } else {
        println("x<y")
        y
    }
    min = if (x < y) {
        println("x < y")
        x
    } else {
        println("x>y")
        y
    }
    println(min)
    println(max)

}
