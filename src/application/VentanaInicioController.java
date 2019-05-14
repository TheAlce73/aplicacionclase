package application;

import application.Main;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class VentanaInicioController {
	
    private  Main ProgramaPrincipal;

    @FXML
    private Button Iniciar;
    
    @FXML
    private Button Cerrar;
    
    private Stage ventana;


    public void setProgramaPrincipal(Main ProgramaPrincipal , Stage ventana) {
        this.ProgramaPrincipal = ProgramaPrincipal;
        this.ventana=ventana;
    }

    public void initialize() {
        // TODO
    }
    
    @FXML
    private void CerrarAplicacion() {
    	this.ventana.close();
    }
    
    @FXML
	private void IniciarAPP() {
    	this.ventana.close();
    	this.ProgramaPrincipal.MostrarInicioSesion();

    }
       	
       	

}
