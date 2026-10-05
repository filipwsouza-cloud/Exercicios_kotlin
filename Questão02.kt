fun processarEntregas(enderecos: List<String?>) {

    for (endereco in enderecos) {

        val enderecoFinal = endereco ?: "Endereço Desconhecido"

        if (enderecoFinal == "Endereço Desconhecido") {
            println("Entrega Pendente: Falta de dados")
        } else {
            println("Rota traçada para: $enderecoFinal")
        }
    }
}

fun main() {

    val enderecos = listOf(
        "Rua A, 100",
        null,
        "Rua B, 200",
        null
    )

    processarEntregas(enderecos)
}
