package application;

import java.io.IOException;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class Controlador {
	
	@FXML
	public ImageView imagen;
	
	@FXML
	public void nuevaVentana() {
		
		try {
			
            FXMLLoader loader = new FXMLLoader(getClass().getResource("popupImage.fxml"));
            AnchorPane page = (AnchorPane) loader.load();
            Stage sendStage = new Stage();    
            Scene scene = new Scene(page);
            sendStage.setScene(scene);          
            sendStage.show();
		

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	@FXML
	private void windowClose() {
		Stage thisStage = (Stage) imagen.getScene().getWindow();
	    thisStage.close();	
	}
	
	@FXML
	private void handleClose() {
	        System.exit(0);
	}
}
