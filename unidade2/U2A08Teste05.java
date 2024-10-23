/*  U2A08Teste05: Valor total recebido por um funcionário
    Em um hotel, cada funcionário recebe, além do salário, uma participação na taxa de serviço paga pelos hóspedes. 
    O percentual da taxa de serviço recebido depende do setor onde trabalha o funcionário, pois alguns atendem mais diretamente os hóspedes do que outros. 
    A tabela de percentuais recebidos segue abaixo:

        | Setor             | Percentual | Quantidade de Funcionários | 
        | ----------------- | ---------- | -------------------------- | 
        | Recepção          | 25         | 6                          | 
        | Bar e restaurante | 25         | 8                          | 
        | Cozinha           | 20         | 5                          | 
        | Manutenção        | 10         | 2                          | 
        | Camareiras        | 10         | 6                          | 
        | Segurança         | 10         | 4                          |
    
    Escreva um programa que mostre o valor a ser recebido pelos funcionários de um setor. O programa precisa ler o seguinte pelo teclado:
        Nome do setor
        Total arrecadado com taxa de serviço no mês
    Seu programa deve mostrar uma mensagem na tela para instruir o usuário sobre o que digitar, antes de ler cada valor. 
    Ao final, o programa deve mostrar o valor a ser recebido por cada funcionário do setor.

    Importante:
        Use variáveis para evitar fazer cálculos repetidos
        Será avaliado se os tipos de variáveis escolhidos são os mais adequados ao problema
        Seu programa deve explorar o uso de condições escritas usando condições simples combinadas com operadores lógicos
        Para que seu programa seja considerado para fins de avaliação, ele deve ser executável. 
        Assim, se o programa não puder ser executado por algum erro em sua escrita, ele será avaliado com 0 (zero)
            Para evitar esse problema, TESTE E VERIFIQUE seu programa antes de finalizar a resolução do teste ! 
            Isso é melhor feito no Intellij IDEA, onde se pode inclusive fazer debug !
*/

//  Solução U2A08Teste05:

import java.util.Scanner;

public class U2A08Teste05 {

    public static void main(String[] args){

        Scanner inp = new Scanner(System.in);
        
        String setor;
        double totalArrecadado, valorRecebido;
        int percentual=0, quantidadeFuncionarios=0;
        
        System.out.printf("Digite o nome do setor [aperte Enter para confirmar, não use acentos, maiúsculas ou cedilha]: ");
        setor = inp.nextLine();
        
        System.out.printf("Digite o total arrecadado com taxa de serviço do mês: R$ ");
        totalArrecadado = inp.nextDouble();
        
        switch(setor){
            case "recepcao":
                percentual = 25;
                quantidadeFuncionarios = 6;
                break;
            case "bar e restaurante":
                percentual = 25;
                quantidadeFuncionarios = 8;
                break;
            case "cozinha":
                percentual = 20;
                quantidadeFuncionarios = 5;
                break;
            case "manutencao":
                percentual = 10;
                quantidadeFuncionarios = 2;
                break;
            case "camareiras":
                percentual = 10;
                quantidadeFuncionarios = 6;
                break;
            case "seguranca":
                percentual = 10;
                quantidadeFuncionarios = 4;
                break;
            default:
                System.out.printf("Setor inexistente");
                return;
        }
        
        valorRecebido = totalArrecadado*percentual/(100*quantidadeFuncionarios);
        
        System.out.printf("O valor a ser recebido pelos funcionários do setor %s é de R$ %.2f.", setor, valorRecebido);
    }
}