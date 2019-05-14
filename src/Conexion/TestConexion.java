package Conexion;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.*;
import java.util.Properties;


import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class TestConexion {

	private String bd;
	private String url= "";
	private String usr = "";
	private String pwd = "";
	private static Connection conexion;
	

	public TestConexion()  {
		Properties propiedades = new Properties();
		InputStream entrada = null;
		try {
			File miFichero=new File("src/Conexion/configCasa.ini");
			if(miFichero.exists()) {
				entrada=new FileInputStream(miFichero);
				propiedades.load(entrada);
				url=propiedades.getProperty("url");
				usr=propiedades.getProperty("usr");
				pwd=propiedades.getProperty("pwd");
				}
			else {
				System.err.println("Fichero no encontrado");
				}
			}
			
			catch(IOException ex) {
				ex.printStackTrace();
			}finally {
				if(entrada != null) {
					try {
						entrada.close();
					}
					catch (IOException e) {
						e.printStackTrace();
					}
				}
			}
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conexion = DriverManager.getConnection(url, usr, pwd);
			
			if(!conexion.isClosed()) {
				System.out.println("Conexión establecida");
				//conexion.close();
			}
			else
				System.out.println("Fallo en Conexión");	
			

		}catch (Exception e) {
			System.out.println("ERROR en conexión con ORACLE");	
			e.printStackTrace();
		}
		
	}
	
	public ObservableList<Usuarios> Numero1() {
		ObservableList<Usuarios> data=FXCollections.observableArrayList();
		
		try {
			Statement stmt = conexion.createStatement();
			ResultSet rset = stmt.executeQuery("SELECT * FROM "+usr+".USUARIOS" );
			while(rset.next()) {
				Usuarios arm1 = new Usuarios(rset.getInt(1), rset.getString(2), rset.getString(3), rset.getString(4));
				data.add(arm1);
				
	
			}
			rset.close();
			stmt.close();
			
		}catch (SQLException s){
			s.printStackTrace();
		}
		
		return data;
	}

	
	

}
