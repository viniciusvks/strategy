package br.fundatec.lp3.designpatterns.strategy.pato;

public class PatoDeBorracha extends Pato {

	@Override
	public String getNome() {
		return "Pato De Madeira";
	}

	@Override
	public void renderizar() {
		System.out.println("Sou um pato de madeira aparecendo na tela");
	}

}
