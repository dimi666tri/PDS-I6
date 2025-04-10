package util;

import javafx.scene.control.Alert;

public class AlertaUtil {
    public static void mostrarAlerta(Alert.AlertType tipo, String titulo,String mensagem){
        Alert alerta = new Alert(tipo);
        alerta.setTitle(titulo);
        alerta.setHeaderText(null);
        alerta.setContentText(mensagem);
        alerta.showAndWait();
    }
    
    public static void mostrarErro(String titulo, String mensagem) {
        mostrarAlerta(Alert.AlertType.ERROR, titulo, mensagem);
    }
    
    public static void mostrarAviso(String titulo, String mensagem) {
        mostrarAlerta(Alert.AlertType.WARNING, titulo, mensagem);
    }
    
    public static void mostrarInformacao(String titulo, String mensagem) {
        mostrarAlerta(Alert.AlertType.INFORMATION, titulo, mensagem);
    }
}
