/*
    As companhias aéreas usualmente isentam crianças menores de 2 anos do pagamento de passagem aérea, 
    contanto que viajem no colo de um adulto (não ocupem um assento). 
    A partir de 2 anos completos, as crianças pagam 50% do valor da passagem e, a partir dos 12 anos, 
    pagam  passagem com valor cheio.
    Escreva um programa que informe o valor da passagem aérea a ser pago por uma crianças. 
    Seu programa deve mostrar uma mensagem na tela pedindo que se digite a idade da criança, 
    e em seguida deve ler essa idade. Ao final, ele deve mostrar o seguinte na tela:
        Isenta (se a criança não tiver 2 anos completos)
        50% (se tiver entre 2 anos completos e 12 anos incompletos)
        100% (se tiver 12 anos completos ou mais)
 */

//  Solução U2A05E05:
import java.util.Scanner;

public class U2A05E05_verificaIdadeIsenta {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        
        System.out.print("Qual a idade da criança?: ");
        
        //  declarando o tipo da variável na mesma linha em que o scanner irá gravar o valor lido nela, sendo este um inteiro
        int idade = inp.nextInt();
        
        //  ATENÇÃO: condicional dentro de condicional!

        //  teste 1: se a idade for menor que 12 e for True
        if (idade < 12){
            //  teste 1.1: se a idade for menor que 2, imprime "Isenta"
            if (idade < 2){
            System.out.print("Isenta");
            } else { // caso teste 1.1 retorne False, imprime "50% do valor"
                System.out.print("50% do valor");
            }
        } else { // caso o teste 1 retorne False, imprime "100% do valor"
            System.out.print("100% do valor");
        }
    }
}