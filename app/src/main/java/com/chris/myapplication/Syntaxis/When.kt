package com.chris.myapplication

import java.time.Month

fun main(){

}

fun getTrimester(month:Int){
    when(month){
        1,2,3 -> print("Primer Trimestre")
        4,5,6 -> print("Segundo Trimestre")
        7,8,9 -> print("Tercer Trimestre")
        10,11,12 ->print("Cuarto Trimestre")
        else-> print("Trimestre no valido")
    }
}

fun getSemester(month: Int){
    when(month){
        in 1..6 ->print("Primer Semestre")
        in 6..12 ->print("Segundo Semestre")
        !in 1..12 -> print("Semestre no valido")
    }
}

fun getSemester2(month: Int) = when(month){
        in 1..6 -> "Primer Semestre"
        in 6..12 -> "Segundo Semestre"
        !in 1..12 -> "Semestre no valido"
        else -> "oa"
    }

/*No es Recomendable*/
fun result(value:Any){
    when(value){
        is Int -> value+value
        is String -> println(value)
        is Boolean -> if(value) print("holiwi")
    }
}