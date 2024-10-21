/*  U2A07E03 - Calculadora Simples Versão 2
    Escreva um programa um programa com duas variáveis numéricas e um caractere que 
    representará uma das operações aritméticas básica (+, –, *, /). 
    O programa deve realizar a operação indicada pelo caractere sobre as variáveis 
    numéricas lidos. O programa deve imprimir os valores e o resultado da operação 
    realizada sobre eles, como mostra o exemplo a seguir:
        Primeiro valor: 4.5
        Segundo valor: 5
        Operador: +

        Resultado: 4.5 + 5.0 = 9.5
    DICA:
        Use switch ... case para identificar qual operação deve ser realizada
        Para ler o operador, use uma variável do tipo String
        Para ler uma string com o Scanner, use next():
            String algo;
            Scanner inp = new Scanner (System.in);

            algo = inp.next();
*/

//  Solução U2A07E03:
import java.util.Scanner;

public class U2A07E03_calculadoraSimplesV2 {
    public static void main(String[] args){
        Scanner inp = new Scanner(System.in);
        
        System.out.println("Calculadora simples [+, -, *, /]\nSepare por espaços o primeiro número, a operação e o segundo número\n[ex: n1 + n2]\nDigite a operação: ");
        float n1, n2;
        String operador;
        
        n1 = inp.nextFloat();
        operador = inp.next();
        n2 = inp.nextFloat();     
        
        switch (operador){
            case "+":
                System.out.printf("Primeiro valor: %.2f\nSegundo valor: %.2f", n1, n2);
                System.out.printf("\nOperador: ", operador);
                System.out.printf("Resultado: %.2f ",(n1+n2));
                break;
            case "-":
                System.out.printf("Primeiro valor: %.2f\nSegundo valor: %.2f", n1, n2);
                System.out.printf("\nOperador: ", operador);
                System.out.printf("Resultado: %.2f ",(n1-n2));
                break;
            case "*":
                System.out.printf("Primeiro valor: %.2f\nSegundo valor: %.2f", n1, n2);
                System.out.printf("\nOperador: ", operador);
                System.out.printf("Resultado: %.2f ",(n1*n2));
                break;
            case "/":
                System.out.printf("Primeiro valor: %.2f\nSegundo valor: %.2f", n1, n2);
                System.out.printf("\nOperador: ", operador);
                System.out.printf("Resultado: %.2f ",(n1/n2));
        }
    }
}
