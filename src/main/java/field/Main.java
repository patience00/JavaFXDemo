package main.java.field;

import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;

public class Main {// copyright w  w w .Yi I b A I .COm 
  public static void main(String[] args) {
    SimpleIntegerProperty xProperty = new SimpleIntegerProperty(0);

    // Adding a change listener with anonymous inner class
    xProperty.addListener(new ChangeListener<Number>() {
      @Override
      public void changed(ObservableValue<? extends Number> ov, Number oldVal,
          Number newVal) {
        System.out.println("old value:"+oldVal);
        System.out.println("new value:"+newVal);
      }
    });

    // Adding a change listener with lambda expression
    xProperty.addListener((ObservableValue<? extends Number> ov, Number oldVal,
        Number newVal) -> {
          System.out.println("old value:"+oldVal);
          System.out.println("new value:"+newVal);
      });
  }
}