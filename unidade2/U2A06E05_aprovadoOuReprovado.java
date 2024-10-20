/*  U2A06E05 - Determinando se estudante foi aprovado
    Pelas regras do IFSC, um estudante é aprovado se:
        Sua média semestral foi pelo menos 6 (seis)
        Sua frequência às aulas foi de pelo menos 75%
    Escreva um programa que obtenha as seguintes informações digitadas por um usuário:
        A média semestral de um estudante
        A carga horária total da unidade curricular, dada em horas-aula (ex: Pensamento Computacional tem 80 horas-aulas)
        A quantidade de faltas desse estudante
    Para cada uma dessas informações, seu programa deve mostrar uma mensagem na tela para instruir o usuário 
    sobre o que ele deve digitar, e então ler o valor requerido.
    Seu programa deve, ao final, mostrar a situação final do estudante, a qual deve ser uma das seguintes:
        APROVADO
        REPROVADO
 */

//  Solução U2A06E05:
import java.util.Scanner;

public class U2A06E05_aprovadoOuReprovado {
    public static void main(String[] args){
        Scanner inp = new Scanner(System.in);
        
        float media;
        int horas, faltas;
        
        System.out.print("Digite a média de estudante: ");
        media = inp.nextFloat();
        System.out.print("Digite a carga horária da unidade curricular: ");
        horas = inp.nextInt();
        System.out.print("Digite a quantidade de faltas de estudante: ");
        faltas = inp.nextInt();
        
        float frequencia = horas/4;

        if (media >= 6 && faltas <= frequencia){
            System.out.print("APROVADO");
        }else {
            System.out.print("REPROVADO");
        }
    }
}
