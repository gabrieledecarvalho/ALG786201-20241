/*  U2A10Teste06: [ver se o teste de ano bisexto funciona]
    Escreva um programa que leia uma data no seguinte formato:
        DD/MM/AAAA
    ... sendo DD o dia, MM o mês, e AAAA o ano. Tanto dia quanto mês podem ser informados com um ou dois dígitos. 
    Por exemplo, estas datas são válidas:
        1/1/2024
        01/1/2024
        01/01/2024
        1/01/2024
    A data deve ser lida por completo e como string.
    Após ler a data, seu programa deve calcular qual o número do dia no ano da data. Por exemplo:
        1/1/2023 é dia 1
        31/12/2023 é dia 365
    Esse cálculo deve levar em conta se o ano é ou não bissexto.
    Seu programa deve mostrar uma mensagem na tela para instruir o usuário sobre o que digitar, antes de ler a data. 
    Ao final, o programa deve mostrar SOMENTE o número do dia. Por exemplo, imagine que o uso do seu programa gerasse o seguinte:
        Data: 1/02/2024
        32
    Na primeira linha, seu programa apresentou a mensagem Data:, e o usuário digitou 1/02/2024. 
    Na segunda linha, seu programa mostrou o número do dia no ano.
    DICA: para resolver este teste, você precisará converter string para número inteiro. Isso pode ser feito assim:
        int x = Integer.valueOf("123");
        Integer.valueOf é um conversor que transforma uma string numérica (que só contém dígitos) em um número inteiro. No exemplo acima a variável x receberá o valor 123 (inteiro).
 */

//  Solução U2A10Teste06:
import java.util.Scanner;

public class U2A10Teste06 {

    public static void main(String[] args){

        Scanner inp = new Scanner(System.in);

        String data, dia, mes, ano;
        int diaspassados = 0, ndia, nmes, nano;

        System.out.printf("Digite a data no formato DD/MM/AAAA: \n");
        data = inp.next();

        int barra = data.indexOf("/");
        dia = data.substring(0,barra);
        data = data.substring(barra+1);

        barra = data.indexOf("/");
        mes = data.substring(0,barra);

        ano = data.substring(barra+1);

        ndia = Integer.valueOf(dia);
        nmes = Integer.valueOf(mes);
       
        switch (nmes){
            case 1: //jan 31
                diaspassados = ndia;
                break;
            case 2: //fev 28
                diaspassados = ndia + 31;
                break;
            case 3: //mar 31
                diaspassados = ndia + 59;
                break;
            case 4: //abr 30
                diaspassados = ndia + 90;
                break;
            case 5: //mai 31
                diaspassados = ndia + 120;
                break;
            case 6: //jun 30
                diaspassados = ndia + 151;
                break;
            case 7: //jul 31
                diaspassados = ndia + 181;
                break;
            case 8: //ago 31
                diaspassados = ndia + 212;
                break;
            case 9: //set 30
                diaspassados = ndia + 243;
                break;
            case 10: //out 31
                diaspassados = ndia + 273;
                break;
            case 11: //nov 30
                diaspassados = ndia + 304;
                break;
            case 12: //dez 31
                diaspassados = ndia + 334;
                break;
        }
        //  adicionei depois, verificar se o programa reage certo:
        if ((ano%400 == 0 || ano%4 == 0 && ano%100 != 0) && nmes>2) {
            ndia+=1;
        }
        System.out.printf("%d", diaspassados);
    }
}