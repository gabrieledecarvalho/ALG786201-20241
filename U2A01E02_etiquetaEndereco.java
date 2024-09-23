/* U2A01E02 - Um programa que apresenta uma etiqueta de endereço:
Elabore um programa que escreve:
Seu nome completo na primeira linha
Seu endereço na segunda
... e o CEP e telefone na terceira.
*/

// Solução A2:
class U2A01E02_etiquetaEndereco {
    public static void main (String[] args){
        // mostando a etiqueta de endereço com print e com \n para separar as linhas:
        System.out.print("Nome completo: Gabriele de Carvalho\nEndereço: Rua das Areias, Tapera, Florianópolis\nCEP: 88049-300   Telefone: (XX) XXXXX-XXXX\n");
        
        // Escrito do jeito anterior pode ficar complicado de ver o código, pode ser escrito assim:
        System.out.println("Nome completo: Gabriele de Carvalho");
        System.out.println("Endereço: Rua das Areias, Tapera, Florianópolis");
        System.out.println("CEP: 88049-300   Telefone: (XX) XXXXX-XXXX");
    }
}
