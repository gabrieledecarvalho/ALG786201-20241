/*  U2A06E03 - Ordenando três números Versão 2
    Escreva um programa que lê três números do teclado, e os apresenta ordenados na tela.
    Seu programa deve mostrar alguma mensagem pedindo os três números, 
    os quais devem ser digitados na mesma linha, separados por espaços. 
    Em seguida, seu programa deve ler os três números, ordená-los, e, por fim, mostrá-los na tela. 
    Ao apresentá-los, os três números devem estar numa mesma linha, separados por espaço, sem qualquer outro texto.
 */

//  Solução U2A06E03:
import java.util.Scanner;

public class U2A06E03_ordena3NumerosV2 {
    public static void main (String[] args){
    Scanner inp = new Scanner(System.in);
        
        int n1, n2, n3;
        
        System.out.print("Digite 3 (três) números separados por espaço para saber qual é o maior: ");
        n1 = inp.nextInt();
        n2 = inp.nextInt();
        n3 = inp.nextInt();
        
        if(n1 > n2 && n1 > n3){
            if (n2>n3){
            System.out.printf("%d %d %d", n1, n2, n3);
            }else{
                System.out.printf("%d %d %d", n1, n3, n2);
            }
        } else if (n2 > n1 && n2 > n3){
            if(n1>n3){
            System.out.printf("%d %d %d", n2, n1, n3);
            } else {
                System.out.printf("%d %d %d", n2, n3, n1);
            }
        } else if (n3 > n1 && n3 > n2){
            if(n1>n2){
                System.out.printf("%d %d %d", n3, n1, n2);    
            } else {
                System.out.printf("%d %d %d", n3, n2, n1);    
            }
        }
    }
}

//  Outra forma de fazer, feita em conjunto e em sala de aula:
    /* 
        if(n1 > n2 && n2 > n3){
            System.out.printf("%d %d %d", n1, n2, n3);
        }else if(n1 > n2 && n3 > n2){
            System.out.printf("%d %d %d", n1, n3, n2);
        }else if (n2 > n1 && n1 > n3){
            System.out.printf("%d %d %d", n2, n1, n3);
        }else if(n1 > n2 && n3 > n1){
            System.out.printf("%d %d %d", n2, n3, n1);
        }else if (n3 > n1 && n1 > n2){
            System.out.printf("%d %d %d", n3, n1, n2);    
        }else{
            System.out.printf("%d %d %d", n3, n2, n1);    
        }
    */
//  segunda forma melhor e mais rápida: 
//  no meu programa está testando o primeiro e depois disso tem que testar os ifs aninhados
//  no segundo programa, testa uma condição e se não der parte para a próxima