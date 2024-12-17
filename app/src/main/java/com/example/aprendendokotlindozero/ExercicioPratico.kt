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
    fun recuperarSaldo(): Double {
        return if (usuarioAutenticado) saldo else 0.0
    }
    fun depositar(deposito: Double ){
        if (deposito > 0) {
            saldo += deposito
            println("Depósito de R$$deposito realizado com sucesso!")
        } else {
            println("O valor do depósito deve ser maior que 0.")
        }
    }
    fun sacar(saque: Double) {
        if (usuarioAutenticado) {
            if (saque > 0 && saque <= saldo) {
                saldo -= saque
                println("Saque de R$$saque realizado com sucesso!")
            } else if (saque > saldo) {
                println("Saldo insuficiente para o saque.")
            } else {
                println("O valor do saque deve ser maior que 0.")
            }
        } else {
            println("Usuário não autenticado. Não é possível realizar saques.")
        }
    }
    fun extrato(dias: Int){
        println("Extrato dos ultimos $dias dias ")
    }
    fun extrato(dataInicial: String, dataFinal: String){
        println("Extrato intervalo $dataInicial a $dataFinal")
    }
}

fun main(){
    val conta = ContaBancaria("PicPay", "Simao Dias", "cleitinquebradeira46")
    println("Saldo: ${conta.recuperarSaldo()}")
    conta.depositar(200.0)
    conta.sacar(500.0)
    println("Saldo: ${conta.recuperarSaldo()}")
    conta.extrato(10)
    conta.extrato("01/01/24", "30/03/24")
}