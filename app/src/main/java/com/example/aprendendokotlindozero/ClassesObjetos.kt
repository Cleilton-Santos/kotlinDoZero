package com.example.aprendendokotlindozero

class Jogador {

    var kart = ""
    var pneu = ""
    var planador = ""

    fun acelerar(aceleracao: Int = 0){
        println("Acelerar na velocidade: $aceleracao km/h")
    }
    fun retornarPoder(): String = "Casco Vermelho"

}

fun main(){
    val jogador1 = Jogador()//Caixa 01
    //jogador1.kart = "Kart do Mario"
    jogador1.acelerar(90)
    val poder = jogador1.retornarPoder()
    println(poder)
    //println(jogador1.kart)
    //jogador1 = Jogador()Quando eu utilizo var eu consigo instanciar um novo jogador
}