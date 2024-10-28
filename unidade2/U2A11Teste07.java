/*  U2A11Teste7: 
    Uma aplicação para emissão automática de DARF precisa que o usuário informe o mês e ano de uma operação, sobre a qual se deve pagar imposto de renda. 
    O usuário deve digitar mês e ano da seguinte forma:
        MM/AAAA
    ... sendo que MM é o mês, e AAAA é o ano, e todos devem ser formados por dígitos numéricos. O mês pode ter um ou dois dígitos, mas o ano deve sempre ter 4 dígitos.
    O valor do mês deve estar entre 1 e 12, e somente anos de 2020 em diante são aceitos. 
    Escreva um programa que leia do teclado o mês e ano nesse formato, e verifique se são válidos. Se a data for válida, seu programa deve apresentar o dia e mês na tela, 
    seguindo o formato padronizado MM/AAAA (mês deve ter dois dígitos). Se a data for inválida, ele deve apresentar o seguinte:
        data invalida
*/

// Solução U2A11Teste7:

import java.util.Scanner;

public class U2A11Teste07 {
    public static void main(String[] args){
        Scanner inp = new Scanner(System.in);
        
        System.out.printf("Digite a data [MM/AAAA]: ");
        String data_original = inp.nextLine();
        String data = data_original.trim();
        
        int barra = data.indexOf("/");
        String mes = data.substring(0,barra);
        mes = mes.trim();
        
        int nmes = Integer.valueOf(mes);
        
        if(mes.length() > 2 || nmes < 1 || nmes > 12){
            System.out.println("data invalida");
            return;
        }
        String ano = data.substring(barra+1);
        ano = ano.trim();
        
        int nano = Integer.valueOf(ano);
        if(ano.length() != 4 || nano < 2020){
            System.out.println("data invalida");
            return;
        }
        
        System.out.printf("%02d/%d",nmes, nano);
    }
}