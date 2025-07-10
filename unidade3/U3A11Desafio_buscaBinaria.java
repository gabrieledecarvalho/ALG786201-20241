import java.util.Scanner;
import java.util.Arrays;

class U3A11Desafio_buscaBinaria {

    // forma iterativa
    static int busca_binaria(int [] vetor, int valor) {
        Array.sort(vetor);
        int inicio = 0, fim=vetor.length-1, meio = fim/2;
        while(true){
            if(valor==vetor[meio]){
                return meio;
            }else if(valor>meio){
                inicio = meio + 1;
            }else if(valor<meio){
                fim = meio - 1
            }
        }
        return -1;
    }

    // forma recursiva [fazer]
    // static int busca_binaria(int [] vetor, int valor){
    //     Array.sort(Vetor);
    //     int inicio = 0, fim=vetor.length-1, meio = fim/2;
    //     if(valor=vetor[meio]){
    //         return meio;
    //     }else if(valor>valor[meio]){
    //          ...
    //         return busca_binaria()
    //     }else if(valor<meio){
    //          fim = meio - 1
    //      }
    //
    // }

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("n: ");
        int n = inp.nextInt();

        long [] nAleatorios = new long[100];

        // poderia fazer um método que gera números aleatorios, dá um vetor, recebe quantidade e intervalo
        int numero = 1 + Math.round(99*math.random());
        nAleatorios[0] = numero
        for(int i = 0; i < nAleatorios.length; i++){
            numero = 1 + Math.round(999*math.random());
            if(numero != nAleatorios[i-1]){
                nAleatorios=numero;
            }else{
                n--;
            }
        }
        if(busca_binaria(nAleatorios,n)==-1){
            System.out.println("Sinto muito, não encontrei o valor :c");
        }else{
            System.out.printf("O valor %d está no vetor [%d], na posição %d.", n,nAleatorios[busca_binaria(nAleatorios,n)],busca_binaria(nAleatorios,n));
        }

    }
}

// algoritmo que gera numeros aleatorios:
//         long numero = 1 + Math.round(9*Math.random());
//         v[0] = numero;
//         int n = 1;
//         while(n<4){
//         // Math.random() gera um double aleatório entre 0 e 1. Ao multiplicá-lo por 9, obtém-se um número
//         // no intervalo [0, 9). Para convertê-lo para inteiro, usa-se arredondamento com Math.round()
//             numero = 1 + Math.round(9*Math.random());
//             if(numero != v[n-1]){
//                 v[n]=numero;
//                 n ++;
//             }
//         }