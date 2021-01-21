package chat;

import javafx.scene.control.TextField;

import java.util.IdentityHashMap;

public class FactoryMsg {
  public Msg greatMsg(String typeOfMsg,String textMsg) {
    
    switch (typeOfMsg) {
      case "in":
        return new InMsg(textMsg);
      case "out":
        return new OutMsg(textMsg);
      default:
        return null;
    }

  }


}
