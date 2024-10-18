/*  U2A02E08 - Calcula comissão de um vendedor
    Escreva um programa que calcule a comissão de um vendedor pela venda de uma peça. 
    O programa deve ler do teclado as seguintes informações:
    - Identificação do vendedor
    - Código da peça
    - Preço unitário da peça
    - Quantidade de peças vendidas
    Para cada uma das informações acima, o programa deve mostrar uma mensagem pedindo 
    ao usuário que a digite, e então ler o valor digitado.

    A comissão pela venda é de 5% . O programa ao final deve mostrar o seguinte:
    Vendedor: identificação_do_vendedor
    Valor da venda: valor_total_vendido
    Comissão: valor_da_comissão
*/

//  Solução U2A02E08:
import java.util.Scanner;

public class U2A02E08_comissaoVendedor {
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);

        //  imprimindo na tela a informação desejada e pedindo o valor do teclado em seguida:
        System.out.print("Identificação do Vendedor: ");
        String id = input.next();
        
        System.out.print("Código da peça: ");
        String code = input.next();
        
        System.out.print("Preço unitário da peça: ");
        double price = input.nextDouble();
        
        System.out.print("Quantidade de peças vendidas: ");
        int qtd = input.nextInt();
        
        //  printando as informações transformadas e formatadas:
        System.out.print("Vendedor: ");
        System.out.println(id);
        System.out.printf("Valor da venda: %.2f\n", price*qtd); //  \n pula linha | %.2f formata com 2 casas após a vírgula
        System.out.printf("Comissão: %.2f", price*qtd*5.0/100);
    }
}
