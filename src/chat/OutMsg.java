package chat;

import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.text.Font;
import javafx.scene.text.Text;

public class OutMsg extends TextField implements Msg{

  public OutMsg(String text) {
    super(text);
//    this.setEditable(false);
//    this.setLayoutX(111.0f);
//    this.setLayoutX(7f);
    this.setFont(Font.font(20f));
    this.autosize();
    this.setStyle("-fx-background-color: #95A7DD; -fx-background-radius: 1em;");
//    this.setMaxWidth(100);
    this.setMaxWidth(200);
    this.setMaxHeight(10);
//    this.setWrapText(true);
//    this.setWrapText(true);

  }

  @Override
  public void showMsg() {

  }
}
