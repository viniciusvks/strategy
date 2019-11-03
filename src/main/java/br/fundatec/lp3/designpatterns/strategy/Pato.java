package br.fundatec.lp3.designpatterns.strategy;

public abstract class Pato {

	public abstract String getNome();

	public void grasnar() {
		System.out.println("Quack!");
	}

	public void nadar() {
		System.out.println("Estou nadando");
	}

	public void voar() {
		System.out.println("Estou voando");
	}

	public abstract void renderizar();

}
