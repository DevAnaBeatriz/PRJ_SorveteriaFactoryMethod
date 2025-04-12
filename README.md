# Sorveteria – Exemplo do Padrão Factory Method em Java
### Este repositório contém uma implementação didática do padrão de projeto Factory Method em um contexto de sorveteria, com foco na criação de diferentes tipos de sorvete. O objetivo é demonstrar de forma clara como o padrão pode ser aplicado para encapsular a lógica de instanciamento e promover flexibilidade no código.

## Objetivo do Projeto
### Simular uma sorveteria que oferece dois tipos de sorvete:

### - Sorvete de Leite

### - Sorvete Vegano

### A ideia é permitir que cada filial da sorveteria possa criar o tipo de sorvete que desejar, utilizando uma estrutura orientada a objetos baseada no padrão Factory Method.

## Estrutura do Projeto
´´´bash
PRJ_SorveteriaFactoryMethod/
├── app/
│   └── Main.java
├── factory/
│   ├── Sorveteria.java          // Classe base (Creator)
│   ├── SorveteriaLeite.java     // Subclasse concreta
│   └── SorveteriaVegana.java    // Subclasse concreta
├── produto/
│   ├── Sorvete.java             // Produto abstrato
│   ├── SorveteLeite.java        // Produto concreto
│   └── SorveteVegano.java       // Produto concreto
´´´

## Explicação das Classes
### - Sorveteria: Classe abstrata que define o método fábrica criarSorvete(), responsável por instanciar os sorvetes. Também contém o método venderSorvete(), que encapsula a lógica comum.

### - SorveteriaLeite / SorveteriaVegana: Subclasses que implementam o método criarSorvete() e retornam os tipos específicos de sorvete.

### - Sorvete: Interface (ou classe abstrata) que representa o produto que será criado.

### - SorveteLeite / SorveteVegano: Implementações concretas do produto.

## Padrão de Projeto Utilizado
### O Factory Method permite que a criação de objetos seja delegada para subclasses sem acoplar o código cliente aos tipos concretos. Isso facilita a adição de novos sabores ou tipos de sorvete no futuro, sem modificar a lógica principal da sorveteria.

## Neste projeto:

### A classe Sorveteria é o creator.

### Os métodos criarSorvete() nas subclasses representam o método fábrica.

### As classes SorveteLeite e SorveteVegano são os produtos concretos.

## Como Executar

### Clone o repositório:

´´´bash
git clone https://github.com/DevAnaBeatriz/PRJ_SorveteriaFactoryMethod.git
´´´

### Importe o projeto em uma IDE Java (IntelliJ, Eclipse, VS Code etc.).

### Execute a classe Main.java localizada no pacote app.

## Referência
### Padrão de Projeto baseado no Factory Method no Refactoring Guru

### Adaptação e contextualização livre baseada em cenários do dia a dia.
