//verificar se um número é primo ou composto
import java.util.Scanner;
public class U3A01E08_verificaPrimo {
    public static void main(String[] args){
        //var inp = new Scanner(System.in); -> var para variavel que é óbvio qual o tipo dela
        Scanner inp = new Scanner(System.in);
        System.out.printf("n: ");
        int n = inp.nextInt();

        // Verificação para caso o número digitado não seja natural:

        // while(n<=1){
        //     System.out.printf("Digite um número NATURAL: ");
        //     n = inp.nextInt();
        // }

        // Utilizando a estrutura while -> algoritmo errado ! o 2 funciona, não sei por que, o while testa numero a numero
        System.out.printf("While\n");
        int i = 2;
        while(i<=Math.sqrt(n)){ //adicionar uma variavel lim para nao usar Math.sqrt(n) no laço
            if(n%i == 0){
                System.out.printf("COMPOSTO");
                return;
            }else{
                i++;
            }
        }

        System.out.printf("PRIMO", n);

        //utilizando a estrutura for, não vai rodar enquanto o de cima não estiver em comentário:
        System.out.printf("\nFor\n");
        if(n==2){
            System.out.printf("PRIMO");
            return;
        }else if(n%2==0){
            System.out.printf("COMPOSTO");
            return;
        }else {
            var lim = Math.sqrt(n);
            for (int i = 3; i <= lim; i += 2) {
                if (n % i == 0) {
                    System.out.printf("COMPOSTO");
                    return;
                }
            }
        }
        System.out.printf("PRIMO");

    }
}