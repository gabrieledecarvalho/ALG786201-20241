/*  Identificando um setor de uma fazenda
    A área de uma grande fazenda possui um formato retangular, com lados de 5 km e 8 km. 
    A administração dividiu essa área em quatro setores também retangulares:
        Setor A: definido pelos cantos (0, 0) e (2, 3)
        Setor B: definido pelos cantos (0, 3) e (5, 6)
        Setor C: definido pelos cantos (2, 0) e (5, 3)
        Setor D: definido pelos cantos (0, 6) e (5, 8)
    As unidades de medida das coordenadas são dadas em km.
    Escreva um programa que informa qual setor contém um ponto dado por um par de coordenadas informado pelo usuário. 
    As coordenadas deve ser informada em metros.

    Seu programa deve mostrar uma mensagem para ler o ponto, e então ler as duas coordenadas, supondo serem separadas por espaço. 
    Em seguida, ele deve mostrar em que setor aquele ponto se localiza. Caso a coordenada não pertença à fazenda, 
    seu programa deve mostrar a mensagem "localizacao invalida" (sem acentuação). Veja um exemplo de uso do programa:
        Coordenadas do local: 1100 501
        Setor A
 */

 // Solução U2A06E04:
 //rever as fronteiras entre os espaços, pois coloquei tudo <= ou >=

import java.util.Scanner;

public class U2A06E04_setorFazenda {
    public static void main (String[] args){
        Scanner inp = new Scanner(System.in);
        
        //  coordenadas:
        int x, y;
        
        System.out.print("Digite as coordenadas (em metros) de x (horizontal) e y (vertical) separadas por um espaço: ");
        x = inp.nextInt();
        y = inp.nextInt();

        //  caso eu não queira incluir as fronteiras e decida que a precedência é A, B, C e D:
         if (x>=0 && x<=2 && y>= 0 && y<=3){
             System.out.print("Setor A");
         } else if (x>=0 && x<=5 && y>=3 && y<=6){
             System.out.print("Setor B");
         } else if (x>=2 && x<=5 && y>=0 && y<=3){
             System.out.print("Setor C");
         } else if (x>=0 && x<=5 && y>=6 && y<=8){
             System.out.print("Setor D");
         }
    /*
        //  considerando as fronteiras:
        if (x>=0 && x<2 && y>= 0 && y<3){ // inclui as retas da fronteira externa mas não a fronteira entre B e C
            System.out.print("Setor A");
        } else if (x>=0 && x<=5 && y>3 && y<6){ //inclui as retas da fronteira externa mas não as fronteiras entre A, C e D
            System.out.print("Setor B");
        } else if (x>2 && x<=5 && y>=0 && y<3){ //inclui as retas da fronteira externa mas não as fronteiras entre A e B
            System.out.print("Setor C");
        } else if (x>=0 && x<5 && y>6 && y<=8){ //inclui as retas da fronteira externa mas não a fronteira com o B
            System.out.print("Setor D");
        } else if (x==2 && y>0 && y<3){
            System.out.print("Fronteira entre A e C");
        } else if (x>=0 && x<2 && y==3){
            System.out.print("Fronteira entre A e B");
        } else if (x>2 && x<=5 && y==3){
            System.out.print("Fronteira entre C e B");
        } else if (x ==2 && y ==3){
            System.out.print("Fronteira entre A, B e C");
        } else if (x>=0 & x<= 5 && y ==6){
            System.out.print("Fronteira entre B e D");
        }
        else {
            System.out.print("localizacao invalida");
        }
    */
    }
}