package com.example.jay.calculator2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.addbtn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText su1 = (EditText) findViewById(R.id.su1);
                EditText su2 = (EditText) findViewById(R.id.su2);
                TextView result = (TextView) findViewById(R.id.result);
                int first = Integer.parseInt(su1.getText().toString());
                int second = Integer.parseInt(su2.getText().toString());
                result.setText(result.getText()+ "\n" + first + "+" + second + "=" + Integer.toString(first + second));
            }
        });
        findViewById(R.id.subtractbtn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText su1 = (EditText) findViewById(R.id.su1);
                EditText su2 = (EditText) findViewById(R.id.su2);
                TextView result = (TextView) findViewById(R.id.result);
                int first = Integer.parseInt(su1.getText().toString());
                int second = Integer.parseInt(su2.getText().toString());
                result.setText(result.getText()+ "\n" + first + "-" + second + "=" + Integer.toString(first - second));
            }
        });
        findViewById(R.id.multiplybtn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText su1 = (EditText) findViewById(R.id.su1);
                EditText su2 = (EditText) findViewById(R.id.su2);
                TextView result = (TextView) findViewById(R.id.result);
                int first = Integer.parseInt(su1.getText().toString());
                int second = Integer.parseInt(su2.getText().toString());
                result.setText(result.getText()+ "\n" + first + "*" + second + "=" + Integer.toString(first * second));
            }
        });
        findViewById(R.id.dividebtn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText su1 = (EditText) findViewById(R.id.su1);
                EditText su2 = (EditText) findViewById(R.id.su2);
                TextView result = (TextView) findViewById(R.id.result);
                int first = Integer.parseInt(su1.getText().toString());
                int second = Integer.parseInt(su2.getText().toString());
                result.setText(result.getText()+ "\n" + first + "/" + second + "=" + Integer.toString(first / second));
            }
        });
    }
}
