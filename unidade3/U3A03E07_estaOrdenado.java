import java.util.Scanner;

public class U3A04E07_estaOrdenado {
    public static void main(String[] args){
        Scanner inp = new Scanner(System.in);
        System.out.printf("Digite 10 números, separados por espaço:\n");

        int [] v = new int[10];
        v[0] = inp.nextInt(); //tenho que ler o primeiro número para poder fazer a comparação abaixo

        int i=1;
        while(i<10){
            if(inp.hasNextInt()){
                v[i] = inp.nextInt();
                if(v[i]<v[i-1]){
                    System.out.printf("DESORDENADOS\n");
                    return;
                }
                i++;
            }else{
            }
        }
        System.out.printf("ORDENADOS\n");
    }
}