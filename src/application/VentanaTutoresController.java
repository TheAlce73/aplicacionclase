package application;

import Conexion.TestConexion;
import Conexion.Usuarios;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

public class VentanaTutoresController {
	
	private Main ProgramaSecundario;
	

	private Stage ventana;
	
	@FXML
	private TableView<Usuarios> Tabla;

	@FXML
	private TableColumn<Usuarios,Integer> ColCod_User;

	@FXML
	private TableColumn<Usuarios,String> ColNombre_User;
	
	@FXML
	private TableColumn<Usuarios,Integer> ColContrasena;

	@FXML
	private TableColumn<Usuarios,String> ColAdmin;
	
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
	    	this.ProgramaSecundario.MostrarModificarTutores();
	    	
	    }
	 public void Anadir() {
	    	this.ProgramaSecundario.MostrarAnadirTutores();;
	    	
	    }



}
