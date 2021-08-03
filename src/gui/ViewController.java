package gui;

import gui.util.Alerts;
import javafx.fxml.FXML;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class ViewController {
	@FXML
	private Button btSubmit;

	@FXML
	private TextField txtUser;

	@FXML
	private TextField txtPassword;

	@FXML
	private Label lblAuth;

	@FXML
	public void onBSubmitAction() {
		String username = txtUser.getText();
		String password = txtPassword.getText();

		if ((username=="oi") & (password=="tchau")) {
			lblAuth.setText("Authentication succeeded");
			Alerts.showAlert("Logged in", null, "Credentials are valid.", AlertType.INFORMATION);

		} else {
			Alerts.showAlert("Error authenticating", null, txtPassword.getText(), AlertType.ERROR);
		}

	}
}
