//estas duas primeiras linhas class e public static void sempre tem que ter nos programas que iremos fazer
class A1escrevenatela{ //a palavra que segue class deve ser a mesma do nome do programa, no caso é Teste.java, logo, tem que ser Teste
    public static void main(String[] args) {
        System.out.printf("O meu nome é Severino,\nnão tenho outro de pia.\nComo há muitos Severinos,\nque é santo de romaria,\nderam então de me chamar\nSeverino de Maria;\ncomo há muitos Severinos\ncom mães chamadas Maria,\nfiquei sendo o da Maria\ndo finado Zacarias.\n");
    
        //println: mostra uma mensagem na tela, seguida de uma quebra de linha, sem o ln não quebra linha
        //System.out.println("O meu nome é Severino,");
        //System.out.println("não tenho outro de pia.");
        // System.out.println("Como há muitos Severinos,");
        // System.out.println("que é santo de romaria,");
        // System.out.println("deram então de me chamar");
        // System.out.println("Severino de Maria;");
        // System.out.println("como há muitos Severinos");
        // System.out.println("com mães chamadas Maria,");
        // System.out.println("fiquei sendo o da Maria");
        // System.out.println("do finado Zacarias.");
        //\n pula uma linha
        //printf: formata uma mensagem e então mostra-a na tela, é usada para combinar mais de uma informação e mostrar na tela
        
        System.out.printf("\nNeste poema, a palavra Severino aparece %d vezes, e outras %d vezes apareceu Maria.", 1, 3);
    }
}
