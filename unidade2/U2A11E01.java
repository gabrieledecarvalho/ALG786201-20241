/*  U2A11E01: Validador de número de cartão de crédito
    O número de cartão de crédito ou débito possui de 13 a 16 dígitos, os quais contêm informações sobre o tipo, a emissora, e o titular do cartão. 
    A tabela a seguir descreve algumas informações sobre números de cartão e companhias emissoras:

        | Operadora  | Prefixo       | Tamanho (em dígitos) | Algoritmo de verificação |
        | ---------- | ------------- | -------------------- | ------------------------ |  
        | Mastercard | 51 a 55       | 16                   | Luhn 10                  |  
        | Visa       | 4             | 13 ou 16             | Luhn 10                  | 
        | Amex       | 34 ou 16      | 15                   | Luhn 10                  |  
        | Diners     | 30 u 36 ou 38 | 14                   | Luhn 10                  |  
        | Discover   | 6011          | 16                   | Luhn 10                  |  
        | enRoute    | 2014 ou 2149  | 15                   | Luhn 10                  |  
        | JCB        | 3             | 16                   | Luhn 10                  |  
        | JCB        | 2131 ou 1800  | 15                   | Luhn 10                  | 

    O último dígito do número serve para verificar a validade do número do cartão como um todo. Como ele se pode conferir se o número do cartão foi escrito corretamente. Esse dígito é calculado usando o algoritmo de Luhn.

    O algoritmo de Luhn foi desenvolvido por Hans Peter Luhn, da IBM, em 1954. Ele é capaz de detectar um erro simples em um dígito, assim como a maioria das transposições de um dígito com os dígitos adjacentes. Este algoritmo verifica se um número de cartão é bem formado realizando o seguinte teste:

        1. Iniciando com o dígito mais à direita, multiplique por 2 (dois) todos os dígitos de posição par, e deixe inalterados os dígitos das posições ímpares. Note que o dígito mais à direita é indexado por 1, ou seja, sua posição sempre é ímpar. Por exemplo, o número 49927398716 seria reescrito como 4(18)9(4)7(6)9(16)7(2)6. Os parênteses ilustram os dígitos que foram dobrados, e são usados apenas para fins didáticos. Sem os parênteses, o número resultante seria 4189476916726.
        2. Se um número dobrado for maior do que 9, ele deve ser substituído pela soma de seus dígitos. Aproveitando o exemplo, o número 4(18)9(4)7(6)9(16)7(2)6 se tornaria então 4(9)9(4)7(6)9(7)7(2)6 ... 49947697726 sem os parênteses.
        3. Some todos os dígitos, independente da sua posição. Assim, o número resultante do passo 2 produziria 4+9+9+4+7+6+9+7+7+2+6 = 70
        4. Se o resto da divisão do número final por 10 for zero, então o número inicial é válido. Note que, obviamente, isso não quer dizer que o cartão seja legítimo, ou que tenha crédito, ou que não tenha expirado. Passar no teste de Luhn quer simplesmente dizer que não ocorreram erros, ou seja, o número é bem formado.
        5. Escreva um programa que leia um número de cartão de crédito e apresente o seguinte resultado na tela:

    A bandeira do cartão, caso o número seja válido
    A mensagem "número inválido", caso contrário
 */

import java.util.Scanner; 

