package com.example.kotlinbasics

fun main(){
    myFunction()
    addup(2, 3)
}
fun addup(a: Int, b:Int) : Int{
    var result = a+b
    print ("Result is $result")
    return result
}
fun myFunction(){
    print ("Called from myFunction")
}