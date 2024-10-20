/*  U2A05E12 - Ordenando três números
    Escreva um programa que lê três números do teclado, e os apresenta ordenados na tela.
    Seu programa deve mostrar alguma mensagem pedindo os três números, 
    os quais devem ser digitados na mesma linha, separados por espaços. 
    Em seguida, seu programa deve ler os três números, ordená-los, e, por fim, mostrá-los na tela. 
    Ao apresentá-los, os três números devem estar numa mesma linha, separados por espaço, sem qualquer outro texto.
 */

//  Solução U2A05E12:
import java.util.Scanner;

public class U2A05E12_ordena3Numeros {
    public static void main (String[] args){
        Scanner inp = new Scanner(System.in);
        
        int n1, n2, n3, nmax, nmed, nmin;
        
        System.out.print("Digite 3 (três) números separados por espaço para saber qual é o maior: ");
        n1 = inp.nextInt();
        n2 = inp.nextInt();
        n3 = inp.nextInt();
        
        //  verificando se n1 é o maior de todos:
        //  se n1 for maior que n2
        if (n1>n2) {
            //  e se n1 for maior que n3
            if (n1>n3) { 
                //  o nmax é o n1 [se n1>n2 E n1>n3]
                nmax = n1;
                
                //  verificando quem é o segundo maior e o menor de todos
                //  aqui, n2 e n3 SÃO menores que n1
                //  se n2>n3
                if (n2>n3) {
                    nmed = n2;
                    nmin = n3;
                } else { //   se o n2 não for maior que n3
                    nmed = n3;
                    nmin = n2;
                }
                
            }
        //  caso n1 não for o maior de todos, n3 ou n2 devem ser
        //  verificando se n3 é o maior de todos:
        //  se n3 for maior que n2
        }else if(n3>n2){
            //  e se n3 for maior que n1
            if(n3>n1){
                //  o nmax é n3 [se n3>n2 E n3>n1]
                nmax = n3;
                
                //  verificando quem é o segundo maior e o menor de todos para o caso de n3 maior que todos
                //  se n2 é maior que n1
                if(n2>n1){
                    nmed = n2;
                    nmin = n1;
                }else{ //   se o n2 não for maior que n1
                    nmed = n1;
                    nmin = n2;
                }
                
            }
        //  caso n1, nem n3 forem o maior de todos, ou seja, n2 tem que ser o maior (mesmo que ele seja igual)
        //  aqui não precisa de verificação, já que há somente 3 números e os outros dois não são o maior
        }else{
            nmax = n2;
            
            //  verificando quem é o segundo maior e o menor de todos para o caso de n2 maior que todos
            //  se n1 é maior que n3
            if(n1>n3){
                nmed = n1;
                nmin = n3;
            }else{ //   se n1 não é maior que n3
                nmed = n3;
                nmin = n1;
            }
        }
        
        //  mostrando na tela, em ordem, o n máximo, o n médio e o n mínimo entre os três números digitados
        System.out.printf("%d %d %d", nmax,nmed,nmin);
    }
}

//  OBS: caso eu queira somente o máximo de 3 números: 
//  max = math.Max(n1,n2);
//  max = math.Max(max,n3);
