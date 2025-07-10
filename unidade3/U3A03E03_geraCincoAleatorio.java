import java.util.Scanner;
public class U3A03E03_geraCincoAleatorio {
    public static void main(String[] args){
        Scanner inp = new Scanner(System.in);
        //criando um vetor de inteiros:
        long [] v = new long[5]; //em java ele cria com valor zero se for int, se for uma string ele cria strings vazias

        int n = 1;
        long numero = 1 + Math.round(9*Math.random());
        v[0] = numero;
        while(n<4){
            // Math.random() gera um double aleatório entre 0 e 1. Ao multiplicá-lo por 9, obtém-se um número
            // no intervalo [0, 9). Para convertê-lo para inteiro, usa-se arredondamento com Math.round()
            numero = 1 + Math.round(9*Math.random());
            if(numero != v[n-1]){
                v[n]=numero;
                n ++;
            }
        }

        System.out.print(v);

        for(int n=1; n<4; n++){
            numero = 1 + Math.round(9*Math.random());
            if(numero != v[n-1]){
                v[n]=numero;
            }else{
                n--; // o for vai incrementar de qualquer forma, mas não quero que incremente a não ser que v[n] seja diferente;
            }
        }

        System.out.print(v);
    }
}