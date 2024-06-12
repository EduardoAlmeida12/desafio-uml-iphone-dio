# Projeto iPhone - README

## Resolução do desafio IPHONE-UML proposto pela dio!

## Projeto 
Este projeto em Java simula o comportamento de um iPhone com funcionalidades de um reprodutor musical, aparelho telefônico e navegador de internet. A classe `Iphone` implementa três interfaces: `ReprodutorMusical`, `AparelhoTelefonico` e `NavegadordeInternet`. Cada uma dessas interfaces define métodos específicos que são implementados na classe `Iphone`.


```
+----------------------+       +---------------------+    +---------------------+          
|    ReprodutorMusical |       | AparelhoTelefonico  |    | NavegadordeInternet |
|----------------------|       |---------------------|    |---------------------|
| +tocar()             |       | +ligar()            |    | +exibirPagina()     |                                    
| +pausar()            |       | +atender()          |    | +adicionarNovaAba() |
| +selecionarMusica()  |       | +iniciarCorreioVoz()|    | +atualizarPagina()  |
+----------------------+       +---------------------+    +---------------------+ 
                                                                                    
              ^                         ^                           ^
              |                         |                           |
              |                         |                           |
+-------------+-------------------------+-------------+-------------+
|                    Iphone                           |
|-----------------------------------------------------|
| +tocar()                                            |
| +pausar()                                           |
| +selecionarMusica()                                 |
| +ligar()                                            |
| +atender()                                          |
| +iniciarCorreioVoz()                                |
| +exibirPagina()                                     |
| +adicionarNovaAba()                                 |
| +atualizarPagina()                                  |
+-----------------------------------------------------+

                ^
                |
                |
       +--------+---------+
       | testIphone01     |
       |------------------|
       | +main(String[])  |
       +------------------+
```



## Estrutura do Projeto

O projeto é dividido em três pacotes principais:
- `Service`: Contém as interfaces que definem os contratos para as funcionalidades do iPhone.
- `dominio`: Contém a classe `Iphone`, que implementa as interfaces definidas em `Service`.
- `test`: Contém a classe `testIphone01`, que realiza testes das funcionalidades do iPhone.

## Interfaces Implementadas

### Interface `ReprodutorMusical`
- Define métodos para tocar, pausar e selecionar música.

### Interface `AparelhoTelefonico`
- Define métodos para ligar, atender e iniciar correio de voz.

### Interface `NavegadordeInternet`
- Define métodos para exibir página, adicionar nova aba e atualizar página.

## Classes Implementadas

### Classe `Iphone`
- Implementa as interfaces `ReprodutorMusical`, `AparelhoTelefonico` e `NavegadordeInternet`.
- Fornece métodos para todas as funcionalidades do iPhone, como tocar música, fazer chamadas e navegar na internet.

## Instruções para Execução

1. Certifique-se de que todas as classes e interfaces estão nos pacotes corretos.
2. Compile todas as classes e interfaces.
3. Execute a classe `testIphone01` para verificar as funcionalidades implementadas na classe `Iphone`.

```java
public class testIphone01 {
    public static void main(String[] args) {
        Iphone iphone = new Iphone();
        iphone.selecionarMusica();
        iphone.tocar();
        iphone.pausar();
    }
}
```

Saida do Console: 

```java 

Selecionando música

Tocando música

Pausando...

```
## Conclusão
Este projeto demonstra a implementação de um dispositivo multifuncional em Java utilizando interfaces para definir contratos e uma classe concreta para implementar esses contratos. Isso ajuda a entender o conceito de polimorfismo e a separação de responsabilidades em programação orientada a objetos.