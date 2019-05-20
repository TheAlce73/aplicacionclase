package Centros;

import Conexion.Centros;
import Conexion.TestConexion;
import application.Main;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class ModificarCentros {
	
	
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
	
	private Centros selectedItems;
	
	private Integer codigo;
	private String nombre;
	private String director;
	private String NIF;
	private Integer Telefono;
	private String ciudad;
	private String provincia;
	private String direcion;
	private Integer cp;
	private Integer fax;
	private String dat;
	
	
	public void setProgramaInicioSesion(Main Programa ,Stage ventana,Centros selectedItemss) {
		this.selectedItems=selectedItemss;
		this.codigo=this.selectedItems.getCod_centro();
		this.nombre=this.selectedItems.getNombreCentro();
		this.director=this.selectedItems.getDirectorCentro();
		this.NIF=this.selectedItems.getNifDirector();
		this.Telefono=this.selectedItems.getTelefonoCentro();
		String telefono=""+Telefono;
		this.ciudad=this.selectedItems.getCiudad();
		this.provincia=this.selectedItems.getProvincia();
		this.direcion=this.selectedItems.getDirecion();
		this.cp=this.selectedItems.getCP();
		String cpp=this.cp+"";
		this.fax=this.selectedItems.getFAX();
		String faxx=this.fax+"";
		this.dat=this.selectedItems.getDAT();
		
		this.setProgramaSecundario(Programa);
		this.setVentana(ventana);





		
		this.Nombre.appendText(nombre);
		this.Director.appendText(director);
		this.NIFDirector.appendText(NIF);
		this.TelefonoCentro.appendText(telefono);
		this.Ciudad.appendText(ciudad);
		this.Provincia.appendText(provincia);
		this.Direcion.appendText(direcion);
		this.CP.appendText(cpp);
		this.FAX.appendText(faxx);
		this.DAT.appendText(dat);
		
	}
	
	public void initialize() {
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
	
	public void ModificarCentro() {
		
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
		

			uno.ModificarCentro(codigo,  NombreC,  director,  NifDirector,
					 tele,  Ciudads,  provincia,  direcion,  c,  f,
					 dat);
			ventana.close();
		
	}

}
