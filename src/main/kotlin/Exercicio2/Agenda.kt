package Exercicio2




data class Agenda(var listaDeContatos : MutableMap<String, Int>) {






    fun SalvarContato(nomeContato:String, telefoneContato:Int):MutableMap<String,Int> {


        var tamanho: Int = listaDeContatos.size

        if (listaDeContatos.containsKey(nomeContato) && listaDeContatos.containsValue(telefoneContato)) {
            println("Esse contato ja existe")


            return listaDeContatos


        }else{


            if (tamanho < 10) {
                listaDeContatos.put(nomeContato,telefoneContato)
                println("Contato Salvo com sucesso!")
                return listaDeContatos

            } else {
                println("Numero de contatos excede o limite")
                return listaDeContatos
            }

        }

    }

    fun RemoverContato(nomeContato:String, telefoneContato:Int):MutableMap<String,Int>{

        return if (listaDeContatos.containsKey(nomeContato) && listaDeContatos.containsValue(telefoneContato)) {
            listaDeContatos.remove(nomeContato,telefoneContato)
            println("Contato Removido com Sucesso")
            println(listaDeContatos)
            listaDeContatos

        } else{
            println("Esse contato nao existe")
            listaDeContatos
        }

    }

    fun BuscarContato(nomeContato:String):MutableMap<String, Int>{

        return if(listaDeContatos.contains(nomeContato)){
           println( " $nomeContato : ${listaDeContatos[nomeContato]}")
            listaDeContatos
        } else {
            println("Nao existe esse contato cadastrado")
            listaDeContatos
        }


    }

    fun MostrarAgenda():MutableMap<String,Int> {
        println(listaDeContatos)
        return listaDeContatos
    }






}