package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {
public Connection conectar() {
	Connection con = null;
	 try{
		 Class.forName("com.mysql.jdbc.Driver");  //Descobrindo o driver
		 System.out.print("Driver conectado");
		  con  = DriverManager.getConnection("jdbc:mysql://localhost:3306/projeto1", "root", "bancodedados");    //conectando com o banco
		 System.out.print("conexão realizada");
		 
		 }catch (ClassNotFoundException erroClass){
		System.out.print("Class Drivernão foi localizado, erro = "+erroClass);
		 }catch (SQLException e){
		 System.out.println("Erro na copnexão ao banco de dados, erro = "+e);
		 }
	 return con;
}
}
