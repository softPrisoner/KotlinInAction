package com.tony.kotlin

fun main(args: Array<String>) {
    println(myPrint("hello"))
    println(myPrint("world"))
    println(myPrint("hello world"))
    println(myPrint("test"))
    var a = 6
    var result = when (a) {
        1 -> {
            println("1")
            10
        }

        2 -> {
            println("2")
            20
        }

        3 -> {
            println("3")
            30
        }

        4 -> {
            println("4")
            40
        }

        5, 6, 7 -> {
            println("5 or 6 or 7")
            60
        }

        in 8..10 -> {
            println("8 or 9 or 10")
            90
        }
        else ->
            -1
    }
}

fun myPrint(str: String): String =
    when (str) {
        "hello", "world" -> str.toUpperCase()
        "hello world" -> str.toUpperCase()
        else -> "No match result"

    }