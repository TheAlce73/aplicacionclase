package Ciclo;

import Conexion.FamiliaProfesional;
import Conexion.TestConexion;
import application.Main;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class VentanaAnadirCiclo {
	
	
	private Main ProgramaSecundario;

	private Stage ventana;
	
	@FXML
	private TextField Nombre;
	
	@FXML
	private TextField Tipo;
	
	@FXML
	private TextField ProgramaFormativo;
	
	@FXML
	private ChoiceBox<String> cb = new ChoiceBox<String>();
	
	private ObservableList<String> FP;
	
	@FXML
	private Button Anadir;

	
	private ObservableList<FamiliaProfesional> data = FXCollections.observableArrayList();
	
	
	public void setProgramaInicioSesion(Main Programa ,Stage ventana) {
		this.setProgramaSecundario(Programa);
		this.setVentana(ventana);
	}

	public void initialize() {
		
		TestConexion uno=new TestConexion();
		FP=uno.SacarFP();
		int x=0;
		while(x<FP.size()) {
			String nombre=FP.get(x);
			this.cb.getItems().addAll(nombre);
			x++;
		}
	

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
	
	public void anadirCiclo() {
		
		String NCiclo= Nombre.getText();
		String tipo=Tipo.getText();
		String ProgramFoma=ProgramaFormativo.getText();
		String nombre=cb.getValue();
		TestConexion uno=new TestConexion();
		
		data=uno.MostrarFP();
	
		Integer cod_FP=uno.SacarCodigoFP(nombre);
		
		int Total=data.size();
		
		int numero=0;

			numero=Total+1;
		
		System.out.println(numero);

		if(nombre!=null) {
			uno.AñadiCiclo(numero,  NCiclo,  tipo,  ProgramFoma ,  cod_FP);
			ventana.close();
		}
		else {
			 System.out.println("Indica Una Familia Profesional");
		}
		
	}

}
