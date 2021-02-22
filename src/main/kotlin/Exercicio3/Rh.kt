package Exercicio3

class Rh {
    var listaDeFuncionarios : MutableMap<String, Int> = mutableMapOf("" to  0)



    fun SalvarContato(nomeContato:String, id: Int, cpf:Int, salario:Boolean):Any {


        var tamanho: Int = listaDeFuncionarios.size

        if (listaDeFuncionarios.containsKey(nomeContato) && listaDeFuncionarios.containsValue(id)) {

            return "Esse contato já existe"


        }else{
            if(listaDeFuncionarios.containsKey("") && listaDeFuncionarios.containsValue(0)){
                listaDeFuncionarios.remove("")


            }


            listaDeFuncionarios.put(nomeContato,id)
            return println(listaDeFuncionarios)


        }

    }

   

}