/*  U2A06E02 - Verificando se uma sequência de números está ordenada
    Escreva um programa que lê quatro números do teclado, e verifica se essa sequência de números, 
    conforme foi digitada, está ordenada em ordem crescente.
    Seu programa deve mostrar alguma mensagem pedindo os quatro números, os quais devem ser digitados na mesma linha, 
    separados por espaços. Em seguida, seu programa deve ler os quatro números, e então verificar se estão ordenados. 
    Ao final, seu programa deve mostrar o seguinte na tela, dependendo do resultado da verificação:
        ORDENADOS
        DESORDENADOS
 */

//  Solução U2A06E02:
import java.util.Scanner;

public class U2A06E02_verificaOrdem4Numeros {
    public static void main (String[] args){
        Scanner inp = new Scanner(System.in);
        
        float n1, n2, n3, n4;
        
        System.out.print("Digite 4 números separados por espaço: ");
        n1 = inp.nextFloat();
        n2 = inp.nextFloat();
        n3 = inp.nextFloat();
        n4 = inp.nextFloat();
        
        //  caso fizessemos ifs aninhados, o programa ficaria gigante
        if (n1 <= n2 && n1 <= n3 && n1 <= n4 && n2 <= n3 && n2 <= n4 && n3 <= n4) {
            System.out.print("ORDENADOS");
        } else {
            System.out.print("DESORDENADOS");
        }
    }
}