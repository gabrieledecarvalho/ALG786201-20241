/*  U2A02E01 - Somando dois números:
    Escreva um programa que leia dois números pelo teclado, e mostre na tela a soma desses números.
    Seu programa deve apresentar uma mensagem na tela para pedir que o usuário digite o primeiro número, e em seguida deve ler um número. 
    Logo depois, ele deve apresentar uma mensagem na tela pedindo o segundo número, e então ler esse número 
    Ao final, ele deve mostrar a soma dos números digitados.
*/
// neste exercícios iremos utilizar um scanner, precisamos escrever a seguinte linha:
import java.util.Scanner;

public class U2A02E01_somandoDoisNumeros {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int x1, x2;
        System.out.println("Digite o primeiro número inteiro: ");
        x1 = leitor.nextInt();
        System.out.println("Digite o segundo número inteiro: ");
        x2 = leitor.nextInt();
        System.out.printf("Soma dos números: %d\n ",x1+x2);
    }
}
