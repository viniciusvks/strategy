package br.fundatec.lp3.designpatterns.strategy.pato;

import br.fundatec.lp3.designpatterns.strategy.comportamento.Mudo;
import br.fundatec.lp3.designpatterns.strategy.comportamento.NaoVoa;

public class PatoDeBorracha extends Pato {

	public PatoDeBorracha() {
		grasnado = new Mudo();
		voo = new NaoVoa();
	}

	@Override
	public String getNome() {
		return "Pato De Madeira";
	}

	@Override
	public void renderizar() {
		System.out.println("Sou um pato de madeira aparecendo na tela");
	}

}
