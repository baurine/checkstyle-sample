package com.baurine.checkstylesample;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    private void testCheckStyle()
            throws RuntimeException {
        boolean testBoolean = 5 > 6
                && 4 > 5;
        int ret = 5 / 0;
    }
}
