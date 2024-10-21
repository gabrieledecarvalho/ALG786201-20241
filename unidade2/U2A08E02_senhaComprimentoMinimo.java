/*  U2A08E02 - Cadastro de senha com comprimento mínimo
    Escreva um programa que solicite uma senha para cadastro. 
    A senha deve ser fornecida duas vezes, para conferência. 
    Além disso, a senha deve ter pelo menos 8 caracteres.
    Seu programa deve mostrar uma mensagem na tela para instruir o usuário 
    sobre o que digitar, antes de ler cada uma das senhas. 
    Ao final, deve ser mostrado o seguinte:
        Senha cadastrada: se a senha passou nas verificações
        Senhas não conferem: se senhas forem diferentes
        Senha deve ter pelo menos 8 caracteres: se senha não atender esse critério
 */
//  Solução U2A08E02:

//  importando a classe Scanner
import java.util.Scanner;

//  declarando a classe "U2A08E02_(...)", sendo ela pública
public class U2A08E02_senhaComprimentoMinimo {

    //  public: acesso à classe; static: método estático, não precisa ser iniciada; void: não retorna nada; "main": nome do método; String[] args: parâmetros (como em funções, no caso aqui chamado de métodos)
    public static void main(String[] args){

        //  criando o objeto tipo Scanner, argumento System.in que fará a leitura do teclado
        Scanner inp = new Scanner(System.in);
    
        //  informando ao usuário que tipo de dado o programa quer, no caso a senha
        System.out.printf("Digite a senha: ");

        //  lendo do teclado a senha, gerando uma string s1, declaro a String junto do pedido do teclado
        String s1 = inp.next();

        //  pedindo para que o usuário confirme a senha digitando ela novamente
        System.out.printf("Digite a senha novamente: ");
        
        //  lendo do teclado a senha, gerando outra string s2, declaro a string junto do pedido do teclado, mas poderia declarar acima, já que tenho 2 Strings
        String s2 = inp.next();
        
        //  usando o condicional if, comparando se s1 e s2, verificando se não são iguais
        if (!s1.equals(s2)){
            System.out.printf("Senhas não conferem");

        //  caso elas sejam iguais, usando o if, verifica se o tamanho da string (length()) é menor que 8
        }else if (s1.length() < 8){
            System.out.printf("A senha deve ter pelo menos 8 caracteres.\n");
            
            /*  Poderia pedir a senha novamente e fazer toda a verificação, veremos na próxima unidade com métodos e loops uma forma mais fácil
            //  caso seja menor que 8 caracteres, pede a senha novamente 2x
            System.out.printf("Digite a senha: ");
            s1 = inp.next();
            System.out.printf("Digite a senha novamente: ");
            s2 = inp.next();
            */

        //  caso s1 e s2 sejam iguais e maior ou igual a 8 caracteres, o sistema mostra na tela:    
        }else{
            System.out.printf("Senha cadastrada");
        }
    }
}
