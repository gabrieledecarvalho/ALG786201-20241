

/*  U2A05E10 - Calculando o imposto de renda
    O imposto de renda de pessoa física (IRPF), quando cobrado diretamente no salário de um trabalhador, 
    tem alíquotas e deduções que dependem do valor recebido. A tabela do IRPF para o ano de 2024 pode ser vista a seguir:
    
    | Base de cálculo                | Aliquota    | Dedução do IR  | 
    | ------------------------------ | ----------- | -------------- |
    | Até R$ 2.259,20                | 0% (zero %) | R$ 0 (R$ zero) | 
    | De R$ 2.259,21 até R$ 2.826,65 | 7,5%        | R$ 169,44      | 
    | De R$ 2.826,65 até R$ 3.751,05 | 15%         | R$ 381,44      | 
    | De R$ 3.751,05 até R$ 4.664,68 | 22,5%       | R$ 662,77      | 
    | Acima de R$ 4.664,68           | 27,5%       | R$ 896,00      | 
    FONTE: Ministério da Fazenda

    Escreva um programa que calcule o valor de IRPF a ser pago por um trabalhador em um determinado mês. 
    Seu programa deve apresentar uma mensagem pedindo o valor do salário do trabalhador, e em seguida ler esse valor. 
    Ao final, ele deve mostrar qual o valor de IRPF a ser recolhido na fonte naquele mês:
        IRPF: R$ xxxx.xx
 */

//  Solução U2A05E10:
import java.util.Scanner;

public class U2A05E10_calculaIR {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        
        //  variáveis do tipo double
        //  sal: salávio; ir: imposto de renda; ali: aliquota; ded: dedução
        double sal, ir = 0.0, ali, ded;
        
        //  mostrando na tela o que digitar e pedindo input do teclado com o inp (um Scanner)
        System.out.print("Digite o salário do trabalhador: R$ ");
        sal = inp.nextDouble();

        if(sal <= 2259.20) { //  até R$ 2.259,20
            ir = 0.0; //  isento de IRPF
        } else if(sal <= 2826.65){ //  de R$ 2.259,21 até R$ 2.826,65
            ali = 0.075;
            ded = 169.44;
            ir = (sal * ali) - ded;
        } else if (sal <= 3751.05) {
            ali = 0.15;
            ded = 381.44;
            ir = (sal * ali) - ded;
        } else if(sal <= 4664.68) {
            ali = 0.225;
            ded = 662.77;
            ir = (sal * ali) - ded;
        } else { //qualquer número maior que 4664.68
            ali = 0.275;
            ded = 896;
            ir = (sal * ali) - ded;
        }
        
        System.out.printf("IRPF: R$ %.2f", ir);    
    }
}