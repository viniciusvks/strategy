package br.fundatec.lp3.designpatterns.strategy.pato;

import br.fundatec.lp3.designpatterns.strategy.comportamento.Grasnado;
import br.fundatec.lp3.designpatterns.strategy.comportamento.Voo;

public abstract class Pato {

	protected Grasnado grasnado;
	protected Voo voo;

	public abstract String getNome();

	public void nadar() {
		System.out.println("Estou nadando");
	}

	public void grasnar() {
		grasnado.executar();
	}

	public void voar() {
		voo.executar();
	}

	public abstract void renderizar();

}
