import java.util.Scanner;
public class U3A02E01_patinhos {
    public static void main(String[] args){
        Scanner inp = new Scanner(System.in);

        System.out.printf("Digite o número de patinhos que vão passear: \n");
        int total_patinhos = inp.nextInt();

        //while
        int n_patinhos = total_patinhos;
        while(n_patinhos!=1){
            System.out.printf("%d patinhos foram passear\nAlém das montanhas\nPara brincar\nAmamãe gritou: Quá, quá, quá, quá\nMas só %d patinhos voltaram de lá.\n",n_patinhos,n_patinhos - 1);

            n_patinhos--;

            if(n_patinhos==1){
                System.out.printf("%d patinho foi passear\nAlém das montanhas\nPara brincar\nAmamãe gritou: Quá, quá, quá, quá\nMas nenhum patinho voltou de lá.\n",n_patinhos);
                break;
            }
        }
        System.out.printf("A mamãe patinha foi procurar\nAlém das montanhhas\na beira do mar\nA mamãe gritou: Quá, quá, quá, quá\nE os %d patinhos voltaram de lá.\n",total_patinhos);
        //for
        for(int n_patinhos = total_patinhos; n_patinhos!=1; n_patinhos--){
            if(n_patinhos==1){
                System.out.printf("%d patinho foi passear\nAlém das montanhas\nPara brincar\nAmamãe gritou: Quá, quá, quá, quá\nMas nenhum patinho voltou de lá.\n",n_patinhos);
                break;
            }else{
                System.out.printf("%d patinhos foram passear\nAlém das montanhas\nPara brincar\nAmamãe gritou: Quá, quá, quá, quá\nMas só %d patinhos voltaram de lá.\n",n_patinhos,n_patinhos - 1);
            }
        }
        System.out.printf("A mamãe patinha foi procurar\nAlém das montanhhas\na beira do mar\nA mamãe gritou: Quá, quá, quá, quá\nE os %d patinhos voltaram de lá.\n",total_patinhos);

    }
}