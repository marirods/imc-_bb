package br.senai.sp.jandira.imc

import br.senai.sp.jandira.imc.model.Medico
import br.senai.sp.jandira.imc.model.Paciente
import java.time.LocalDate

fun main() {

    // criar o paciente Ana Maria
    var paciente1 = Paciente()
    paciente1.id = 1
    paciente1.nome = "Ana Maria"
    paciente1.email = "ana@email.com"
    paciente1.altura= 1.67
    paciente1.peso= 59
    paciente1.dataNascimento = LocalDate.of(2001,8, 13)
    paciente1.calcularImc()
    paciente1.classificarImc()
    paciente1.mostrarDadosBiometricos()



    //criar o paciente Mariane Rodrigues
    var paciente2 = Paciente()
    paciente2.id = 2
    paciente2.nome = "Mariane Rodrigues"
    paciente2.email = "mariane.rodrigues@email.com"
    paciente2.altura = 1.64
    paciente2.peso = 60
    paciente2.dataNascimento = LocalDate.of(2007, 4, 2)
    paciente2.calcularImc()
    paciente2.classificarImc()
    paciente2.mostrarDadosBiometricos()


    // criar um objeto médico

    var medico1 = Medico()
    var medico2 = Medico()

    medico1.id = 1
    medico1.nome = "Roberta"
    medico1.email = "roberta@hospital.com"
    medico1.especialidades.add("Nutricionista")
    medico1.especialidades.add("Gastroenterologista")
    medico1.exibirFichaDoMedico()


}




