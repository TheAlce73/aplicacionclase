package application;



import Centros.AnadirCentros;
import Centros.ModificarCentros;
import Centros.VentanaCentroController;
import Ciclo.VentanaAnadirCiclo;
import Ciclo.VentanaCicloController;
import Ciclo.VentanaModificarCiclo;
import Conexion.Centros;
import Conexion.Ciclo;
import Conexion.FamiliaProfesional;
import Conexion.Tutores;
import Conexion.Usuarios;
import FamiliaProfesional.VentanaAnadirFP;
import FamiliaProfesional.VentanaFamiliaPController;
import FamiliaProfesional.VentanaModificarFP;
import Tutores.AnadirTutor;
import Tutores.ModificarTutor;
import Tutores.VentanaTutoresController;
import UsuariosAdmin.AnadirUsuario;
import UsuariosAdmin.ModificarUsuario;
import UsuariosAdmin.VentanaUsuarios;
import javafx.application.Application;

import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.TableView;
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
	
	//USUARIOS
	
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
			System.out.println("HOla");
			
		     FXMLLoader loader = new FXMLLoader(Main.class.getResource("../UsuariosAdmin/UsuariosAnadir.fxml"));
		     System.out.println("HOla");
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

	public void MostrarModificarUsuario(TableView<Usuarios> tabla, Usuarios selectedItem) {
		try {
			
		     FXMLLoader loader = new FXMLLoader(Main.class.getResource("../UsuariosAdmin/UsuariosModificar.fxml"));
	            AnchorPane ventanaDos = (AnchorPane) loader.load();
	            Stage ventana = new Stage();
	            ventana.setTitle("Paguina Modificar Usuario");

	            ventana.initOwner(stagePrincipal);
	            Scene scene = new Scene(ventanaDos);
	            ventana.setScene(scene);

	            ModificarUsuario controller2 = loader.getController();
	            controller2.setProgramaInicioSesion(this,ventana,tabla, selectedItem);

	            ventana.show();
            
           } catch(Exception e) {
			e.printStackTrace();
			
		}
		
	}
	
	//TUTORES
	
	public void MostrarVentanaTutores() {
		try {
			
		     FXMLLoader loader = new FXMLLoader(Main.class.getResource("../Tutores/Tutores.fxml"));
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
	public void MostrarModificarTutores(Tutores selectedItem) {
		try {
			
		     FXMLLoader loader = new FXMLLoader(Main.class.getResource("../Tutores/TutoresModificar.fxml"));
	            AnchorPane ventanaDos = (AnchorPane) loader.load();
	            Stage ventana = new Stage();
	            ventana.setTitle("Paguina Administrador");

	            ventana.initOwner(stagePrincipal);
	            Scene scene = new Scene(ventanaDos);
	            ventana.setScene(scene);

	            ModificarTutor controller2 = loader.getController();
	            controller2.setProgramaInicioSesion(this,ventana,selectedItem);

	            ventana.show();
            
           } catch(Exception e) {
			e.printStackTrace();
			
		}
		
	}
	public void MostrarAnadirTutores() {
		try {
			
		     FXMLLoader loader = new FXMLLoader(Main.class.getResource("../Tutores/TutoresAnadir.fxml"));
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
	
	//CENTROS
	
	public void MostrarVentanaCentro() {
		try {
			
		     FXMLLoader loader = new FXMLLoader(Main.class.getResource("../Centros/Centros.fxml"));
	            AnchorPane ventanaDos = (AnchorPane) loader.load();
	            Stage ventana = new Stage();
	            ventana.setTitle("Paguina Administrador");

	            ventana.initOwner(stagePrincipal);
	            Scene scene = new Scene(ventanaDos);
	            ventana.setScene(scene);

	            VentanaCentroController controller2 = loader.getController();
	            controller2.setProgramaInicioSesion(this,ventana);

	            ventana.show();
            
           } catch(Exception e) {
			e.printStackTrace();
			
		}
		
	}
	public void MostrarAnadirCentros() {
		try {
			
		     FXMLLoader loader = new FXMLLoader(Main.class.getResource("../Centros/CentrosAnadir.fxml"));
	            AnchorPane ventanaDos = (AnchorPane) loader.load();
	            Stage ventana = new Stage();
	            ventana.setTitle("Paguina Administrador");

	            ventana.initOwner(stagePrincipal);
	            Scene scene = new Scene(ventanaDos);
	            ventana.setScene(scene);

	            AnadirCentros controller2 = loader.getController();
	            controller2.setProgramaInicioSesion(this,ventana);

	            ventana.show();
            
           } catch(Exception e) {
			e.printStackTrace();
			
		}
		
	}
	
	public void MostrarModificarCentros(Centros selectedItem) {
		try {
			
		     FXMLLoader loader = new FXMLLoader(Main.class.getResource("../Centros/CentrosModificar.fxml"));
	            AnchorPane ventanaDos = (AnchorPane) loader.load();
	            Stage ventana = new Stage();
	            ventana.setTitle("Paguina Administrador");

	            ventana.initOwner(stagePrincipal);
	            Scene scene = new Scene(ventanaDos);
	            ventana.setScene(scene);

	            ModificarCentros controller2 = loader.getController();
	            controller2.setProgramaInicioSesion(this,ventana,selectedItem);

	            ventana.show();
            
           } catch(Exception e) {
			e.printStackTrace();
			
		}
		
	}
	
	//FP
	
	public void MostrarVentanaFamiliaProfesional() {
		try {
			
		     FXMLLoader loader = new FXMLLoader(Main.class.getResource("../FamiliaProfesional/FamiliaProfesional.fxml"));
	            AnchorPane ventanaDos = (AnchorPane) loader.load();
	            Stage ventana = new Stage();
	            ventana.setTitle("Paguina Administrador");

	            ventana.initOwner(stagePrincipal);
	            Scene scene = new Scene(ventanaDos);
	            ventana.setScene(scene);

	            VentanaFamiliaPController controller2 = loader.getController();
	            controller2.setProgramaInicioSesion(this,ventana);

	            ventana.show();
            
           } catch(Exception e) {
			e.printStackTrace();
			
		}
		
	}
	
	public void MostrarAnadirFP() {
		try {
			
		     FXMLLoader loader = new FXMLLoader(Main.class.getResource("../FamiliaProfesional/AnadirFP.fxml"));
	            AnchorPane ventanaDos = (AnchorPane) loader.load();
	            Stage ventana = new Stage();
	            ventana.setTitle("Paguina Administrador");

	            ventana.initOwner(stagePrincipal);
	            Scene scene = new Scene(ventanaDos);
	            ventana.setScene(scene);

	            VentanaAnadirFP controller2 = loader.getController();
	            controller2.setProgramaInicioSesion(this,ventana);

	            ventana.show();
            
           } catch(Exception e) {
			e.printStackTrace();
			
		}
		
	}
	
	public void MostrarModificarFP(FamiliaProfesional selectedItem) {
		try {
			
		     FXMLLoader loader = new FXMLLoader(Main.class.getResource("../FamiliaProfesional/ModificarFP.fxml"));
	            AnchorPane ventanaDos = (AnchorPane) loader.load();
	            Stage ventana = new Stage();
	            ventana.setTitle("Paguina Administrador");

	            ventana.initOwner(stagePrincipal);
	            Scene scene = new Scene(ventanaDos);
	            ventana.setScene(scene);

	            VentanaModificarFP controller2 = loader.getController();
	            controller2.setProgramaInicioSesion(this,ventana,selectedItem);

	            ventana.show();
            
           } catch(Exception e) {
			e.printStackTrace();
			
		}
		
	}
	
	//CICLOS
	
	public void MostrarVentanaCiclos() {
		try {
			
		     FXMLLoader loader = new FXMLLoader(Main.class.getResource("../Ciclo/Ciclo.fxml"));
	            AnchorPane ventanaDos = (AnchorPane) loader.load();
	            Stage ventana = new Stage();
	            ventana.setTitle("Paguina Administrador");

	            ventana.initOwner(stagePrincipal);
	            Scene scene = new Scene(ventanaDos);
	            ventana.setScene(scene);

	            VentanaCicloController controller2 = loader.getController();
	            controller2.setProgramaInicioSesion(this,ventana);

	            ventana.show();
            
           } catch(Exception e) {
			e.printStackTrace();
			
		}
		
	}

	public void MostrarAnadirCiclo() {
		try {
			
		     FXMLLoader loader = new FXMLLoader(Main.class.getResource("../Ciclo/AnadirCiclo.fxml"));
	            AnchorPane ventanaDos = (AnchorPane) loader.load();
	            Stage ventana = new Stage();
	            ventana.setTitle("Paguina Administrador");

	            ventana.initOwner(stagePrincipal);
	            Scene scene = new Scene(ventanaDos);
	            ventana.setScene(scene);

	            VentanaAnadirCiclo controller2 = loader.getController();
	            controller2.setProgramaInicioSesion(this,ventana);

	            ventana.show();
            
           } catch(Exception e) {
			e.printStackTrace();
			
		}

	}
	
	public void MostrarModificarCiclo(Ciclo selectedItem) {
		try {
			
		     FXMLLoader loader = new FXMLLoader(Main.class.getResource("../Ciclo/ModificarCiclo.fxml"));
	            AnchorPane ventanaDos = (AnchorPane) loader.load();
	            Stage ventana = new Stage();
	            ventana.setTitle("Paguina Administrador");

	            ventana.initOwner(stagePrincipal);
	            Scene scene = new Scene(ventanaDos);
	            ventana.setScene(scene);

	            VentanaModificarCiclo controller2 = loader.getController();
	            controller2.setProgramaInicioSesion(this,ventana,selectedItem);

	            ventana.show();
            
           } catch(Exception e) {
			e.printStackTrace();
			
		}
		
	}
}