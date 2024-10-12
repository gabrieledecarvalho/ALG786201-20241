/*  U2A03E01 - Calculando a posição de um objeto que se move
    Em Física, o Movimento Retilíneo Uniforme (MRU) representa casos em que 
    um corpo se move em linha reta com velocidade constante. 
    A equação da posição de um corpo é dada por esta fórmula:
        x(t) = x0 + v*t
    ... sendo:
    - x(t): a posição do corpo no instante t
    - x0: a posição do corpo no instante t=0
    - v: a velocidade do corpo
    - t: o instante em segundos
    Escreva um programa que forneça a posição atual de um objeto 
    que se desloque de acordo com MRU. Seu programa deve obter do 
    usuário a posição inicial desse objeto (em metros), a velocidade (em m/s)
    e o instante (em segundos), apresentando então a posição atual na tela.
    Para cada valor a ser obtido do usuário, seu programa deve mostrar 
    uma mensagem informando-lhe o que deve digitar.
 */

 // Solução U2A03E01:
 import java.util.Scanner;

public class U2A03E01_MRU {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        
        //  declarando variáveis: xi = posição inicial, v = velocidade, t = tempo
        double xi, v, t;
        
        //  Mostrando na tela o que deve ser digitado e logo em seguida chamando o Scanner para inserir o dado pelo teclado
        System.out.print("Qual a posição inicial (m)? ");
        xi = input.nextDouble();
        
        System.out.print("Qual a velocidade do corpo (m/s)? ");
        v = input.nextDouble();
        
        System.out.print("Em qual instante de tempo o corpo está no movimento (s)? ");
        t = input.nextDouble();
        
        //  mostrando na tela dados formatados com dois pontos após a vírgula, fazendo o cálculo dentro do print
        System.out.printf("A posição do corpo no instante %.2f s é %.2f m.", t, xi+v*t);
    }
}