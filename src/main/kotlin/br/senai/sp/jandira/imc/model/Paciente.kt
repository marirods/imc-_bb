package br.senai.sp.jandira.imc.model

import java.time.LocalDate
import java.time.Period
import kotlin.math.pow

class Paciente {

    var id: Int = 0
    var nome: String = ""
    var dataNascimento: LocalDate? = null
    var email: String = ""
    var peso: Int = 0
    var altura: Double = 0.0
    var imc: Double = 0.0
    var classificacaoImc: String = ""

    fun calcularImc(): Double{
        imc = peso/altura.pow(2)
        return imc
    }

    fun mostrarDadosBiometricos(){
        println("--------------------------------------------------")
        println("DADOS DO PACIENTE")
        println("--------------------------------------------------")
        println("NOME: $nome")
        println("PESO: $peso")
        println("ALTURA: $altura")
        println("IMC: $imc")
        println("CLASSIFICAÇÃO: $classificacaoImc")
        println("IDADE: ${calcularIdade()}")
        println("--------------------------------------------------")
    }

    fun classificarImc() {
        if (imc <= 18.5) {
            classificacaoImc = "Abaixo do Peso"
        } else if (imc > 18.5 && imc < 25.0) {
            classificacaoImc = "Peso Ideal"
        } else if (imc > 25.0 && imc < 30.0) {
            classificacaoImc = "Levemente acima do peso"
        }
    }

    fun calcularIdade() : Int {
        return Period.between(dataNascimento, LocalDate.now()).years
    }

}