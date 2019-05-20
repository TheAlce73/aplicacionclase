package Centros;

import Conexion.Centros;
import Conexion.TestConexion;
import application.Main;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class AnadirCentros {
	
	private Main ProgramaSecundario;
	

	private Stage ventana;
	
	@FXML
	private Button Volver;
	
	@FXML
	private Button Modificar;
	
	@FXML
	private Button Anadir;
	
	@FXML
	private TextField Nombre;

	@FXML
	private TextField Director;
	
	@FXML
	private TextField NIFDirector;

	@FXML
	private TextField TelefonoCentro;
	
	@FXML
	private TextField Ciudad;
	
	@FXML
	private TextField Provincia;
	
	@FXML
	private TextField Direcion;

	@FXML
	private TextField CP;
	
	@FXML
	private TextField FAX;
	
	@FXML
	private TextField DAT;

	
	
	private ObservableList<String> Centros;
	
	private ObservableList<Centros> data = FXCollections.observableArrayList();
	
	
	public void setProgramaInicioSesion(Main Programa ,Stage ventana) {
		this.setProgramaSecundario(Programa);
		this.setVentana(ventana);
	}
	
	public void initialize() {
    }
	
	public void AnadirCentro() {
		
		String NombreC=Nombre.getText();
		String director=Director.getText();
		String NifDirector=NIFDirector.getText();
		String Telefono=TelefonoCentro.getText();
		int tele=Integer.parseInt(Telefono);
		String Ciudads=Ciudad.getText();
		String provincia=Provincia.getText();
		String direcion=Direcion.getText();
		String cp=CP.getText();
		int c=Integer.parseInt(cp);
		String Fax=FAX.getText();
		int f=Integer.parseInt(Fax);
		String dat=DAT.getText();
		
		TestConexion uno=new TestConexion();
		
		data=uno.MostrarCentros();
		
	

		int Total=data.size();

		System.out.println("hola");
		System.out.println(Total);
		

			uno.AñadirCentro((Total+1),  NombreC,  director,  NifDirector,
					 tele,  Ciudads,  provincia,  direcion,  c,  f,
					 dat);
			ventana.close();
		

		
		
	}


	public Main getProgramaSecundario() {
		return ProgramaSecundario;
	}


	public void setProgramaSecundario(Main programaSecundario) {
		ProgramaSecundario = programaSecundario;
	}


	public Stage getVentana() {
		return ventana;
	}


	public void setVentana(Stage ventana) {
		this.ventana = ventana;
	}

}
