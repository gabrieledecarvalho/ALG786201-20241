/*  U2A09E08 - DESAFIO: verificar se um CPF é válido !
    Escreva um programa que verifica se um CPF é válido. Esse CPF é informado no primeiro argumento de linha de comando.
    Se o CPF for válido, seu programa deve apresentar esse CPF normalizado na tela. Um CPF normalizado tem este formato: XXX.XXX.XXX-XX (cada X é um dígito numérico). 
    Se o CPF for inválido, ele deve apresentar o seguinte:
        invalido
    Um CPF deve ter 11 dígitos numéricos, sendo os 2 últimos usados para verificação dos 9 primeiros dígitos. O número de CPF pode conter caracteres especiais 
    (ex: 529.982.247-25) ou ser puramente numérico (52998224725). A verificação dos dígitos deve ser feita assim:
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

    DICA 1: para resolver este exercício, você precisará converter string para número inteiro. Isso pode ser feito assim:
        int x = Integer.valueOf("123");
        Integer.valueOf é um conversor que transforma uma string numérica (que só contém dígitos) em um número inteiro.

    DICA 2: você pode garantir que, independente de como for digitado, o CPF tenha somente dígitos numéricos. 
    Isso é importante, pois o CPF pode ter pontuação, ou ser puramente numérico ...
*/

//  Solução U2A09E08:
import java.util.Scanner;

public class U2A09E08_desafioCPF {
    public static void main(String[] args){
        Scanner inp = new Scanner(System.in);
        
        System.out.printf("Digite seu cpf: ");
        String cpf = inp.nextLine();
        
        cpf = cpf.trim();// removendo os espaços 
        cpf = cpf.replace(".","");// removendo os pontos e subsitui por nada
        cpf = cpf.replace("-","");// removendo os traços e substitui por nada
        
        if(cpf.length() != 11){
            System.out.printf("invalido.\n");
            return; // return finaliza o programa
        }
        
        //  convertendo cada dígito de string para inteiro, usando artifícios da String
        int n1 = Integer.valueOf(cpf.substring(0,1));
        int n2 = Integer.valueOf(cpf.substring(1,2));
        int n3 = Integer.valueOf(cpf.substring(2,3));
        int n4 = Integer.valueOf(cpf.substring(3,4));
        int n5 = Integer.valueOf(cpf.substring(4,5));
        int n6 = Integer.valueOf(cpf.substring(5,6));
        int n7 = Integer.valueOf(cpf.substring(6,7));
        int n8 = Integer.valueOf(cpf.substring(7,8));
        int n9 = Integer.valueOf(cpf.substring(8,9));
        int n10 = Integer.valueOf(cpf.substring(9,10));
        int n11 = Integer.valueOf(cpf.substring(10,11));
        //pode ser feito dessa forma também
        //String n11 = cpf.substring(10,11);
        //int n11 = Integer.valueOf(n11);
        
        //  calculando os dígitos
        int resultado1 = n1*10 + n2*9 + n3*8 + n4*7 + n5*6 + n6*5 + n7*4 + n8*3 + n9*2;
        int resultado2 = (resultado1*10)%11;
        resultado2 %= 10; //divisão inteira por 10 para garantir que se for 10 é zero
        
        double resultado3 = n1*11 + n2*10 + n3*9 + n4*8 + n5*7 + n6*6 + n7*5 + n8*4 + n9*3+n10*2;
        double resultado4 = (resultado3*10)%11;
        resultado4 %=10;
        
        //  verificando se são iguais aos do cpf
        if (resultado2 == n10 && resultado4 == n11){
            // cpf = cpf.substring(0,3)+ "." + cpf.substring(3,6) + "." + cpf.substring(6,9) + "-" + cpf.substring(9);
            System.out.printf("O cpf %d%d%d.%d%d%d.%d%d%d-%d%d é válido.\n", n1,n2,n3,n4,n5,n6,n7,n8,n9,n10,n11); //    apresentando formatado
        }else{
            System.out.println("invalido.");
        }
    }
}