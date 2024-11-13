package com.example.aprendendokotlindozero

fun main(){
    /*val notaAluno = 8
    val condicao = notaAluno >= 6*/

    /*val opcao = 4

    if (opcao == 1){
        println("Cartao de credito")
    }else if (opcao == 2){
        println("Extrato Bancario")
    }else if (opcao == 3){
        println("Saldo")
    }else{
        println("Nnehuma opcao selecionada")
    }*/

    /*val opcao = 4

    if (opcao in 1..3){
        println("Cartao de credito")
    }else if (opcao in 4 .. 8){
        println("Nao tem")
    }else{
        println("negado")
    }*/
    val opcao = 4

    //println("Cartao de credito")
    //println("Extrato Bancario")
    //println("Saldo")
    when(opcao){
        1 -> println("Cartao de credito")
        2 -> println("Extrato Bancario")
        in 3 .. 5 -> println("Saldo")//vamos supor que a pessoa utilize o saldo do 3 > 5
        else -> println("Nnehuma opcao selecionada")
    }

}