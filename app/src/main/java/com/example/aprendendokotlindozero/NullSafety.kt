package com.example.aprendendokotlindozero

class Carro {
    var cor = "Vermelho"

    fun acelerar(){
        // ***
    }
}
fun main(){
    var carro: Carro? = null
    //carro = Carro()
    // ***
    val cor = carro?.cor ?: "cor padrao"
    println(carro?.cor)// Chamada segura
}