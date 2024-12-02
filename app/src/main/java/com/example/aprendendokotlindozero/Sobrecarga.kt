package com.example.aprendendokotlindozero

class Usuario{
    //Propiedades
    fun logar(email: String, senha: String){
        println("Usuario logado com email: $email e senha: $senha")
    }
    fun logar(numeroTelefone: String){
        println("Usuario logado com telefone: $numeroTelefone")
    }
}

fun main(){
    val usuario = Usuario()
    usuario.logar("cleilton14s@gmail.com", "cleitin1234")
    usuario.logar("79999130957")
}