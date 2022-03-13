package com.example.kotlinbasics

import java.util.*
import kotlin.IllegalArgumentException

fun main(){
//    var adri = Person ("Adrian", "Romasanta", 35)
//    println("Adri is ${adri.age} years old")
//    var john = Person()
//    john.hobby = "playing football"
//    john.stateHobby()
//    var johnPeterson = Person (lastName = "Peterson")
//
//    var mp1 = MobilePhone("Android", "Samsung", "Galaxy S20 Ultra")
//    var mp2 = MobilePhone("Android", "Google", "Pixel 5")
    var mp3 = MobilePhone("iOS", "Apple", "Iphone 13 Pro Max")
    mp3.chargeBattery(30)
    mp3.chargeBattery(30)
    mp3.chargeBattery(30)

//    var myCar = Car()
//    myCar.maxSpeed = 222
//    myCar.myModel = "M4"
//    println("Brand is ${myCar.myBrand}")

    val user1 = User (1, "Adri")
    val user2 = User (2, "Mike")
    println(user1.equals(user2))
    println("User details: $user1")
    val updatedUser = user1.copy(name = "Denis")
    println(updatedUser)
    println(updatedUser.component1()) // prints 1
    val (iduu, nameuu) = updatedUser
}

class Person(firstName: String = "John", lastName: String = "Doe"){
    // Member variables
    var firstName: String? = null
    var age: Int? = null
    var hobby: String = "watching Netflix"
    // Executed when an object is created
    init {
        this.firstName = firstName
        println ("Person created with first name $firstName and last name $lastName")
    }
    // Member secondary constructor
    constructor(firstName: String, lastName: String, age: Int)
            : this (firstName, lastName){
                this.age = age
                println ("Person created with first name $firstName, last name $lastName and " +
                        "age $age")
            }

    //Member functions
    fun stateHobby(){
        println("$firstName\'s hobby is $hobby")
    }
}

class MobilePhone (osName: String, brand: String, model: String){
    private var battery = 30

    init {
        println ("MobilePhone created with osName $osName, brand $brand and model $model")
    }
    fun chargeBattery(amountCharge : Int){
        println("Previous battery state was ${this.battery}")
        println("$amountCharge has been charged")
        if (this.battery + amountCharge <= 100) {
            this.battery += amountCharge
        }
        else this.battery = 100
        println("Current battery state is ${this.battery}")
    }
}

open class Car(){
    lateinit var owner : String
    val myBrand : String = "BMW"
        // Custom getter for myBrand field
        get(){
//            field is used to avoid using the property itself within the get, because this would
//            cause a recursive call and an stack overflow
            return field.lowercase()
        }
    var maxSpeed : Int = 250
        // value is the value given to the variable when using = operator
        set(value) {
            field = if (value > 0) value else throw IllegalArgumentException("Minimum value is 0")
        }
    var myModel : String = "M5"
        private  set
    init {
        this.owner = "Frank"
    }
}

data class User(val id: Long, var name: String)