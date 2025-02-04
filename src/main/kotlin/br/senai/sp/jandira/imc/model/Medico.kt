package br.senai.sp.jandira.imc.model

import java.time.LocalDate

class Medico {

    var id: Int = 0
    var nome: String = ""
    var especialidades = ArrayList<String>()
    var email: String = ""

    fun exibirFichaDoMedico(){
        println("--------------------------------------------------")
        println("FICHA DO MÉDICO")
        println("--------------------------------------------------")
        println("NOME: $nome")
        println("E-MAIL: $email")
        println("ESPECIALIDADES DO MÉDICO:")
        for (especialidade in especialidades){
            println("   -> $especialidade")
        }
        println("-----------------------------------")
    }
}