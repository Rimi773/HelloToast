package com.virus.hellotoast;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity<textview> extends AppCompatActivity {
    private int Hello=0;
    private TextView Look;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void toast(View view) {
        Context context=getApplicationContext();
        Toast toast= Toast.makeText(context, R.string.message, Toast.LENGTH_SHORT);
        toast.show();
    }

    @SuppressLint("SetTextI18n")
    public void count(View view) {
        Look= (TextView) findViewById(R.id.show_count);
        Hello++;
        Look.setText(Integer.toString(Hello));
    }
}