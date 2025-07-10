/*  U2A09E06 - Ajustar nome para que tenha iniciais maiúsculas
    Escreva um programa que leia o nome de uma pessoa, e o ajuste para que suas iniciais estejam em maiúsculas, 
    e o restante de cada parte do nome esteja em minúsculas. Considere que um nome de pessoa tenha, no máximo, quatro partes.
    Seu programa deve mostrar uma mensagem na tela para instruir o usuário sobre o que digitar, antes de ler o nome. 
    Ao final, o nome ajustado deve ser apresentado na tela.
*/

//  Solução U2A09E06:
import java.util.Scanner;
public class U2A09E06_iniciaisMaiusculas {
    public static void main(String[] args){
        Scanner inp = new Scanner(System.in);
        
        System.out.print("Digite seu nome: ");
        String nome = inp.nextLine();
        
        nome = nome.trim(); // removendo espaços do inicio e do fim do nome, foreshadow: usar strip
        
        int espaco = nome.indexOf(" "); //vê em qual posição o primeiro espaço se encontra
        String primeira_letra = nome.substring(0,1); //pega a string da posição entre 0 e 1 (intervalo aberto no 1), a primeira letra
        primeira_letra = primeira_letra.toUpperCase(); //coloca a string em letra maiúscula
        String primeiro_nome = nome.substring(1,espaco+1); //pega a string da posição 1 e espaço+1 (intervalo aberto) -> acho que deveria ser espaço só pois não quero o espaço
        primeiro_nome = primeira_letra + primeiro_nome; //concatena (junta) as strings
        
        //reutilizando algumas variáveis acima
        nome = nome.substring(espaco+1); //pega a string após a posição do espaço (intervalo fechado)
        nome = nome.trim();
        espaco = nome.indexOf(" ");
        primeira_letra = nome.substring(0,1);
        primeira_letra = primeira_letra.toUpperCase();
        String segundo_nome = nome.substring(1,espaco+1);
        
        nome = nome.substring(espaco+1);
        nome = nome.trim();
        espaco = nome.indexOf(" ");
        primeira_letra = nome.substring(0,1);
        primeira_letra = primeira_letra.toUpperCase();
        String terceiro_nome = nome.substring(1,espaco+1);
        terceiro_nome = primeira_letra + terceiro_nome;
        
        nome = nome.substring(espaco+1);
        espaco = nome.indexOf(" ");
        primeira_letra = nome.substring(0,1);
        primeira_letra = primeira_letra.toUpperCase();
        String quarto_nome = nome.substring(1,espaco+1);
        quarto_nome = primeira_letra + quarto_nome;
        
        String nome_completo = primeiro_nome + " " + segundo_nome + " " + terceiro_nome + " " + quarto_nome;

        System.out.println(nome_completo);
        
    }
}