package entities;

public class Designer extends Funcionario {
	
	@Override
	public double getBonificacao() {
		System.out.println("Controle de bonificacao do Designer");
		return 200.00;
	}
}