public class U2A11E01 {
    public static void main(String[] args){
        Scanner inp = new Scanner(System.in);
        
        //mostra na tela a mensagem ao usuário
        System.out.print("digite o numero do cartao: ");
        String numero = inp.nextLine(); //nextLine lerá tudo o que está sendo digitado até uma quebra de linha
        
        if (numero.length() > 16){
            System.out.printf("Número inválido");
            return;
        }
        //removendo espaços anteriores e posteriores ao numero
        numero = numero.trim(); 
        
        int n14 = 0, n15 = 0, n16 = 0;
        
        //transformando cada caracter da string em uma substring ao mesmo tempo que os transforma em um valor inteiro
        int n1 = Integer.valueOf(numero.substring(0,1));
        int n2 = Integer.valueOf(numero.substring(1,2));
        int n3 = Integer.valueOf(numero.substring(2,3));
        int n4 = Integer.valueOf(numero.substring(3,4));
        int n5 = Integer.valueOf(numero.substring(4,5));
        int n6 = Integer.valueOf(numero.substring(5,6));
        int n7 = Integer.valueOf(numero.substring(6,7));
        int n8 = Integer.valueOf(numero.substring(7,8));
        int n9 = Integer.valueOf(numero.substring(8,9));
        int n10 = Integer.valueOf(numero.substring(9,10));
        int n11 = Integer.valueOf(numero.substring(10,11));
        int n12 = Integer.valueOf(numero.substring(11,12));
        int n13 = Integer.valueOf(numero.substring(12,13));
        if (numero.length() > 13){
            n14 = Integer.valueOf(numero.substring(13,14));
            if (numero.length() > 14){
                n15 = Integer.valueOf(numero.substring(14,15));
                if (numero.length()
                > 15){
                    n16 = Integer.valueOf(numero.substring(15,16));
                }
            }
        }
        
        
        /**algoritimo de verificação de todos os cartões deste teste é o Luhn 10
         * dígito mais à direita é o 1 (ímpar)
         * se o número * 2 for > 9, o número é a soma dos dígitos
         * somar todos os dígitos, independente da posição
         * soma % 10 = 0 -> número válido;
        */
        int soma;
        switch(numero.length()){
            case 16:
                soma = n16 + n15*2 + n14 + n13*2 + n12 + n11*2 + n10 + n9*2 + n8 + n7*2 + n6 + n5*2 + n4 + n3*2 + n2 + n1*2;
                if(soma%10 != 0){
                    System.out.printf("Número inválido");
                    return;//tenho que botar else aqui?
                }else{
                    
                }
                break;
            case 15:
                soma = n15+ n14*2 + n13 + n12*2 + n11 + n10*2 + n9 + n8*2 + n7 + n6*2 + n5 + n4*2 + n3 + n2*2 + n1;
                if(soma%10 != 0){
                    System.out.printf("Número inválido");
                    return;
                }
                break;
            case 14:
                soma = n14 + n13*2 + n12 + n11*2 + n10 + n9*2 + n8 + n7*2 + n6 + n5*2 + n4 + n3*2 + n2 + n1*2;
                if(soma%10 != 0){
                    System.out.printf("Número inválido");
                    return;
                }
                break;
            case 13:
                soma = n13 + n12*2 + n11 + n10*2 + n9 + n8*2 + n7 + n6*2 + n5 + n4*2 + n3 + n2*2 + n1;
                if(soma%10 != 0){
                    System.out.printf("Número inválido");
                    return;
                }
                break;
        }
        
        String bandeira = "";//tive que inicializar a variável antes do switch
        //usando o switch case para diferenciar os cartões pelo tamanho deles, depois com if/else pelos prefixos
        switch(numero.length()){//o switch só recebe uma variável
            case 13:
            case 16:
                if(n1 == 4){
                    System.out.printf("Visa\n");
                }else if(n1 == 5 && (n2 == 1 || n2 == 2 || n2 == 3 || n2 == 4|| n2 == 5)){
                    bandeira = "Mastercard";
                }else if(n1 == 6 && n2 == 0 && n3 ==1 && n4 == 1){
                    bandeira = "Discover";
                }else if(n1 == 3){
                    bandeira = "JCB";
                }else{
                    bandeira = "Bandeira inválida";
                }
                break;
            case 14:
                if(n1 == 3 && (n2 == 0 || n2 == 6 || n2 == 8)){
                    bandeira = "Diners";
                }else{
                    bandeira = "Bandeira inválida";
                }
                break;
            case 15:
                if(n1 == 3){
                    if(n2 == 4 || n2 == 7){
                        bandeira = "Amex";
                    }else{
                        bandeira = "JCB";
                    }
                }else if(n1 == 2){
                    if((n2 == 0 && n3 == 1 && n4 == 4) || (n2 == 1 && n3 == 4 && n4 ==9)){
                        bandeira = "enRoute";
                    }else if(n2 == 1 && n3 == 3 && n4 == 1){
                        bandeira = "JCB";
                    }else{
                    bandeira = "Bandeira inválida";
                    }
                }else if(n1 == 1 && n2 == 8 && n3 == 0 && n4 == 0){
                    bandeira = "JCB";
                }else{
                    bandeira = "Bandeira inválida";
                }
                break;
            }
        
        //caso numero valido:
        System.out.printf("%s", bandeira);
        
        
    }
}