import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)
    val calculadora = CalculadoraPegadaCarbono()

    println("Qual tipo de energia (eletricidade ou gás natural)?")
    val tipoEnergia = scanner.nextLine()

    println("Informe o consumo de energia em kWh ou m³:")
    val consumo = scanner.nextDouble()

    try {
        calculadora.validarConsumo(consumo)
        val pegadaCarbono = calculadora.calcularPegada(tipoEnergia, consumo)
        println("$tipoEnergia: %.2f kg CO2".format(pegadaCarbono))
        println("Total: %.2f kg CO2".format(calculadora.obterPegadaCarbonoTotal()))
    } catch (e: IllegalArgumentException) {
        println("Erro: ${e.message}")
    }
}