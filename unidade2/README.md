# Unidade 2
Como ler o nome dos arquivos: U2A01E01_escrevePoema.java = Unidade 2 Aula 01 Exercício 01 _ título do programa .java

* Aula 1: Apresentação e Hello World!
  *  System.out.println: mostra uma mensagem na tela, seguida de uma quebra de linha
  *  System.out.print: mostra uma mensagem na tela, mas sem quebra de linha
  *  System.out.printf: formata uma mensagem e então mostra-a na tela
  *  [Java printf( ) Method Quick Reference](https://www.cs.colostate.edu/~cs160/.Summer16/resources/Java_printf_method_quick_reference.pdf)
* Aula 2: Lendo valores do teclado + tipos, variáveis e constantes
  * [Java User Input (Scanner Class) - W3Schools](https://www.w3schools.com/java/java_user_input.asp), [Como funciona a classe Scanner do Java? - devmedia](https://www.devmedia.com.br/como-funciona-a-classe-scanner-do-java/28448)
  * [Primitive Data Types](https://docs.oracle.com/javase/tutorial/java/nutsandbolts/datatypes.html); declaração de variável: \<Tipo> \<nomeVariavel> \<atribuicaoDeValorOpcional>; declaração de constantes: final \<Tipo> \<nomeVariavel> \<atribuicaoDeValor>
* Aula 3: Expressões aritméticas
  * Soma: + | subtração: - | multiplicação: * | divisão: / | módulo (resto de divisão): %
  * Precedência de operações: parênteses > divisão, multiplicação módulo/resto de divisão > somas/subtrações
  * Resultados das expressões podem ser armazenados em variáveis (atribuição): = , += , -= , *= , /= , %=
  * Incremento e decremento: ++ e --
    ```
    int x = 0, y, z;
    y = x++ // x = 1 e y = 0, valor atribuido a y é o valor antes do incremento
    x = 0 
    z = ++x // x = 1 e z = 1, valor atribuido a z é o valor depois do incremento
    ```
* Aula 4: Teste de mesa e debug/depuração
  * [vídeo sobre debug no IntelliJ IDEA](https://www.youtube.com/watch?v=qz6gbT0kdzg&ab_channel=MarceloSobral)
* Aula 5: Estruturas de decisão - parte 1, resultados booleanos (True/False)
  * estrutura se-então-senão
    ```
    Se condição então
      Faz algumas coisas
    Senão
      Faz outras coisas
    ```
  * Se-então-senão em Java
    ```
    if (condição) { // Se condição então
    // uma ou mais instruções
    } else {        // Senão 
    // uma ou mais instruções
    }
    ```
  * Operadores Relacionais:

    | Operador | Exemplo | Descrição |
    | --- | --- | --- |
    | == | x == 0 | Compara se dois valores são iguais |   
    | != | x != 0 | Compara se dois valores são diferentes |
    | > | x > 0 | Compara se um valor é maior que outro |
    | >= | x >= 0| Compara se um valor é maior ou igual que outro |
    | < | x < 0 | Compara se um valor é menor que outro |
    |< = | x <= 0| Compara se um valor é menor ou igual que outro |

* Aula 6: Estruturas de decisão - parte 2, operadores lógicos, tabela-verdade dos operadores lógicos (UC de lógica), precedência de operadores lógicos
  * Operadores lógicos:

    | Operador | Exemplo | Descrição |
    | --- | --- | --- |
    | && | x > 0 && x <5 | E lógico: resultado é verdadeiro se ambos operandos forem verdadeiros |   
    | \|\| | x < 0 \|\| x > 5 | OU lógico: resultado é verdadeiro se ao menos um dos operandos for verdadeiro |
    | ! | !(x < 0) | NÃO lógico: resultado é a negação (inverso) do operando |
   
  * Precedência de operadores lógicos: 1. operador NÃO (!), 2. operador E (&&), 3. operador OU; caso seja necessário mudar esta ordem, deve-se usar parênteses ()

* Aula 7: estruturas de decisão - parte 3, estruturas switch ... case, tipos de dados usado no case, uso do break, [switch case em java - betrybe](https://blog.betrybe.com/java/switch-case-java/), [java switch - w3schools](https://www.w3schools.com/java/java_switch.asp)

* Aula 8: String - parte 1: o tipo String é um objeto, não somente um tipo, armazena variável mas também é possível realizar um conjunto de operações advindas da classe (será estudado em POO); length(), equals(), concatenação, toLowerCase()/toUpperCase(), startsWith()/endsWith(), contains(), isEmpty(), indexOf(), substring().

* Aula 9: String - parte 2: lastIndexOf(), replace(), strip() (estávamos utilizando o trim na época), compareTo().

* Aula 10: Boas práticas de programação
  * Identação adequada do código
  * Documentar o código -> comentários, [Best practices for writing code comments](https://stackoverflow.blog/2021/12/23/best-practices-for-writing-code-comments/), [What Are Java Comments? Types, Examples, Best Practices](https://www.tutorialsfreak.com/java-tutorial/java-comments)
  * nomes de variáveis legíveis, claros e concisos, algumas convenções: [Camel Case](https://pt.wikipedia.org/wiki/CamelCase), [Snake Case](https://en.wikipedia.org/wiki/Snake_case), [Naming convention (programming)](https://en.wikipedia.org/wiki/Naming_convention_(programming))
  * restringir variáveis a seus escopos: definir variáveis onde serão utilizadas, [Discussão no Fórum sobre](https://stackoverflow.com/questions/8803674/declaring-variables-inside-or-outside-of-a-loop)
  
<!--
Bibliografia básica:
1. SOUZA, M. A. F. D.; GOMES, M. M.; SOARES, M. V.; CONCILIO, R. Algoritmos e lógica de programação: um texto introdutório para a engenharia. São Paulo: Cengage Learning Brasil, 2019. E-book (274 p.). 9788522128150. Disponível em: https://app.minhabiblioteca.com.br/#/books/9788522128150/
2. SANTOS, M. da S. dos. et al. Pensamento computacional. Porto Alegre: SAGAH, 2021. Ebook (270 p.). ISBN 9786556901121. Disponível em: https://app.minhabiblioteca.com.br/#/books/9786556901121/.
Bibliografia complementar:
1. SCHILDT, H. Java para iniciantes: crie, compile e execute programas Java rapidamente. 6.ed. Porto Alegre: Bookman, 2015. E-book (668 p.). ISBN 9788582603376. Disponível em: https://app.minhabiblioteca.com.br/#/books/9788582603376/. Acesso em: 19 out. 2022.
2. FURGERI, S. Java 8 - ensino didático: desenvolvimento e Implementação de aplicações. São Paulo: Érica, 2015. E-book (321 p.). ISBN 9788536519340. Disponível em: https://app.minhabiblioteca.com.br/#/books/9788536519340/. Acesso em: 19 out. 2022.
3. MANZANO, J. A. N. G.; OLIVEIRA, J. F. D. Algoritmos: lógica para desenvolvimento de programação de computadores. 29. ed. São Paulo: Érica, 2019. E-book (369 p.). ISBN 
9788536531472. Disponível em: https://app.minhabiblioteca.com.br/#/books/9788536531472/. Acesso em: 19 out. 2022
-->
