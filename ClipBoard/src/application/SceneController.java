package application;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class SceneController {
	private Stage stage;
	private Scene scene;
	private Parent root;
	
	static void copyToClipboard(String text) {
	    java.awt.Toolkit.getDefaultToolkit().getSystemClipboard()
	        .setContents(new java.awt.datatransfer.StringSelection(text), null);
	}
	
	public void copy(ActionEvent e) {
		String text = "to be implemented";
		copyToClipboard(text);
	}
	
	
	
	@FXML
	public void switchToMain(ActionEvent event) throws IOException {
		Parent root = FXMLLoader.load(getClass().getResource("Main.fxml"));
		stage = (Stage) ((Node)event.getSource()).getScene().getWindow();
		scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
	}
	
	@FXML
	public void switchToScene1(ActionEvent event) throws IOException {
		Parent root = FXMLLoader.load(getClass().getResource("Scene1.fxml"));
		stage = (Stage) ((Node)event.getSource()).getScene().getWindow();
		scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
	}
	

}

//public class SceneController {
//    static private Stage stage;
//    static private Scene scene1;
//    static private Scene scene2;
//    @FXML
//    private void switchToScene1(ActionEvent event) {
//        stage.setScene(scene1);
//        stage.show();
//        System.out.println("Stage: " + stage);
//        System.out.println("Scene 1: " + scene1);
//    }
//    @FXML
//    private void switchToScene2(ActionEvent event) throws IOException {
//        if (scene2 == null) {
//            Parent root = FXMLLoader.load(this.getClass().getResource("scene2.fxml"));
//            scene2 = new Scene(root);
//            scene1 = ((Node)event.getSource()).getScene();
//            stage = (Stage) scene1.getWindow();
//        }
//        stage.setScene(scene2);
//        stage.show();
//        System.out.println("Stage: " + stage);
//        System.out.println("Scene 2: " + scene2);
//    }
//}

 
