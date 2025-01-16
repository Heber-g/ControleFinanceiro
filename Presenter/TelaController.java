package Presenter;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.Node;
import javafx.stage.Stage;

import java.io.File;
import java.io.IOException;

public class TelaController {
    
    public void irParaTelaLancamentos(javafx.event.ActionEvent event) {
        try {
            //Carregar o arquivo FXML da nova tela
            Parent novaTela = FXMLLoader.load(getClass().getResource("/View/telaLancamento.fxml"));
            //Aqui se recupera o Stage a partir do evento que disparou o método.
            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();

            //Aqui substitui-se o root da cena atual pela nova tela a ser carregada
            Scene scene = stage.getScene();
            scene.setRoot(novaTela);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void irParaTelaEditar(javafx.event.ActionEvent event) {
        try {
            Parent novaTela = FXMLLoader.load(getClass().getResource("/View/telaEdicao.fxml"));
            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();

            Scene scene = stage.getScene();
            scene.setRoot(novaTela);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
}
