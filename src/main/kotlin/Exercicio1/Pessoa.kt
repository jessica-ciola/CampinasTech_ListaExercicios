package Exercicio1

import java.time.LocalDate
import java.time.Period
import java.time.format.DateTimeFormatter
import java.util.*

data class Pessoa(private var nome: String,
             private var dataNascimento: String,
             private var altura: Double ) {

    fun calculaIdade(dataNascimento: String):Int{
        var formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy")
        var aniversario = LocalDate.parse(dataNascimento,formatter)
        var current = LocalDate.now()
        return Period.between(
            aniversario, current).years

    }

    fun getInfo(): String{
        return "$nome nasceu em $dataNascimento, tem ${calculaIdade(dataNascimento)} anos e possui ${altura}m de altura."

    }
}