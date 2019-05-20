package UsuariosAdmin;

import Conexion.TestConexion;
import Conexion.Usuarios;
import application.Main;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class AnadirUsuario {
	
	private Main ProgramaSecundario;
	

	private Stage ventana;
	
	@FXML
	private Button Volver;
	
	@FXML
	private Button Modificar;
	
	@FXML
	private Button Anadir;
	
	@FXML
	private TextField contrasena;
	
	@FXML
	private TextField cod_Usuario;
	
	@FXML
	private TextField nombreUser ;
	
	@FXML
	private RadioButton admin;
	
	private final ObservableList<Usuarios> data = FXCollections.observableArrayList();
	
	public void setProgramaInicioSesion(Main Programa ,Stage ventana) {
		this.setProgramaSecundario(Programa);
		this.setVentana(ventana);
	}

	public void initialize() {
       
    }
	
	public Stage getVentana() {
		return ventana;
	}

	public void setVentana(Stage ventana) {
		this.ventana = ventana;
	}

	public Main getProgramaSecundario() {
		return ProgramaSecundario;
	}

	public void setProgramaSecundario(Main programaSecundario) {
		ProgramaSecundario = programaSecundario;
	}
	
	public void AnadirUsuarios(ActionEvent event) {
		TestConexion uno=new TestConexion();
		String NUsuario= nombreUser.getText();
		String Contraseña= contrasena.getText();
		String Admin="";
		data.addAll(uno.MostrarUsuario());
		int Total=data.size();
		System.out.println(Total);
		if(admin.isSelected()==true) {
			 Admin="Si";
		}
		else {
			 Admin="No";
		}
		uno.AñadirUsuarios((Total+1), NUsuario, Contraseña, Admin);
		ventana.close();
	}
	

}
