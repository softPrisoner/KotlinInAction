package com.tony.kotlin

//class Person private constructor(username: String) {
class Person constructor(username: String) {
    private var username: String? = null
    private var age: Int? = null
    private var address: String? = null

    init {
        println(username)
        this.username = username
        this.age = 20
        this.address = "Beijing"
    }

    constructor(username: String, age: Int) : this(username) {
        println("$username , $age")
        this.username = username
        this.address = "beijing"
        this.age = age
    }

    constructor(username: String, age: Int, address: String) : this(username, age) {
        this.address = address
    }

    fun printInfo() {
        println("username:${this.username},age:${this.age},address:${this.address}")
    }
}

fun main(args: Array<String>) {
    val person = Person("tony");
    val person2 = Person("tony", 12)
    val person3 = Person("tony", 12, "HuBei")
    person.printInfo()
    person2.printInfo()
    person3.printInfo()
}
