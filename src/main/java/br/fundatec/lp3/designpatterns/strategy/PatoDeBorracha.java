package br.fundatec.lp3.designpatterns.strategy;

public class PatoDeBorracha extends Pato {

	@Override
	public String getNome() {
		return "Pato De Madeira";
	}

	@Override
	public void renderizar() {
		System.out.println("Sou um pato de madeira aparecendo na tela");
	}

	@Override
	public void grasnar() {
		//Nao faz nada
	}

	@Override
	public void voar() {
		//Nao faz nada
	}

}
