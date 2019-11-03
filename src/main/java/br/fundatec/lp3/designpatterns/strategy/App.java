package br.fundatec.lp3.designpatterns.strategy;

public class App {

    public static void main( String[] args ) {

        Pato patoDeBorracha = new PatoDeBorracha();
        executa(patoDeBorracha);
        System.out.println("\n");
        Pato patoDeMadeira = new PatoDeMadeira();
        executa(patoDeMadeira);

    }

	private static void executa(Pato pato) {

		System.out.print(pato.getNome() + ": ");
        pato.renderizar();
        System.out.print(pato.getNome() + ": ");
        pato.nadar();
        System.out.print(pato.getNome() + ": ");
        pato.grasnar();
        System.out.print(pato.getNome() + ": ");
        pato.voar();

	}

}
