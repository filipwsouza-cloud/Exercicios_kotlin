fun limparEmails(emails: List<String?>) {

    var contasInvalidas = 0

    for (email in emails) {

        val tamanho = email?.length ?: 0

        if (email == null || tamanho == 0) {

            contasInvalidas++

            println("Conta inválida: será apagada.")

        } else {

            println("Conta válida: $email")
        }
    }

    println("Contas que precisam ser apagadas: $contasInvalidas")
}

fun main() {

    val emails = listOf(
        "usuario@email.com",
        null,
        "",
        "teste@email.com"
    )

    limparEmails(emails)
}
