/*  U2A05E09 - Calculando multa por excesso de velocidade
    Uma infração do tipo excesso de velocidade, quando detectada, é penalizada com multa e pontos na CNH (ver detalhamento). 
    A penalidade depende de quanto foi excedida a velocidade máxima na via:
        Até 20% acima do limite permitido: infração média, com multa de R$ 130,16 e 04 (quatro) pontos na CNH
        Entre 20% e 50% acima do limite: infração grave, com multa de R$ 195,23 e 05 (cinco) pontos na CNH
        50% ou mais acima do limite: infração gravíssima, com multa de R$ 880,41 e 07 (sete) pontos na CNH
    Escreva um programa que verifique se a velocidade de um veículo respeita o limite de velocidade da via. 
    Caso haja infração, seu programa deve mostrar a gravidade da infração, o valor da multa e a quantidade de pontos na carteira.

    Seu programa deve mostrar uma mensagem na tela solicitando a velocidade limite da via, e então ler esse valor. 
    Em seguida, deve mostrar uma mensagem pedindo a velocidade do veículo, e então ler seu valor. Ao final, ele deve mostrar o seguinte:
        Se não houve infração: deve apresentar a mensagem "sem infracao" (sem acentos)
        Se houve infração: deve apresentar as informações e penalidade da infração desta forma:
            Infração GRAVIDADE
            Multa: R$ xxx,xx
            Pontos na CNH: número
            ... sendo GRAVIDADE um destes identificadores (sem acento): media, grave, gravissima
 */

//  Solução U2A05E09:
import java.util.Scanner;

public class U2A05E09_calculaMultaVelocidade {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        
        //  declarando variáveis que serão utilizadas, todas do tipo inteiro
        //  lim: limite de velocidade; v: velocidade; vexc: velocidade excedente; pontos: pontos da CNH 
        int lim, v, vexc, pontos;
        
        //  mostra na tela o que digitar e chama o scanner logo em seguida para ler o inteiro do teclado:
        System.out.print("Digite a velocidade limite da via em km/h: ");
        lim = inp.nextInt();
        
        System.out.print("Digite a velocidade do veículo: ");
        v = inp.nextInt();
        
        //  calcula a velocidade excedente e guarda na variável vexc
        vexc = v - lim;
        
        //  primeiro teste: se a velocidade excedente for maior que zero
        if (vexc > 0){
            //  calcula a porcentagem do excesso de velocidade e substitui o valor da velocidade excedente (melhor seria criar uma nova variável para a porcentagem)
            vexc = vexc*100/lim;

            //  teste 1.1, 1.2 e 1.3 compara a velocidade em porcentagem agora com as porcentagens descritas nas regulamentações
            if(vexc <= 20){
                System.out.print("Infração: media\nMulta: R$130,16\nPontos na CNH: 4");
            }else if(vexc <=50) {
                System.out.print("Infração: grave\nMulta: R$195,23\nPontos na CNH: 5");
            }else{
                System.out.print("Infração: gravissima\nMulta: R$880,41\nPontos na CNH: 7");
            }
        
        //  caso vexc seja igual (ou menor, não é pra ser) não há infração:
        }else{
            System.out.print("sem infracao");
        }    
    }
}