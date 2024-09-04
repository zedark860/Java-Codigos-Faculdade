package entities;

public class Conta {
	
	private double saldo;
	
	private int agencia, numero;
	
	private Cliente titular;
	
	private static int contasCriadas;
	
	public Conta(int agencia, int numero) {
		this.agencia = agencia;
		this.numero = numero;
		this.saldo = 100;
		Conta.contasCriadas++;
		System.out.println(
				"Criando conta com agência: " 
				+ this.agencia 
				+ " e número: " 
				+ this.numero
		);
		System.out.println("Contas criadas: " + Conta.contasCriadas);
	}
	
	public void deposita(double valor) {
		this.saldo += valor;
	}
	
	
	public boolean saca(double valor) {
		if (!(this.saldo >= valor)) { return false; }
		
		this.saldo -= valor;
		
		return true;
	}
	
	public boolean transfere(double valor, Conta destino) {
		if (!(this.saldo >= valor)) { return false; }
		
		this.saldo -= valor;
		destino.deposita(valor);
		
		return true;
	}

	public double getSaldo() { return saldo; }

	public int getAgencia() { return agencia; }

	public int getNumero() { return numero; }

	public void setNumero(int numero) { this.numero = numero; }

	public Cliente getTitular() { return titular; }

	public void setTitular(Cliente titular) { this.titular = titular; }

	public static int getContasCriadas() { return contasCriadas; }
	
}
