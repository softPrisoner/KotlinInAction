package com.tony.kotlin

fun main(args: Array<String>) {
    println(add(1, 2))
    add2(2, 3)
    add3(3, 4)
}

fun isOdd(x: Int) = x % 2 != 0

fun add(a: Int, b: Int): Int {
    return a + b
}

fun add2(a: Int, b: Int): Unit {
    println((a + b))
}

fun add3(a: Int, b: Int) {
    println("$a+$b=${a + b}")
}