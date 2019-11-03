package br.fundatec.lp3.designpatterns.strategy;

public class PatoDeBorracha extends Pato {

	@Override
	public String getNome() {
		return "Pato De Borracha";
	}

	@Override
	public void renderizar() {
		System.out.println("Sou um pato de borracha aparecendo na tela");
	}

}
