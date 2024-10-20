/*  U2A05E01 - Teste se o número é positivo, negativo ou zero
    Escreva um programa que leia um número do teclado e informe se esse número é negativo, positivo, ou zero.
    Seu programa deve mostrar uma mensagem na tela pedindo que se digite o número a ser verificado, e em seguida deve ler esse número. 
    Ao final, ele deve mostrar apenas uma destas duas mensagens na tela, dependendo do valor do número:
        POSITIVO
        NEGATIVO
        ZERO
*/

//  Solução U2A05E01:
import java.util.Scanner;

public class U2A05E01_sinalNumero {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        
        //  declarando variável número sendo um inteiro:
        int numero;
        
        //  mostrando na tela o que deve ser digitado:
        System.out.println("Digite um número: ");
        
        //  chamando o scanner de nome inp, quardando o valor digitado na variável numero
        numero = inp.nextInt();
        
        //  primeiro teste: se o número digitado for maior que zero, estritamente, imprime "POSITIVO"
        if (numero > 0) {
            System.out.print("POSITIVO");
        
        //  segundo teste (só é ativado se o primeiro for false): se o número for menor que zero, estritamente, imprime "NEGATIVO"
        } else if (numero < 0) {
            System.out.print("NEGATIVO");
        
        //  caso nenhum dos testes acima retornem True, esse é ativado, imprimindo "ZERO"
        } else { //isso só é testado se o primeiro e o segundo sejam falsos
            System.out.print("ZERO");
        }
    }
}