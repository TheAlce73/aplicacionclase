package application;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class PaguinaAdminController {
	

	private Main ProgramaSecundario;
	

	private Stage ventana;
	
	@FXML
	private Button CerrarSesión;
	
	@FXML
	private Button Usuarios;
	
	@FXML
	private Button Tutores;
	
	@FXML
	private Button UsrATuto;
	
	@FXML
	private Button Alumnos;
	
	@FXML
	private Button FProfesionales;

	@FXML
	private Button Anexos;
	
	
	
	public void setProgramaInicioSesion(Main Programa ,Stage ventana) {
		this.setProgramaSecundario(Programa);
		this.setVentana(ventana);
	}
	
    public void initialize() {
        // TODO
    }
    
    public void CerrarSesion() {
    	ventana.close();
    	
    }
    
    public void Usuarios() {
    	ventana.close();
    	this.ProgramaSecundario.MostrarUsuarios();
    	
    }
    
    public void Tutores() {
    	ventana.close();
    	this.ProgramaSecundario.MostrarVentanaTutores();
   	
    }
    
    public void UsuarioATutor() {
    	ventana.close();
    	this.ProgramaSecundario.MostrarUsuarioATutores();
    	
    }
    
    public void FP() {
    	ventana.close();
    	
    }
    public void Anexos() {
    	ventana.close();
    	
    }
    
    public void Alumnos
    () {
    	ventana.close();
    	
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

}
