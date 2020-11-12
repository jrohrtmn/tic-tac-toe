package com.example.tictactoe;

import android.app.AppComponentFactory;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class Example  extends AppCompatActivity {

    /**
     * Default constructor for AppCompatActivity. All Activities must have a default constructor
     * for API 27 and lower devices or when using the default
     * {@link AppComponentFactory}.
     */
    public Example() {
        super();
        Button button = this.findViewById(R.id.button2);

    }
}
