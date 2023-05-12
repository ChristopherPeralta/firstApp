package com.chris.myapplication

fun main(){
    mutableList()
}

//LISTA INMUTABLE
fun inmutableList(){
    val readOnly:List<String> = listOf("Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sabado", "Domingo")

    println(readOnly.size)
    println(readOnly)
    println(readOnly[0])
    println(readOnly.last())
    println(readOnly.first())

    //BUCLE que contenga la letra a
    val example = readOnly.filter { it.contains(other = "a") }
    println(example)

    //BUCLE
    readOnly.forEach { diaSemana -> println(diaSemana) }
}

//LISTA MUTABLE
fun mutableList(){
    var weekDays:MutableList<String> = mutableListOf("Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sabado", "Domingo")
    weekDays.add("ChrisPer")
    weekDays.add(0,"PerChris")
    println(weekDays)

    if(weekDays.isEmpty()){

    }else{
        weekDays.forEach{println(it)}
    }

    if(weekDays.isNotEmpty()){
        weekDays.forEach{ println(it)}
    }

    weekDays.last()
}