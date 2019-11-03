package br.fundatec.lp3.designpatterns.strategy.pato;

public abstract class Pato {

	public abstract String getNome();

	public void nadar() {
		System.out.println("Estou nadando");
	}

	public abstract void renderizar();

}
