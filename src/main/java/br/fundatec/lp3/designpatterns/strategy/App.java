package br.fundatec.lp3.designpatterns.strategy;

public class App {
    public static void main( String[] args ) {

        Pato patoMalhado = new PatoMalhado();
        System.out.print("Pato Malhado: ");
        patoMalhado.renderizar();
        System.out.print("Pato Malhado: ");
        patoMalhado.nadar();
        System.out.print("Pato Malhado: ");
        patoMalhado.grasnar();

    }
}
