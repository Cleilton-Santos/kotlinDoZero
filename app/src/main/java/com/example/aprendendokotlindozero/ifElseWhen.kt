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

    val opcao = 4

    if (opcao in 1..3){
        println("Cartao de credito")
    }

}