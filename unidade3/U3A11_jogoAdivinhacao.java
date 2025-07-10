/*
Escreva um programa capaz de descobrir o valor de um número que você tenha imaginado. O programa deve interagir sucessivamente com você, até descobrir o número. Ao final, ele deve informar quantas tentativas precisou para descobrir o número. OBS: o número deve ser um inteiro entre 1 e 99.

Dica: é possível descobrir o número em no máximo 7 tentativas se for usada uma busca binária.
O programa deve funcionar da seguinte maneira.

O programa mostra na tela seu palpite para o número que você pensou
Se o programa acertou, você deve digitar = seguido de ENTER. O programa então mostra quantas tentativas ele fez até adivinhar o número, e então termina.
Se o número que você pensou for maior do que o número mostrado pelo programa, você deve digitar > seguido de ENTER, e o programa repete a partir do passo 1
Se o número que você pensou for menor do que o número mostrado pelo programa, você deve digitar < seguido de ENTER, e o programa repete a partir do passo 1
Veja este exemplo de execução do programa, supondo que o número imaginado pelo usuário tenha sido 57:

45
>
60
<
49
>
56
>
57
=
5 tentativas
 */

import java.util.Scanner;
class U3A11_jogoAdivinhacao {

    // static int advinha(String r) {
    //     if(r==">"){
    //         return false;
    //     }else if(r=="<"){
    //         return false;
    //     }else if(r=="="){
    //         return true;
    //     }else{
    //         System.out.printf("Comando inválido.");
    //         return false;
    //     }
    // }

    // professor fez com switch case, tentar fazer
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Pense em um número de 1 a 100\n");
        int limI = 0, limS = 100, vezes=0;

        boolean ok = false;

        while (!ok) {
            int meio = limI + (limS - limI)/2;
            vezes++;
            System.out.printf("o número é %d: ", meio);
            String resposta = inp.next();
            //LEMBRAR QUE STRING NÃO SE COMPARA COMO NÚMERO !!!!!
            if(resposta.equals("=")){
                ok = true;
            }else if(resposta.equals(">")){
                limI = meio + 1;
            }else if(resposta.equals("<")){
                limS = meio - 1;
            }else{
                System.out.printf("Comando inválido.");
            }

        }
        System.out.printf("Acertei em %d tentativas!!!!!!!!!!!!\n",vezes);
    }
}

//
//>
//limI = 50, limS = 100
//        int meio = limI + (limS)/2;
//<
//        limI = 0, limS = 50
//        int meio = limI + (limS)/2;
//
//=
//ok