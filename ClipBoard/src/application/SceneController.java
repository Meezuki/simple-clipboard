package application;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;



public class SceneController {
	
	private Stage stage;
	private Scene scene;
	private Parent root;
	
	
	@FXML
	public Label label_content;
	
	@FXML
	public TextField textInputField;
	
	public void save(ActionEvent e) throws IOException{
		String inputText = textInputField.getText();
		FileHandling.create_file("clipboardContent");
		FileHandling.write_file("clipboardContent", inputText);
		initialize();
	}
	
	
	public void initialize() throws IOException {
		String labelText = FileHandling.read_file("clipboardContent");
		label_content.setText(labelText);
		
	}
	
	static void copyToClipboard(String textToBeCopied) {
	    java.awt.Toolkit.getDefaultToolkit().getSystemClipboard()
	        .setContents(new java.awt.datatransfer.StringSelection(textToBeCopied), null);
	}
	
	public void copy(ActionEvent e) throws IOException {
		String text = FileHandling.read_file("clipboardContent");
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

 
