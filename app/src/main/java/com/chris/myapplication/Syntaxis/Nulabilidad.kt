package com.chris.myapplication

fun main(){
    var name:String? = null
    //name? significa si no es un valor nulo, get(3) devuelveme la posicion 3
    //:? si es nulo devuelveme "Es nullo"
    println(name?.get(3) ?: "Es nullo")
}