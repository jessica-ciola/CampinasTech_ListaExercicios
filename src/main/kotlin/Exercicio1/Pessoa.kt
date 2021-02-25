package Exercicio1

import java.time.LocalDate
import java.time.Period
import java.time.format.DateTimeFormatter
import java.util.*

data class Pessoa(private var nome: String,
             private var dataNascimento: String,
             private var altura: Double ) {

    fun calculaIdade(dataNascimento: String):Int{
        var formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy") //cria um formato pra data
        var aniversario = LocalDate.parse(dataNascimento,formatter) //coloca o formato da data no nascimento
        var current = LocalDate.now() //pega a data do dia

        //calcula a idade
        return Period.between(
            aniversario, current).years

    }

    //retorna a informação
    fun getInfo(): String{
        return "$nome nasceu em $dataNascimento, tem ${calculaIdade(dataNascimento)} anos e possui ${altura}m de altura."

    }
}