package br.fundatec.lp3.designpatterns.strategy;

import br.fundatec.lp3.designpatterns.strategy.pato.Pato;
import br.fundatec.lp3.designpatterns.strategy.pato.PatoDeBorracha;
import br.fundatec.lp3.designpatterns.strategy.pato.PatoDeCabecaVermelha;
import br.fundatec.lp3.designpatterns.strategy.pato.PatoDeMadeira;
import br.fundatec.lp3.designpatterns.strategy.pato.PatoMalhado;

public class App {

    public static void main( String[] args ) {

        Pato patoDeBorracha = new PatoDeBorracha();
        executa(patoDeBorracha);
        System.out.println("\n");
        Pato patoDeMadeira = new PatoDeMadeira();
        executa(patoDeMadeira);
        System.out.println("\n");
        PatoMalhado patoMalhado = new PatoMalhado();
        executaPatoMalhado(patoMalhado);
        System.out.println("\n");
        PatoDeCabecaVermelha patoDeCabecaVermelha = new PatoDeCabecaVermelha();
        executaPatoDeCabecaVermelha(patoDeCabecaVermelha);

    }

	private static void executa(Pato pato) {

		System.out.print(pato.getNome() + ": ");
        pato.renderizar();
        System.out.print(pato.getNome() + ": ");
        pato.nadar();

	}

	private static void executaPatoMalhado(PatoMalhado pato) {

		System.out.print(pato.getNome() + ": ");
        pato.renderizar();
        System.out.print(pato.getNome() + ": ");
        pato.nadar();
        System.out.print(pato.getNome() + ": ");
        pato.grasnar();
        System.out.print(pato.getNome() + ": ");
        pato.voar();

	}

	private static void executaPatoDeCabecaVermelha(PatoDeCabecaVermelha pato) {

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
