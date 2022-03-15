package com.example.kotlinbasics

// Lambda is a function which has no name
fun main(){
    val sum: (Int,Int) -> Int = {a:Int, b:Int -> a+b}
    println(sum(10,5))
    val sumShort = {a:Int, b:Int -> println(a+b)}
    sumShort(10,5)
}