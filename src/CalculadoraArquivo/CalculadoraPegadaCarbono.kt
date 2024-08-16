package CalculadoraArquivo
class CalculadoraPegadaCarbono {
    private val itens = arrayOf("arroz", "feijão")
    private val fatoresEmissao = arrayOf(0.003, 0.0025) // kg CO2/g

    fun calcularPegadaCarbono(item: String, quantidade: Double): Double {
        val index = itens.indexOf(item.lowercase())
        val fatorEmissao = if (index >= 0) fatoresEmissao[index] else 0.0
        return quantidade * fatorEmissao
    }
}
