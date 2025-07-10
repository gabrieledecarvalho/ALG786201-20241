/*  U2A05E07 - Mostrando as raízes de uma equação de 2o grau
    Escreva um programa que calcule as raízes de uma equação do segundo grau. 
    O algoritmo deve ler os coeficientes da equação, e então usar a fórmula de Bhaskara para resolvê-la. 
    O algoritmo deve ser capaz de identificar cada um destes casos:
        Se há duas raízes: neste caso, ele mostra as duas raízes calculadas
        Se há somente uma raiz: neste caso, ele mostra a única raiz da equação
        Se não ha raízes reais: aqui ele mostra a mensagem "sem raízes reais"
    Seu programa deve mostrar uma mensagem pedindo que se digitem os coeficientes da equação de 2o grau separados por espaços. Ex:
        Digite os coeficientes a, b, c separados por espaço:
    Em seguida, ele deve ler os trẽs coeficientes. Ao final, o programa deve mostrar o seguinte na tela:
        Se há duas raízes:
            Raízes: x1=valor_da_raiz_1, x2=valor_da_raiz_2
        Se há somente uma raiz:
            Raiz dupla: x1=valor_da_raiz
        Se não ha raízes reais:
            Sem raízes reais
 */

//  OBS: na versão 1, não nos preocupamos com raízes não reais, dessa vez iremos.

//  Solução U2A05E07:
import java.util.Scanner;

public class U2A05E08_raizesEquacao2GrauV2 {
    public static void main(String[] arfs) {
        
        //  criando o objeto inp, da classe Scanner -> criando um Scanner
        Scanner inp = new Scanner(System.in);
        
        //  declarando variáveis inteiras: a, b e c -> coeficientes da equação do segundo grau
        int a, b, c;

        //  declarando delta, uma das variáveis de Báskara e x que corresponderá às raízes da equação do segundo grau
        double delta, x;

        //  mostrando na tela o que digitar e como, logo em seguida inp é chamado para ler os valores do teclado
        System.out.print("Digite os coeficientes a, b, c separados por espaço: ");
        a = inp.nextInt();
        b = inp.nextInt();
        c = inp.nextInt();
        
        //  cálculo da váriável delta, baseado nos coeficientes digitados; utilizando o método Math.pow
        delta = Math.pow(b, 2) - 4 * a * c;
        
        //  teste 1: se delta for maior ou igual a zero
        if (delta >= 0){

            //  teste 1 retorna True -> o primeiro x é calculado:
            x = (-b + Math.sqrt(delta))/(2.0 * a);

            //  teste 1.1, se delta for somente igual a zero
            if (delta == 0){

                //  se teste 1.1 for True, nem é preciso calcular a segunda raíz, pois ela é a mesma -> mostra na tela x
                System.out.printf("Raíz dupla: %.1f", x);
            
            } else { //  se o teste 1.1 for False, é preciso mostrar a variável x calculada primeiro, mas há outra diferente
                System.out.printf("Raízes: %.1f, ",x);

                //  calculando a segunda raíz, como já foi impresso a primeira, podemos substituir o valor na mesma variável (não é uma boa prática, ao meu ver, mas é bom demonstrar que podemos mudar o valor desse tipo de variável)
                x = (-b - Math.sqrt(delta))/(2.0 * a);

                //  imprimindo a segunda raíz
                System.out.printf("%.1f",x);
            }
            
        }else{ //   caso o teste 1 seja False, delta é negativo, mostra na tela que não existe raízes reais
            System.out.print("Sem raízes reais");
        }
    }
}