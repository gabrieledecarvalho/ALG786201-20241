// Escreva um programa em Java que solicita 10 números ao usuário, usando um laço while, e ao final mostre os dois maiores números digitados pelo usuário.

import java.util.Scanner;
public class U3A02E04_doisMaiores {
    public static void main(String[] args){
        Scanner inp = new Scanner(System.in);
        System.out.printf("Digite 10 números: \n");
        System.out.printf("n1: ");
        double n1 = inp.nextDouble();

        // while:
        double n1Maior = n1, n2Maior = n1;
        int i = 0;
        while(i<9){
            System.out.printf("n%d: ",i+2);
            double n = inp.nextDouble();
            if(n>=n2Maior){
                if(n>n1Maior){
                    n2Maior = n1Maior;
                    n1Maior = n;
                }else{
                    n2Maior = n;
                }
            }
            i++;
        }
        System.out.printf("%.2f/%.2f",n1Maior, n2Maior);

        // for:
        double n1Maior = n1, n2Maior = n1;
        for(int i = 0; i<9;i++){
            System.out.printf("n%d: ",i+2);
            double n = inp.nextDouble();
            if(n>=n2Maior){
                if(n>n1Maior){
                    n2Maior = n1Maior;
                    n1Maior = n;
                }else{
                    n2Maior = n;
                }
            }
        }
        System.out.printf("%.2f/%.2f",n1Maior, n2Maior);
    }
}