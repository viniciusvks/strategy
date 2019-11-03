package br.fundatec.lp3.designpatterns.strategy;

public class PatoMalhado extends Pato {

	@Override
	public void renderizar() {
		System.out.println("Sou um pato malhado aparecendo na tela");
	}

	@Override
	public String getNome() {
		return "Pato Malhado";
	}

}
