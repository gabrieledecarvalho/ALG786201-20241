/*  U2A09E01 - Cadastro de senha Versão 2
    Escreva um programa que solicite uma senha para cadastro. 
    A senha deve ser fornecida duas vezes, para conferência. 
    Espaços no início ou no final da senha são desconsiderados. 
    Por fim, a senha deve ter pelo menos 8 caracteres.
    Seu programa deve primeiro conferir se as senhas são iguais. 
    Em seguida, ele deve conferir se a senha possui pelo menos 8 caracteres.
    Seu programa deve mostrar uma mensagem na tela para instruir o usuário sobre o que digitar, 
    antes de ler cada uma das senhas. Ao final, deve ser mostrado o seguinte:
        Senha cadastrada: se a senha passou nas verificações
        Senhas não conferem: se senhas forem diferentes
        Senha deve ter pelo menos 8 caracteres: se senha não atender esse critério
*/

//  Solução U2A09E01:
import java.util.Scanner;

public class U2A09E01_cadastroSenhaV2 {
    public static void main(String[] args){
        Scanner inp = new Scanner(System.in);
        String s1, s2; //   senhas

        System.out.printf("Digite a senha: ");
        s1 = inp.next();

        //  verificando se a senha 1 tem pelo menos 8 caracteres:
        if (s1.length() < 8){
            System.out.printf("A senha deve ter pelo menos 8 caracteres.\n");
            System.out.printf("Digite a senha: ");
            s1 = inp.next();
        }

        System.out.printf("Digite a senha novamente: ");
        s2 = inp.next();

        //  aqui está sendo usado trim, para aparar as bordas das strings, mas é melhor usar o strip; foreshadow: em algum momento da U3 será substituído:
        s1 = s1.trim();
        s2 = s2.trim();

        //  verificando se as senhas conferem:
        } if (s1.compareTo(s2) != 0) {
            System.out.printf("Senhas não conferem");
        } else {
            System.out.printf("Senha cadastrada");
        }
    }
}