import java.util.Scanner;
public class U3A03E05_verificaComando {
    public static void main(String[] args){
        Scanner inp = new Scanner(System.in);

        String [] comandos = {"execute", "ajuda", "mostre", "liste", "remova", "copie", "renomeie", "filtre", "ordene", "bloqueie", "historico", "info", "sair", "limpe", "desligue"};
        String comando;
        do {
            System.out.printf("Comando: ");
            comando = inp.nextLine();

            for(int i=0; i<comando.length();i++){
                if(comando.equals(comandos[i])){
                    System.out.printf("%s executado\n",comando);
                }else{

                }
            }
        } while(!comando.equals("sair"));
    }
}