package br.fundatec.lp3.designpatterns.strategy.pato;

import br.fundatec.lp3.designpatterns.strategy.comportamento.Grasno;
import br.fundatec.lp3.designpatterns.strategy.comportamento.Voo;

public abstract class Pato {

	protected Grasno grasno;
	protected Voo voo;

	public abstract String getNome();

	public void nadar() {
		System.out.println("Estou nadando");
	}

	public void grasnar() {
		grasno.executar();
	}

	public void voar() {
		voo.executar();
	}

	public abstract void renderizar();

}
