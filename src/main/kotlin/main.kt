import Exercicio1.Pessoa
import java.time.LocalDate

fun main(args: Array<String>) {

  var Jessica = Pessoa(nome = "Ana", dataNascimento = "19-09-1991", altura = 1.68)

    println(Jessica.getInfo())

  var Sandro = Pessoa(nome = "Sandro", dataNascimento = "04-07-1989", altura = 1.70)

  println(Sandro.getInfo())



}