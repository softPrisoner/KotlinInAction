package com.tony.kotlin

fun main(args: Array<String>) {

    val list = listOf("Hello", "World", "Hello World")

    println(list)
    val filterList = list.filter { it.contains("Hello") }
    println(filterList)
    for (ele in list)
        println(ele)

    list.forEach(System.out::println)
}