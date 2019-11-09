package br.fundatec.lp3.designpatterns.strategy.pato;

import br.fundatec.lp3.designpatterns.strategy.comportamento.Quack;
import br.fundatec.lp3.designpatterns.strategy.comportamento.VooComAsas;

public class PatoDeCabecaVermelha extends Pato {

	public PatoDeCabecaVermelha() {
		grasnado = new Quack();
		voo = new VooComAsas();
	}

	@Override
	public void renderizar() {
		System.out.println("Sou um pato de cabeca vermelha aparecendo na tela");
	}

	@Override
	public String getNome() {
		return "Pato De Cabeca Vermelha";
	}

}
