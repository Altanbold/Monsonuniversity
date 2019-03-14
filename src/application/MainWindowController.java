package application;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class MainWindowController {

	@FXML
	private Button btn2;

	@FXML
	private Button btn3;

	@FXML
	private Button btn5;

	@FXML
	private Button btn6;

	@FXML
	private Button btn7;

	@FXML
	private Button btn4;

	@FXML
	private Button btn8;

	@FXML
	private Button btn1;

	@FXML
	void handleClickBtn1(ActionEvent event) {
		Parent root;
		try {
			root = FXMLLoader.load(getClass().getResource("SampleFxml.fxml"));
			Scene secondScene = new Scene(root, 550, 300);
			Stage newWindow = new Stage();
			newWindow.setTitle("Simple Cash System - Admin");
			newWindow.setScene(secondScene);
			newWindow.show();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	@FXML
	void handleClickBtn2(ActionEvent event) {
		Parent root;
		try {
			root = FXMLLoader.load(getClass().getResource("SampleFxml.fxml"));
			Scene secondScene = new Scene(root, 550, 300);
			Stage newWindow = new Stage();
			newWindow.setTitle("Simple Cash System - Admin");
			newWindow.setScene(secondScene);
			newWindow.show();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@FXML
	void handleClickBtn3(ActionEvent event) {
		Parent root;
		try {
			root = FXMLLoader.load(getClass().getResource("SampleFxml.fxml"));
			Scene secondScene = new Scene(root, 550, 300);
			Stage newWindow = new Stage();
			newWindow.setTitle("Simple Cash System - Admin");
			newWindow.setScene(secondScene);
			newWindow.show();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@FXML
	void handleClickBtn4(ActionEvent event) {
		Parent root;
		try {
			root = FXMLLoader.load(getClass().getResource("SampleFxml.fxml"));
			Scene secondScene = new Scene(root, 550, 300);
			Stage newWindow = new Stage();
			newWindow.setTitle("Simple Cash System - Admin");
			newWindow.setScene(secondScene);
			newWindow.show();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@FXML
	void handleClickBtn5(ActionEvent event) {
		Parent root;
		try {
			root = FXMLLoader.load(getClass().getResource("SampleFxml.fxml"));
			Scene secondScene = new Scene(root, 550, 300);
			Stage newWindow = new Stage();
			newWindow.setTitle("Simple Cash System - Admin");
			newWindow.setScene(secondScene);
			newWindow.show();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@FXML
	void handleClickBtn6(ActionEvent event) {
		Parent root;
		try {
			root = FXMLLoader.load(getClass().getResource("SampleFxml.fxml"));
			Scene secondScene = new Scene(root, 550, 300);
			Stage newWindow = new Stage();
			newWindow.setTitle("Simple Cash System - Admin");
			newWindow.setScene(secondScene);
			newWindow.show();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@FXML
	void handleClickBtn7(ActionEvent event) {
		Parent root;
		try {
			root = FXMLLoader.load(getClass().getResource("SampleFxml.fxml"));
			Scene secondScene = new Scene(root, 550, 300);
			Stage newWindow = new Stage();
			newWindow.setTitle("Simple Cash System - Admin");
			newWindow.setScene(secondScene);
			newWindow.show();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@FXML
	void handleClickBtn8(ActionEvent event) {
		Stage stage = (Stage) btn1.getScene().getWindow();
		// do what you have to do
		stage.close();
	}

}
