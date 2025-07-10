/*
A fatoração de um número é uma operação em que se listam os números
primos que o dividem. Por exemplo, a fatoração de 30 é 2, 3 e 5, e a
fatoração de 20 é 2, 2, e 5.

Escreva um programa que obtém um número inteiro digitado pelo
usuário, e o fatore, mostrando ao final os fatores primos que o dividem.
 Note que a multiplicidade de cada fator deve ser respeitada .. se um
certo fator divide o número duas vezes, ele deve ser mostrado também
duas vezes.

Aproveite a solução que você escreveu no exercício sobre [mostrar números primos](https://moodle.ifsc.edu.br/mod/vpl/view.php?id=156670) ... isso deve ajudar bastante para resolver este exercício.
 */

import java.util.Scanner;
class U3A09E02_fatoraNumero {

    static boolean verifica_primo(int x) {
        if (x == 2) {
            return true;
        } else if (x % 2 == 0) {
            return false;
        } else {
            var lim = Math.sqrt(x);
            for (int i = 3; i <= lim; i += 2) {
                if (x % i == 0) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.printf("Digite um número inteiro: ");
        int numero = inp.nextInt();

        int i=2;
        while(i<numero){
            if (verifica_primo(i)){
                if(numero%i==0){
                    System.out.printf("%d, ",i);
                }else{
                    i++;
                }
            }else{
                i++;
            }
        }
    }
}