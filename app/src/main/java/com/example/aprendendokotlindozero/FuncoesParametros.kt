package com.example.aprendendokotlindozero

fun somar(numero1: Int, numero2: Int=0, numero3: Int = 0){//Definir a variavel como nao obrigatoria passando o valor =0
    println(numero1 + numero2 + numero3)
}

fun main(){
    //val numero:Int = 0, Do mesmo jeito que definimos uma variavel com o valor nulo
    //somar(numero1 = 10, numero2 = 50) Parametro nomeado
    somar(10, 22, 34)
}