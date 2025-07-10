/*  U2A09E04 - Gerar texto a partir de formulário e valores de uma linha CSV
    Modifique o programa do exercício anterior de Gerador de texto a partir de formulário para que os parâmetros e 
    seus valores sejam lidos na forma de uma linha CSV. Lembre que uma linha no formato CSV é formada por valores separados por vírgulas. 
    No caso do gerador de texto, as colunas dessa linha CSV corresponderão aos parâmetros cidade, data, aluno e disciplina, nesta ordem.
*/

//  Solução U2A09E04:
import java.util.Scanner;

public class U2A09E04_linhaCSV_parte3 {
    public static void main(String[] args){
        Scanner inp = new Scanner(System.in);
        String texto, dados, dados1, cidade, data, aluno, disciplina;

        texto = "$cidade, $data\nCaro $aluno, você foi aprovado em $disciplina !";

        System.out.print("Digite os dados no formato CSV: ");
        dados = inp.nextLine();
        
        //  encontrando a posição da vírgula, criando substring com os dados referentes à posição na linha:
        int pos = dados.indexOf(",");   //   indexOf() retorna um número, a posição do que quer se achar dentro da string
        cidade = dados.substring(0,pos);   //  lembrando: substring(posição1, posição2), pega a string que está dentro do intervalo [posição1, posição2)
        dados = dados.substring(pos+1);
        
        pos = dados.indexOf(",");
        data = dados.substring(0,pos);
        dados = dados.substring(pos+1); // pos+1 porque quero pegar a substring a partir da próxima posição depois da vírgula, não quero a vírgula no meu texto
        
        pos = dados.indexOf(",");
        aluno = dados.substring(0,pos);
        dados = dados.substring(pos+1);
        
        pos = dados.indexOf(",");
        disciplina = dados.substring(0,pos);
        dados = dados.substring(pos+1);
        
        texto = texto.replace("$cidade", cidade);
        texto = texto.replace("$data", data);
        texto = texto.replace("$aluno", aluno);
        texto = texto.replace("$disciplina", disciplina);

        System.out.printf(texto);
    }
}