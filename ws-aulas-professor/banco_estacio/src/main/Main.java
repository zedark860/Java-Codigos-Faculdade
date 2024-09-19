package main;

import entities.ControleBonificacao;
import entities.Designer;
import entities.EditorVideo;
import entities.Funcionario;
import entities.Gerente;

public class Main {

	public static void main(String[] args) {
		Gerente g1 = new Gerente();
		ControleBonificacao c = new ControleBonificacao();
		
		g1.setNome("Anderson");
		g1.setSalario(3800.00);
		g1.getBonificacao();
		c.registra(g1);
		
		Gerente g2 = new Gerente();
		g2.setNome("Anderson");
		g2.setSalario(4180.00);
		g2.getBonificacao();
		c.registra(g2);
		
		EditorVideo editor = new EditorVideo();
		editor.setSalario(1500.00);
		c.registra(editor);
		
		Designer des = new Designer();
		des.setSalario(2000.00);
		c.registra(des);
		
		System.out.println(g1);
		System.out.println(g1.getNome());
		
	}

}
