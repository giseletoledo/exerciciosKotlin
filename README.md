# Calculadoras de emissão de carbono


Considerando ​um exemplo onde a eletricidade é usada e o consumo de energia é de 1000 kWh. Vamos assumir ​que essa eletricidade vem da rede elétrica mundial, com um fator de emissão médio de 0,475 kg ​CO₂/kWh.

Consumo de Energia: 1000 kWh

Fator de Emissão da Eletricidade da Rede: 0,475 kg CO₂/kWh

Pegada de Carbono = Consumo de Energia * Fator de Emissão Pegada de Carbono

Pegada de Carbono = 1000 kWh * 0,475 kg CO₂/kWh

Portanto, a pegada de carbono associada ao consumo de 1000 kWh de eletricidade da rede é de ​475 kg de CO₂.

1. Desenvolva um programa que solicite ao usuário o tipo de energia (eletricidade ou gás natural) e o respectivo consumo. Utilize fatores
de emissão específicos para cada tipo de energia: Eletricidade (0.475kg CO₂/kWh) e gás natural (2.0 kg CO₂/m3). O programa deve calcular
a pegada de carbono para cada tipo de energia inserido e, ao final, apresentar o valor total da pegada de carbono.

| Entrada                               | Saída                        |
|---------------------------------------|------------------------------|
| Eletricidade: 100 kWh/m³              | Eletricidade: 47.50 kg CO₂   |
| Gás: 50 kWh/m³                        | Gás: 100 kg CO₂              |
|                                       | Total: 147.50 kg CO₂         |

#### CalculadoraPegadaCarbono.kt

2. Desenvolva um programa que solicite ao usuário a distância percorrida e o meio de transporte utilizado para várias viagens (carro, ônibus e avião). Utilize fatores de emissão específicos para cada tipo de veículo: carro (0.21 kg CO₂/km), ônibus (0.105 kg CO₂/km), avião (0.133 kg CO₂/km). Armazene esses dados em vetores e utilize uma matriz para acessar os fatores de emissão. Implemente funções que calculem a pegada de carbono de cada viagem e a soma total. Ao final, exiba o total da pegada de carbono

OBJETIVOS
Trabalhar funções, vetores e matrizes

| Entrada              | Saída                   |
|----------------------|-------------------------|
| Carro: 100 km        | Pegada de CO₂: 21 kg    |

#### CalculadoraEmissao.kt

