# Projeto: Mockito – Serviço Matemático

#Este projeto demonstra o uso de Mockito para testar uma classe 'Calculadora' que depende de um serviço matemático.

## 📂 Estrutura

- 'src/main/java/mockito/ServicoMatematico.java': Interface com método 'somar(int a, int b)`
- 'src/main/java/mockito/ServicoMatematicoImpl.java': Implementação que retorna a soma de 'a' e 'b'
- 'src/main/java/mockito/Calculadora.java': Classe que usa 'ServicoMatematico' para calcular somas
- 'src/test/java/mockito/CalculadoraTest.java': Teste unitário com Mockito simulando o serviço

## 🧪 Teste com Mockito

O teste cria um mock de 'ServicoMatematico' e configura o retorno de 'somar(2, 3)' como '5'. Em seguida, verifica se o resultado da 'Calculadora' é igual a '5'.

## 🚀 Como executar

'''bash
