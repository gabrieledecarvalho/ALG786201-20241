/*  U2A04E01 - Debug: Descobrindo o maior valor dentre 5 números
    Este programa lê 5 números do teclado, e então mostra o maior dentre eles. 
    Ele usa esta função matemática para ajudar a resolver o problema:
    Math.max(x, y): tem como resultado o maior valor dentre x e y
    O programa possui ao menos um erro. Faça o procedimento de debug para descobri-lo(s) e corrigi-lo(s) !
*/

import java.util.Scanner;

public class U2A04E01_debug1 {
    public static void main(String[] args) {
        double x, y;
        Scanner inp = new Scanner(System.in);
        
        System.out.print("Digite um número: ");
        x = inp.nextDouble();

        System.out.print("Digite um número: ");
        y = inp.nextDouble();
        x = Math.max(x, y);
        
        System.out.print("Digite um número: ");
        x = inp.nextDouble(); // sem rodar o debugger -> x é o valor máximo obtido na linah 20 e o valor será substituido por um novo, perdendo a variável
        y = Math.max(x, y);

        System.out.print("Digite um número: ");
        y = inp.nextDouble(); // mesmo problema da linha 23
        x = Math.max(x, y);

        System.out.print("Digite um número: ");
        x = inp.nextDouble(); // mesmo problema da linha 23
        y = Math.max(x, y);

        System.out.printf("Maior é: %g\n", y);        
    }
}