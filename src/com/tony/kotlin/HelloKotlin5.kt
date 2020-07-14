package com.tony.kotlin

fun main(args: Array<String>) {

}

fun convert2UpperCase(str: Any): String? {
    if (str is String) {
        return str.toUpperCase()
    }
    return null
}
