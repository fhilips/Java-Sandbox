package br.com.alura.jdbc.factory;
import java.beans.PropertyVetoException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import javax.sql.DataSource;

import com.mchange.v2.c3p0.ComboPooledDataSource;

public class ConnectionFactory {

//	public DataSource dataSource;
//
//	public ConnectionFactory() {
//		
//		ComboPooledDataSource comboPooledDataSource = new ComboPooledDataSource();
//			
//		comboPooledDataSource.setJdbcUrl("jdbc:mysql:3307//localhost/loja_virtual?useTimezone=true&serverTimezone=UTC");
//		comboPooledDataSource.setUser("root");
//		comboPooledDataSource.setPassword("root");
//
//		this.dataSource = comboPooledDataSource;
//	}

	public Connection recuperarConexao() {
		
		try {
			return DriverManager
			.getConnection("jdbc:mysql://localhost:3307/loja_virtual?useTimezone=true&serverTimezone=UTC", "root", "root");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			throw new RuntimeException(e);
		}
//
//		try {
//			return this.dataSource.getConnection();
//		} catch (SQLException e) {
//			throw new RuntimeException(e);
//		}
		
	}
}
