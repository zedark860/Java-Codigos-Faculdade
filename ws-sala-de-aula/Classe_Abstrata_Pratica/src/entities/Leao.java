package entities;

//subclasse concreta
public class Leao extends Animal {
	
	public void tipoDeAnimal() {
		System.out.println("É um animal Selvagem.");
	}

	@Override
	public void emitirSom() {
		System.out.println("Rugir!");
	}
	
}
