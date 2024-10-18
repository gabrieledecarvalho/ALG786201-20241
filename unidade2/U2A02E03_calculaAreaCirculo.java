/*  U2A02E03 - Cálculo de área de um círculo
    Escreva um programa que calcule a área de um círculo, a qual pode ser feita com esta fórmula:
    A = pi*(r^2)
    ... sendo r o raio do círculo, e π uma constante com valor aprox. 3.1416. O valor do raio deve ser informado via teclado.
    Seu programa deve mostrar uma mensagem na tela pedindo o raio do círculo. 
    Em seguida, ele deve mostrar a área calculada.
*/

//  Solução U2A02E03:
import java.util.Scanner;

public class U2A02E03_calculaAreaCirculo {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in); 
        double a, r;
        System.out.print("Digite o raio do círculo: ");
        r = leitor.nextDouble();

        // declarando uma constante "pi" do tipo double, usando o 'final'
        final double pi = 3.1416;
        a = pi*r*r;
        System.out.printf("A área do círculo é: %.2f.", a);
    }
}
