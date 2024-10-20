/*  U2A05E04 - Verificando a senha para o acesso a um sistema
    Escreva um programa exige que o usuário forneça uma senha para que possa usá-lo. 
    Essa senha deve ser pleiades, sendo predefinida dentro do próprio programa.
    Seu programa deve mostrar uma mensagem na tela pedindo que o usuário digite a senha, 
    e em seguida deve ler essa senha. Ao final, ele deve mostrar apenas uma destas duas mensagens na tela:
        Acesso liberado (se a senha estiver correta)
        Acesso negado (caso contrário)
    
    IMPORTANTE:
        Para ler uma string em Java, você deve usar uma variável do tipo String:
            String senha;
        Para comparar se duas strings são iguais, não use o operador "==". Você deve fazer assim:
            // supondo que senha seja uma variável do tipo string ...
            if (senha.equals("alguma coisa")) {
 */

//  Solução U2A05E04:
import java.util.Scanner;

public class U2A05E04_verificaSenhaIgual {
    public static void main(String[] args) {
        //  criando o objeto inp, da classe Scanner
        Scanner inp = new Scanner(System.in);
        
        //  mostrando na tela o que deve ser digitado e logo em seguida chamando o Scanner inp para guardar os dados do teclado na string "senha"
        System.out.printf("Digite a senha: ");
        String senha = inp.next(); //   usando somente next
        
        //  OBS: if(senha == ("1234abcd")){  não é o certo, string é um dado especial, deve ser testado como a seguir:
        
        //  teste 1, se a senha digitada é igual à sequência de caracteres "1234abcd", imprime "Acesso liberado"
        if (senha.equals("1234abcd")) {
            System.out.print("Acesso liberado");
        
        //  caso o teste 1 retorne False, imprime "Acesso negado"
        }else {
            System.out.print("Acesso negado");
        }
    }
}