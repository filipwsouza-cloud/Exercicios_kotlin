fun main() {

    val transferencias = listOf(50.0, null, 120.5, null, 10.0)

    var total = 0.0

    for (valor in transferencias) {

        if (valor != null) {
            total += valor
        } else {
            println("Transação ignorada")
        }
    }

    println("Valor total processado: $total")
}
