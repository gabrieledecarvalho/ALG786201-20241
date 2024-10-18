/*  U2A03E06: calculando a nota da unidade 1
    Escreva um programa que calcula a nota da unidade 1, conforme definida no plano de ensino. 
    Para fazer o cálculo, seu programa deve receber estas informações:

        N: a quantidade de testes realizados
        k: a quantidade de testes com aprovação
        P: a nota da prova individual ao final da unidade
        T: a média dos N-2 testes com maior nota
        Para cada um desses valores a serem lidos (e nessa sequência), seu programa deve mostrar uma mensagem na tela informando o usuário sobre o que ele deve digitar.

    A resolução deste exercício é facilitada se forem usadas estas funções matemáticas:

        Math.max(x, y): tem como resultado o maior valor dentre x e y
        Math.min(x, y): tem como resultado o menor valor dentre x e y
        Math.round(x): tem como resultado o valor de x arredondado segundo regra de arredondamento usual
    
    Seu programa deve mostrar como resultado:

        A nota da unidade 1
        Os pesos W1 e W2 que foram usados no cálculo dessa nota

    Essas informações devem ser apresentadas da seguinte forma na tela:

        Nota da unidade 1: nota_calculada
        Pesos: W1=W1_calculado, W2=W2_calculado
    
    OBS: nota_calculada deve ser um número inteiro arredondado segundo regra de arredondamento usual. 
    Você pode usar a função Math.round para essa finalidade !
 */

 import java.util.Scanner;

 public class U2A03E06_calculoNotaU1 {
     public static void main(String[] args){
         
         Scanner input = new Scanner(System.in);
         
         int n, k;
         double p, t, w1, w2, a;
         
         System.out.print("Quantidade de testes realizados: ");
         n = input.nextInt();
        
         System.out.print("Quanidade de testes com aprovação: ");
         k = input.nextInt();
        
         System.out.print("Nota da prova: ");
         p = input.nextDouble();
        
         System.out.print("Média dos testes com maior nota: ");
         t = input.nextDouble();
         
         //Math.max(x,y) maior valor dentre x e y
         //Math.min(x,y) menor valor dentre x e y
         //Math.round(x) valor de x arredondado segundo regra de arredondamento usual
         
         w1 = 5 + Math.min(5 , Math.max(0,n-2-k));
         w2 = 5 - Math.min(5 , Math.max(0,n-2-k));
         
         a = Math.round(((w1*p) + (w2*t))/10);//calculo da nota da unidade 1
         
         System.out.printf("Nota da unidade 1: %.1f.",a);
         System.out.printf("Pesos: W1 = %.2f, W2 = %.2f.", w1, w2);
     }
 }