package com.chris.myapplication

fun main(){
    var name:String = "ChrisPer"
    var name1:String = "ChrisPer"
    var name2:String = "ChrisPer"

    val diaSemana = arrayOf("Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sabado", "Domingo")
    println(diaSemana)
    println(diaSemana.size)

    if(diaSemana.size >=8){
        println(diaSemana[7])
    }else{
        println("No hay mas valores en el array")
    }

    //REEMPLAZAR VALORES EN ARRAY
    //diaSemana[0] = "Hola"
    //println(diaSemana[0])

    //BUCLE EN ARRAYS
    for( position in diaSemana.indices){
        println(diaSemana[position])
    }

    for((position, value) in diaSemana.withIndex()){
        println("La posicion $position, contiene $value")
    }

    for (diaSemanas in diaSemana){
        println("Ahora es $diaSemanas")
    }
}

