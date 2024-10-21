/*  U2A07E05 - Classificando produtos de um mercado
    Um supermercado possui uma classificação dos produtos. 
    Para cada código numérico existe uma classificação, conforme a tabela a seguir:

    | Código                | Classificação          |
    | --------------------- | ---------------------- |
    | 1                     | Alimento não-perecível |
    | 2, 3 ou 4             | Alimento perecível     |
    | 5 ou 6                | Vestuário              |
    | 7                     | Higiente pessoal       |
    | 8 até 15              | Limpeza                |
    | Qualquer outro código | Código inválido        |

    Escreva um programa que leia um código de produto pelo teclado, e mostre a classificação
    correspondente. Seu programa deve mostrar alguma mensagem de texto antes de ler o código.
    Ao final, ele deve mostrar a classificação do produto.


 */

//  Solução U2A07E05:
import java.util.Scanner;

public class U2A07E05_classificaProdutos {
    public static void main(String[] args){
        Scanner inp = new Scanner(System.in);
        
        System.out.print("Digite o código do produto: ");
        int codigo = inp.nextInt();
        
        switch (codigo){
            case 1:
                System.out.print("Alimento não-perecível");
                break;
            case 2:
            case 3:
            case 4:
                System.out.print("Alimento perecível");
                break;
            case 5:
            case 6:
                System.out.print("Higiente pessoal");
                break;
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                System.out.print("Limpeza");
                break;
            default:
                System.out.print("Código inválido");
        }
    }
}
