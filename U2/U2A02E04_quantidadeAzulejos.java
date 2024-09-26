/*  U2A02E04 - Determinando quantidade de azulejos para uma parede:
    Escreva um programa que calcule quantos azulejos são necessários para cobrir uma parede. 
    O azulejo é quadrado, e tanto seu comprimento de lado quanto a área da parede devem ser informados pelo teclado.
    Seu programa deve mostrar uma mensagem na tela pedindo o comprimento do lado do azulejo, o qual deve ser informado em cm. 
    Em seguida, ele deve mostrar outra mensagem pedindo a área da parede, a qual deve ser informada em m2. 
    Ao final, ele deve mostrar a quantidade de azulejos necessária para cobrir toda a parede. 
    Note que isso possivelmente envolve arredondar essa quantidade para cima ... 
    se o resultado do cálculo for 23.6 azulejos, por exemplo, a resposta deve ser 24. 
    Para arredondar um número para cima, você precisará usar uma função matemática chamada Math.ceil (seu nome vem da função matemática teto):
*/

// // O módulo Math contém várias funções matemáticas
// import java.lang.Math;

// class Teste {
//   public static void main(String[] args) {
//     // exemplo: o teto de 2.5 é 3 ?
//     double x = 2.5;
//     System.out.printf("teto de %g é %g\n", x, Math.ceil(x));

//     // mas teto de 2 é 2 !
//     x = 2.0;
//     System.out.printf("Teto de %g é %g\n", x, Math.ceil(x));
//   }
// }
//

//  Solução U2A02E04:
import java.util.Scanner;

class U2A02E04_quantidadeAzulejos {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int lado_azulejo;
        double area_parede, area_azulejo;
        
        System.out.print("Lado do azulejo (cm): ");
        lado_azulejo = input.nextInt();
        System.out.print("Área da parede (m): ");
        area_parede = input.nextDouble();

        //  valor do cálculo é atribuído em "area_azulejo" já convertido para m^2:
        area_azulejo = (lado_azulejo*lado_azulejo)/(10000.0); 
        //  utilizando o 10000.0, converto qualquer tipo de numero em double/float pelo decimal contido no número
        
        System.out.printf("Quantidade de azulejos: %d\n", (int) Math.ceil(area_parede/area_azulejo)); 
        //a Math.ceil devolve um double, (int) na frente da função transforma o tipo qualquer que seja em int - não é uma boa prática forçar essa transformação
    }
} 