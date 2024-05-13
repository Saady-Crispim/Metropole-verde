package gui;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;

public class FinalController {
	@FXML
	private Button btnMenu;
	@FXML
	private Label lblPontuacao1;
	@FXML
	private Label lblPontuacao2;
	@FXML
	private Label lblTop1;
	@FXML
	private Label lblTop2;
	@FXML
	private Button btnAttlabel;

	private Pontuacao pontuacao = Pontuacao.getInstance();

	@FXML
	public void initialize() {
		if (pontuacao.getPontuacao1() > pontuacao.getPontuacao2()) {
			lblPontuacao1.setText(Integer.toString(pontuacao.getPontuacao1()));
			lblPontuacao2.setText(Integer.toString(pontuacao.getPontuacao2()));
		} else {
			lblPontuacao1.setText(Integer.toString(pontuacao.getPontuacao2()));
			lblPontuacao2.setText(Integer.toString(pontuacao.getPontuacao1()));
		}
		if (pontuacao.getPontuacao1() > pontuacao.getPontuacao2()) {
			lblTop1.setText("Jogador 1 ");
			lblTop2.setText("Jogador 2 ");
		} else {
			lblTop1.setText("Jogador 2 ");
			lblTop2.setText("Jogador 1 ");
		}
	}

	@FXML
	public void onMenuAction(ActionEvent event) {
		Stage stage = (Stage) ((Button) event.getSource()).getScene().getWindow();
		try {
			Parent root = FXMLLoader.load(getClass().getResource("View.fxml"));
			Scene scene = new Scene(root);
			stage.setScene(scene);
			stage.show();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
