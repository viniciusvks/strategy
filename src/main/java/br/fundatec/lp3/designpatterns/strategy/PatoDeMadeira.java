package br.fundatec.lp3.designpatterns.strategy;

public class PatoDeMadeira extends Pato {

	@Override
	public String getNome() {
		return "Pato De Borracha";
	}

	@Override
	public void renderizar() {
		System.out.println("Sou um pato de borracha aparecendo na tela");
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
