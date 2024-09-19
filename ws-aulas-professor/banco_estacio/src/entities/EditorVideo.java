package entities;

public class EditorVideo extends Funcionario {
	
	@Override
	public double getBonificacao() {
		System.out.println("Controle de bonificacao do Editor de Video");
		return 150.00;
	}
}
	

