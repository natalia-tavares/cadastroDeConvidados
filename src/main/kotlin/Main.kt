fun main(args: Array<String>) {


    var escolhaSimNao:String="nao"

    println("Deseja acessar o menu ?")
    escolhaSimNao= readLine()!!
    while (escolhaSimNao=="Sim"||escolhaSimNao=="sim"||escolhaSimNao=="s"||escolhaSimNao=="S") {
        println("\n\nDigite 1 para adicionar convidado")
        println("Digite 2 para remover convidado")
        println("Digite 3 para apresentar a lista de  convidados")

        var escolhaMenu= readLine()!!
        val convidados= mutableListOf<String>("Matheus","Allan")
        when(escolhaMenu){
            "1"-> adicionarConvidados(convidados)
            "2"-> removerConvidados(convidados)
            "3"->listarConvidados(convidados)
        }

        println(" Atualmente esta na lista os seguintes nomes: $convidados")
        println("\n Deseja continuar?")

    }
    println("Programa encerrado")


}


fun adicionarConvidados(convidados:MutableList<String>):Any {
    println("Qual nome do convidado que você deseja adicionar ")
    var nomeConvidado= readLine()!!
    convidados+=(nomeConvidado)

    return convidados
}


fun removerConvidados(convidados:MutableList<String>):Any {
    println("Qual nome do convidado que você deseja remover ")
    var nomeConvidado = readLine()!!
    return if (convidados.contains(nomeConvidado)) {
        convidados.remove(nomeConvidado)
        println("$nomeConvidado removido com sucesso")

    } else {
        println("Nome não localizado : $nomeConvidado")
    }

}

fun listarConvidados(convidados: MutableList<String>){
    for(item in convidados )
        println(item)
}
