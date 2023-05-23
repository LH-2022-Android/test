package com.example.myapplication

import kotlin.math.max

fun largerNumber(num1: Int, num2: Int): Int {
    return max(num1, num2)


}
fun main(){
    println ("Hello World!");
    var a: Int = 10

    println("a="+a)
    a = largerNumber(1,2);
    println("a="+a)
    a= getScore("Tom")
    checkNumber(1);
    println("a="+a)
    for (i in 0..10) {
        println(i)
    }

}
fun getScore(name: String) = when (name) {
    "Tom" -> 86
    "Jim" -> 77
    "Jack" -> 95
    "Lily" -> 100
    else -> 0
}

fun checkNumber(num: Number) {
    when (num) {
        is Int -> println("number is Int")
        is Double -> println("number is Double")
        else -> println("number not support")
    }
}
