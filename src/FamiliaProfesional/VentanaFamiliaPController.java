package FamiliaProfesional;

import Conexion.FamiliaProfesional;
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

public class VentanaFamiliaPController {
	
	
	private Main ProgramaSecundario;
	

	private Stage ventana;
	
	@FXML
	private TableView<FamiliaProfesional> Tabla;

	@FXML
	private TableColumn<FamiliaProfesional,Integer> ColClaveFP;

	@FXML
	private TableColumn<FamiliaProfesional,String> ColNombre;
	
	@FXML
	private Button Volver;
	
	@FXML
	private Button Modificar;
	
	@FXML
	private Button Anadir;
	
	private final ObservableList<FamiliaProfesional> data = FXCollections.observableArrayList();
	
	public void setProgramaInicioSesion(Main Programa ,Stage ventana) {
		this.setProgramaSecundario(Programa);
		this.setVentana(ventana);
	}

	public void initialize() {
		
		ColClaveFP.setCellValueFactory(new PropertyValueFactory<FamiliaProfesional,Integer>("ClaveFP"));
		ColNombre.setCellValueFactory(new PropertyValueFactory<FamiliaProfesional,String>("NombreFP"));
		
		TestConexion uno=new TestConexion();
		data.addAll(uno.MostrarFP());
		Tabla.setItems(data);

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

		 FamiliaProfesional selectedItem=Tabla.getSelectionModel().getSelectedItem();
		 if(selectedItem!=null) {
			 
			 this.ProgramaSecundario.MostrarModificarFP(selectedItem);
		 }
	    	
	    }
	 public void Anadir() {
	    	this.ProgramaSecundario.MostrarAnadirFP();;
	    	
	    }




}
