package entities;

public class Gerente extends Funcionario {
	
	private int senha;
	
	@Override
	public double getBonificacao() {
		return super.getSalario() * 0.1;
	}
	
	@Override
	public void setSenha(int senha) {
		this.senha = senha;
	}
	
	@Override
	public boolean 
}
