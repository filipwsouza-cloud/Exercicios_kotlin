fun validarBioInfantil(bio: String?) {

    val tamanho = bio?.length ?: 0

    if (tamanho <= 50) {
        println("Bio aceita")
    } else {
        println("Bio muito longa")
    }
}

fun main() {

    validarBioInfantil("Sou uma criança")
    validarBioInfantil(null)
    validarBioInfantil("Esta é uma biografia muito grande que ultrapassa cinquenta caracteres.")
}
