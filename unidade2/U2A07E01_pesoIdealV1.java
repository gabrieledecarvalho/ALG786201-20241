/*  U2A07E01 - Peso ideal
    Escreva um programa que calcule o “peso ideal” de uma pessoa de acordo com um caractere
    identificador de sexo (“M” para Masculino ou “F” para Feminino). 
    A fórmula para cada um dos dois casos está definida abaixo.
        Caso “M”: utilize a fórmula: 52 + (0.75 × (altura - 152.4)
        Caso “F”: utilize a fórmula: 52 + (0.67 × (altura - 152.4)
        O usuário pode informar o sexo com letra maiúscula ou minúscula.
    Seu programa deve mostrar uma mensagem na tela para instruir o usuário sobre o que digitar, antes de ler cada um dos valores. Seu programa deve primeiro ler a altura, e depois o sexo. Ao final, o peso ideal deve ser apresentado na tela.
 */

//  Solução U2A07E01:
import java.util.Scanner;

public class U2A07E01_pesoIdealV1 {
    public static void main(String[] args){
        Scanner inp = new Scanner(System.in);
        float peso, h;
        
        System.out.print("Digite a altura (cm): ");
        h = inp.nextFloat();
        System.out.print("Digite o gênero (F/M): ");
        String sex = inp.next();

        switch (sex) {
            case "m":
                System.out.printf("O peso ideal é %.2f Kg", (52 + (0.75 * (h - 152.4))));
                break;
            case "M":
                System.out.printf("O peso ideal é %.2f Kg", (52 + (0.75 * (h - 152.4))));
                break;
            case "f":
                System.out.printf("O peso ideal é %.2f Kg", (52 + (0.67 * (h - 152.4))));
                break;
            case "F":
                System.out.printf("O peso ideal é %.2f Kg", (52 + (0.67 * (h - 152.4))));
        }
    }
}