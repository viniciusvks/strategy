package br.fundatec.lp3.designpatterns.strategy;

public class PatoDeCabecaVermelha extends Pato {

	@Override
	public void renderizar() {
		System.out.println("Sou um pato de cabeca vermelha aparecendo na tela");
	}

	@Override
	public String getNome() {
		return "Pato De Cabeca Vermelha";
	}

}
