package com.example.kotlinbasics

import java.lang.Byte.toString

fun main() {
    println("Hello, world!!!")
    // This is a comment. Comments start with //
    // val is used for variables which are immutable (not changeable)
    val myName = "Denis"
    // myName = "Michael" // ERROR: Val cannot be reassigned

    /* This is a multi line comment starts with /* and ends with *'/ without the '
     var is used for variables which are mutable/changeable.
     kotlin is a strongly typed language that supports Type Inference.
     The compiler will directly assume the size and type to a variable by that.
     For example, if you assign any whole number to a variable,
     the compiler will directly assume that the variable is of type Int
    */ */
    var myAge = 31

    // Integer TYPES: Byte (8 bit), Short (16 bit), Int (32 bit), Long (64 bit)
//    val myByte: Byte = 13
//    val myShort: Short = 125
//    val myInt: Int = 123123123
//    val myLong: Long = 12_039_812_309_487_120
//
//    // Floating Point number Types: Float (32 bit), Double (64 bit)
//    val myFloat: Float = 13.37F
//    val myDouble: Double = 3.14159265358979323846

    // Booleans the type Boolean is used to represent logical values.
    // It can have two possible values true and false.
    var isSunny: Boolean = true
    // not sunny anymore...
    isSunny = false

    // Characters
    val letterChar = 'A'
    val digitChar = '1'

    // Strings
    val myStr = "Hello World"
    var firCharInStr = myStr[0]
    var lastCharInStr = myStr[myStr.length - 1]

    var myString: String = "Android Masterclass"
    var myFloat: Float = 13.37F
    var myDouble: Double = 3.14159265358979
    var myByte: Byte = 25
    var myShort: Short = 2020
    var myLong: Long = 18881234567
    var myBoolean: Boolean = true
    var myChar: Char = 'a'

//    print ("First character $myString is not as cool as ${myString.length}")
    //create a variable for testing all condition
    val age = 16
//create a variable for drinkingAge
    val drinkingAge = 21
//create a variable for votingAge
    val votingAge = 18
//create a variable for drivingAge
    val drivingAge = 16

//Assign the if statement to a variable
    val currentAge = when {
        age >= drinkingAge -> {
            println("Now you may drink in the US")
/* return the value for this block */
            drinkingAge
        }
        age >= votingAge -> {
            println("You may vote now")
//return the value for this block
            votingAge
        }
        age >= drivingAge -> {
            println("You may drive now")
//return the value for this block
            drivingAge
        }
        else -> {
            println("You are too young")
//return the value for this block
            age
        }
    }

    var season = 3
    when (season) {
        1 -> println("Spring")
        in 2..4 -> print("Summer")
        else -> println("Other")
    }

    var x = 100
    while (x >= 0){
        println("$x")
        x-=2
    }
    println("pepe")

    var feltTemp = "cold"
    var roomTemp = 10
    while (feltTemp == "cold"){
        roomTemp++
        if(roomTemp >= 20){
            feltTemp = "comfy"
            println("It's comfy now")
        }
    }
    for (num in 10 downTo 1 step 2) println ("$num")

    for (i in 0..10000){
        if (i == 9001) println("It's over 9000!!!")
    }
    var humidityLevel = 80
    var humidity = "Humid"
    while (humidityLevel >= 60){
        humidityLevel -= 5
        println("Humidity decreased")
    }
    println("It's comfy now")
    humidity = "Comfy"


}