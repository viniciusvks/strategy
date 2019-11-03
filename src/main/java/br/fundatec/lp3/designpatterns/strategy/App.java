package br.fundatec.lp3.designpatterns.strategy;

public class App {

    public static void main( String[] args ) {

        Pato patoMalhado = new PatoMalhado();
        executa(patoMalhado);

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
