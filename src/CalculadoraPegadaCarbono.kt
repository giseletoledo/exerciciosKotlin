class CalculadoraPegadaCarbono {

    private val fatorEletricidade = 0.475 // kg CO2/kWh
    private val fatorGas = 2.0            // kg CO2/m³
    private var pegadaCarbonoTotal = 0.0

    fun calcularPegada(tipoEnergia: String, consumo: Double): Double {
        val pegadaCarbono = when (tipoEnergia.lowercase()) {
            "eletricidade" -> consumo * fatorEletricidade
            "gás" -> consumo * fatorGas
            else -> throw IllegalArgumentException("Tipo de energia desconhecido")
        }
        pegadaCarbonoTotal += pegadaCarbono
        return pegadaCarbono
    }

    fun obterPegadaCarbonoTotal(): Double {
        return pegadaCarbonoTotal
    }

    fun validarConsumo(consumo: Double) {
        when {
            consumo < 0 -> {
                throw IllegalArgumentException("O consumo não pode ser negativo.")
            }
            consumo.toString().length > 6 -> {
                throw IllegalArgumentException("O consumo não pode ter mais de 6 dígitos.")//valor simbolico somente para limitar
            }
        }
    }
}