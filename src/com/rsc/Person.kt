package com.rsc

class Person (var Name: String) {
    fun display() {
        println("display $Name")
    }

    fun displayWithLambda(func: (s:String) -> Unit){
        func(Name)
    }
}