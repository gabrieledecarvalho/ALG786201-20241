/*  U2A09E07 - Remover espaços em excesso de uma frase curta    
    Escreva um programa que leia uma frase contendo até cinco palavras, e então a modifique de forma a remover todos os espaços em excesso. 
    Isso significa que:
        Não deve haver espaços nas bordas
        Deve haver somente um espaço entre palavras
    Seu programa deve mostrar uma mensagem na tela para instruir o usuário sobre o que digitar, antes de ler a linha.
    Ao final, ele deve mostrar a linha modificada.
*/

//  Solução U2A09E07:
import java.util.Scanner;

public class U2A09E07_removeEspaco {
    public static void main(String[] args){
        Scanner inp = new Scanner(System.in);
        
        System.out.printf("Digite sua frase (até 5 palavras):");
        String frase = inp.nextLine(); //utilizando o nextLine ele só vai ler o valor após o enter e não o espaço
        
        // primeira palavra
        frase = frase.trim(); //    foreshadow: usar strip
        int espaco = frase.indexOf(" ");
        String palavra1 = frase.substring(0,espaco+1);
        frase = frase.substring(espaco+1);
        frase = frase.trim();
        
        // segunda palavra
        espaco = frase.indexOf(" ");
        String palavra2 = frase.substring(0,espaco+1);
        frase = frase.substring(espaco+1);
        frase = frase.trim();
        
        // terceira palavra
        espaco = frase.indexOf(" ");
        String palavra3 = frase.substring(0,espaco+1);
        frase = frase.substring(espaco+1);
        frase = frase.trim();
        
        // quarta palavra
        espaco = frase.indexOf(" ");
        String palavra4 = frase.substring(0,espaco+1);
        frase = frase.substring(espaco+1);
        
        // quinta palavra
        String palavra5 = frase.trim();
        
        frase = palavra1 + palavra2 + palavra3 + palavra4 + palavra5;
        
        System.out.print(frase);
    }
}