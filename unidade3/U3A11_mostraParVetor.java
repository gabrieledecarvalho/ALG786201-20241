import java.util.Scanner;

class U3A11_mostraParVetor {

    static boolean ehPar(int x){
        return x%2==0;
    }

    public static void main(String[] args){
        Scanner inp = new Scanner(System.in);

        int [] numeros = new int[10];
        System.out.print("Digite 10 números.\n");
        for(int i = 0; i<10;i++){
            System.out.printf("n%d: ",i+1);
            numeros[i] = inp.nextInt();
        }

        for(int i = 9;i!=0;i--){
            if(ehPar(numeros[i])) {
                System.out.printf("%d ", numeros[i]);
            }
        }
    }
}


// ------------------------------------------------
// algoritimo mais generalizado, para não ter que definir o tamanho do vetor
import java.util.Scanner;

class Teste{

    static int[] converte_linha(String l, String delim) {
        String[] v = l.split(delim);
        int[] n = new int[v.length];
        for (int j = 0; j < v.length; j++) {
            n[j] = Integer.valueOf(v[j]);
        }
        return n;
    }

    static boolean ehPar(int x){
        return x%2==0;
    }

    public static void main(String[] args){
        Scanner inp = new Scanner(System.in);
        System.out.print("Digite 10 números, separados por espaço: ");
        String numeros = inp.nextLine();
        int [] numerosInteiros = converte_linha(numeros," ");
        int tamanhoN = numerosInteiros.length;


        for(int i = tamanhoN-1;i!=0;i--){
            if(ehPar(numerosInteiros[i])) {
                System.out.printf("%d ", numerosInteiros[i]);
            }
        }
    }
}
