package Exercicio3

data class Rh(var listaDeFuncionarios : MutableMap<Int, MutableList<Any>>):CalcularSalario {


    fun salvar(id: Int, nomeContato: String, cpf: String, salario: Double): MutableMap<Int, MutableList<Any>> {

        //Verifica se o funcionrio já está cadastrado pelo id
        if (listaDeFuncionarios.containsKey(id)) {
            println("Esse funcionario já existe")

            return listaDeFuncionarios


        } else {

            var cargo: String

            //Pede se o funcionario é Programador ou Gestor

            do {
                println("Qual o cargo do funcionario? <Digite P (programador) ou G (gestor)")
                cargo = readLine().toString()

            } while (cargo.isEmpty() && cargo != "G" && cargo!= "P")

            cargo = if (cargo == "G") "Gerente" else "Programador"

            //Instancia o funcionario e seus dados
            listaDeFuncionarios[id] = mutableListOf(nomeContato, cpf, salario, cargo)
            println("Funcionario adicionado com sucesso")
            return listaDeFuncionarios
        }


    }

    fun BuscarFuncionario(id: Int): MutableMap<Int, MutableList<Any>> {

        return if (listaDeFuncionarios.contains(id)) {
            var opcao: String

                //Pergunta se quer mostrar ou aumentar o salario
            do {
                println("Você deseja exibir os dados do Funcionário (E) ou Aumentar seu salário (A)")
                opcao = readLine().toString()

            } while (opcao.isEmpty() && opcao != "E" && opcao != "A") //Verifica se está em branco ou digitou correto


            if (opcao == "E") {
                println(" $id : ${listaDeFuncionarios[id]}")
                listaDeFuncionarios

            } else {

                var pegaSalario: MutableList<Any> = mutableListOf()
                pegaSalario = listaDeFuncionarios[id]!! //pega os dados do funcionario
                var salario = pegaSalario[2].toString().toDouble() //objeto de indice 2 da lista é o salrio
                var cargo = pegaSalario[3].toString() //objeto de indice 3 da lista é o cargo


                pegaSalario[2] = calcular(salario, cargo = cargo) //calcula o salario novo e troca no registro
                listaDeFuncionarios[id] = pegaSalario //troca os dados no registro
                listaDeFuncionarios

            }


        } else {
            println("Nao existe esse funcionario cadastrado")
            listaDeFuncionarios
        }


    }


    override fun calcular(salario: Double, cargo: String): Double {
        return if (cargo == "E") {
            salario * 1.1
        } else
        {

            salario * 1.2
        }


}

    fun MostrarFuncionarios():MutableMap<Int,MutableList<Any>> {
        println(listaDeFuncionarios)
        return listaDeFuncionarios
    }


}