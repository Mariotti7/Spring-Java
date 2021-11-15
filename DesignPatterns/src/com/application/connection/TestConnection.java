package com.application.connection;

import java.sql.SQLException;

import com.application.factory.ConexaoFactory;
import com.application.interfaces.Conexao;

public class TestConnection {

	public static void main(String[] args) throws SQLException {
		
		Conexao conexao = ConexaoFactory.getConexao("MySQL");
		
		conexao.getConnection().prepareStatement("Select table to beggin");

	}

}
