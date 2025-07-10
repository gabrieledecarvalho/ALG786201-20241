// Escreva um programa que pergunte ao usuário quantos alunos tem na sala dele. Em seguida, seu programa deve pedir ao usuário para que entre com as notas de todos os alunos da sala, um por vez. Os números devem ser digitados todos na mesma linha, separados por espaço, ou um por linha. Ao final, seu programa deve mostrar a média aritmética das notas dos alunos dessa turma.
import java.util.Scanner;
public class U3A02E02_calculoMedia {
    public static void main(String[] args){
        Scanner inp = new Scanner(System.in);
        System.out.printf("Digite o número de estudantes da sala: \n");
        int nEstudantes = inp.nextInt();

        //while
        int i = 1;
        double soma = 0, nota;
        while (i<=nEstudantes){
            System.out.printf("Digite a nota do %d º estudante: \n",i);
            nota = inp.nextDouble();
            soma += nota;
            i++;
        }

        System.out.printf("A média aritmética das notas dos estudantes foi de %.2f\n",(soma/nEstudantes));

        //for
        for(int i=0;i<nEstudantes;i++){
            System.out.printf("Digite a nota do %d º estudante: \n". i+1);
            nota = inp.nextDouble();
            soma += nota;
        }

        System.out.printf("A média aritmética das notas dos estudantes foi de %.2f\n",(soma/nEstudantes));
    }
}