package Presenter;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.File;
import java.io.IOException;

public class TelaController {
    
    public void irParaTelaLancamentos(){
        try {
            FXMLLoader loader = new FXMLLoader(new File("View/telaLancamento.fxml").toURI().toURL());
            Parent root = loader.load();

            // Obtém o Stage atual e muda a Scene
            Stage stage = new Stage();
            stage.setTitle("Tela de Lançamentos");
            stage.setScene(new Scene(root));
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void irParaTelaEditar() {
        try {
            FXMLLoader loader = new FXMLLoader(new File("View/telaEdicao.fxml").toURI().toURL());
            Parent root = loader.load();

            // Obtém o Stage atual e muda a Scene
            Stage stage = new Stage();
            stage.setTitle("Tela de Edição");
            stage.setScene(new Scene(root));
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
}
