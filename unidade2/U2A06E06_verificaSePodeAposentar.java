//  REVER: melhorar o programa e ver sobre lossy conversion, 0.02f o que isso significa

/*  U2A06E06 - Testando se um trabalhador pode se aposentar
    Pelas leis brasileiras, um trabalhador pode se aposentar se atender estas condições:
        Ter ao menos 65 anos de idade
        Ter contribuído para a previdência por, pelo menos, 15 anos
    O benefício previdenciário, por sua vez, será calculado da seguinte forma:
        60% da média de todos seus salários + 2% ao ano acima de 15 anos para mulheres e 20 anos para homens
    Escreva um programa que informa se um trabalhador pode se aposentar. 
    Em caso afirmativo, seu programa deve também mostrar qual o benefício previdenciário a ser recebido.
    Seu programa deve obter estas informações digitadas pelo usuário:
        Idade
        Sexo
        Tempo de contribuição
        Média dos salários de contribuição
    Para cada uma dessas informações, seu programa deve mostrar uma mensagem na tela para instruir o usuário sobre o que digitar. 
    Ao final, seu programa deve mostrar se o trabalhador pode se aposentar da seguinte forma:
        DEFERIDO
        INDEFERIDO
    No caso DEFERIDO, seu programa deve mostrar também o valor do benefício a ser recebido:
        Valor do benefício: R$ XXX.XX
*/

//  Solução U2A06E06:
import java.util.Scanner;

public class U2A06E06_verificaSePodeAposentar {
    public static void main (String[] args){
        Scanner inp = new Scanner(System.in);
        
        int idade, t_contr;
        float media_sal, bonus = 0, beneficio; //duvida: tive que inicializar a variável com zero antes de usala na linha 33
        String gen;
        
        System.out.print("Digite a idade [somente em anos]: ");
        idade = inp.nextInt();
       
        System.out.print("Digite o gênero [feminino ou masculino]: ");
        gen = inp.next();
        
        if(!gen.equals("feminino") && !gen.equals("masculino")){ //testador fem masc
            System.out.print("Atualmente, é preciso escolher entre feminino e masculino para poder ter garantido o direito à aposentadoria.\nDigite o gênero [feminino ou masculino]: ");
            gen = inp.next();
        }
        
        System.out.print("Digite o tempo de contribuição: ");
        t_contr = inp.nextInt();
        
        System.out.print("Digite a média dos salários de contruibuição: R$ ");
        media_sal = inp.nextFloat();

        if(gen.equals("feminino") && t_contr > 15){
            bonus = (t_contr - 15) * 0.02f; //https://www.baeldung.com/java-lossy-conversion -> 0.02f
            if (bonus < 0) {
                bonus = 0;
            }
        } else if(gen.equals("masculino") & t_contr > 20){
            bonus = (t_contr - 20) * 0.02f;
            if (bonus < 0) {
            bonus = 0;
            }
        }
       
        beneficio = media_sal * (0.6f + bonus);
        
        if (idade >= 65 && t_contr >= 15){
            System.out.printf("DEFERIDO\nValor do benefício: R$ %.2f", beneficio);
        } else {
            System.out.print("INDEFERIDO");
        }
    }
}