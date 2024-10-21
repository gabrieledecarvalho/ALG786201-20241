/*  U2A08E05: Formatando o nome de uma pessoa
    Em alguns documentos, o nome completo de uma pessoa é informado neste formato:
        sobrenome, nome
    Escreva um programa que leia o primeiro nome e depois o sobrenome de uma pessoa, 
    e com eles gere o nome completo no formato indicado acima. 
    Esse nome completo deve ser armazenado em uma variável String, 
    e em seguida apresentado na tela.
    Seu programa deve mostrar uma mensagem na tela para instruir o usuário sobre o que 
    digitar, antes de ler cada um dos valores.
*/

//  Solução U2A08E05:

import java.util.Scanner;
public class U2A08E05_formataNome {
    public static void main(String[] args){
        Scanner inp = new Scanner(System.in);
        String nome, sobrenome, nomecompleto;

        System.out.print("Digite o nome: ");
        nome = inp.next();
        String nomeMinusculo = nome.toLowerCase();

        System.out.print("Digite o sobrenome: ");
        sobrenome = inp.next();
        String sobrenomeMinusculo = sobrenome.toLowerCase();

        //  concatenando as strings:
        nomecompleto = sobrenome + ", " + nome;
        
        System.out.print(nomecompleto);
    }    
}
