package Ciclo;

import Conexion.Ciclo;
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

public class VentanaCicloController {

	private Main ProgramaSecundario;
	

	private Stage ventana;
	
	@FXML
	private TableView<Ciclo> Tabla;

	@FXML
	private TableColumn<Ciclo,Integer> ColCodigo;

	@FXML
	private TableColumn<Ciclo,String> ColNombre;
	
	@FXML
	private TableColumn<Ciclo,String> ColTipo;
	
	@FXML
	private TableColumn<Ciclo,String> ColProgramaFormativo;
	

	
	@FXML
	private Button Volver;
	
	@FXML
	private Button Modificar;
	
	@FXML
	private Button Anadir;
	
	private  ObservableList<Ciclo> data = FXCollections.observableArrayList();
	
	public void setProgramaInicioSesion(Main Programa ,Stage ventana) {
		this.setProgramaSecundario(Programa);
		this.setVentana(ventana);
	}

	public void initialize() {
		
		ColCodigo.setCellValueFactory(new PropertyValueFactory<Ciclo,Integer>("Cod_Ciclo"));
		ColNombre.setCellValueFactory(new PropertyValueFactory<Ciclo,String>("Tipo"));
		ColTipo.setCellValueFactory(new PropertyValueFactory<Ciclo,String>("NombreC"));
		ColProgramaFormativo.setCellValueFactory(new PropertyValueFactory<Ciclo,String>("ProgramaFormativo"));
		

		
		TestConexion uno=new TestConexion();
		data=uno.MostrarCiclo();
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
		 Ciclo selectedItem=Tabla.getSelectionModel().getSelectedItem();
		 if(selectedItem!=null) {
			 
			 this.ProgramaSecundario.MostrarModificarCiclo(selectedItem);
		 }
	    	
	    }
	 public void Anadir() {
	    	this.ProgramaSecundario.MostrarAnadirCiclo();;
	    	
	    }
}
