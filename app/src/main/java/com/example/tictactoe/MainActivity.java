package com.example.tictactoe;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.TypedValue;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private int x = 1080;
    private int y = 1500;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        RelativeLayout relativeLayout = new RelativeLayout(this);

        // Button aus der view erstellen
        Button button = (Button)this.findViewById(R.id.button);



        // Text
        TextView textView = new TextView(this);
        textView.setText(R.string.hello_world);
        RelativeLayout.LayoutParams txtDetails = new RelativeLayout.LayoutParams(RelativeLayout.LayoutParams.WRAP_CONTENT, RelativeLayout.LayoutParams.WRAP_CONTENT);
        txtDetails.addRule(RelativeLayout.CENTER_HORIZONTAL);
        txtDetails.addRule(RelativeLayout.CENTER_VERTICAL);
        int i = 42;
        textView.setId(i);

        // Button
        Button buttonStart = new Button(this);
        buttonStart.setText(R.string.start_game);

        RelativeLayout.LayoutParams buttonDetails = new RelativeLayout.LayoutParams(RelativeLayout.LayoutParams.WRAP_CONTENT, RelativeLayout.LayoutParams.WRAP_CONTENT);
        buttonDetails.addRule(RelativeLayout.ABOVE, 42);
        buttonDetails.addRule(RelativeLayout.CENTER_HORIZONTAL);

        int displayIndependentPixel = (int) TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, 500, this.getResources().getDisplayMetrics());
        buttonStart.setWidth(displayIndependentPixel);


        buttonStart.setOnClickListener(
                new Button.OnClickListener() {
                    /**
                     * Called when a view has been clicked.
                     *
                     * @param v The view that was clicked.
                     */
                    @Override
                    public void onClick(View v) {
                        buttonStart.setText("You did it!");
                    }
                }
        );

        buttonStart.setOnLongClickListener(
                new View.OnLongClickListener() {
                    /**
                     * Called when a view has been clicked and held.
                     *
                     * @param v The view that was clicked and held.
                     * @return true if the callback consumed the long click, false otherwise.
                     */
                    @Override
                    public boolean onLongClick(View v) {
                        buttonStart.setText("Woah, pass auf! mach micht nicht kaputt.");

                        return true;
                    }
                }
        );
        relativeLayout.addView(textView, txtDetails);
        relativeLayout.addView(buttonStart, buttonDetails);

        setContentView(relativeLayout);
    }
}