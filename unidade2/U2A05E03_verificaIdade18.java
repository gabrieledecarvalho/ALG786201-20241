/*  U2A05E03 - Verificando a idade de um usuário para acesso ao conteúdo
    Alguns tipos de conteúdo online exigem uma idade mínima de usuário para acesso. 
    Escreva um programa que informe a um usuário se ele tem acesso a um site de conteúdo que exige idade mínima e 18 anos.
    Seu programa deve mostrar uma mensagem na tela pedindo que o usuário digite sua idade, 
    e em seguida deve ler esse número. Ao final, ele deve mostrar apenas uma destas duas mensagens na tela, dependendo dessa idade:
        Acesso liberado (se a idade mínima for atendida)
        Acesso negado (caso contrário)
 */

//  Solução U2A05E03:
import java.util.Scanner;

public class U2A05E03_verificaIdade18 {
    public static void main(String[] args) {
        
        //  relembrando que na próxima linha o scanner inp está sendo criado (objeto) pela classe Scanner
        Scanner inp = new Scanner(System.in);
        
        //  declarando a variável idade sendo do tipo inteiro
        int idade;
        
        //  mostrando na tela o que deve ser digitado
        System.out.printf("Qual a sua idade? ");
        
        //  guardando na variável idade o que foi captado pelo scanner inp, sendo aceito somente dígitos inteiros (nextInt)
        idade = inp.nextInt();
        
        //  primeiro teste: se idade for maior ou igual a 18, mostra na tela "Acesso liberado"
        if (idade >= 18) {
            System.out.print("Acesso liberado");
        
        //  caso o teste acima retorne False, mostra na tela "Acesso negado"
        } else {
            System.out.print("Acesso negado");
        }
    }
}