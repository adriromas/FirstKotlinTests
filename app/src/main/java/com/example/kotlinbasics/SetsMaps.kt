package com.example.kotlinbasics

fun main(){
    // Sets avoid repetitions
    val fruits = setOf("orange", "apple", "grape", "orange")
    println(fruits.toSortedSet())

    val newFruits = fruits.toMutableList()
    newFruits.add("Water melon")
    newFruits.add("Pear")
    print(newFruits)

    //Maps are key value pair
    val daysOfWeek = mapOf(1 to "Monday", 2 to "Tuesday", 3 to "Wednesday")
    print(daysOfWeek[2])
    for (key in daysOfWeek.keys){
        println("$key is to ${daysOfWeek[key]}")
    }
}