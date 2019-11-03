package br.fundatec.lp3.designpatterns.strategy.comportamento;

public class Quack implements Grasno {

	@Override
	public void executar() {
		System.out.println("Quack!");
	}

}
