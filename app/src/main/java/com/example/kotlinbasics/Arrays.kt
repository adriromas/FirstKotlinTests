package com.example.kotlinbasics

fun main(){
//    val numbers = intArrayOf(1,2,3,4,5,6)
    val numbers = arrayOf(1,2,3,4,5,6)
//    print (numbers) // Ugly output
    println (numbers.contentToString()) //Brackets output
    for (element in numbers){
        print(element)
    }
    val fruits = arrayOf(Fruit("apple", 2.5), Fruit("orange", 1.0))
    println(fruits.contentToString())
    for(index in fruits.indices){
        println("${fruits[index].name}")
    }
}

data class Fruit(val name: String, val price:Double)