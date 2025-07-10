/*
Escreva um programa que que leia dois números inteiros X e N, sendo X <= N, e então mostre todos os números múltiplos de X menores ou iguais a N. Por exemplo, se X=3 e N=10, seu programa deve mostrar isto:

3 6 9
Seu programa deve apresentar uma mensagem para cada valor a ser lido, a fim de instruir o usuário.

Ao final, os números calculados devem ser mostrados na mesma linha, sendo separados por espaço.
 */

// VERIFICAR:
import java.util.Scanner;

public class U3A04Teste8 {
    public inp = new Scanner(System.in);

    System.out.print("Digite um número inteiro: ");
    int n1 = inp.nextInt();
    System.out.print("Digite outro número inteiro, maior o igual ao primeiro: ");
    int n2 = inp.nextInt();

    int multiplos=0;
    while(multiplos<=n1){
        multiplos+=n2
        System.out.print("%d ",multiplos);
    }

    // verificar:
    // for(int i=0;i<=n1;i+=n2){
    //     System.out.print("%d ",multiplos);
    // }
}