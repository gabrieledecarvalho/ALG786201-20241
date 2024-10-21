/*  U2A05E11 - Fazendo um diagnóstico cardíaco de emergência Versão 1
    Em um hospital para pacientes cardíacos, dados vitais dos pacientes da emergência foram coletados durante alguns anos.
    Essa grande coleção de informações sobre pacientes, e também sobre seus destinos após a internação, foi um dia analisada. 
    O objetivo foi identificar que informações vitais eram cruciais para identificar a gravidade do caso de cada paciente. 
    O resultado da análise mostrou que três informações eram críticas:
        Pressão sistólica
        Presença de sinus-taquicardia
        Idade
    A verificação dessas informações, e os respectivos valores críticos, foram resumidos abaixo:
    
        A pressão sistólica nas 24h iniciais esteve acima de 91?
            Se não -> Saída: G
            Se sim: A idade é maior que 62.5?
                Se não -> Saída: F
                Se sim: Há sinus taquicardia?
                    Se não -> Saída: F
                    Se sim -> Saída: G
    
    ... sendo G a classificação como caso grave.
    Escreva um programa que faça a verificação de gravidade de um paciente com base nesse diagrama. 
    Seu programa deve ler as três informações vitais nesta ordem:
        Idade
        Pressão sistólica
        Presença de sinus-taquicardia
    Para cada um dos sinais vitais, seu programa deve apresentar uma mensagem de texto para orientar 
    o usuário sobre o que deve ser digitado. Ao final, seu programa deve informar a gravidade do paciente, 
    mostrando uma destas duas mensagens na tela:
        URGENTE
        NORMAL
 */

//  Solução U2A05E11:
import java.util.Scanner;

public class U2A05E11_diagnosticoCardiacoEmergenciaV1 {
    public static void main (String[] args){
        
        //  criando inp, Scanner:
        Scanner inp = new Scanner(System.in);
        
        //  declarando variáveis
        //  ano: idade do paciente em anos; mes: idade sobrando em meses do paciente no ano; idade -> será calculada com os dados de ano e mes, pode ser um inteiro ou double
        int ano, mes, pressao_sistolica;
        double idade;
        String sinus_taquicardia;
        
        //  colhendo dados para  avaliar a gravidade depois:

        System.out.print("Digite a idade do paciente (ano e meses completos separados por espaço): ");
        ano = inp.nextInt();
        mes = inp.nextInt();

        //  calculando a idade em anos, com decimal
        idade = ano + mes/12;
        
        System.out.print("Digite a maior pressão sanguínea sistólica registrada nas últimas 24h: ");
        pressao_sistolica = inp.nextInt();
        
        System.out.print("Há presença de sinus taquicardia? [se sim, digite S, se não, digite n]: ");
        sinus_taquicardia = inp.next();
        
        //  se a pressão for menor que 91, já classifica como Urgente
        if (pressao_sistolica < 91){
            System.out.print("URGENTE");
        } else if (idade > 65.5){ //    se ela for maior ou igual a 91, é preciso analisar se o paciante tem mais que 65.5 anos
            if(sinus_taquicardia.equals("S")){ //   se for igual ou maior que 91 e o paciente tiver mais que 65.5 anos, o teste agora é para saber se há sinus taquicardia
                System.out.print("URGENTE"); // se sim, urgente
            } else{
                System.out.print("NORMAL"); //  se não, normal    
            }
        }
    }
}