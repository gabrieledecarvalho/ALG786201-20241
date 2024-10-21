/*  U2A07E02 - Dias úteis ou não
    Escreva um programa que leia do teclado um número inteiro que represente um dos sete dias
    da semana, e em seguida mostre na tela se é dia útil, fim de semana, ou inválido. 
    Considere que domingo é dia 1, e sábado dia 7.

    Seu programa deve antes mostrar uma mensagem na tela para instruir o usuário sobre o 
    que digitar.
*/

//  Solução U2A07E02:
import java.util.Scanner;

public class U2A07E02_diaDaSemana {
    public static void main(String[] args){
        Scanner inp = new Scanner(System.in);
        //domingo dia 1 e sábado dia 7
        int dia;
        
        System.out.print("Digite o dia da semana [dom: 1; sab: 7]: ");
        dia = inp.nextInt();
        
        switch(dia){
            case 1:
            case 7:
                System.out.print("Fim de semana");
                break;
            case 3:
            case 4:
            case 5:
            case 6:
                System.out.print("Dia de semana");
                break;
            default:
                System.out.print("Inválido");
        }
    }
}