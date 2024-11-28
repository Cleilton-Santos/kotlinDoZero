package com.example.aprendendokotlindozero

/*
fun fulano():Boolean = (true)
fun sicrano():Boolean = (false)
*/
fun soma(number1: Int, number2: Int = 0, numero3: Int){
    println(number1 + number2 + numero3)
}

fun main(){
    soma(23, 77, 34)

    /*val retorno = fulano() == sicrano()
    println(retorno)
*/
    /*val motoristas = arrayOf(
        "Cleilton", "Tuila", "Ubiratan", "Acerola"
    )*/
    /*val motoristas = 5
    if (motoristas >= 5){
        println("Seja Bem Vindo")
    }else{
        println("Nenhuma escolha")
    }*/

    /*val motoristas = 2

    for (betoneiros in motoristas){
        println("$betoneiros")
    }
    when(motoristas){
        1 -> println("Bom funcionario")
        2 -> println("Bom funcionario")
        3 -> println("Bom funcionario")
        else -> println("Nenhuma opcao selecionada")
    }*/
}