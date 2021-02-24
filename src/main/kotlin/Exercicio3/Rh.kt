package Exercicio3

abstract class Inicio(){
    abstract val salario: Double
    abstract val cpf: Int
    abstract val nomeContato: String
    abstract val id: Int

}



data class SalvarContatoRh(override val salario: Double,
                           override val cpf: Int,
                           override val nomeContato: String,
                           override val id: Int

):Inicio() {

    var listaDeFuncionarios: MutableMap<Int, List<Any>> = mutableMapOf()
    var tamanho: Int = listaDeFuncionarios.size


    fun salvar(): Any {



            if (listaDeFuncionarios.containsKey(id) && listaDeFuncionarios.containsValue(
                    listOf(
                        nomeContato,
                        cpf,
                        salario
                    )
                )
            ) {
                println("Esse funcionário já existe")

                return listaDeFuncionarios


            } else {

                listaDeFuncionarios[id] = listOf(nomeContato, cpf, salario)
                return listaDeFuncionarios
            }


    }
}

