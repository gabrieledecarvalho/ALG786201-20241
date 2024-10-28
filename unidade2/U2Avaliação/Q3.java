/*
    O banco XYZ vai fornecer empréstimo a uma pessoa. Porém, sabemos que o banco XYZ não pode emprestar para qualquer um, não é todo mundo que vai pagar. 
    O banco faz então uma estimativa da probabilidade de que o cliente vá pagar o empréstimo, e para isso ele usa o seguinte diagrama:

    Possui empréstimo em outros bancos?
        Sim:
            Trabalha de carteira assinada?
                Sim:
                    Possui casa própria?
                        Sim: 55%
                        Não: 40%
                Não:
                    Possui casa própria?
                        Sim: 40%
                        Não: 27%
        Não:
            Trabalha de carteira assinada?
                Sim:
                    Possui casa própria?
                        Sim: 80%
                        Não: 75%
                Não:
                    Possui casa própria?
                        Sim: 70%
                        Não: 60%

    O banco classifica um cliente como bom pagador se a probabilidade obtida por meio desse diagrama for pelo menos 50%.

    Escreva um programa que mostre a probabilidade de um cliente pagar um empréstimo, e se ele deve ser considerado bom pagador. Seu programa deve ler as informações necessárias para obter essa probabilidade, fazendo as perguntas indicadas no diagrama, e então apresentar os resultados na tela.

    OBS: lembre de selecionar Verdadeiro ao final desta questão, se a escolheu, e Falso caso contrário.
*/

import java.util.Scanner; 

public class Q3 {
    public static void main(String[] args){
        Scanner inp = new Scanner(System.in);
        int probabilidade;
        
        System.out.print("Possui empréstimo em outros bancos? ");
        String resposta = inp.next();
        if(resposta.equalsIgnoreCase("SIM")){
            System.out.print("Trabalho de carteira assinada? ");
            resposta = inp.next();
            if(resposta.equalsIgnoreCase("SIM")){
                System.out.print("Possui casa própria? ");
                resposta = inp.next();
                if(resposta.equalsIgnoreCase("SIM")){
                    probabilidade = 55;
                }else{
                    probabilidade = 40;
                }
            }else{
                System.out.print("Possui casa própria? ");
                resposta = inp.next();
                if(resposta.equalsIgnoreCase("SIM")){
                    probabilidade = 40;
                }else{
                    probabilidade = 27;
                }
            }
        }else{
            System.out.print("Trabalho de carteira assinada? ");
            resposta = inp.next();
            if(resposta.equalsIgnoreCase("SIM")){
                System.out.print("Possui casa própria? ");
                resposta = inp.next();
                if(resposta.equalsIgnoreCase("SIM")){
                    probabilidade = 80;
                }else{
                    probabilidade = 75;
                }
            }else{
                System.out.print("Possui casa própria? ");
                resposta = inp.next();
                if(resposta.equalsIgnoreCase("SIM")){
                    probabilidade = 70;
                }else{
                    probabilidade = 60;
                }
            }
        }
        if(probabilidade >= 50){
            System.out.printf("O cliente será um bom pagador, a probabilidade de pagamento é de %d.", probabilidade);       
        }else{
            System.out.printf("O cliente não será um bom pagador, a probabilidade de pagamento é de %d.", probabilidade);       
        }
    }
}