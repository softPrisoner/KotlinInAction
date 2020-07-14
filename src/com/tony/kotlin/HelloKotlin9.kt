package com.tony.kotlin

fun main(args: Array<String>) {
    val array = listOf("hello", "world", "hello world", "welcome", "goodbye")
    for (item in array) {
        println(item)
    }
    when {
        "world" in array -> println("world in array ")
    }
    array.filter { it.length > 5 }.map { it.toUpperCase() }.sorted().forEach(System.out::println)
}

