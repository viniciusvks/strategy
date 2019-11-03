package br.fundatec.lp3.designpatterns.strategy;

public abstract class Pato {

	public void grasnar() {
		System.out.println("Quack!");
	}

	public void nadar() {
		System.out.println("Estou nadando");
	}

	public abstract void renderizar();

}
