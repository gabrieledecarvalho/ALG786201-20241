/*  U2A07E04 - Conta de uma lanchonete
    O cardápio de uma casa de lanches é dado pela tabela abaixo:

        | Código | Produto        | Preço Unitário |
        | ------ | -------------- | -------------- |
        | 100    | Cachorro Quente| R$ 1,70        |
        | 101    | Bauru Simples  | R$ 2,30        |
        | 102    | Bauru com Ovo  | R$ 2,60        |
        | 103    | Hamburguer     | R$ 2,40        |
        | 104    | Cheeseburguer  | R$ 2,50        |
        | 105    | Refrigerante   | R$ 1,00        |
    
    Escreva um programa que leia o código do item adquirido pelo consumidor e a quantidade, 
    e então calcula e mostra o valor a pagar. Para cada valor lido, 
    seu programa deve antes mostrar uma mensagem na tela para instruir o usuário sobre o que digitar. 
    O valor deve ser apresentado da seguinte forma:
        Conta: R$ xx.xx
    Se o usuário digitar um código inválido, o programa deve mostrar a mensagem:
        codigo invalido
    DICA:
        Use switch ... case para identificar qual operação deve ser realizada
 */

//Solução U2A07E04:
import java.util.Scanner;

public class U2A07E04_contaLanchonete {
    public static void main(String[] args){
        Scanner inp = new Scanner(System.in);
        int codigo, quantidade;
        double preco;
        
        System.out.print("Digite o código do produto: ");
        codigo = inp.nextInt();
        System.out.print("Quantidade do produto: ");
        quantidade = inp.nextInt();
        
        switch (codigo){
            case 100:
                preco = 1.70;
                //System.out.printf("Conta: R$ %.2f", 1.70*quantidade);
                break;
            case 101:
                preco = 2.30;
                //System.out.printf("Conta: R$ %.2f", 2.30*quantidade);
                break;
            case 102:
                preco = 2.60;
                //System.out.printf("Conta: R$ %.2f", 2.60*quantidade);
                break;
            case 103:
                preco = 2.40;
                //System.out.printf("Conta: R$ %.2f", 2.40*quantidade);
                break;
            case 104:
                preco = 2.50;
                //System.out.printf("Conta: R$ %.2f", 2.50*quantidade);
                break;
            case 105:
                preco = 1.00;
                //System.out.printf("Conta: R$ %.2f", 1.00*quantidade);
                break;
            default:
                System.out.print("Código inválido!");
                return; //termina o programa a partir desse ponto, não retorna nada
        }
  
        System.out.printf("Conta: R$ %.2f\n", quantidade*preco);
    }
}
