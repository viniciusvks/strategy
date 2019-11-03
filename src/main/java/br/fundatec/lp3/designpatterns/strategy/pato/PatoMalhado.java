package br.fundatec.lp3.designpatterns.strategy.pato;

import br.fundatec.lp3.designpatterns.strategy.comportamento.Grasnador;
import br.fundatec.lp3.designpatterns.strategy.comportamento.Voador;

public class PatoMalhado extends Pato implements Grasnador, Voador {

	@Override
	public void renderizar() {
		System.out.println("Sou um pato malhado aparecendo na tela");
	}

	@Override
	public String getNome() {
		return "Pato Malhado";
	}

	@Override
	public void voar() {
		System.out.println("Estou voando");
	}

	@Override
	public void grasnar() {
		System.out.println("Quack!");
	}

}