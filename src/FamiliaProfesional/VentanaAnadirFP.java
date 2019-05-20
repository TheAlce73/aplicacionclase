package FamiliaProfesional;

import Conexion.FamiliaProfesional;
import Conexion.TestConexion;
import Conexion.Tutores;
import application.Main;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class VentanaAnadirFP {
	
	private Main ProgramaSecundario;

	private Stage ventana;
	
	@FXML
	private TextField Nombre;
	
	@FXML
	private Button Anadir;

	
	private ObservableList<FamiliaProfesional> data = FXCollections.observableArrayList();
	
	
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
	
	public void anadirTutor() {
		
		String nombre=this.Nombre.getText();
		
		
		TestConexion uno=new TestConexion();
		

	
		
		data=uno.MostrarFP();
		int Total=data.size();

		
		
	
			uno.AñadirFP((Total+1), nombre);
			ventana.close();

			
		
	
		
	}
	

}
