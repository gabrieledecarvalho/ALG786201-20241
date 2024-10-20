/*  U2A05E06 - Previsor de tempo versão 1
    A previsão do tempo na costa brasileira pode ser feita de forma aproximada usando-se um barômetro e um termômetro. 
    Uma estimativa com boa chance de acerto se baseia na tabela abaixo:

        |barômetro     | termômetro   | tempo provável                                      |
        |------------- | ------------ | --------------------------------------------------- |
        | subindo      | subindo      | tempo bom, ventos quentes e secos                   |
        | subindo      | estacionário | tempo bom, ventos de leste frescos                  |
        | subindo      | baixando     | tempo bom, ventos de sul a sudeste                  |
        | estacionário | subindo      | tempo mudando para bom, ventos de leste             |
        | estacionário | estacionário | tempo incerto, ventos variáveis                     |
        | estacionário | baixando     | chuva provável, ventos de sul a sudeste             |
        | baixando     | subindo      | tempo instável, aproximação de frente               |
        | baixando     | estacionário | frente quente com chuvas prováveis                  |
        | baixando     | baixando     | chuvas abundantes e ventosd e sul a sudoeste fortes |
    
    Escreva um programa que forneça uma estimativa da previsão do tempo usando essa tabela. Seu programa deve funcionar da seguinte forma:
        O programa deve apresentar o seguinte na tela:
            Barometro:
        Em seguida, o programa deve ler o valor informado pelo usuário via teclado.
        Em seguida, ele deve apresentar isto:
            Termometro:
        Em seguida, o programa deve ler o valor informado pelo usuário via teclado.
        Ao final, ele deve apresentar a previsão de tempo, conforme indicado na tabela. Por exemplo:
            Tempo incerto
        Os valores para barômetro e termômetro a serem digitados pelo usuário podem ser somente estes:
            subindo
            baixando
            estacionario
 */

//  Solução U205E06:
import java.util.Scanner;

public class U2A05E07_previsorDeTempoV1 {
    public static void main(String[] args){
        Scanner inp = new Scanner(System.in);
        
        //  declarando as variáveis do tipo String, bar: barômetro e ter: termômetro
        String bar, ter;
        
        //  mostrando na tela a variável que deve ser digitada (Barômetro) e chamando o Scanner "inp" para ler os valores do teclado (em String)
        System.out.print("Barometro: ");
        bar = inp.next();
        
        //  sequência de condicionais para testar o valor digitado no barômetro, lembrando do fluxograma feito na unidade1 > algoritmosFluxograma > questão4

        //  verificando se o que foi digitado é igual a subindo, estacionário ou baixando, exatamente:
        if(!bar.equals("subindo")){ //  se não for igual subindo 
            }if(!bar.equals("estacionario")){ //    se não for igual a estacionário
                if(!bar.equals("baixando")){ // se não for igual a baixando
                    
                    //  caso nenhum teste retorne False, mostra a mensagem na tela e pede para digitar novamente:
                    System.out.print("Digite somente subindo, baixando ou estacionario: ");
                    bar = inp.next();
                }
            }
        //  é possível verificar se é igual, usando um if primeiro depois else if e por fim um else acima


        //  sequência de condicionais para testar o valor digitado do termômetro:
        System.out.print("Termometro: ");
        ter = inp.next();
        
        //  mesma lógica das linhas 49 a 57
        if(!ter.equals("subindo")){
            }if(!ter.equals("estacionario")){
                if(!ter.equals("baixando")){
                    System.out.print("Digite somente subindo, baixando ou estacionario: ");
                    ter = inp.next();
                }
            }
        
        //  agora o trabalho braçal, testando a combinação de cada entrada de bar e ter:

        //  se bar é igual a subindo e
        if(bar.equals("subindo")) {
            //  ter igual a subindo
            if (ter.equals("subindo")) {
                System.out.print("Tempo bom, ventos quentes e secos");
            
            //  caso não seja subindo, se for estacionario
            } else if (ter.equals("estacionario")) { // como se fosse o elif do python mas não é o mesmo, é como se fosse "else {if{}}"", como são duas instruções, posso concatenar
                System.out.print("Tempo bom, ventos de leste frescos");
            
            // caso não seja nem subindo nem estacionario, se for baixando
            } else if (ter.equals("baixando")) {
                System.out.print("Tempo bom, ventos de sul a sudeste");
            }
        
        //  combinação 2, se bar é igual a estacionário...
        } else if (bar.equals("estacionário")) {
            if (ter.equals("subindo")) {
                System.out.print("Tempo mudando para bom, ventos de leste");
            } else if (ter.equals("estacionario")) {
                System.out.print("Tempo incerto, ventos variáveis");
            } else if (ter.equals("baixando")) {
                System.out.print("Chuva provável, aproximação de frente");
            }
        
        //  combinação 3, se bar é igual a baixando...
        } else if (bar.equals("baixando")) {
            if (ter.equals("subindo")) {
                System.out.print("Tempo instável, aproximação de frente");
            } else if (ter.equals("estacionario")) {
                System.out.print("Frente quente com chuvas prováveis");
            } else if (ter.equals("baixando")) {
                System.out.print("Chuvas abundantes e ventos de sul a sudoeste fortes");
            }
        }
    }
}