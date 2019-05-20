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
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class VentanaModificarCiclo {
	
	private Main ProgramaSecundario;
	

	private Stage ventana;
	
	
	@FXML
	private Button Modificar;
	
	@FXML
	private TextField Nombre;

	@FXML
	private TextField Tipo;
	
	@FXML
	private TextField Programa;
	
	@FXML
	private ChoiceBox<String> cb = new ChoiceBox<String>();
	
	

	
	private  ObservableList<FamiliaProfesional> data = FXCollections.observableArrayList();
	
	private int codigo;
	private String nombre;
	private String tipo;
	private String programa;
	private int codFP;


	private Ciclo selectedItem;
	
	private ObservableList<String> FP;

	
	public void setProgramaInicioSesion(Main Programa ,Stage ventana,Ciclo selectedItems) {
		this.selectedItem=selectedItems;
		this.codigo=this.selectedItem.getCod_Ciclo();
		this.nombre=this.selectedItem.getNombreC();
		this.tipo=this.selectedItem.getTipo();
		this.programa=this.selectedItem.getProgramaFormativo();
		this.codFP=this.selectedItem.getClaveFP();

		this.ventana=ventana;
		this.ProgramaSecundario=Programa;

		
		TestConexion uno=new TestConexion();
		
		String nombreCFP=uno.SacarNombreFP(codFP);
		

		
	    String num=this.codFP+"";
	    
	    FP=uno.SacarFP();
	    int x=0;
	    while(x<FP.size()) {
		
			String nombre=FP.get(x);
			this.cb.getItems().addAll(nombre);
			x++;
		}
	    
	    this.Nombre.appendText(nombre);
	    this.Tipo.appendText(tipo);
	    this.Programa.appendText(programa);
	    this.cb.setValue(nombreCFP);
		

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
		
		String NCiclo= Nombre.getText();
		String tipo=Tipo.getText();
		String ProgramFoma=Programa.getText();
		String nombre=cb.getValue();
		TestConexion uno=new TestConexion();
		
		data=uno.MostrarFP();
	
		Integer cod_FP=uno.SacarCodigoFP(nombre);
		


		if(nombre!=null) {
			uno.ModificarCiclo(cod_FP,  NCiclo,  tipo,  ProgramFoma ,  cod_FP);
			ventana.close();
		}
		else {
			 System.out.println("Indica Una Familia Profesional");
		}
		
	}
}



