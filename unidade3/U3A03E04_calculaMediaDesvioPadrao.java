import java.util.Scanner;
public class U3A03E04_calculaMediaDesvioPadrao {
    public static void main(String[] args){
        Scanner inp = new Scanner(System.in);

        System.out.printf("Quantidade de notas: \n");
        int N = inp.nextInt(); // quantidade de notas totais

        double [] notas = new double[N]; // vetor vazio que alocará cada nota

        // laço para arrecadar as notas para a média
        int i = 0; // inicializando o contador no zero
        double somaNotas = 0;
        while(i<N){ // iniciado o contador no zero, o limite superior tem que ser aberto
            System.out.printf("n%d: ",i+1); // i + 1 pois o contador inicia no zero
            notas[i] = inp.nextDouble();
            somaNotas += notas[i];
            i++;
        }

        double M = somaNotas/N; // média de notas, N: quantidade de notas totais

        // laço realizar o somatório para o desvio padrão
        double somatorio = 0;
        int j = 0;
        while(j<N){
            somatorio += Math.pow((notas[j]-M),2); // nota j lida menos a média, tudo isso ao quadrado
            j++;
        }

        double D = Math.sqrt(somatorio/N); // desvio padrão

        System.out.printf("%.2f/%.2f", M, D);
    }
}