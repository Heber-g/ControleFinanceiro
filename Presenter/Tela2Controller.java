package Presenter;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Tela2Controller {
    public void voltarParaTelaInicial(ActionEvent event) {
        try {
            Parent novaTela = FXMLLoader.load(getClass().getResource("/View/telaInicial.fxml"));
            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();

            Scene scene = stage.getScene();
            scene.setRoot(novaTela);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
