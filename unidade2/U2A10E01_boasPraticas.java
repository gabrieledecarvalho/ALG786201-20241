/*
Sumário:
1. O programa pede uma frase e retorna a mesma frase toda em letra minúscula, exceto a primeira palavra, sem espaços nas bordas da frase
2. Entrada = String frase qualquer
3. Saída = String frase em minúscula
*/

import java.util.*;

/* Aplique aqui as boas práticas de programação:
 1. Revise a identação
 2. Comente o código para ajudar a entender o que faz cada trecho
 3. Renomeie variáveis, se isso for necessário para esclarecer suas finalidades
 4. Revise o escopo de variáveis, se for pertinente
 */
 
public class U2A10E01_boasPraticas {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        //usuário digita uma frase com o teclado:
        System.out.print("Frase: ");
        String frase_original = s.nextLine();
        //criando uma nova variável frase para que a frase original não se perca
        String frase = frase_original.trim();
        
        //localizando a posição do primeiro espaço da frase:
        int n = frase.indexOf(" ");
        
        if (n > 0) {//se existir espaço após a primeira palavra:
            //criando uma variável chamada prefrase (primeira palavra da String):
            String prefrase = frase.substring(0, n+1);
            
            //removendo a prefase da frase
            frase = frase.substring(n+1);
            //removendo os espaços da frase restante
            frase = frase.trim();
            
            //procurando o próximo espaço na frase restante:
            int m = frase.indexOf(" ");
            
            //concatenando a prefrase com o frase restante enquanto muda a frase restante de upperCase para LowerCase caso necessário
            frase = prefrase + frase.toLowerCase();
            
            
            if (m > 0) {//se existir espaço após a segunda palavra:
                n = n + 1 + m;

                prefrase = frase.substring(0, n+1);
                frase = frase.substring(n+1);
                frase = frase.trim();
                
                m = frase.indexOf(" ");
                frase = prefrase + frase.toLowerCase();

                if (m > 0) {//se existir espaço após a terceira palavra:
                    n = n + 1 + m;

                    prefrase = frase.substring(0, n+1);
                    frase = frase.substring(n+1);
                    frase = frase.trim();
                    frase = prefrase + frase.toLowerCase();
                }
            }

        }
        
        System.out.println(frase);
    
    }

}