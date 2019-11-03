package br.fundatec.lp3.designpatterns.strategy.pato;

public class PatoDeMadeira extends Pato {

	@Override
	public String getNome() {
		return "Pato De Borracha";
	}

	@Override
	public void renderizar() {
		System.out.println("Sou um pato de borracha aparecendo na tela");
	}

}
