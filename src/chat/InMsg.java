package chat;

import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.Text;

import java.awt.*;

public class InMsg extends TextField implements Msg{
//********* Пока не виден на экране
  public InMsg(String text) {
    super(text);
    this.setFont(Font.font(10f));
    this.setStyle("-fx-background-color: #95A7DD; -fx-background-radius: 1em;");

//    this.autosize();

  }

  @Override
  public void showMsg() {

  }
}
