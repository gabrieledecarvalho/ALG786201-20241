package U2Avaliação;/* Q1:
    Em linhas gerais, a referência bibliográfica conforme as normas da ABNT – Associação Brasileira de Normas Técnicas – 
    é a indicação de autores, título, edição, local, editora e data de qualquer citação feita em um texto.

    O formato das referências de artigos de periódico ou revista podem variar a partir da quantidade de autores. No caso específico de um artigo com apenas um autor, ela tem este formato:

    SOBRENOME, Nome abreviado. Título do artigo. Título da Revista, Local de publicação, número do volume, 
    páginas inicial-final, mês e ano.
    Exemplo:

    KILOMBA, G. A máscara, Revistas USP, n. 16, p. 23-40, Março de 2016.
    Escreva um programa que apresente uma referência bibliográfico de um artigo de periódico ou revista com apenas um autor. Seu programa deve ler as informações que compõem essa referência bibliográfica:

    Nome do autor:
    Título:
    Revista:
    Local de publicação:
    Numero do volume:
    Página inicial:
    Página final:
    Mês:
    Ano:
    ... e então apresentá-la na tela no formato ABNT.
 */

 import java.util.Scanner;

 public class Q1 {
     public static void main(String[] args){
         Scanner inp = new Scanner(System.in);
         
         System.out.print("Nome do autor: ");
         String nome = inp.nextLine();
         nome = nome.trim();
         int n = nome.indexOf(" ");
         String sobrenome = nome.substring(n);
         sobrenome = sobrenome.toUpperCase();
         sobrenome = sobrenome.trim();
         String inicial = nome.substring(0,1);
         inicial = inicial.toUpperCase();
         
         System.out.print("Título: ");
         String titulo = inp.nextLine();
         titulo = titulo.trim();
         titulo = titulo.toLowerCase();
         String titulo1 = titulo.substring(0,1);
         titulo1 = titulo1.toUpperCase();
         String titulo2 = titulo.substring(1);
         titulo = titulo1 + titulo2;
         
         System.out.print("Revista: ");
         String revista = inp.nextLine();
         revista = revista.trim();
         revista = revista.toLowerCase();
         String revista1 = revista.substring(0,1);
         revista1 = revista1.toUpperCase();
         String revista2 = revista.substring(1);
         revista = revista1 + revista2;
         
         System.out.print("Local: ");
         String local = inp.nextLine();
         local = local.toUpperCase();
         
         System.out.print("Numero do volume: ");
         int vol = inp.nextInt();
         
         System.out.print("Página inicial: ");
         int p1 = inp.nextInt();
         
         System.out.print("Página final: ");
         int p2 = inp.nextInt();
         
         System.out.print("Mês: ");
         String mes = inp.nextLine();
         String mes1 = mes.substring(0,1);
         mes1 = mes1.toUpperCase();
         String mes2 = mes.substring(1);
         mes = mes1 + mes2;
         
         System.out.print("Ano: ");
         int ano = inp.nextInt();
         
         System.out.printf("%s, %s. %s. %s, %d, p. %d-%d, %s de %d.",sobrenome,inicial,titulo,revista,local,vol,p1,p2,mes,ano);
     }
 }

 // Seu programa resolve o problema proposto, e faz até mais do que foi pedido (ex: garantir que iniciais sejam maiúsculas).