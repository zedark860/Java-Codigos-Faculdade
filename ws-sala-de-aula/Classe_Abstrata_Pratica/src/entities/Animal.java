package entities;

// Classe Abstrata
public abstract class Animal {
	// método abstrato
	
	public abstract void emitirSom();
	
    // metodo concreto
    public void dormir() {
        System.out.println("Zzzz...");
    }
}
