# Sistema de Controle de Usina Hidrelétrica

Projeto em Java que simula o monitoramento do nível de água de um reservatório,
classificando o estado operacional (Normal, Atenção, Alerta, etc.) com base no
volume útil.
Projeto de monitoramento hidrológico com cálculo de número de Froude
e carga hidráulica para aplicações em usinas hidrelétricas.
Este projeto implementa, em Java, o cálculo da vazão afluente utilizando calhas Parshall, amplamente empregadas em medições hidrológicas.

## Fórmula Utilizada
Formula para a medição do nível afluente
O cálculo da vazão é feito a partir da equação empírica:

Q=C⋅H^n

Onde:

Q → Vazão (m³/s)

C → Coeficiente da calha

H → Nível de água (m)

n → Expoente associado à calha

Os valores de C e n variam conforme a largura da calha Parshall, seguindo tabelas técnicas padronizadas.

## Módulos
- Monitoramento hidrológico e ambiental
- Simulador de sensor de nível

## Tecnologias
- Java
- Programação Orientada a Objetos
- Enum
- Simulação de sensores

## Estrutura do projeto
sistema_de_controle_de_usina_hidroeletrica
├── monitoramento_hidrologico_e_ambiental
├── simulador
## Objetivo
Projeto com foco educacional e portfólio, simulando lógica usada em sistemas
de controle de usinas hidrelétricas e saneamento.

## Próximos passos
- Integração com sensores reais
- Testes unitários
- Dashboard de monitoramento
