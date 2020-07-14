package com.tony.kotlin

//Default public
class EmptyClass

//在kotlin中,一个类可以有一个primary构造方法以及一个或多个secondary构造方法
//constructor 声明为primary构造方法为类头
//如果primary构造方法没有任何注解或是可见性关键字修饰,那么constructor可省略掉
//class MyClass constructor(username: String) {
class MyClass(username: String) {
    private val username: String = username.toUpperCase()

    //初始代码块-可以使用构造函数中的参数
    init {
        println(username)
    }
}

fun main(args: Array<String>) {
    val myClass = MyClass("tony li")
}