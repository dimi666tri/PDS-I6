package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class LoginController {
    private Stage stageLogin;
    @FXML
    private Button bntFechar;

    @FXML
    private Button bntLogar;

    @FXML
    private Label lblDB;

    @FXML
    private PasswordField txtSenha;

    @FXML
    private TextField txtUsuario;
    
    @FXML
    void bntFecharClick(ActionEvent event) {
        System.exit(0);
    }

    @FXML
    void bntLogarClick(ActionEvent event) {
        
    }
    
    public void setStage(Stage stage){
        this.stageLogin = stage;
    }
    
    public void abrirJanela (){
        System.out.println("Janela exibida");
    }
}
