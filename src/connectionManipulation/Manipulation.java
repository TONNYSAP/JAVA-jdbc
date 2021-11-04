package connectionManipulation;

//import java.sql.Connection;

import classes.profissao;
import db.ConnectionDB;


public class Manipulation {

	public static void main(String[] args) {
		
		inserir();
		//deletar();
		//atualizar();
		//selecionarTudo();

	}

	public static void inserir() {
		profissao profissao = new profissao(123456789, "padre", 01234567, 8967645);
		ConnectionDB.save(profissao);
	}
	
	public static void deletar() {
		profissao profissao = new profissao();
		profissao.setId(7);
		ConnectionDB.delete(profissao);
	}
	
	public static void atualizar() {
		profissao profissao = new profissao(4, 33355222, "engenheiro pesca", 777888011,	789564888);
		ConnectionDB.update(profissao);
	}
	
	public static void selecionarTudo() {
		ConnectionDB.selectAll();
	}
}
