package br.fundatec.lp3.designpatterns.strategy.comportamento;

public class VooComAsas implements Voo {

	@Override
	public void executar() {
		System.out.println("Estou voando com asas!");
	}

}
