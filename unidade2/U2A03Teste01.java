/*  U2A03Teste01: Média de 6 números
    Escreva um programa que calcule a média de seis números inteiros. Note que a média pode ter parte 
    fracionária ! Os números devem ser informados via teclado. 
    Seu programa deve mostrar uma mensagem na tela pedindo que se digitem os seis números separados 
    por espaços, e em seguida deve ler os seis números. Em seguida, ele deve mostrar a média desses números.
 */

// Solução U2A03Teste01:
import java.util.Scanner;

public class U2A03Teste01{
    public static void main(String[] args){
        Scanner inp = new Scanner(System.in);
        
        //  declarando todas as variáveis que serão utilizadas:
        double n1, n2, n3, n4, n5, n6, media;
        
        //  mostrando na tela o que digitar:
        System.out.printf("Digite 6 números separados por espaço para calcular a média: \n");
        
        //  scanner sendo chamado para que os dados sejam captados pelo teclado
        n1 = inp.nextDouble();
        n2 = inp.nextDouble();
        n3 = inp.nextDouble();
        n4 = inp.nextDouble();
        n5 = inp.nextDouble();
        n6 = inp.nextDouble();
        
        //  calculando a média, usando 6.0 para garantir que seja double e atribuindo à variável média
        media = (n1+n2+n3+n4+n5+n6)/6.0;
        
        //  mostrando na tela uma mensagem formatada
        System.out.printf("A média dos números digitados é %.2f.", media);
    }
}