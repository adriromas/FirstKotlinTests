package com.example.kotlinbasics
 // If a class is declared as sealed, you cannot inherit from it
//open class Vehicle{
//    // properties
//    // methods
//}

open class Vehicle(override val maxSpeed: Double, val name: String, val brand: String): Drivable{
 open var range: Double = 0.0
 fun extendRange (amount: Double){
    if (amount > 0)
      range += amount
  }

    override fun drive(): String {
        return "driving the interface drive"
    }
 open fun drive(distance: Double){
   println("Drove for $distance distance")
 }
}

class ElectricVehicle(maxSpeed: Double, name: String, brand: String, batteryLife: Double): Vehicle(maxSpeed, name, brand){
    override var range = batteryLife * 6
    override fun drive(distance: Double) {
        println("Drove for $distance KM on electricity")
    }
    override fun drive(): String{
        return "Drove for $range km on electricity"
    }

    override fun brake() {
        super.brake()
        println("Regenerating battery")
    }
}

interface Drivable{
    val maxSpeed: Double
    fun drive(): String
    fun brake(){
        println("The drivable is braking")
    }
}
fun main(){
    var a3 = Vehicle(200.0,"A3", "Audi")
    var tesla = ElectricVehicle (230.0,"Model S", "Tesla", 85.0)
//    a3.drive(200.0)
//    tesla.drive(200.0)
//    tesla.drive()
    tesla.brake()
    a3.brake()
}