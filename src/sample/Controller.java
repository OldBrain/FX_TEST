package sample;


import chat.FactoryMsg;
import chat.Msg;
import chat.OutMsg;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.text.TextFlow;
import javafx.stage.Stage;

import java.awt.*;


public class Controller {
//  private Msg msg = new OutMsg();
  private FactoryMsg factoryMsg = new FactoryMsg();

  @FXML
  private Button sendButton;
  @FXML
  public TextArea sendText;
  @FXML
//  Pane msgPanel;
  VBox msgPanel;

  public Controller() {

  }




  @FXML
  public void clickSendButton(javafx.event.ActionEvent actionEvent) {
    Msg msg = factoryMsg.greatMsg("out",sendText.getText());
    msgPanel.setAlignment(Pos.BASELINE_RIGHT);// Выравнивание внутри панели
    msgPanel.getChildren().add((TextField) msg);

    sendText.clear();

  }
}
