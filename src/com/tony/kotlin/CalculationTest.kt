package com.tony.kotlin

//Import function alias
import  com.tony.kotlin.multiple as myMultiple

fun main(args: Array<String>) {
    val a: Int = 3
    val b: Int = 4
    println(myMultiple(a, b))
    //as final
    val m = intArrayOf(1, 2, 3)
    m.set(0, 5)
    for (t in m) {
        println(t)
    }
}