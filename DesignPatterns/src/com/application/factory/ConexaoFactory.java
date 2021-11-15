package com.application.factory;

import com.application.db.MySQLConnection;
import com.application.interfaces.Conexao;

public abstract class ConexaoFactory {
	
	private ConexaoFactory() {}

	public static Conexao getConexao(String tipo) {
		switch (tipo) {
		case "MYSQL" :
			return new MySQLConnection();
		default :
			throw new RuntimeException("No Data Base Avaliable");
		}
	}
}
