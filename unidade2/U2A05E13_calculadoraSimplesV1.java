/*  U2A05E13 - Calculadora simples
    Escreva um programa um programa com duas variáveis numéricas e um caractere que representará uma das operações aritméticas básica (+, –, *, /). 
    O programa deve realizar a operação indicada pelo caractere sobre as variáveis numéricas lidos. 
    O programa deve imprimir os valores e o resultado da operação realizada sobre eles, como mostra o exemplo a seguir:
        Primeiro valor: 4.5
        Segundo valor: 5
        Operador: +
        Resultado: 4.5 + 5.0 = 9.5
    DICA:
        Para ler o operador, use uma variável do tipo String
        Para ler uma string com o Scanner, use next():
            String algo;
            Scanner inp = new Scanner (System.in);

            algo = inp.next();
 */

//  Solução U2A05E13:
import java.util.Scanner;

public class U2A05E13_calculadoraSimplesV1 {
    public static void main(String[] args){
        Scanner inp = new Scanner(System.in);
        String operador;
        
        //  a calculadora só fará operações entre dois valores
        float n1, n2;
            
        System.out.print("Primeiro valor: ");
        n1 = inp.nextFloat();
            
        System.out.print("Segundo valor: ");
        n2 = inp.nextFloat();
            
        System.out.print("Operador [escolha entre +, -, * ou /]: ");
        operador = inp.next();
            
        if (operador.equals("+")) {
            System.out.printf("Resultado: %.1f",n1+n2); //  apresentando na tela com uma casa após a vírgula
            
        } else if (operador.equals("-")) {
            System.out.printf("Resultado: %.1f",n1-n2);
        } else if (operador.equals("*")) {
            System.out.printf("Resultado: %.1f",n1*n2);
        } else if (operador.equals("/")) {
            if(n2 == 0) {
                System.out.print("O denominador é igual a zero, digite outro valor: ");
                n2 = inp.nextFloat();
            }else{
                 System.out.printf("Resultado: %.1f",n1/n2);   
            }
        }
    }
}