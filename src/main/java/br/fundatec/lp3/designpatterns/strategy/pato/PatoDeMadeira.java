package br.fundatec.lp3.designpatterns.strategy.pato;

import br.fundatec.lp3.designpatterns.strategy.comportamento.Mudo;
import br.fundatec.lp3.designpatterns.strategy.comportamento.NaoVoa;

public class PatoDeMadeira extends Pato {

	public PatoDeMadeira() {
		grasnado = new Mudo();
		voo = new NaoVoa();
	}

	@Override
	public String getNome() {
		return "Pato De Borracha";
	}

	@Override
	public void renderizar() {
		System.out.println("Sou um pato de borracha aparecendo na tela");
	}

}
