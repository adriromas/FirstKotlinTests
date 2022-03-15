package com.example.kotlinbasics

fun main(){
    val months = listOf("January", "February")
    val anyTypes = listOf(1,2,3,true,false,"string")
    print(anyTypes.size)

    val additionalMonths = months.toMutableList() //this way we can add items
    val newMonths = arrayOf("April", "May")
    additionalMonths.addAll(newMonths)
    println(additionalMonths)
    val days = mutableListOf<String>("Mon", "Tue")
    days.add("Thurs")
    days[2] = "Sun"
    println(days);
    val removeList = mutableListOf<String>("Mon", "Wed")
    days.removeAll(removeList)
    println(days);
}