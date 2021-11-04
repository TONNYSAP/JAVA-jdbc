package db;

import java.sql.Connection;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
//import java.util.ArrayList;
//import java.util.List;

import classes.profissao;
import connectionManipulation.Conexao;

public class ConnectionDB {

	public static void save(profissao profissao) {
		String sql = "INSERT INTO `cadastro`.`profissao` (`CT`, `profissao`, `CPF`, `RG`) VALUES ('"+ profissao.getCt() +"', '" + profissao.getProfissao() + "', '" + profissao.getCpf() + "', '" + profissao.getRg() + "');";
		Connection conexao = Conexao.getConect();
		try {
			Statement stmt = conexao.createStatement();			
			stmt.executeUpdate(sql);
			Conexao.close(conexao, stmt);
			System.out.println(stmt);
			System.out.println("Registro inserido com sucesso.");
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void delete(profissao profissao) {
		if(profissao == null || profissao.getId() == null) {
			System.out.println("Não foi possivel excluir o registro.");
			return;
		}
		String sql = "DELETE FROM `cadastro`.`profissao` WHERE (`id` = '" + profissao.getId() + "');";
		Connection conexao = Conexao.getConect();
		try {
			Statement stmt = conexao.createStatement();			
			stmt.executeUpdate(sql);
			Conexao.close(conexao, stmt);
			System.out.println("Registro excluido com sucesso.");
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void update(profissao profissao) {
		if(profissao == null || profissao.getId() == null) {
			System.out.println("Não foi possivel atualizar o registro.");
			return;
		}
		String sql = "UPDATE `cadastro`.`profissao` SET `CT` = '"+ profissao.getCt() +"', `profissao` = '"+ profissao.getProfissao() +"', `CPF` = '"+ profissao.getCpf() +"', `RG` = '"+ profissao.getRg() +"' WHERE (`id` = '"+ profissao.getId() +"');";
		Connection conexao = Conexao.getConect();
		try {
			Statement stmt = conexao.createStatement();			
			stmt.executeUpdate(sql);
			Conexao.close(conexao, stmt);
			System.out.println("Registro atualizado com sucesso.");
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void selectAll() {
		String sql = "SELECT * FROM cadastro.profissao;";
		Connection conexao = Conexao.getConect();
		//List<profissao> profissaoList = new ArrayList<>();
		try {
			Statement stmt = conexao.createStatement();			
			ResultSet rs = stmt.executeQuery(sql);
			while(rs.next()) {
				System.out.println("Id: " + rs.getInt("id"));
				System.out.println("CT: " + rs.getString("CT"));
				System.out.println("Profissao: " + rs.getString("profissao"));
				System.out.println("CPF: " + rs.getString("CPF"));
				System.out.println("RG: " + rs.getString("RG"));
				System.out.println("*****************************");
			}
						
			Conexao.close(conexao, stmt, rs);
						
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
