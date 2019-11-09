package br.fundatec.lp3.designpatterns.strategy.pato;

import br.fundatec.lp3.designpatterns.strategy.comportamento.Squeak;
import br.fundatec.lp3.designpatterns.strategy.comportamento.VooComAsas;

public class PatoMalhado extends Pato {

	public PatoMalhado() {
		grasnado = new Squeak();
		voo = new VooComAsas();
	}

	@Override
	public void renderizar() {
		System.out.println("Sou um pato malhado aparecendo na tela");
	}

	@Override
	public String getNome() {
		return "Pato Malhado";
	}

}
