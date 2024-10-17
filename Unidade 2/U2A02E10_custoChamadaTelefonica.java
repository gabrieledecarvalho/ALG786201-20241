/*  U2A02E10 - Custo de uma chamada telefônica
    Em uma chamada de telefone, o custo da ligação é calculado pela quantidade de minutos. 
    Por exemplo, a operadora Vivo cobra R$ 1,79 por minuto em chamadas DDD feitas com celulares pré-pagos.
    Para fins de registro, a duração das chamadas é feita por segundo.

    Escreva um programa que calcule o custo de uma chamada a partir de sua duração, 
    que deve ser informada em segundos. Por exemplo, uma chamada de 2 minutos e 12 segundos 
    deve ter sua duração informada como sendo 132 segundos. 
    A partir dessa duração em segundos, seu programa deve calcular o custo da chamada. 
    Note que, se uma chamada durou entre 1 e 60 segundos, ela deve ser 
    contabilizada como sendo de 1 minuto para fins de tarifação. 
    Se ela durou entre 61 e 120 segundos, deve ser contabilizada como sendo 2 minutos, e assim por diante.

    Note que isso possivelmente envolve arredondar uma quantidade para cima 
    ... se o resultado do cálculo for 1.5 minutos, por exemplo, 
    a duração para fins de tarifação deve ser 2 minutos. 
    Para arredondar um número para cima, 
    você precisará usar uma função matemática chamada Math.ceil (seu nome vem da função matemática teto):

//  Math.ceil:
//  O módulo Math contém várias funções matemáticas
import java.lang.Math;

class Teste {
  public static void main(String[] args) {
    // exemplo: o teto de 2.5 é 3 ?
    double x = 2.5;
    System.out.printf("teto de %g é %g\n", x, Math.ceil(x));

    // mas teto de 2 é 2 !
    x = 2.0;
    System.out.printf("Teto de %g é %g\n", x, Math.ceil(x));
  }
}

    Seu programa deve mostrar uma mensagem na tela pedindo a duração da chamada em segundos, 
    e em seguida deve ler o valor digitado. Em seguida, ele deve mostrar o custo da chamada. 
    O custo por minuto deve ser R$ 1.79.
*/

//  Solução U2A02E10:
import java.util.Scanner;
import java.lang.Math;

public class U2A02E10_custoChamadaTelefonica {
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);
        double t, custo; // t = tempo de duração da chamada
        
        //  definindo uma constante chamada taxa com o final
        final double taxa = 1.79;
        
        System.out.print("Qual a duração da chamada? (em segundos): ");
        t = input.nextDouble();
        
        custo = Math.ceil(t/60)*taxa;
        
        System.out.printf("O custo da chamada foi de: R$%.2f.",custo);
        
    }
}