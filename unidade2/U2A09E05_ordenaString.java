/*  U2A09E05 - Ordenar strings
    Escreva um programa que lê três palavras do teclado, e as apresenta ordenadas alfabeticamente na tela. 
    O ordenamento deve respeitar as maiúsculas e minúsculas.
    Seu programa deve mostrar alguma mensagem pedindo as três palavras, as quais devem ser digitados na mesma linha, 
    separadas por espaços. Em seguida, seu programa deve ler as três palavras, ordená-las, e, por fim, mostrá-las na tela. 
    Ao apresentá-las, as três palavras devem estar numa mesma linha, separadas por espaço, sem qualquer outro texto.
*/

//  Solução U2A09E05:
import java.util.Scanner;

public class U2A09E05_ordenaString {
    public static void main(String[] args){
        Scanner inp = new Scanner(System.in);

        String primeira, segunda, terceira;

        System.out.print("Digite a primeira palavra: ");
        primeira = inp.nextLine();
        System.out.print("Digite a segunda palavra: ");
        segunda = inp.nextLine();
        System.out.print("Digite a terceira palavra: ");
        terceira = inp.nextLine();

        //  utilizando o compareTo, para verificar se uma string é maior que outra, se precede alfabeticamente, retorna um número inteiro
        if(primeira.compareTo(segunda) <= 0 && primeira.compareTo(terceira) <= 0){
            if(segunda.compareTo(terceira) < 0){
                System.out.printf("%s, %s, %s", primeira, segunda, terceira);
            }else{
                System.out.printf("%s, %s, %s", primeira, terceira, segunda);
            }
        }else if(segunda.compareTo(primeira) <= 0 && segunda.compareTo(terceira) <= 0){
            if(primeira.compareTo(terceira) < 0){
                System.out.printf("%s, %s, %s", segunda, primeira, terceira);
            }else{
                System.out.printf("%s, %s, %s", segunda, terceira, primeira);
            }
        }else if(terceira.compareTo(primeira) <= 0 && terceira.compareTo(segunda) <= 0){
            if(primeira.compareTo(segunda) < 0){
                System.out.printf("%s, %s, %s", terceira, primeira, segunda);
            }else{
                System.out.printf("%s, %s, %s", terceira, segunda, primeira);
            }
        }
        //  lembrando o programa que ordena 3 números, poderia ter colocado os ifs aninhados dentro do primeiro if, assim, o programa não testa 2 vezes, somente 1
    }
}