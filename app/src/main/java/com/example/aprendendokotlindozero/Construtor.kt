package com.example.aprendendokotlindozero

//Construtor Primario
class Usuario2 (
    var nome: String = "",
    var sobrenome: String = ""
){

    init {//Inicializar
        /*this.nome = nome
        this.sobrenome = sobrenome*/
        println("Objeto inicializado")
        println("nome: $nome sobrenome: $sobrenome")
    }
    //Constructor Secondary
    constructor(nome: String): this(nome, ""){
        println("Construtor Secundario")
    }

}

fun main(){
    val usuario = Usuario2("Cleilton")

}