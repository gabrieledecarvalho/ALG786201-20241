import java.util.Scanner;
public class U3A01E06_valoresPG {
    public static void main(String[] args){
        Scanner inp = new Scanner(System.in);
        System.out.print("Digite o valor do x1: ");
        double xOriginal = inp.nextDouble();
        System.out.print("Digite o valor do q: ");
        double q = inp.nextDouble();
        System.out.print("Digite o valro de N: ");
        int N = inp.nextInt();
        System.out.printf("%.2f ",xOriginal);

        // utilizando estrutura while:
        System.out.printf("While: \n");
        double x = xOriginal;
        int i = 1;
        while(i <= N){
            x = x*q;
            i++;
            System.out.printf("%.2f ", x);
        }
    }
}