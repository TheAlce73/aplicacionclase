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
	

	//Usuario
	//
	//
	//
	//
	//Mostrar
	
	public ObservableList<Usuarios> MostrarUsuario() {
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
	
	//
	//
	//
	//
	//
	//Añadir
	
	public void AñadirUsuarios(int cod_Usuario, String nombreUser, String contraseña, String admin) {
		try {
			Statement stmt = conexion.createStatement();
			stmt.executeQuery("INSERT INTO "+usr+".USUARIOS VALUES ("+cod_Usuario+",'"+nombreUser+"','"+contraseña+"','"+admin+"')");
		}catch(SQLException s) {
			System.out.println("HOla2");
			s.printStackTrace();
		}
	}
	
	//
	//
	//
	//
	//
	//Modificar
	
	public void ModificarUsuarios(int codigo,int cod_Usuario, String nombreUser, String contraseña, String admin) {
		try {
			Statement stmt = conexion.createStatement();
			stmt.executeQuery("UPDATE "+usr+".USUARIOS SET COD_USUARIO="+cod_Usuario+",NOMBREUSER='"+nombreUser+"',CONTRASEÑA='"+contraseña+"',ADMIN='"+admin+"' WHERE COD_USUARIO='"+codigo+"'");
		}catch(SQLException s) {
			System.out.println("HOla2");
			s.printStackTrace();
		}
	}
	

	//Tutores
	//
	//
	//
	//Mostrar
	
	public ObservableList<Tutores> MostrarTutores() {
		ObservableList<Tutores> data=FXCollections.observableArrayList();
		
		try {
		
			Statement stmt = conexion.createStatement();
			ResultSet rset = stmt.executeQuery("SELECT * FROM "+usr+".TUTORCICLO" );
			while(rset.next()) {
				Tutores arm1 = new Tutores(rset.getInt(1), rset.getString(2), rset.getString(3), rset.getString(4), rset.getString(5), rset.getInt(6), rset.getInt(7));
				data.add(arm1);
				
	
			}
			rset.close();
			stmt.close();
			
		}catch (SQLException s){
			s.printStackTrace();
		}
		
		return data;
	}
	
	//
	//
	//
	//
	//Añadir
	
	public void AñadirTutores(int cod_Tutor, String nombreTutor, String ApellidoTutor, String DNI , String email ,int numero,int cod_centro) {
		try {
			Statement stmt = conexion.createStatement();
			stmt.executeQuery("INSERT INTO "+usr+".TUTORCICLO VALUES ("+cod_Tutor+",'"+nombreTutor+"','"+ApellidoTutor+"','"+DNI+"','"+email+"',"+numero+","+cod_centro+")");
			
		}catch(SQLException s) {
			System.out.println("HOla2");
			s.printStackTrace();
		}
	}
	
	public ObservableList<String> SacarCentros() {
		ObservableList<String> centros=FXCollections.observableArrayList();
		
		try {
			Statement stmt = conexion.createStatement();
			ResultSet rset = stmt.executeQuery("SELECT NOMBRECE FROM "+usr+".CENTRO" );
			while(rset.next()) {
				String nombre=rset.getString(1);
				centros.add(nombre);
				
	
			}

			rset.close();
			stmt.close();
			
		}catch (SQLException s){
			s.printStackTrace();
		}
		
		return centros;
	}
	
	public int SacarCodigoCentro(String nombre){
		
		try {

		Statement stmt=conexion.createStatement();
		ResultSet rset=stmt.executeQuery("SELECT COD_CENTRO FROM "+usr+".CENTRO WHERE NOMBRECE='"+nombre+"'");
		int numero=0;
		while(rset.next()) {
		numero=rset.getInt(1);
		}
		return numero;
		
		}catch(SQLException s) {
			System.out.println("Fallo");
			s.printStackTrace();
			return 0;
		}
	}
	
	public String SacarNombreCentro(int numero){
		
		try {

		Statement stmt=conexion.createStatement();
		ResultSet rset=stmt.executeQuery("SELECT NOMBRECE FROM "+usr+".CENTRO WHERE COD_CENTRO='"+numero+"'");
		String colegio="";
		while(rset.next()) {
		colegio=rset.getString(1);
		}
		return colegio;
		
		}catch(SQLException s) {
			System.out.println("Fallo");
			s.printStackTrace();
			return "";
		}
	}
	
	public void ModificarTutores(int codigo,int cod_Tutor, String nombreTutor, String ApellidoTutor, String DNI , String email ,int numero,int cod_centro) {
		try {
			
			Statement stmt = conexion.createStatement();
			stmt.executeQuery("UPDATE "+usr+".TUTORCICLO SET COD_TUTORCICLO="+cod_Tutor+",NOMBRETC='"+nombreTutor+"',APELLIDOSTC='"+ApellidoTutor+"',DNI='"+DNI+"',EMAIL='"+email+"',TELEFONOTC="+numero+",COD_CENTRO="+cod_centro+" WHERE COD_TUTORCICLO='"+codigo+"'");
		}catch(SQLException s) {
			System.out.println("HOla2");
			s.printStackTrace();
		}
	}
	
	public ObservableList<Centros> MostrarCentros() {
		ObservableList<Centros> data=FXCollections.observableArrayList();
		
		try {
		
			Statement stmt = conexion.createStatement();
			ResultSet rset = stmt.executeQuery("SELECT * FROM "+usr+".CENTRO" );
			while(rset.next()) {
				Centros arm1 = new Centros(rset.getInt(1), rset.getString(2), rset.getString(3), rset.getString(4), rset.getInt(5), rset.getString(6), rset.getString(7), rset.getString(8), rset.getInt(9), rset.getInt(10), rset.getString(11));
				data.add(arm1);
				
	
			}
			rset.close();
			stmt.close();
			
		}catch (SQLException s){
			s.printStackTrace();
		}
		
		return data;
	}
	
	public void AñadirCentro(Integer cod_centro, String nombreCentro, String directorCentro, String nifDirector,Integer telefonoCentro, String ciudad, String provincia, String direcion, Integer cP, Integer fAX,String dAT) {
		try {
			Statement stmt = conexion.createStatement();
			stmt.executeQuery("INSERT INTO "+usr+".CENTRO VALUES ("+cod_centro+",'"+nombreCentro+"','"+directorCentro+"','"+nifDirector+"',"+telefonoCentro+",'"+ciudad+"','"+provincia+"','"+direcion+"',"+cP+","+fAX+",'"+dAT+"')");
			
		}catch(SQLException s) {
			System.out.println("HOla2");
			s.printStackTrace();
		}
	}
	
	public void ModificarCentro(Integer cod_centro, String nombreCentro, String directorCentro, String nifDirector,Integer telefonoCentro, String ciudad, String provincia, String direcion, Integer cP, Integer fAX,String dAT) {
		try {
			
			Statement stmt = conexion.createStatement();
			stmt.executeQuery("UPDATE "+usr+".CENTRO SET COD_CENTRO="+cod_centro+",NOMBRECE='"+nombreCentro+"',DIRECTORCENTRO='"+directorCentro+"',NIF_DIRECTOR='"+nifDirector+"',TELEFONOC="+telefonoCentro+",CIUDAD='"+ciudad+"',PROVINCIA='"+provincia+"',DIRECCION='"+direcion+"',CP="+cP+",FAX="+fAX+",DAT='"+dAT+"' WHERE COD_CENTRO="+cod_centro);
		}catch(SQLException s) {
			System.out.println("HOla2");
			s.printStackTrace();
		}
	}
	
	//FP
	
	public ObservableList<FamiliaProfesional> MostrarFP() {
		ObservableList<FamiliaProfesional> data=FXCollections.observableArrayList();
		
		try {
		
			Statement stmt = conexion.createStatement();
			ResultSet rset = stmt.executeQuery("SELECT * FROM "+usr+".FAMILIAPROFESIONAL" );
			while(rset.next()) {
				FamiliaProfesional arm1 = new FamiliaProfesional(rset.getInt(1), rset.getString(2));
				data.add(arm1);
				
	
			}
			rset.close();
			stmt.close();
			
		}catch (SQLException s){
			s.printStackTrace();
		}
		
		return data;
	}
	
	public void AñadirFP(Integer Clave, String nombre) {
		try {
			Statement stmt = conexion.createStatement();
			stmt.executeQuery("INSERT INTO "+usr+".FAMILIAPROFESIONAL VALUES ("+Clave+",'"+nombre+"')");
			
		}catch(SQLException s) {
			System.out.println("HOla2");
			s.printStackTrace();
		}
	}
	
	public void ModificarFP(Integer Clave, String nombre) {
		try {
			Statement stmt = conexion.createStatement();
			stmt.executeQuery("UPDATE "+usr+".FAMILIAPROFESIONAL SET CLAVEFP="+Clave+",NOMBREFP='"+nombre+"' WHERE CLAVEFP="+Clave);
			
		}catch(SQLException s) {
			System.out.println("HOla2");
			s.printStackTrace();
		}
	}
	
	//Ciclo
	
	public ObservableList<Ciclo> MostrarCiclo() {
		ObservableList<Ciclo> data=FXCollections.observableArrayList();
		
		try {
		
			Statement stmt = conexion.createStatement();
			ResultSet rset = stmt.executeQuery("SELECT * FROM "+usr+".CICLO" );
			while(rset.next()) {
				Ciclo arm1 = new Ciclo(rset.getInt(1), rset.getString(2), rset.getString(3), rset.getString(4), rset.getInt(5));
				data.add(arm1);
				
	
			}
			rset.close();
			stmt.close();
			
		}catch (SQLException s){
			s.printStackTrace();
		}
		
		return data;
	}
	
	public void AñadiCiclo(Integer Clave, String nombre,String tipo,String Programa,Integer clave) {
		try {
			Statement stmt = conexion.createStatement();
			stmt.executeQuery("INSERT INTO "+usr+".CICLO VALUES ("+Clave+",'"+nombre+"','"+tipo+"','"+Programa+"',"+clave+")");
			
		}catch(SQLException s) {
			System.out.println("HOla2");
			s.printStackTrace();
		}
	}
	
	public void ModificarCiclo(Integer Clave, String nombre,String tipo, String Programa,Integer claves) {
		try {
			Statement stmt = conexion.createStatement();
			stmt.executeQuery("UPDATE "+usr+".CICLO SET COD_CICLO="+Clave+",NOMBREC='"+nombre+"',TIPO='"+tipo+"',PROGRAMAFORMATIVO='"+Programa+"',CLAVEFP="+claves+" WHERE COD_CICLO="+Clave);
			
		}catch(SQLException s) {
			System.out.println("HOla2");
			s.printStackTrace();
		}
	}
	
	public ObservableList<String> SacarFP() {
		ObservableList<String> FP=FXCollections.observableArrayList();
		
		try {
			Statement stmt = conexion.createStatement();
			ResultSet rset = stmt.executeQuery("SELECT NOMBREFP FROM "+usr+".FAMILIAPROFESIONAL" );
			while(rset.next()) {
				String nombre=rset.getString(1);
				FP.add(nombre);
				
	
			}

			rset.close();
			stmt.close();
			
		}catch (SQLException s){
			s.printStackTrace();
		}
		
		return FP;
	}
	
	public int SacarCodigoFP(String nombre){
		
		try {

		Statement stmt=conexion.createStatement();
		ResultSet rset=stmt.executeQuery("SELECT CLAVEFP FROM "+usr+".FAMILIAPROFESIONAL WHERE NOMBREFP='"+nombre+"'");
		int numero=0;
		while(rset.next()) {
		numero=rset.getInt(1);
		}
		return numero;
		
		}catch(SQLException s) {
			System.out.println("Fallo");
			s.printStackTrace();
			return 0;
		}
	}
	
	public String SacarNombreFP(int numero){
		
		try {

		Statement stmt=conexion.createStatement();
		ResultSet rset=stmt.executeQuery("SELECT NOMBREFP FROM "+usr+".FAMILIAPROFESIONAL WHERE CLAVEFP='"+numero+"'");
		String colegio="";
		while(rset.next()) {
		colegio=rset.getString(1);
		}
		return colegio;
		
		}catch(SQLException s) {
			System.out.println("Fallo");
			s.printStackTrace();
			return "";
		}
	}
	

}
