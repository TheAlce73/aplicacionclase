package UsuariosAdmin;

import Conexion.TestConexion;
import Conexion.Usuarios;
import application.Main;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class ModificarUsuario {
	
	private Main ProgramaSecundario;
	

	private Stage ventana;
	
	@FXML
	private Button Volver;
	
	@FXML
	private Button Modificar;
	
	@FXML
	private Button Anadir;
	
	@FXML
	private TextField contrasena;
	
	@FXML
	private TextField cod_Usuario;
	
	@FXML
	private TextField nombreUser ;
	
	@FXML
	private RadioButton admin;
	
	
	private  Usuarios selectedItem;
	
	private final ObservableList<Usuarios> data = FXCollections.observableArrayList();
	
	private int codigo;
	private int cod;
	private String NUser;
	private String admins;
	private String Contra;
	
	
	public void setProgramaInicioSesion(Main Programa ,Stage ventana, TableView<Usuarios> tabla, Usuarios selectedItem) {
		System.out.println("Hiio");
		this.setProgramaSecundario(Programa);
		this.setVentana(ventana);
		System.out.println("HOla");
	    this.selectedItem=selectedItem;
		this.admins=this.selectedItem.getAdmin();
		this.NUser=this.selectedItem.getNombreUser();
		this.Contra=this.selectedItem.getContraseña();
		this.cod=this.selectedItem.getCod_Usuario();
		
		this.codigo=cod;
		
		this.contrasena.appendText(Contra);
		this.nombreUser.appendText(NUser);
		if(this.admins.equals("Si")) {
		this.admin.fire();
		}
		
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
	
	public void ModificarUsuarios(ActionEvent event) { 
		TestConexion uno=new TestConexion();
		String NUsuario= nombreUser.getText();
		String Contraseña= contrasena.getText();
		String Admin="";
		data.addAll(uno.MostrarUsuario());
		int Total=data.size();
		System.out.println(Total);
		if(admin.isSelected()==true) {
			 Admin="Si";
		}
		else {
			 Admin="No";
		}
		uno.ModificarUsuarios(this.codigo,this.cod, NUsuario, Contraseña, Admin);

		
	
		
		ventana.close();
	}
	


}
