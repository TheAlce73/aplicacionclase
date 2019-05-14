package UsuariosAdmin;

import Conexion.TestConexion;
import Conexion.Usuarios;
import application.Main;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

public class VentanaUsuarios {
	
	private Main ProgramaSecundario;
	

	private Stage ventana;
	
	@FXML
	private TableView<Usuarios> Tabla;

	@FXML
	private TableColumn<Usuarios,Integer> ColCod_User;

	@FXML
	private TableColumn<Usuarios,String> ColNombre_User;
	
	@FXML
	private TableColumn<Usuarios,String> ColContrasena;

	@FXML
	private TableColumn<Usuarios,String> ColAdmin;
	
	private final ObservableList<Usuarios> data = FXCollections.observableArrayList();
	
	@FXML
	private Button Volver;
	
	@FXML
	private Button Modificar;
	
	@FXML
	private Button Anadir;
	
	public void setProgramaInicioSesion(Main Programa ,Stage ventana) {
		this.setProgramaSecundario(Programa);
		this.setVentana(ventana);
	}

	public void initialize() {
		ColCod_User.setCellValueFactory(new PropertyValueFactory<Usuarios,Integer>("Cod_Usuario"));
		ColNombre_User.setCellValueFactory(new PropertyValueFactory<Usuarios,String>("NombreUser"));
		ColContrasena.setCellValueFactory(new PropertyValueFactory<Usuarios,String>("Contraseña"));
		ColAdmin.setCellValueFactory(new PropertyValueFactory<Usuarios,String>("Admin"));
		TestConexion uno=new TestConexion();
		data.addAll(uno.Numero1());
		Tabla.setItems(uno.Numero1());
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
	
	
	 public void Volver() {
	    	ventana.close();
	    	this.ProgramaSecundario.MostrarPaguinaAdmin();
	    	
	    }
	 public void Modificar() {
	    	this.ProgramaSecundario.MostrarModificarUsuario();
	    	
	    }
	 public void Anadir() {
	    	this.ProgramaSecundario.MostrarAñadirUsuario();;
	    	
	    }


}
