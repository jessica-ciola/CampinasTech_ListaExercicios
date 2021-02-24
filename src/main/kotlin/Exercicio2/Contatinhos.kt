package Exercicio2

var listaDeContatos : MutableMap<String, Int> = mutableMapOf()



fun SalvarContato(nomeContato:String, telefoneContato:Int):MutableMap<String,Int> {
    var tamanho: Int = listaDeContatos.size


    if (listaDeContatos.containsKey(nomeContato) && listaDeContatos.containsValue(telefoneContato)) {
        println("Esse contato já existe")


        return listaDeContatos


    }else{


        if (tamanho < 3) {
            listaDeContatos.put(nomeContato,telefoneContato)
            return listaDeContatos

        } else {
            println("Número de contatos excede o limite")
            return listaDeContatos
        }

    }

}

fun RemoverContato(nomeContato:String, telefoneContato:Int):MutableMap<String,Int>{

    return if (listaDeContatos.containsKey(nomeContato) && listaDeContatos.containsValue(telefoneContato)) {
        listaDeContatos.remove(nomeContato,telefoneContato)
        println(listaDeContatos)
        listaDeContatos

    } else{
        println("Esse contato não existe")
        listaDeContatos
    }

}

fun BuscarContato(nomeContato:String):MutableMap<String, Int>{

    return if(listaDeContatos.contains(nomeContato)){
        println( " $nomeContato : ${listaDeContatos[nomeContato]}")
        listaDeContatos
    } else {
        println("Não existe esse contato cadastrado")
        listaDeContatos
    }


}

fun MostrarAgenda():MutableMap<String,Int> {
    println(listaDeContatos)
    return listaDeContatos
}