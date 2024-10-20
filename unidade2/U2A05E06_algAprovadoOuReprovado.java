/*  U2A05E06 - Calculando a nota do semestre e informando se houve aprovação
    De acordo com o plano de ensino [de ALG786201], a nota final do semestre deve ser calculada da seguinte forma:
        notaFinal = (2*A1+4*A2+4*A3)/10
    ... sendo:
        A1: nota da unidade 1
        A2: nota da unidade 2
        A3: nota da unidade 3
    Escreva um programa que lê do teclado das notas das unidades, e informe ao usuário se houve ou não aprovação. 
    Um estudante está aprovado se sua nota final for pelo menos 6 (seis). Seu programa deve mostrar o seguinte na tela:
        APROVADO (se houve aprovação)
        REPROVADO (caso contrário)
 */

import java.util.Scanner;

public class U2A05E06_algAprovadoOuReprovado {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        
        //  declarando como tipo double as variáveis que serão utilizadas
        double a1, a2, a3, nf;
        
        //  mostrando na tela o que deve ser digitado e como, em seguida lendo os valores do teclado com o Scanner inp
        System.out.print("Digite as notas separadas por espaço: ");
        a1 = inp.nextDouble();
        a2 = inp.nextDouble();
        a3 = inp.nextDouble();
        
        //  nf é a nota final, uma média ponderada entre as notas a1, a2 e a3 (de 1 a 10)
        nf = (2*a1 + 4*a2 + 4*a3)/10;
        
        //  primeiro teste: se nf for maior ou igual a 6.0, mostra na tela "APROVADO"
        if (nf >= 6.0) {
            System.out.printf("APROVADO");
        } else { // caso o primeiro teste retorne False imprime na tela "REPROVADO"
            System.out.printf("REPROVADO");
        }
    }
}