package application;
	
import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class Main extends Application {
	
	private AnchorPane ap_principal;
	public Stage stage;
	
	@Override
	public void start(Stage stage) throws IOException{
		
		FXMLLoader loader = new FXMLLoader(getClass().getResource("VistaCchannel.fxml"));

		ap_principal = (AnchorPane) loader.load();

		stage.setScene(new Scene(ap_principal));
		stage.setTitle("AID School");
		stage.show();
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
