package Tutores;

import Conexion.Centros;
import Conexion.TestConexion;
import Conexion.Tutores;
import Conexion.Usuarios;
import application.Main;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class ModificarTutor {
		
		private Main ProgramaSecundario;
		

		private Stage ventana;
		
		
		@FXML
		private Button Modificar;
		
		@FXML
		private TextField Cod_Tutor;

		@FXML
		private TextField Nombre_Tutor;
		
		@FXML
		private TextField Apellido_Tutor;

		@FXML
		private TextField DNI;
		
		@FXML
		private TextField Email;
		
		@FXML
		private TextField Numero;
		
		@FXML
		private ChoiceBox<String> cb = new ChoiceBox<String>();
		
		

		
		private  ObservableList<Tutores> data = FXCollections.observableArrayList();
		
		private int codigo;
		private int cod;
		private String NTutor;
		private String ATutor;
		private String DNIs;
		private String email;
		private int numero;
		private int codCentro;


		private Tutores selectedItem;
		
		private ObservableList<String> Centros;

		
		public void setProgramaInicioSesion(Main Programa ,Stage ventana,Tutores selectedItems) {
			this.selectedItem=selectedItems;
			this.codigo=this.selectedItem.getCod_TutorCiclo();
			this.NTutor=this.selectedItem.getNombreTC();
			this.ATutor=this.selectedItem.getApellidosTC();
			this.DNIs=this.selectedItem.getDNI();
			this.email=this.selectedItem.getEmail();
			this.numero=this.selectedItem.getTelefonoTP();
			this.codCentro=this.selectedItem.getCod_Centro();
			this.ventana=ventana;
			this.ProgramaSecundario=Programa;

			
			TestConexion uno=new TestConexion();
			
			String nombreCentro=uno.SacarNombreCentro(codCentro);
			

			
		    String num=this.numero+"";
		    
		    Centros=uno.SacarCentros();
		    int x=0;
		    while(x<Centros.size()) {
			
				String nombre=Centros.get(x);
				this.cb.getItems().addAll(nombre);
				x++;
			}
			
			this.Nombre_Tutor.appendText(NTutor);
			this.Apellido_Tutor.appendText(ATutor);
			this.DNI.appendText(DNIs);
			this.Email.appendText(email);
			this.Numero.appendText(num);
			this.cb.setValue(nombreCentro);


			

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
			TestConexion uno=new TestConexion();
			
			
			String NTutor= Nombre_Tutor.getText();
			String ATutor=Apellido_Tutor.getText();
			String dni=DNI.getText();
			String email= Email.getText();
			String numero=Numero.getText();
			int num=Integer.parseInt(numero);
			String nombre=cb.getValue();
			

			
			
	
			
			
			data.addAll(uno.MostrarTutores());
		
			Integer cod_centro=uno.SacarCodigoCentro(nombre);
			
			data=uno.MostrarTutores();


			
			if(nombre!=null) {
				uno.ModificarTutores( codigo, codigo,  NTutor,  ATutor,  dni ,  email , num, cod_centro);
			
			}
			else {
				 System.out.println("Indica Un Centro");
			}
			
			this.ventana.close();
		
		}
		
}
