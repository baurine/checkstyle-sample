package com.baurine.checkstylesample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    private void TestCheckStyle()
    throws RuntimeException
    {
        boolean TestBoolean = 5 > 6 &&
                4>5;
        int ret = 5 / 0;
    }
}
