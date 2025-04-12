# Java

Projeto em Java utilizado para aprendizado da linguagem do curso Bradesco Java Cloud Native disponibilizado por banco Bradesco e DIO.me

## Anotações

Arquivo .java: Começar com letra maiúscula

Nomenclatura de Classes: Primeira letra maiúscula em todas as palavras

Variável: Primeira palavra minúscula, próximas maiúscula. Exemplo: anoFabricacao

Keyword final: Usada para informar que uma variável possuirá valor constante, ou seja, seu valor não pode ser alterado após a primeira atribuição. 

Exemplo: `final String BR = "Brasil"`;

### Convenção de nomenclatura de pacotes

 - `com`: comercial

 - `org`: organizacional ou opensource

 - `opensource`: opensource

 A nomenclatura é iniciada pelo tipo de projeto (conforme acima), seguido do nome da empresa, nome do projeto e funcionalidade do pacote.

 Exemplo: Supondo que sua empresa se chame HyperTech e sua aplicação chame Notification, seus pacotes podem possuir nomes como os listados abaixo:

    com.hypertech.notification.app
    com.hypertech.notification.model
    com.hypertech.notification.util
    com.hypertech.notification.service

Para criar um pacote dentro do VS Code e ele automaticamente informar nas classes o pacote utilizado, deve-se criar uma pasta para cada "." do pacote. Exemplo:

    1 - Caso deseje criar o pacote "com.hypertech.notification.app", crie a pasta "com";
    
    2 - Dentro da pasta "com", crie a pasta "hypertech";
    
    3 - Dentro da pasta "hypertech", crie a pasta "notification";
    
    4 - Dentro da pasta "notification", crie a pasta "app";
    
    5 - Mova a classe que deseja inserir neste pacote para a pasta "app".

### Convenção de nomenclatura de variáveis

    1 - Sem abreviação do nome da variável. Correto: `salarioMedio`. Incorreto: `salMedio`;

    2 - Não definir nomes "mágicos", como `x`, `abc`, etc.;

    3 - Nome no singular, a menos que seja uma lista;

    4 - Sempre escrever todas as variáveis do código no mesmo idioma.

### Convenção de nomenclatura de métodos

    1 - Nome no infinitivo. Exemplo: `adicionarCliente`, `excluirProduto`;

    2 - Seguir padrão Camel Case, onde primeira palavra tem inicial minúscula e seguintes maiúscula;

    3 - Devem sempre possuir uma única finalidade. Incorreto: Criar um método `calcularImprimir`, que calcula algo e imprime algo. Correto: criar um método `calcular` para realizar o cálculo, e um método `imprimir`, para realizar a impressão.

## Getting Started

Welcome to the VS Code Java world. Here is a guideline to help you get started to write Java code in Visual Studio Code.

## Folder Structure

The workspace contains two folders by default, where:

- `src`: the folder to maintain sources
- `lib`: the folder to maintain dependencies

Meanwhile, the compiled output files will be generated in the `bin` folder by default.

> If you want to customize the folder structure, open `.vscode/settings.json` and update the related settings there.

## Dependency Management

The `JAVA PROJECTS` view allows you to manage your dependencies. More details can be found [here](https://github.com/microsoft/vscode-java-dependency#manage-dependencies).
