package lab2;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

public class FXMainPane extends VBox {

    // Declare components
    private Button btnHello, btnHowdy, btnChinese, btnClear, btnExit;
    private Label feedbackLabel;
    private TextField feedbackTextField;
    private HBox hBox1, hBox2;

    // Declare an instance of DataManager
    private DataManager dataManager;

    // Constructor
    FXMainPane() {
        // Instantiate the buttons
        btnHello = new Button("Hello");
        btnHowdy = new Button("Howdy");
        btnChinese = new Button("Chinese");
        btnClear = new Button("Clear");
        btnExit = new Button("Exit");

        // Instantiate the label and text field
        feedbackLabel = new Label("Feedback:");
        feedbackTextField = new TextField();

        // Instantiate the HBoxes
        hBox1 = new HBox();
        hBox2 = new HBox();

        // Add components to the HBoxes
        hBox1.getChildren().addAll(btnHello, btnHowdy, btnChinese, btnClear, btnExit);
        hBox2.getChildren().addAll(feedbackLabel, feedbackTextField);

        // Add the HBoxes to the VBox (this FXMainPane)
        this.getChildren().addAll(hBox1, hBox2);

        // Instantiate DataManager
        dataManager = new DataManager();

        // Set event handlers for buttons
        btnHello.setOnAction(new ButtonHandler());
        btnHowdy.setOnAction(new ButtonHandler());
        btnChinese.setOnAction(new ButtonHandler());
        btnClear.setOnAction(new ButtonHandler());
        btnExit.setOnAction(new ButtonHandler());
    }

    // Private inner class to handle button clicks
    private class ButtonHandler implements EventHandler<ActionEvent> {
        @Override
        public void handle(ActionEvent event) {
            if (event.getTarget() == btnHello) {
                System.out.println("Hello button clicked");
                feedbackTextField.setText(dataManager.getHello());
            } else if (event.getTarget() == btnHowdy) {
                System.out.println("Howdy button clicked");
                feedbackTextField.setText(dataManager.getHowdy());
            } else if (event.getTarget() == btnChinese) {
                System.out.println("Chinese button clicked");
                feedbackTextField.setText(dataManager.getChinese());
            } else if (event.getTarget() == btnClear) {
                System.out.println("Clear button clicked");
                feedbackTextField.setText("");
            } else if (event.getTarget() == btnExit) {
                System.out.println("Exit button clicked");
                Platform.exit();
                System.exit(0);
            }
        }
    }
}

