package com.chris.myapplication

fun main(){
    ifBasico()
    ifAnidado("dog")
    ifBoolean()
    ifInt()
}

fun ifMultiple(){
    var age = 18
    var permisoPadres = false
    var soyFeliz = true

    if (age>=18 && permisoPadres ==true && soyFeliz == true){
        println("Puedes beber")
    }else{
        println("No puedes beber")
    }
}

fun ifInt(){
    var age = 27

    if(age >= 18){
        println("Beber cerveza")
    }else{
        println("Beber jugo")
    }
}

fun ifBoolean(){
    var soyFeliz:Boolean = true

    if(!soyFeliz){
        println("Estoy triste :(")
    }
}

fun ifAnidado(animal:String){

    if (animal == "dog"){
        println("Es un perrito")
    }else if (animal == "cat"){
        println("Es un gatito")
    }else if (animal == "bird"){
        println("Es un pajarito")
    }else{
        println("No es uno de los animales esperados")
    }
}

fun ifBasico(){
    val name = "Aris"

    if (name == "Aris"){
        println("Oye, la variable name es ARIS")
    }else{
        println("Este no es Aris")
    }
}