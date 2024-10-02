/*  U2A02E05 - Calculando o volume de uma lata de óleo
    Escreva um programa que calcule o volume de uma lata de óleo cilíndrica. Esse volume segue a seguinte fórmula:
    V=h*pi*r*r
    ... sendo h a altura da lata e r o raio de sua base. O valor de π deve ser 3.1416.
    Seu programa deve mostrar uma mensagem na tela pedindo a altura da lata de óleo, e em seguida deve ler o valor dessa altura, a qual deve ser dada em cm. Depois deve mostrar uma mensagem pedindo o raio da base da lata, e ler esse valor, o qual deve ser também em cm. Ao final, ele deve mostrar o volume da lata de óleo, o qual deve ser informado em litros (lembre que 1 litro = 1000 cm3).
 */

//  Solução U2A02E05:
import java.util.Scanner;

public class U2A02E05_volumeLata {
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);
        double h, r;
        
        //  Definindo uma constante do tipo double com o final
        final double pi = 3.1416;
        
        //  Printa na tela e logo após pede entrada do teclado
        System.out.print("Altura da lata (cm): ");
        h = input.nextDouble();

        System.out.print("Raio da base da lata (cm): ");
        r = input.nextDouble();
        
        //  Printa na tela o resultado do volume, calculando direto no print
        System.out.printf("Volume da lata: %.2f", h*pi*r*r);
    }
}