package com.ll.fy.test;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button button;
    String b;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = (Button) findViewById(R.id.button);
        button.setText("A");
    }

    public void click(View view) {
        Toast.makeText(this, "hello ab  ww", Toast.LENGTH_LONG).show();
        b = (String) button.getText();
        if (b.equals("A")) {
            button.setText("B");
        } else {
            button.setText("A");
        }

    }
}
