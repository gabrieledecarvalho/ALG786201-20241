/*  U2A03E04: Mostrando a sequência de fibonacci usando somente 3 variáveis
    Refaça o exercício sobre a sequência de Fibonacci, porém usando somente três variáveis. 
    Além de obter uma solução, explique dentro do seu código-fonte como ela pode ser generalizada 
    para gerar quantos números da sequência forem desejados. Essa explicação deve ser feita na forma 
    de comentários, aparecendo acima do código-fonte.
 */


//  Solução U2A03E05:
public class U2A03E05_fibonacciV2 {
    public static void main(String[] args){
        //  definindo as 3 variáveis que serão atualizadas durante a execução do programa:
        int f0 = 0, f1 = 1, f;

        System.out.printf("f0 = %d, ",f0);
        System.out.printf("f1 = %d, ",f1);
        //  o próximo número é a soma dos dois últimos, sendo f0 o primeiro termo e f1 o segundo, f3 o terceiro
        f = f0 + f1;
        System.out.printf("f2 = %d, ",f);
        //  atualizando o primeiro termo (f0) para o valor contido em f1:
        f0 = f1;
        //  atualizando o segundo termo (f1) para o valor calculado anteriormente:
        f1 = f;
        //  atualizando o terceiro termo (f), a soma dos dois ultimos termos
        f = f0 + f1;
        System.out.printf("f3 = %d, ",f);
        f0 = f1;
        f1 = f;
        f = f0 + f1;
        System.out.printf("f4 = %d, ",f);
        f0 = f1;
        f1 = f;
        f = f0 + f1;
        System.out.printf("f5 = %d, ",f);
        f0 = f1;
        f1 = f;
        f = f0 + f1;
        System.out.printf("f6 = %d, ",f);
        f0 = f1;
        f1 = f;
        f = f0 + f1;
        System.out.printf("f7 = %d, ",f);
        f0 = f1;
        f1 = f;
        f = f0 + f1;
        System.out.printf("f8 = %d, ",f);
        f0 = f1;
        f1 = f;
        f = f0 + f1;
        System.out.printf("f9 = %d.",f);
        }
}