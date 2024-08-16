import CalculadoraArquivo.CalculadoraPegadaCarbono
import java.io.File
import java.io.FileNotFoundException
import java.util.*

fun main() {
   /* val scanner = Scanner(System.`in`)
    val calculadora = CalculadoraPegadaCO()

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
    }*/

  /*  val calculadora = CalculadoraEmissao()

    print("Quantas viagens você deseja calcular? ")
    val numViagens = readLine()!!.toInt()

    var totalEmissao = 0.0
    repeat(numViagens) {
        var distancia: Double
        while (true) {
            print("Digite a distância da viagem ${it + 1} (km): ")
            distancia = readLine()!!.toDouble()
            if (distancia >= 0 && distancia <= 9999) break
            else println("Distância inválida! Deve ser um valor positivo e com no máximo 4 dígitos.")
        }

        var meioTransporte: String
        while (true) {
            print("Digite o meio de transporte (carro, ônibus, avião): ")
            meioTransporte = readLine()!!.lowercase()
            if (meioTransporte in listOf("carro", "ônibus", "avião")) break
            else println("Meio de transporte inválido! Deve ser carro, ônibus ou avião.")
        }

        totalEmissao += calculadora.calcularEmissao(distancia, meioTransporte)
    }

    println("A pegada de carbono total é: $totalEmissao kg CO2")*/

    val calculadora = CalculadoraPegadaCarbono()

    var totalPegadaCarbono = 0.0

    try {
        val linhas = File("src/resources/itens_consumo.txt").readLines()

        for (linha in linhas) {
            val partes = linha.split(":")
            val item = partes.getOrNull(0)?.trim()?.lowercase() ?: "item desconhecido"
            val quantidadeStr = partes.getOrNull(1)?.trim()?.replace("g", "") ?: "0"

            val quantidade = quantidadeStr.toDoubleOrNull() ?: 0.0

            val pegadaCarbono = calculadora.calcularPegadaCarbono(item, quantidade)
            totalPegadaCarbono += pegadaCarbono

            println("$item: ${pegadaCarbono} kg CO2")
        }

        println("Pegada de carbono total: $totalPegadaCarbono kg CO2")

    } catch (e: FileNotFoundException) {
        println("Erro: Arquivo não encontrado.")
    } catch (e: Exception) {
        println("Erro ao processar o arquivo: ${e.message}")
    }

}