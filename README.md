# 🚗 Sistema de Gerenciamento de Vendas de Veículos

![Java](https://img.shields.io/badge/java-%23ED8B00.svg?style=for-the-badge&logo=openjdk&logoColor=white)
![GitHub license](https://img.shields.io/badge/license-MIT-blue.svg?style=flat-square)

Uma aplicação desenvolvida em Java para auxiliar no controle de veículos, clientes e operações básicas de uma concessionária.

---

## 👥 Integrantes do Projeto

* **Antonio Augusto**
* **Artur Antunes** 
* **Eduardo Liscano Guerra**
* **Julielen Dorneles**
---

## ⚙️ Funcionalidades do Sistema

### Gestao Financeira
- Adicionar saldo na carteira
- Remover saldo da carteira
- Consultar o valor disponível

### Controle de Veículos
- Cadastro de veiculos
- Exibição dos dados de veículos
- Controle de disponibilidade do veículo
- Cálculo do valor final de venda
---

## Modelagem Orientada a Objetos

O projeto foi desenvolvido com base em conceitos de Programação Orientada a Objetos (POO), utilizando:

- Encapsulamento
- Heranca
- Polimorfismo
- Interface

---

## Estrutura de Veículos
A modelagem de veículos foi organizada da seguinte forma:

- `Veiculo`: classe abstrata com os dados e comportamentos comuns
- `Carro`: classe filha de `Veiculo`
- `Moto`: classe filha de `Veiculo`
- `Comercializavel`: interface implementada por `Veiculo`

---

## Tecnologias Utilizadas
- Java 
- Programação Orientada a Objetos
- IntelliJ IDEA
- Terminal / CLI
