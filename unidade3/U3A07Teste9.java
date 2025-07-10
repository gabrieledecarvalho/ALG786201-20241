/*
Um programa executa um comando digitado pelo usuário. Esse programa apresenta o prompt "> " e em seguida lê um comando digitado pelo usuário. Após verificar se o nome do comando digitado é válido, o programa o executa e então termina.

Escreva esse programa de forma que o nome do comando digitado seja verificado. Se estiver correto, o programa deve mostrar a seguinte mensagem na tela (isso simula sua execução):

COMANDO executado
... sendo COMANDO o nome do comando digitado. Se o comando for inválido, o programa deve mostrar o seguinte:

COMANDO inválido
A lista de comandos aceitos é esta:

execute ajuda mostre liste remova copie renomeie filtre ordene bloqueie historico info sair limpe desligue
Um comando é válido independente de estar em maiúsculas ou minúsculas. Por exemplo, o comando execute pode ser digitado tanto como execute, Execute, EXECUTE, ou qualquer combinação de letras maiúsculas e minúsculas.

Veja este exemplo de execução do programa, em que um comando válido é digitado:

> ajuda
ajuda executado
Use um vetor para armazenar os nomes de comandos válidos. Assim, a verificação de validade de um comando digitado pode ser feita com a busca desse comando no vetor.

Neste teste, não é aceitável usar switch/case ou if/else aninhados para testar cada comando válido comando  !
 */

import java.util.Scanner;

public class U3A07Teste9 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        String [] comandosValidos = {"execute", "ajuda", "mostre", "liste", "remova", "copie", "renomeie", "filtre", "ordene", "bloqueie", "historico", "info", "sair", "limpe", "desligue"};
        String comando;

        System.out.printf("> ");
        comando = inp.nextLine();

        for(int i=0; i<comandosValidos.length;i++){
            if(comando.equalsIgnoreCase(comandosValidos[i])){
                System.out.printf("%s executado\n",comando.toLowerCase());
                return;
            }
        }

        System.out.printf("%s inválido",comando.toLowerCase());
    }
}