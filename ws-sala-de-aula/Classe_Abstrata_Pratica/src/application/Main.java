package application;

import entities.Animal;
import entities.Cachorro;
import entities.Gato;
import entities.Leao;

public class Main {

	public static void main(String[] args) {
		Animal cachorro = new Cachorro();
		Animal gato = new Gato();
		Leao leao = new Leao();
		// cachorro
		cachorro.emitirSom();
		cachorro.dormir();
		// gato
		gato.emitirSom();
		gato.dormir();
		// leao
		leao.emitirSom();
		leao.tipoDeAnimal();
		leao.dormir();
	}

}
