package application;

import Conexion.TestConexion;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class VentanaInicioSesionController {
	

	private Main ProgramaSecundario;
	

	private Stage ventana;
	
	@FXML
	private Button IniciarSesion;
	
	
	
	public void setProgramaInicioSesion(Main Programa ,Stage ventana) {
		this.setProgramaSecundario(Programa);
		this.setVentana(ventana);
	}
	
    public void initialize() {
    	TestConexion uno=new TestConexion();
    }
    
    public void IniciarSesion() {
    	ventana.close();
    	ProgramaSecundario.MostrarPaguinaAdmin();
    	
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

}
