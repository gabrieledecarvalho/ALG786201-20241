/*  U2A08E04: Conferindo se foi digitado algo e se a senha é a correta
    Escreva um programa que solicite uma senha de acesso, 
    e então verifique se algo foi de fato digitado(se o usuário não teclou simplesmente ENTER). 
    Se a senha for digitada, o programa deve conferir se ela corresponde à senha cadastrada, 
    a qual é "bacurau". Ao final, seu programa deve mostrar o seguinte:
        Senha aceita: se a senha estiver correta
        Senha rejeitada: se a senha foi digitada, mas está incorreta
        Senha não informada: se a senha não foi digitada
    Seu programa deve mostrar uma mensagem na tela para instruir o usuário sobre o que digitar,
    antes de ler a senha.
*/
// Solução U2A08E04:

import java.util.Scanner;

public class U2A08E04_verificaSenha {
    public static void main(String[] args){
        Scanner inp = new Scanner(System.in);
        String s;
        //  s: senha
        
        System.out.print("Digite a senha: ");
        s = inp.nextLine(); 
        //  nextLine() quarda qualquer coisa que seja digitado até a próxima quebra de linha (Enter) ser digitada, inclusive vazio, garantindo que os passos continuem mesmo sem digitar nada
        
        if(s.isEmpty()){
            System.out.print("Senha não informada\nDigite a senha: ");
            s = inp.nextLine(); //pede a senha novamente
        }else if(s.equals("bacurau")){
            System.out.print("Senha aceita");
        }else{
            System.out.print("Senha rejeitada");
        }
    }
}