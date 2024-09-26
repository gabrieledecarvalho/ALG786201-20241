/*  U2A02E02 - Conversor de temperatura
    Escreva um programa que converta uma temperatura da escala Celsius para Farenheit. 
    A conversão pode ser feita com esta equação:
    TF=32+TC*1.8
    O valor a temperatura em graus Celsius deve ser informada pelo teclado.

    Seu programa deve mostrar uma mensagem na tela pedindo a temperatura em graus Celsius. 
    Em seguida, ele deve mostrar a termperatura equivalente em graus Farenheit.
*/

//  Solução U2A02E02:
import java.util.Scanner;

public class U2A02E02_converteTemperatura {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        //definindo variávels do tipo double, tf: temperatura em farenheit e tc: temperatura em celcius
        double tf, tc;
        
        System.out.print("Escreva a temperatura em Celcius: ");
        tc = leitor.nextDouble();
        
        // ao invés de fazer a conta e mostrar dentro do printf, guarda-se o resultado dentro de uma variável e a mostra depois
        tf = 32 + (tc*1.8);

        System.out.printf("A temperatura em Farenheit: %.2f \n",tf);
    }
}