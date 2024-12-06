package com.example.aprendendokotlindozero

/*
fun fulano():Boolean = (true)
fun sicrano():Boolean = (false)
*//*
fun soma(number1: Int, number2: Int = 0, numero3: Int){
    println(number1 + number2 + numero3)
}*/
class Usu{
    val nome: String = ""
    val sobrenome: String = ""

    fun logar(nome: String, sobrenome: String){
        println("Usuario logado na base de dados")
    }
}

fun main(){
    val usu1 = Usu()
    usu1.logar("Cleilton", "Santos")
    println(usu1)
    /*soma(23, numero3 = 65)*/

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