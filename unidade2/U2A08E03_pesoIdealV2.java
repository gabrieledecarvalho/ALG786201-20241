/*
    Escreva um programa que calcule o “peso ideal” de uma pessoa de acordo com um caractere 
    identificador de sexo (“M” para Masculino ou “F” para Feminino). 
    A fórmula para cada um dos dois casos está definida abaixo.
        Caso “M”: utilize a fórmula: 52 + (0.75 × (altura - 152.4)
        Caso “F”: utilize a fórmula: 52 + (0.67 × (altura - 152.4)
    O usuário pode informar o sexo com letra maiúscula ou minúscula. 
    Explore as operações de string para simplificar essa verificação !
    Seu programa deve mostrar uma mensagem na tela para instruir o usuário sobre o 
    que digitar, antes de ler cada um dos valores. Seu programa deve primeiro ler a altura,
    e depois o sexo. Ao final, o peso ideal deve ser apresentado na tela.
 */

//  Solução U2A08E03:

import java.util.Scanner;

public class U2A08E03_pesoIdealV2 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        double peso, h, i = 0; //tive que inicializar o i, por ele estar dentro do condicional ?
        //  h: altura (heigth), i: índice de acordo com o sexo

        System.out.print("Digite a altura (cm): ");
        h = inp.nextFloat();
        System.out.print("Digite o gênero (F/M): ");
        String sexo = inp.next();
        
        //  ao invés de utilizar um ignoreCase, transformar tudo para maiúsculas ou minúsculas
        sexo = sexo.toUpperCase();
        
        if (sexo.equals("M")){
            i = 0.75;
        }else if (sexo.equals("F")){
            i = 0.67;
        }
        
        // if (sexo.equalsIgnoreCase("m")){ //ignorar entre maiúsculas e minúsculas
        //     i = 0.75;
        // }else if (sexo.equalsIgnoreCase("f")){
        //     i = 0.67;
        // }
        
        //  posso fazer um switch (sexo) case (m/g) também

        //  com o índice (i) definido é só apresentar o resultado:
        System.out.printf("O peso ideal é %.2f Kg", (52 + (i * (h - 152.4))));
    }
}
