# Controle Financeiro
O projeto visa a contrução de uma aplicação Java desktop para o controle financeiro de uma instituição religiosa sem fins lucrativos.
O sistema funcionará através da criação e modificação de um arquivo Excel, o qual será usado para guardar os dados da movimentação monetária da instituição.
O projeto utiliza a biblioteca JavaFX para criação das telas da aplicação, Scene Builder para auxiliar no desenvolvimento das telas usando JavaFX e python para manipular o arquivo Excel


<?xml version="1.0" encoding="UTF-8"?>
<?import javafx.scene.control.Button?>
<?import javafx.scene.layout.VBox?>

<VBox spacing="10" alignment="CENTER" xmlns="http://javafx.com/javafx/17" xmlns:fx="http://javafx.com/fxml/1" fx:controller="Presenter.Tela2Controller">
    <Button text="Voltar para a Tela Inicial" onAction="#voltarParaTelaInicial" />
</VBox>
