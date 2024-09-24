/* U2A01E01 - Um programa que escreve um poema:
Neste exercício, você deve escrever um programa que mostre algumas informações na tela. Ele deve apresentar este poema:
O meu nome é Severino,
não tenho outro de pia.
Como há muitos Severinos,
que é santo de romaria,
deram então de me chamar
Severino de Maria;
como há muitos Severinos
com mães chamadas Maria,
fiquei sendo o da Maria
do finado Zacarias.

Cada linha do texto deve ser apresentada com uma instrução.  Ao final, seu programa deve mostrar uma linha em branco, e logo em seguida isto:
Neste poema, a palavra Severino aparece XX vezes, e outras YY vezes apareceu Maria.
... sendo que XX e YY são números inteiros que devem ser substituídos nessa frase final.
*/

// Solução E1:
class U2A01E01_escrevePoema { //a palavra que segue class deve ser a mesma do nome do programa
    public static void main(String[] args) {
        // utilizando print e com \n para separar as linhas
        System.out.print("O meu nome é Severino,\nnão tenho outro de pia.\nComo há muitos Severinos,\nque é santo de romaria,\nderam então de me chamar\nSeverino de Maria;\ncomo há muitos Severinos\ncom mães chamadas Maria,\nfiquei sendo o da Maria\ndo finado Zacarias.\n");

        /* versão aternativa utilizando um println para cada linha:
        obs: println: mostra uma mensagem na tela, seguida de uma quebra de linha, sem o ln não quebra linha.
        */
        System.out.println("O meu nome é Severino,");
        System.out.println("não tenho outro de pia.");
        System.out.println("Como há muitos Severinos,");
        System.out.println("que é santo de romaria,");
        System.out.println("deram então de me chamar");
        System.out.println("Severino de Maria;");
        System.out.println("como há muitos Severinos");
        System.out.println("com mães chamadas Maria,");
        System.out.println("fiquei sendo o da Maria");
        System.out.println("do finado Zacarias.");
       
        // printf: formata uma mensagem e então mostra-a na tela, é usada para combinar mais de uma informação e mostrar na tela
        System.out.printf("\nNeste poema, a palavra Severino aparece %d vezes, e outras %d vezes apareceu Maria.", 1, 3);
    }
}
