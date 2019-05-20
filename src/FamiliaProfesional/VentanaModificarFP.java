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

public class VentanaModificarFP {
	
	private Main ProgramaSecundario;
	

	private Stage ventana;
	
	
	@FXML
	private Button Modificar;
	

	
	@FXML
	private TextField Nombre;
	
	private  ObservableList<FamiliaProfesional> data = FXCollections.observableArrayList();
	
	private int codigo;
	private String NFP;
	
	private FamiliaProfesional selectedItem;
	

	public void setProgramaInicioSesion(Main Programa ,Stage ventana,FamiliaProfesional selectedItems) {
		
		this.ventana=ventana;
		this.ProgramaSecundario=Programa;
		this.selectedItem=selectedItems;
		this.codigo=this.selectedItem.getClaveFP();
		this.NFP=this.selectedItem.getNombreFP();
		
		TestConexion uno=new TestConexion();
		
		this.Nombre.appendText(NFP);
		
	}
	
	public void initialize() {
        // TODO
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
	
	public void ModificarTutores() {

		String nombre=this.Nombre.getText();
		
		
		TestConexion uno=new TestConexion();

			uno.ModificarFP((this.codigo), nombre);
	
			ventana.close();
	
	}

}
