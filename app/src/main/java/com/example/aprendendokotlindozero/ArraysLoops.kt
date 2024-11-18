package com.example.aprendendokotlindozero

fun main(){

    /*val nomes = arrayOf(
        "Jamilton", "Ana"
    )
    nomes[0] = "mudou "
    println(nomes[0])
    */
    /*var numero = 1
    while (numero <= 5){
        println("Executou: $numero")
        numero++//incremento
    }*/

    /*for (numero in 1..4){
        println("Executou: $numero")
    }*/

    val postagens = arrayOf(
        "Viagem para a praia",
        "Levei meu cahorro no veterinario",
        "Trilha com os amigos"
    )

    for ((indice, postagem) in postagens.withIndex()){
        println("$indice: $postagem")
    }

}