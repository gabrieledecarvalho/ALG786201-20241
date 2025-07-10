/*
Escreva um programa que leia o nome de uma pessoa, e o ajuste para que suas iniciais estejam em maiúsculas, e o restante de cada parte do nome esteja em minúsculas. O nome de pessoa pode ter um número arbitrário de partes.

Seu programa deve mostrar uma mensagem na tela para instruir o usuário sobre o que digitar, antes de ler o nome. Ao final, o nome ajustado deve ser apresentado na tela.
 */

import java.util.Scanner;
public class U3A02E06_iniciaisMaiusculas {
    public static void main(String[] args){
        var inp = new Scanner(System.in);
        System.out.printf("Nome: ");
        var nome = inp.nextLine();

        int tamanhoNome = nome.length();
        String nomeNovo = "";

        // laço feito junto do professor em aula:
        boolean espaço = true;
        for(int j = 0; j < tamanhoNome; j++){
            char c = nome.charAt(j); //char -> 1 caracter; charAt -> caracter dessa posição
            if(c != ' ' && espaço) { // espaço no primeiro laço é true
                c = Character.toUpperCase(c);
            }
            espaço = c == ' '; //resultado da operação c == ' ' -> false or true
            nomeNovo += c; //nova string
        }
    }
}