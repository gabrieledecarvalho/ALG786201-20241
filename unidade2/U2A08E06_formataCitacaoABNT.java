/*  U2A08E05: Formatando o nome de um autor para citação bibliográfica
    Segundo a norma de citação bibliográfica da ABNT (Associação Brasileira de Normas Técnicas),
    o autor de um trabalho técnico ou científico deve ser informado da seguinte forma:
        sobrenome, INICIAL
    A INICIAL é a letra inicial do primeiro nome.
    Escreva um programa que leia o nome completo de uma pessoa, e a partir dele gere o nome 
    de autor para citação bibliográfica no formato indicado acima. 
    Esse nome completo deve ser armazenado em uma variável String, 
    e em seguida apresentado natela.
    Seu programa deve mostrar uma mensagem na tela para instruir o usuário sobre o que digitar, 
    antes de ler o nome completo.
*/

//  Solução U2A08E06:
import java.util.Scanner;
public class U2A08E06_formataCitacaoABNT {
    public static void main(String[] args){
        Scanner inp = new Scanner(System.in);
        String nome, sobrenome, inicial, abnt;
        
        System.out.print("Digite o nome: ");
        nome = inp.next();
        System.out.print("Digite o sobrenome: ");
        sobrenome = inp.next();
        
        //  pegando o primeiro caracter da string (posição zero), guardando em "inicial"
        inicial = nome.substring(0,1);

        //  modificando a inicial:
        inicial = inicial.toUpperCase();

        //  concatenando as strings e guardando em abnt
        abnt = sobrenome + ", " + inicial;
        
        System.out.print(abnt);
    }
}
