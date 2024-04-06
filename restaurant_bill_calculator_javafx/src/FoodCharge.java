///////////////////////////////////////////////////////////////////////
// Description: This is a JavaFX application which calculates        //
//              the food charge bill.   		        	         //                                           //
//                                                                   //
// Author: Abhishek Anand                                            //
//                                                                   //
///////////////////////////////////////////////////////////////////////

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class FoodCharge extends Application {

    // Create Fields and Label
    private TextField foodChargeField;
    private Label foodChargeLabel;
    private Label tipLabel;
    private Label salesTaxLabel;
    private Label totalBillLabel;
    private Label errorLabel;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {

        foodChargeLabel = new Label("ENTER FOOD CHARGE:");
        foodChargeField = new TextField();
        tipLabel = new Label("TIP: $0.00");
        salesTaxLabel = new Label("SALES TAX: $0.00");
        totalBillLabel = new Label("TOTAL: $0.00");
        errorLabel = new Label();

        // Create Button and action for button
        Button calculateButton = new Button("CALCULATE BILL");
        calculateButton.setOnAction(e -> {
            // Get the food charge entered by the user
            try {
                double foodCharge = Double.parseDouble(foodChargeField.getText());

                // Calculate the tip, salestax and total bill
                double tip = foodCharge * 0.18;
                double salesTax = foodCharge * 0.07;
                double totalBill = foodCharge + tip + salesTax;

                // Display the tip, sales tax and total bill
                tipLabel.setText("Tip: $" + String.format("%.2f", tip));
                salesTaxLabel.setText("Sales Tax: $" + String.format("%.2f", salesTax));
                totalBillLabel.setText("Total: $" + String.format("%.2f", totalBill));

                // set visiblity for labels
                tipLabel.setVisible(true);
                salesTaxLabel.setVisible(true);
                totalBillLabel.setVisible(true);
                errorLabel.setVisible(false);

            } catch (NumberFormatException ex) {
                errorLabel.setVisible(true);
                errorLabel.setText("Invalid input : " + foodChargeField.getText()
                        + "\nPlease enter correct food charge.");
                errorLabel.setStyle("-fx-font-weight: bold;");

                // clear the food charge field in case of invalid input
                foodChargeField.clear();

                // set visiblity for labels
                tipLabel.setVisible(false);
                salesTaxLabel.setVisible(false);
                totalBillLabel.setVisible(false);
            }

        });

        // Create a VBox and add the components to it
        VBox vbox = new VBox(10);
        vbox.getChildren().addAll(foodChargeLabel, foodChargeField, calculateButton, tipLabel, salesTaxLabel,
                totalBillLabel, errorLabel);
        vbox.setPadding(new Insets(20));

        // Create a Scene and add the VBox to it
        Scene scene = new Scene(vbox, 300, 260);
        primaryStage.setScene(scene);
        primaryStage.setTitle("BILL CALCULATOR");

        // Display the stage
        primaryStage.show();

    }
}