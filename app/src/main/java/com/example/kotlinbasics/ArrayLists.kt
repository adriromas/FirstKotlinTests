package com.example.kotlinbasics
// Arraylist are like arrays but with dynamic size
fun main(){
    val arrayList = ArrayList<String>()
    arrayList.add("one")
    arrayList.add("two")
    println("print array list")
    for (i in arrayList){
        println(i)
    }
    val itr = arrayList.iterator()
    while (itr.hasNext()){
        println(itr.next())
    }
    print(arrayList[1])
    var myArrList = arrayListOf(1.0,2.0,3.0,4.0,5.0)
    var avg = 0.0
    var sum = 0.0
    for(i in myArrList){
        sum += i
    }
    avg = sum / myArrList.size
    println(avg)
}