package entities;

public class Gerente extends Funcionario {
	
	private int senha;
	
	public boolean autentica(int senha) {
		if (this.senha != senha) { return false; }
		
		return true;
	}
	
	@Override
	public double getBonificacao() {
		return super.getBonificacao() * super.getBonificacao();
	}
	
}
