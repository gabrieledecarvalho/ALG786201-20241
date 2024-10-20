/*  U2A05E14 - Imposto de renda sobre venda de imóvel
    O Imposto de Renda sobre a venda de imóvel recai apenas sobre o lucro obtido na operação. 
    Por exemplo, se você comprou um imóvel por R$ 100 mil e depois vendeu ele também por R$ 100 mil, 
    seu lucro será zero e não haverá custo com imposto de renda. Se vendeu o mesmo imóvel por R$ 150 mil, 
    seu lucro será de R$ 50 mil. Além disso, custos inerentes ao processo de venda podem ser descontados do lucro, 
    tais como taxa de corretagem. Esse "lucro" da operação é chamado pela Receita Federal de "ganho de capital".
    O cálculo do imposto é feito com diferentes alíquotas, dependendo do lucro da venda, como mostrado na tabela a seguir:

    | Faixa do ganho de capital na venda de imóvel | Alíquota do IR aplicada sobre a faixa |
    | -------------------------------------------- | ------------------------------------- |
    | Até R$ 5 milhões                             | 15,00%                                |
    | De R$ 5 milhões até R$ 10 milhões            | 17,50%                                |
    | De R$ 10 milhões até R$ 30 milhões           | 20,00%                                |
    | Mais de R$ 30 milhões                        | 22,50%                                |

    Importante ressaltar que, quando ultrapassar o ganho de capital de R$ 5 milhões, o crescimento da alíquota é gradual, 
    como se fosse um cálculo "em escada". Por exemplo, se o ganho de capital for de R$ 7 milhões, a alíquota de 17,50% só 
    será aplicada sobre montante que ultrapassar os R$ 5 milhões. A tabela abaixo traz uma simulação desse cálculo:

    | Faixa do ganho de capital na venda de imóvel | Alíquota do IR aplicada sobre a faixa | Valor do ganho de capital nesta faixa | Valor do imposto devido |
    | -------------------------------------------- | ------------------------------------- | ------------------------------------- | ----------------------- |
    | Até R$ 5 milhões                             | 15,00%                                | 15,00%                                | R$ 750.000              |
    | De R$ 5 milhões até R$ 10 milhões            | 17,50%                                | 17,5-%                                | R$ 350.000              |
    | Total                                        | 15,71%                                | R$ 7.000.000                          | R$ 1.100.000            |

    Por fim, se você usar o valor dessa venda para comprar outro imóvel no prazo de 180 dias, não será necessário pagar o imposto de renda.

    Escreva um programa que calcula o imposto de renda a ser pago no ganho de capital na venda de imóvel. 
    Seu programa deve obter as seguintes informações de um usuário:Valor de compra do imóvel
        Valor de aquisição do imóvel
        Valor de venda do imóvel
        Custo de corretagem na venda
        Se outro imóvel será adquirido no prazo de 180 dias
    Para cada uma dessas informações a serem fornecidas, seu programa deve apresentar uma mensagem de texto 
    para instruir o usuário sobre o que deve ser digitado, e então ler a respectiva informação. 
    Ao final, seu programa deve mostrar o imposto de renda a ser pago sobre a venda do imóvel.
 */

//  Solução U2A05E14:
import java.util.Scanner;

public class U2A05E14_IRImovel {
    public static void main(String[] args){
        Scanner inp = new Scanner(System.in);
        double valor_imovel, valor_venda_imovel, corretagem_imovel, ganho, ali;
        String comprar_imovel;
        double ir; //   imposto de renda
        
        System.out.print("Digite o valor de aquisição do imóvel: R$ ");
        valor_imovel = inp.nextDouble();
        System.out.print("Digite o valor de venda do imóvel: R$ ");
        valor_venda_imovel = inp.nextDouble();
        System.out.print("Digite o custo de corretagem na venda do imóvel: R$ ");
        corretagem_imovel = inp.nextDouble();
        System.out.print("Outro imóvel será adquirido no prazo de 180 dias? [S/n]: ");
        comprar_imovel = inp.next();
        
        ganho = valor_venda_imovel - valor_imovel;
        
        if (comprar_imovel.equals("S")){
            System.out.print("Não será necessário pagar o imposto de renda!");
            
        }else if (ganho < 5000000){
            ali = 0.15;
            ir = ganho*ali; //ir de ATÉ 5000000
            }else if(ganho < 10000000 ){
                ali = 0.175;
                ir = ir + (ganho-5000000)*ali; //ir de ATÉ 10000000
            }else if(ganho < 30000000){
                ali = 0.20;
                ir = ir + (ganho-10000000)*ali; //ir de ATÉ 30000000
            }else if(ganho > 30000000){
                    ali = 0.225;
                    ir = ir + (ganho-30000000)*ali; //ir de MAIS de 30000000
            }
        
        System.out.printf("IRPF: %.2f", ir);
        
    }
}