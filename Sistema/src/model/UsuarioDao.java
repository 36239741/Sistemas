package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;



public class UsuarioDao {

	
	public boolean Insere(Usuario s) {
		Conexao c = new Conexao();
		Connection con = c.conectar();
		boolean o = false;
		String sql = "INSERT INTO cadastro(tipo,nome,email,login,senha) values(1,?,?,?,?)";
		try {
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1,s.getNome());
			ps.setString(2,s.getEmail());
			ps.setString(3,s.getLogin());
			ps.setString(4,s.getSenha());
			ps.execute();
			return true;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
		
	}
}
