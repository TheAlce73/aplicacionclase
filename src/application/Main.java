package application;



import UsuariosAdmin.VentanaUsuarios;
import javafx.application.Application;

import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;



public class Main extends Application {

	 private static Stage stagePrincipal;
	 private AnchorPane rootPane;
	 
	 @Override
	    public void start(Stage stagePrincipal) throws Exception {
	        Main.stagePrincipal = stagePrincipal;
	        MostrarInicio();

	    }
		public static void main(String[] args) {

			launch(args);
		}


	public void MostrarInicio() {
		try {
			
			FXMLLoader loader = new FXMLLoader(Main.class.getResource("Inicio APP.fxml"));
			rootPane=(AnchorPane) loader.load();
			Scene scene = new Scene(rootPane);
			stagePrincipal.setTitle("Inicio APP");
            stagePrincipal.setScene(scene);
            
            VentanaInicioController controller = loader.getController();
            controller.setProgramaPrincipal(this, stagePrincipal);

            stagePrincipal.show();
            
           } catch(Exception e) {
			e.printStackTrace();
			
		}
		
	}
	
	public void MostrarInicioSesion() {
		try {
			
		     FXMLLoader loader = new FXMLLoader(Main.class.getResource("Inicio Sesion.fxml"));
	            AnchorPane ventanaDos = (AnchorPane) loader.load();
	            Stage ventana = new Stage();
	            ventana.setTitle("Inicio Sesión");

	            ventana.initOwner(stagePrincipal);
	            Scene scene = new Scene(ventanaDos);
	            ventana.setScene(scene);

	            VentanaInicioSesionController controller2 = loader.getController();
	            controller2.setProgramaInicioSesion(this,ventana);

	            ventana.show();
            
           } catch(Exception e) {
			e.printStackTrace();
			
		}
		
	}

	
	public void MostrarPaguinaAdmin() {
		try {
			
		     FXMLLoader loader = new FXMLLoader(Main.class.getResource("Paguina Admin.fxml"));
	            AnchorPane ventanaDos = (AnchorPane) loader.load();
	            Stage ventana = new Stage();
	            ventana.setTitle("Paguina Administrador");

	            ventana.initOwner(stagePrincipal);
	            Scene scene = new Scene(ventanaDos);
	            ventana.setScene(scene);

	            PaguinaAdminController controller2 = loader.getController();
	            controller2.setProgramaInicioSesion(this,ventana);

	            ventana.show();
            
           } catch(Exception e) {
			e.printStackTrace();
			
		}
		
	}
	
	public void MostrarUsuarios() {
		try {
			
		     FXMLLoader loader = new FXMLLoader(Main.class.getResource("../UsuariosAdmin/Usuarios.fxml"));
	            AnchorPane ventanaDos = (AnchorPane) loader.load();
	            Stage ventana = new Stage();
	            ventana.setTitle("Paguina Administrador");

	            ventana.initOwner(stagePrincipal);
	            Scene scene = new Scene(ventanaDos);
	            ventana.setScene(scene);

	            VentanaUsuarios controller2 = loader.getController();
	            controller2.setProgramaInicioSesion(this,ventana);

	            ventana.show();
            
           } catch(Exception e) {
			e.printStackTrace();
			
		}
		
	}
	
	public void MostrarAñadirUsuario() {
		try {
			
		     FXMLLoader loader = new FXMLLoader(Main.class.getResource("UsuariosAñadir.fxml"));
	            AnchorPane ventanaDos = (AnchorPane) loader.load();
	            Stage ventana = new Stage();
	            ventana.setTitle("Paguina Administrador");

	            ventana.initOwner(stagePrincipal);
	            Scene scene = new Scene(ventanaDos);
	            ventana.setScene(scene);

	            AnadirUsuario controller2 = loader.getController();
	            controller2.setProgramaInicioSesion(this,ventana);

	            ventana.show();
            
           } catch(Exception e) {
			e.printStackTrace();
			
		}
		
	}

	public void MostrarModificarUsuario() {
		try {
			
		     FXMLLoader loader = new FXMLLoader(Main.class.getResource("UsuariosModificar.fxml"));
	            AnchorPane ventanaDos = (AnchorPane) loader.load();
	            Stage ventana = new Stage();
	            ventana.setTitle("Paguina Administrador");

	            ventana.initOwner(stagePrincipal);
	            Scene scene = new Scene(ventanaDos);
	            ventana.setScene(scene);

	            ModificarUsuario controller2 = loader.getController();
	            controller2.setProgramaInicioSesion(this,ventana);

	            ventana.show();
            
           } catch(Exception e) {
			e.printStackTrace();
			
		}
		
	}
	
	public void MostrarVentanaTutores() {
		try {
			
		     FXMLLoader loader = new FXMLLoader(Main.class.getResource("Tutores.fxml"));
	            AnchorPane ventanaDos = (AnchorPane) loader.load();
	            Stage ventana = new Stage();
	            ventana.setTitle("Paguina Administrador");

	            ventana.initOwner(stagePrincipal);
	            Scene scene = new Scene(ventanaDos);
	            ventana.setScene(scene);

	            VentanaTutoresController controller2 = loader.getController();
	            controller2.setProgramaInicioSesion(this,ventana);

	            ventana.show();
            
           } catch(Exception e) {
			e.printStackTrace();
			
		}
		
	}
	public void MostrarModificarTutores() {
		try {
			
		     FXMLLoader loader = new FXMLLoader(Main.class.getResource("TutoresModificar.fxml"));
	            AnchorPane ventanaDos = (AnchorPane) loader.load();
	            Stage ventana = new Stage();
	            ventana.setTitle("Paguina Administrador");

	            ventana.initOwner(stagePrincipal);
	            Scene scene = new Scene(ventanaDos);
	            ventana.setScene(scene);

	            ModificarTutor controller2 = loader.getController();
	            controller2.setProgramaInicioSesion(this,ventana);

	            ventana.show();
            
           } catch(Exception e) {
			e.printStackTrace();
			
		}
		
	}
	public void MostrarAnadirTutores() {
		try {
			
		     FXMLLoader loader = new FXMLLoader(Main.class.getResource("TutoresAñadir.fxml"));
	            AnchorPane ventanaDos = (AnchorPane) loader.load();
	            Stage ventana = new Stage();
	            ventana.setTitle("Paguina Administrador");

	            ventana.initOwner(stagePrincipal);
	            Scene scene = new Scene(ventanaDos);
	            ventana.setScene(scene);

	            AnadirTutor controller2 = loader.getController();
	            controller2.setProgramaInicioSesion(this,ventana);

	            ventana.show();
            
           } catch(Exception e) {
			e.printStackTrace();
			
		}
		
	}
	
	public void MostrarUsuarioATutores() {
		try {
			
		     FXMLLoader loader = new FXMLLoader(Main.class.getResource("UsuariosATutores.fxml"));
	            AnchorPane ventanaDos = (AnchorPane) loader.load();
	            Stage ventana = new Stage();
	            ventana.setTitle("Paguina Administrador");

	            ventana.initOwner(stagePrincipal);
	            Scene scene = new Scene(ventanaDos);
	            ventana.setScene(scene);

	            UsuarioATutor controller2 = loader.getController();
	            controller2.setProgramaInicioSesion(this,ventana);

	            ventana.show();
            
           } catch(Exception e) {
			e.printStackTrace();
			
		}
		
	}

}
