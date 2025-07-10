import java.util.Scanner;

public class U3A03E08_previsorTempo {
    public static void main(String[] args){
        Scanner inp = new Scanner(System.in);

        String [][] previsor = {//barometro - linha, //termometro - coluna
                {"Tempo bom, ventos quentes e secos","Tempo bom, ventos de leste frescos", "Tempo bom, ventos de sul a sudeste"}, //linha 0 - subindo
                {"Tempo mudando para bom, ventos de leste","Tempo incerto, ventos variáveis", "Chuva provável, ventos de sul a sudeste"}, //linha 1 - estacionario
                {"Tempo instável, aproximação de frente","Frente quente com chuvas prováveis","Chuvas abundantes e ventos de sul a sudoeste fortes"} //linha 2 - baixando
        };

        System.out.printf("Digite 0 para subindo, 1 para estacionatio, 2 para baixando.\n");
        System.out.printf("Barometro: ");
        int barometro = inp.nextInt();
        System.out.print("Termometro: ");
        int termometro = inp.nextInt();

        if(barometro < 0 || barometro > 2 || termometro < 0 || termometro > 2){
            System.out.print("Dados digitados invalidos.");
            return;
        }
        System.out.print(previsor[barometro][termometro]);

    }
}
