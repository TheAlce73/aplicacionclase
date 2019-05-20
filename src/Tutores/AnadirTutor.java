package Tutores;

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

public class AnadirTutor {
		
		private Main ProgramaSecundario;
		

		private Stage ventana;
		
		@FXML
		private Button Volver;
		
		@FXML
		private Button Modificar;
		
		@FXML
		private Button Anadir;
		
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
		
		
		private ObservableList<String> Centros;
		
		private ObservableList<Tutores> data = FXCollections.observableArrayList();
		
		
		public void setProgramaInicioSesion(Main Programa ,Stage ventana) {
			this.setProgramaSecundario(Programa);
			this.setVentana(ventana);
		}

		public void initialize() {
			System.out.println("Hla");
			TestConexion uno=new TestConexion();
			Centros=uno.SacarCentros();
			System.out.println("Hola1.4");
			int x=0;
			while(x<Centros.size()) {
				System.out.println("qq");
				String nombre=Centros.get(x);
				this.cb.getItems().addAll(nombre);
				x++;
			}
			System.out.println("qqs");
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
		
		public void anadirTutor() {
			
			
			String NTutor= Nombre_Tutor.getText();
			String ATutor=Apellido_Tutor.getText();
			String dni=DNI.getText();
			String email= Email.getText();
			String numero=Numero.getText();
			Integer num=Integer.parseInt(numero);
			String nombre=cb.getValue();
			
			TestConexion uno=new TestConexion();
			
			data.addAll(uno.MostrarTutores());
		
			Integer cod_centro=uno.SacarCodigoCentro(nombre);
			
			data=uno.MostrarTutores();
			int Total=data.size();

			
			
			if(nombre!=null) {
				uno.AñadirTutores((Total+1),  NTutor,  ATutor,  dni ,  email , num, cod_centro);
				ventana.close();
			}
			else {
				 System.out.println("Indica Un Centro");
			}
			
		
			
		}
		
}
