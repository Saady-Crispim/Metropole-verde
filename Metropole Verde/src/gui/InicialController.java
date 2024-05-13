	package gui;
	
	import java.io.IOException;
	
	import javafx.event.ActionEvent;
	import javafx.fxml.FXML;
	import javafx.fxml.FXMLLoader;
	import javafx.scene.Parent;
	import javafx.scene.Scene;
	import javafx.scene.control.Button;
	import javafx.stage.Stage;
	
	public class InicialController {
	
	    @FXML
	    private Button View2;
	    @FXML
	    private Button regras;
	    @FXML
	    private Button ConstCat;
	    @FXML
	    private Button btnVoltar;
	
	    @FXML
	    public void onRegrasAction(ActionEvent event) {
	        Stage stage = (Stage) regras.getScene().getWindow();
	        try {
	            Parent root = FXMLLoader.load(getClass().getResource("regras.fxml"));
	            Scene scene = new Scene(root);
	            stage.setScene(scene);
	            stage.show();
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	    }
	    @FXML
	    public void onConstCatAction(ActionEvent event) {
	        Stage stage = (Stage) ConstCat.getScene().getWindow();
	        try {
	            Parent root = FXMLLoader.load(getClass().getResource("ConstCatalago.fxml"));
	            Scene scene = new Scene(root);
	            stage.setScene(scene);
	            stage.show();
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	    }
	
	    @FXML
	    public void onView2Action(ActionEvent event) {
	        Stage stage = (Stage) View2.getScene().getWindow();
	        try {
	            Parent root = FXMLLoader.load(getClass().getResource("JogadaView.fxml"));
	            Scene scene = new Scene(root);
	            stage.setScene(scene);
	            stage.show();
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	    }
	
	    @FXML
	    public void onVoltarAction(ActionEvent event) {
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
