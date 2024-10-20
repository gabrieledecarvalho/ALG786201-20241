/*  U2A03E02: Cálculo das raízes de uma equação do 2º grau
    Escreva um programa que calcula as raízes de uma equação de 2o grau usando a fórmula de Bhaskara, 
    supondo que existam raízes reais. Isso significa que seu programa não precisa testar se existem raízes
    (nem quantas existem), bastando aplicar a fórmula para descobri-las.

    Seu programa deve obter do usuário os coeficientes da equação do 2o grau. 
    Em seguida, ele deve mostrar os valores das raízes (um por linha). 
    A primeira raiz a ser apresenta deve ser obtida com raiz de delta positiva.

    A resolução deste exercício é facilitada se forem usadas estas duas funções matemáticas:
        Math.pow(x, y): calcula x^y
        Math.sqrt(x): calcula a raiz quadrada de x
 */

 // Solução U2A03E02:
 import java.util.Scanner;

public class U2A03E03_raizesEquacao2GrauV1 {
    public static void main(String[] args){
       Scanner input = new Scanner(System.in);
      
       //   supondo que as raízes reais existam
       int a, b, c; //  coeficientes da equação no formato ax^2 + bx + c = 0
       double x; // incógnita da equação

       System.out.println("Cálculo das raízes de uma equação do segundo grau do tipo Ax^2+Bx+c=0.");
       
       System.out.print("Digite o coeficiente A: ");
       a = input.nextInt();
      
       System.out.print("Digite o coeficiente B: ");
       b = input.nextInt();
       
       System.out.print("Digite o coeficiente C: ");
       c = input.nextInt();
       
       //   Báskara, utilizando sqrt e pow:
       x = -b + Math.sqrt(Math.pow(b,2)-4*a*c);
       System.out.printf("Raiz 1: %.2f\n",x); //    printando dados formatados
       
       x = -b - Math.sqrt(Math.pow(b,2)-4*a*c);
       System.out.printf("Raiz 2: %.2f",x);
    }
}