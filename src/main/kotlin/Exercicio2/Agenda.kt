package Exercicio2




data class Agenda(var nomeAgenda: String) {


    var listaDeContatos : MutableMap<String, Int> = mutableMapOf("" to  0)



    fun SalvarContato(nomeContato:String, telefoneContato:Int):Any {


        var tamanho: Int = listaDeContatos.size

        if (listaDeContatos.containsKey(nomeContato) && listaDeContatos.containsValue(telefoneContato)) {

            return "Esse contato já existe"


        }else{
            if(listaDeContatos.containsKey("") && listaDeContatos.containsValue(0)){
                listaDeContatos.remove("")


            }


            if (tamanho < 3) {
                listaDeContatos.put(nomeContato,telefoneContato)
                println("Agenda da $nomeAgenda")
                return println(listaDeContatos)

            } else {
                return println("Número de contatos excede o limite")
            }

        }

    }

    fun RemoverContato(nomeContato:String, telefoneContato:Int):Any{

        return if (listaDeContatos.containsKey(nomeContato) && listaDeContatos.containsValue(telefoneContato)) {
            listaDeContatos.remove(nomeContato,telefoneContato)
            println(listaDeContatos)

        } else{
            "Esse contato não existe"
        }

    }

    fun BuscarContato(nomeContato:String):Any{

        return if(listaDeContatos.contains(nomeContato)){
            " $nomeContato : ${listaDeContatos[nomeContato]}"
        } else {
            "Não existe esse contato cadastrado"
        }


    }

    fun MostrarAgenda() {
        return println(listaDeContatos)
    }






}