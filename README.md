# Projeto: Mockito – Serviço Bancário

Este projeto demonstra como testar um serviço bancário usando Mockito para simular o repositório de contas.

## 📂 Estrutura

- : modelo de conta com número e saldo
- : interface simulando acesso ao banco de dados
- : serviço bancário que depende do repositório
- : testes unitários usando Mockito

## 🧪 Testes

- : verifica se o saldo retornado está correto e se o método  foi chamado
- : simula um depósito e verifica se o saldo foi atualizado e os métodos foram invocados corretamente

## 🚀 Como executar

'''bash
mvn test
