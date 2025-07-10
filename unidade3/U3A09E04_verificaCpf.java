/*
Escreva um programa que verifica se um CPF é válido. Esse CPF é informado pelo teclado.

Se o CPF for válido, seu programa deve apresentar esse CPF normalizado na tela. Um CPF normalizado tem este formato: XXX.XXX.XXX-XX (cada X é um dígito numérico). Se o CPF for inválido, ele deve apresentar o seguinte:

invalido
Um CPF deve ter 11 dígitos numéricos, sendo os 2 últimos usados para verificação dos 9 primeiros dígitos. O número de CPF pode conter caracteres especiais (ex: 529.982.247-25) ou ser puramente numérico (52998224725). A verificação dos dígitos deve ser feita assim:

Multiplica-se cada um dos 9 primeiros dígitos pela sequência decrescente de números de 10 a 2, somando-se os resultados
Multiplica-se por 10 o resultado obtido no passo 1, e então obtém-se o restado da divisão por 11 O número obtido deve ser igual ao primeiro dígito verificador.
Multiplica-se cada um dos 9 primeiros dígitos, e também o primeiro dígito verificador, pela sequência decrescente de números de 11 a 2, somando-se os resultados.
Multiplica-se por 10 o resultado obtido no passo 3, e então obtém-se o restado da divisão por 11 O número obtido deve ser igual ao segundo dígito verificador.
Exemplo: suponha que o CPF seja 529.982.247-25:

Multiplicar pela sequência de 10 a 2: 5*10 + 2*9 + 9*8 + 9*7 + 8*6 + 2*5 + 2*4 + 4*3 + 7*2 = 295
Multiplicar por 10 e obter resto de divisão por 11: 2
Se o valor obtido for 10, então deve ser substituído por 0 (zero)
Multiplicar pela sequência de 11 a 2: 5*11 + 2*10 + 9*9 + 9*8 + 8*7 + 2*6 + 2*5 + 4*4 + 7*3 + 2*2 = 347
Multiplicar por 10 e obter resto de divisão por 11: 5
Se o valor obtido for 10, então deve ser substituído por 0 (zero)
Assim, o CPF 529.982.247-25 é válido !

IMPORTANTE: crie um método para calcular o dígito de verificação de CPF. O algoritmo contido nesse método deve ser capaz de gerar tanto o primeiro quanto o segundo dígito.

DICA 1: para resolver este exercício, você precisará acessar cada caractere de uma string, e convertê-lo para um número inteiro. Isso pode ser feito assim:

// Obtém o primeiro caractere da string "data"
char c = data.charAt(0);
// converte esse caractere para um número inteiro, e armazena-o na variável "digito"
int digito = Character.getNumericValue(c);
DICA 2: você pode garantir que, independente de como for digitado, o CPF tenha somente dígitos numéricos. Isso é importante, pois o CPF pode ter pontuação, ou ser puramente numérico ...
 */


// não testei nenhuma das opções
//----------------------------------------------------------------------
import java.util.Scanner;

public class U3A09E04_verificaCpf {

    // opção 1, método para retornar os dígitos em forma de vetor, meio feio:
    static int [] calcula_digito_cpf(int[] cpf){
        int digito1=0,digito2=0; //dígito 1 é a posição 9, dígito 2 é a posição 10
        int n=10;
        for(int i=0;i<cpf.length();i++){
            if(n>=2){
                digito1 += cpf[i]*n;
            }
            if(n>=1){
                digito2 += cpf[i]*(n+1);
                n--;
            }
        }
        int digito1 = (digito1*10)%11;
        resultado3 %=10;
        int digito2 = (digito2*10)%11;
        resultado4 %= 10;

        int [] digitos = (digito1,digito2);
        return digitos;
    }


    public static void main(String[] args){
        Scanner inp = new Scanner(System.in);
        System.out.printf("cpf: ");
        String cpfOriginal = inp.nextLine();
        String cpf = cpfOriginal.strip();
        cpf = cpf.replace(".","");
        cpf = cpf.replace("-","");
        //cpf = cpf.replace("[-.]",""); // expressões regulares [-.]

        int cpfTamanho = cpf.length();

        if(cpfTamanho > 11){
            System.out.printf("invalido\n");
        }

        int [] cpfDigitos = new int[11];

        // laço para transformar o cpf String em um vetor de dígitos numéricos, cada caracter é um dígito:
        for (int i=0;i<cpfTamanho;i++){
            char c = cpf.charAt(i);
            cpfDigitos[i] = Character.getNumericValue(c);
        }

        // verificar se é correto o uso do método:
        if(calcula_digito(cpfDigitos)[1]==cpfDigitos[9] & calcula_digito(cpfDigitos)[1]==cpfDigitos[10]){
            for(int j=0;j<cpfTamanho;j++){
                System.out.printf("%d",cpfDigitos[j]);
                // lembrar que na comparação é dois iguais !!!!
                if(j==2 | j==5){
                    System.out.print(".");
                }if(j==8){ // posição 8
                    System.out.print("-");
                }
            }
        }else{
            System.out.printf("inválido\n");
        }
    }
}
// [0] [1] [2] . [3] [4] [5] . [6] [7] [8] - [9] [10]

// lembrar para o método: String.format("%02d %02d:%02d:%02d\n",horario[0],horario[1],horario[2],horario[3]);


//------------------------------------------------------------------
import java.util.Scanner;

public class Teste{

    // opção dois, método para verificar se o cpf é válido, só quebrar o código em 2:
    static boolean cpf_valido(int [] cpf){

        int digito1=0,digito2=0; //dígito 1 é a posição 9, dígito 2 é a posição 10
        int n=10;
        for(int i=0;i<cpf.length();i++){
            if(n>=2){
                digito1 += cpf[i]*n;
            }
            if(n>=1){
                digito2 += cpf[i]*(n+1);
                n--;
            }
        }
        int digito1 = (digito1*10)%11;
        resultado3 %=10;
        int digito2 = (digito2*10)%11;
        resultado4 %= 10;

        if(digito1==cpfDigitos[9] & digito2==cpfDigitos[10]){
            return true;
        }else{
            return false;
        }

        public static void main(String[] args){
            Scanner inp = new Scanner(System.in);
            System.out.printf("cpf: ");
            String cpfOriginal = inp.nextLine();
            String cpf = cpf.strip();
            cpf = cpf.replace(".","");
            cpf = cpf.replace("-","");
            //cpf = cpf.replace("[-.]",""); // expressões regulares [-.]
            int cpfTamanho = cpf.length();
            boolean validade;

            if(cpfTamanho > 11){
                System.out.println("inválido");
            }

            int [] cpfDigitos = new int[11];
            for (int i=0;i<cpfTamanho;i++){
                char c = cpf.charAt(i);
                cpfDigitos[i] = Character.getNumericValue(c);
            }

            if(cpf_valido(cpfDigitos)){
                System.out.print("O CPF ");
                for(int j=0;j<cpfTamanho;j++){
                    System.out.printf("%d",cpfDigitos[j]);
                    if(j==2 | j==5){
                        System.out.print(".");
                    }if(j==8){
                        System.out.print("-");
                    }
                }
                System.out.println(" é válido.");
            }else{
                System.out.println("inválido");
            }

        }
    }