import java.util.Scanner;
public class U3A03E02_inverteOrdemParte2 {
    public static void main(String[] args){
        Scanner inp = new Scanner(System.in);

        String [] v = new String[10];

        int n = 0;

        while(n < 10){
            System.out.printf("Digite o %d número: ", n+1);
            v[n] = inp.next();
            n++;
            if(v[n].equals("")){
                break;
            }
        }
        System.out.print(v);
        int i = 0;
        String [] w = new String[10];

        while(i < 10){
            w[i] = v[n];
            n--;
            i++;
        }
        System.out.print(w);

        String [] u = new String[10];
        for(int n=0;n<10;n++){
            System.out.printf("Digite o %d número: ", n+1);
            u[n] = inp.next();
            if(v[u].equals("")){
                break;
            }
        }
        System.out.print(u);

        String [] s = new String[10];
        for(int i = 0;i<10;i++){
            s[i] = u[n];
            n--;
        }
        System.out.print(s);
    }
}