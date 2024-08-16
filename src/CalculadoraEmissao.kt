class CalculadoraEmissao {
    // Matriz para armazenar os fatores de emissão
    private val fatoresEmissao = arrayOf(
        arrayOf("carro", 0.21),  // Fator de emissão para carro
        arrayOf("ônibus", 0.105), // Fator de emissão para ônibus
        arrayOf("avião", 0.133)  // Fator de emissão para avião
    )

    // Função para calcular a emissão de carbono de uma viagem
    fun calcularEmissao(distancia: Double, meioTransporte: String): Double {
        // Busca o fator de emissão correspondente ao meio de transporte
        for (i in fatoresEmissao.indices) {
            if (fatoresEmissao[i][0] == meioTransporte) {
                val fator = fatoresEmissao[i][1] as Double
                return distancia * fator
            }
        }
        return 0.0 // Retorna 0.0 se o meio de transporte não for encontrado
    }
}
