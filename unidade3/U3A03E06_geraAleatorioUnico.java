import java.util.Scanner;

public class U3A03E06_geraAleatorioUnico {
    public static void main(String[] args){
        Scanner inp = new Scanner(System.in);
        System.out.printf("Quantidade de numeros a serem sorteados: \n");
        int quantidade = inp.nextInt();
        System.out.printf("Valor máximo de um número sorteado: \n");
        int limS = inp.nextInt();
        long v [] = new long[quantidade];

        int n = 1;
        long numero = 1 + Math.round((limS-1)*Math.random());
        v[0] = numero;
        System.out.printf("%d, ",v[0]);

        while(n<quantidade){
            numero = 1 + Math.round((limS-1)*Math.random());
            if(numero != v[n-1]){
                v[n]=numero;
                System.out.printf("%d, ",v[n]);
                n ++;

            }
        }
    }
}