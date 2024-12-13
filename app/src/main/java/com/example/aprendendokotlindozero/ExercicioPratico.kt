package com.example.aprendendokotlindozero

class ContaBancaria (
    var agencia: String,
    var conta: String,
    var senha: String
){
    var saldo: Double = 50.0
    var usuarioAutenticado: Boolean = false

    // Simula autenticação
    init {
        usuarioAutenticado = true
    }
    fun retornarSaldo(): Double {
        return if (usuarioAutenticado) saldo else 0.0
    }
    fun depositar(deposito1: Double = 40.5){
        println(saldo + deposito1)
    }
    fun sacar(saque1: Double = 20.0){
        println(saldo - saque1)
    }
}

fun main(){
    val conta = ContaBancaria("PicPay", "Simao Dias", "cleitinquebradeira46")
    val deposito = conta.retornarSaldo()
    println("Usuario Autenticado: ${conta.usuarioAutenticado}")
    println("Agencia: ${conta.agencia}")
    println("Conta: ${conta.conta}")
    println("Saldo: $deposito")
}