package Tutores;

import Conexion.TestConexion;
import Conexion.Tutores;
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

public class VentanaTutoresController {
	
	private Main ProgramaSecundario;
	

	private Stage ventana;
	
	@FXML
	private TableView<Tutores> Tabla;

	@FXML
	private TableColumn<Tutores,Integer> ColCod_Tutor;

	@FXML
	private TableColumn<Tutores,String> ColNombre_Tutor;
	
	@FXML
	private TableColumn<Tutores,String> ColApellido_Tutor;

	@FXML
	private TableColumn<Tutores,String> ColDNI;
	
	@FXML
	private TableColumn<Tutores,String> ColEmail;
	
	@FXML
	private TableColumn<Tutores,Integer> ColNumero;
	
	@FXML
	private TableColumn<Tutores,Integer> ColCod_Centro;
	
	@FXML
	private Button Volver;
	
	@FXML
	private Button Modificar;
	
	@FXML
	private Button Anadir;
	
	private final ObservableList<Tutores> data = FXCollections.observableArrayList();
	
	public void setProgramaInicioSesion(Main Programa ,Stage ventana) {
		this.setProgramaSecundario(Programa);
		this.setVentana(ventana);
	}

	public void initialize() {
		ColCod_Tutor.setCellValueFactory(new PropertyValueFactory<Tutores,Integer>("Cod_TutorCiclo"));
		ColNombre_Tutor.setCellValueFactory(new PropertyValueFactory<Tutores,String>("NombreTC"));
		ColApellido_Tutor.setCellValueFactory(new PropertyValueFactory<Tutores,String>("ApellidosTC"));
		ColDNI.setCellValueFactory(new PropertyValueFactory<Tutores,String>("DNI"));
		ColEmail.setCellValueFactory(new PropertyValueFactory<Tutores,String>("email"));
		ColNumero.setCellValueFactory(new PropertyValueFactory<Tutores,Integer>("TelefonoTP"));
		//ColCod_Centro.setCellValueFactory(new PropertyValueFactory<Tutores,Integer>("Cod_Centro"));
		TestConexion uno=new TestConexion();
		data.addAll(uno.MostrarTutores());
		Tabla.setItems(uno.MostrarTutores());

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
		 Tutores selectedItem=Tabla.getSelectionModel().getSelectedItem();
		 if(selectedItem!=null) {
			 
			 this.ProgramaSecundario.MostrarModificarTutores(selectedItem);
		 }
		 
	    	
	    	
	    }
	 public void Anadir() {
	    	this.ProgramaSecundario.MostrarAnadirTutores();;
	    	
	    }



}
