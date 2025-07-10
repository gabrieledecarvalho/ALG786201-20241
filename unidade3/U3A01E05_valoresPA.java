import java.util.Scanner;
public class U3A01E05_valoresPA {
    public static void main(String[] args){
        Scanner inp = new Scanner(System.in);
        //pedindo ao usuário o x1:
        System.out.print("Digite o valor de x1: ");
        double x1 = inp.nextDouble();
        //pedindo ao usuário a razão:
        System.out.print("Digite o valor de r: ");
        double r = inp.nextDouble();
        //pedindo ao usuário quantos números serão mostrados:
        System.out.print("Digite o valor de N: ");//limite superior
        int N = inp.nextInt();

        //mostrando na tela o valor do x1
        System.out.printf("%.2f ", x1);

        // utilizando estrutura While:
        double x = x1;
        System.out.printf("While: \n");
        //inicializando o contador que será comparado com o N
        double i = 1;
        //enquando i não for maior que o N o loop continua
        while(i <= N){
            //esquação da PA
            x += r;
            //incremento no contador
            i++;
            //mostrando na tela o valor atual de x, que foi incrementado com o valor do x anterior + a razão
            System.out.printf("%.2f ", x);
        }
    }
}