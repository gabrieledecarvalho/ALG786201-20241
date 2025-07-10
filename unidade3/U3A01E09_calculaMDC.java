import java.util.Scanner;

public class U3A01E09_calculaMDC {
    public static void main(String[] args){
        Scanner inp = new Scanner(System.in);

        System.out.printf("Programa que calcula o mdc (máximo divisor comum) de dois números.\n");
        System.out.printf("Digite o primeiro número: \n");
        int n1 = inp.nextInt();
        System.out.printf("Digite o segundo número: \n");
        int n2 = inp.nextInt();

        // utilizando a estrutura while:
        System.out.printf("\nWhile\n");
        //inicializando 3 variáveis que serão utilizadas no condicional e no laço para que as originais não se percam.
        int resto = 0, a = n1, b = n2;
        if(b==0){
            System.out.printf("O máximo divisor comum entre %d e %d é %d.\n",n1,n2,a);
            return; //para o programa
        }

        while(b!=0){
            resto = a%b ;
            a = b;
            b = resto;
        }

        System.out.printf("O máximo divisor comum entre %d e %d é %d.\n",n1,n2,a);

    }
}