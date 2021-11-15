package com.application.db;

import java.sql.Connection;
import java.sql.SQLException;

import com.application.interfaces.Conexao;

public class MySQLConnection implements Conexao{

	@Override
	public Connection getConnection() throws SQLException {
		MysqlDataSource source = new MysqlDataSource();
		source.setUrl("jdbc:mysql://localhost/viasoft");
		source.serUser("root");
		source.setPassword("");
		return source.getConnection;
	}
	
	

}
