package com.example.aprendendokotlindozero

class Usuario2 constructor(nome: String, sobrenome: String){//Construtor Primario

    var nome: String = ""
    var sobrenome: String = ""

    init {//Inicializar
        this.nome = nome
        this.sobrenome = sobrenome
        println("Objeto inicializado")
        println("nome: $nome sobrenome: $sobrenome")
    }
}

fun main(){
    val usuario = Usuario2("Cleilton", "Santos")

}