package com.example.radekbunda.userinput;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.text.NumberFormat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    int numberOfCoffees = 0;

    /**
     * This method is called when button is touched.
     */

    public void submitOrder(View view) {
        display(numberOfCoffees);
        displayPrice(numberOfCoffees * 5);
        String priceMessage = "Thanks for order.";
        priceMessage = priceMessage + " \nObjednáno bylo " + numberOfCoffees + " hrnků kávy.";
        displayMessage(priceMessage);
    }

    /**
     * This method is called when + button is touched.
     */

    public void increment(View view) {
        numberOfCoffees = numberOfCoffees + 1;
        display(numberOfCoffees);
        String priceMessage = "";
        displayMessage(priceMessage);

    }

    /**
     * This method is called when - button is touched.
     */

    public void decrement(View view) {
        numberOfCoffees = numberOfCoffees - 1;
        display(numberOfCoffees);
        String priceMessage = "";
        displayMessage(priceMessage);

    }

    /**
     * This method displays the given quantity on the screen.
     */

    private void display(int number) {
        TextView quantityTextView = findViewById(R.id.quantityInput);
        quantityTextView.setText("" + number);
    }

    /**
     * This method displays the given price on the screen.
     */
    private void displayPrice(int number) {
        TextView priceTextView = findViewById(R.id.price_text_view);
        priceTextView.setText(NumberFormat.getCurrencyInstance().format(number));
    }

    /**
     * This method displays the given text on the screen.
     */
    private void displayMessage(String message) {
        TextView priceTextView = findViewById(R.id.price_string_view);
        priceTextView.setText(message);
    }
}
