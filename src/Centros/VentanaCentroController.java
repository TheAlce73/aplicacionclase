package Centros;

import Conexion.Centros;
import Conexion.TestConexion;
import Conexion.Tutores;
import application.Main;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

public class VentanaCentroController {
	
	@FXML
	private TableColumn<Centros,Integer> ColCodigoCentro;

	@FXML
	private TableColumn<Centros,String> ColNombreCentro;
	
	@FXML
	private TableColumn<Centros,String> ColDirectorCentro;

	@FXML
	private TableColumn<Centros,String> ColNIFDirector;
	
	@FXML
	private TableColumn<Centros,String> ColTelefonoC;
	
	@FXML
	private TableColumn<Centros,String> ColCiudad;
	
	@FXML
	private TableColumn<Centros,String> ColProvincia;
	
	@FXML
	private TableColumn<Centros,String> ColDirecion;
	
	@FXML
	private TableColumn<Centros,Integer> ColCP;
	
	@FXML
	private TableColumn<Centros,Integer> ColFAX;
	
	@FXML
	private TableColumn<Centros,String> ColDAT;
	
	private  Main ProgramaSecundario;

	private Stage ventana;
	
	@FXML
	private Button Volver;
	
	@FXML
	private Button Modificar;
	
	@FXML
	private Button Anadir;
	
	private final ObservableList<Centros> data = FXCollections.observableArrayList();
	
	@FXML
	private TableView<Centros>  tabla;
	
	public void setProgramaInicioSesion(Main Programa ,Stage ventana) {
		this.setProgramaSecundario(Programa);
		this.setVentana(ventana);
	}
	public void initialize() {
		ColCodigoCentro.setCellValueFactory(new PropertyValueFactory<Centros,Integer>("cod_centro"));
		ColNombreCentro.setCellValueFactory(new PropertyValueFactory<Centros,String>("NombreCentro"));
		ColDirectorCentro.setCellValueFactory(new PropertyValueFactory<Centros,String>("DirectorCentro"));
		ColNIFDirector.setCellValueFactory(new PropertyValueFactory<Centros,String>("NifDirector"));
		ColTelefonoC.setCellValueFactory(new PropertyValueFactory<Centros,String>("TelefonoCentro"));
		ColCiudad.setCellValueFactory(new PropertyValueFactory<Centros,String>("Ciudad"));
		ColProvincia.setCellValueFactory(new PropertyValueFactory<Centros,String>("Provincia"));
		ColDirecion.setCellValueFactory(new PropertyValueFactory<Centros,String>("Direcion"));
		ColCP.setCellValueFactory(new PropertyValueFactory<Centros,Integer>("CP"));
		ColFAX.setCellValueFactory(new PropertyValueFactory<Centros,Integer>("FAX"));
		ColDAT.setCellValueFactory(new PropertyValueFactory<Centros,String>("DAT"));

		TestConexion uno=new TestConexion();
		data.addAll(uno.MostrarCentros());
		tabla.setItems(data);

		
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
	
	
	 public void Volver() {
	    	ventana.close();
	    	this.ProgramaSecundario.MostrarPaguinaAdmin();
	    	
	    }
	 public void Modificar() {
		 
		 Centros selectedItem=tabla.getSelectionModel().getSelectedItem();
		 if(selectedItem!=null) {
			 
			 this.ProgramaSecundario.MostrarModificarCentros(selectedItem);
		    
		 }
	
	    }
	 public void Anadir() {
	    	this.ProgramaSecundario.MostrarAnadirCentros();;
	    	
	    }
	
	

}
