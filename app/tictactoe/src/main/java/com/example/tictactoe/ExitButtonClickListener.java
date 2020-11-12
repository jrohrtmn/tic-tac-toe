package com.example.tictactoe;

import android.view.View;

public class ExitButtonClickListener implements View.OnClickListener {
    /**
     * Called when a view has been clicked.
     *
     * @param v The view that was clicked.
     */
    @Override
    public void onClick(View v) {
        System.exit(0);
    }
}
