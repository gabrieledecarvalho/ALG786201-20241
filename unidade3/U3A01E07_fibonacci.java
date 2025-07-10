import java.util.Scanner;
public class U3A01E07_fibonacci {
    public static void main(String[] args){
        Scanner inp = new Scanner(System.in);
        System.out.print("Digite o N: ");
        int N = inp.nextInt();
        int f1 = 0, f2 = 1, f = 0;

        // utilizando estrutura while:
        System.out.printf("\nFor: \n");
        System.out.printf("%d %d ",f1, f2);
        int i=0;
        while (i < N-2){ //N - 2 por que já mostro o f1 e o f2 antes do laço
            f = f1 + f2;
            System.out.printf("%d ", f);
            f1 = f2;
            f2 = f;
            i++;
        }
    }
}