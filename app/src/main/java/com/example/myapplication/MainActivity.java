package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {
    private EditText obj_a, obj_b;
    private TextView res;
    private Button btn1, btn2, btn3, btn4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);

        obj_a = findViewById(R.id.string_11);
        obj_b = findViewById(R.id.string_22);

        btn1 = findViewById(R.id.button22);
        btn2 = findViewById(R.id.button33);
        btn3 = findViewById(R.id.button44);
        btn4 = findViewById(R.id.button55);
        res = findViewById(R.id.string_33);
        View.OnClickListener onClickListener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (v.getId()) {
                    case R.id.button22:
                        int a = Integer.parseInt(obj_a.getText().toString());
                        int b = Integer.parseInt(obj_b.getText().toString());
                        int c = a + b;
                        res.setText(Integer.toString(c));
                        break;
                    case R.id.button33:
                        a = Integer.parseInt(obj_a.getText().toString());
                        b = Integer.parseInt(obj_b.getText().toString());
                        c = a - b;
                        res.setText(Integer.toString(c));
                        break;
                    case R.id.button44:
                        a = Integer.parseInt(obj_a.getText().toString());
                        b = Integer.parseInt(obj_b.getText().toString());
                        c = a * b;
                        res.setText(Integer.toString(c));
                        break;
                    case R.id.button55:
                        a = Integer.parseInt(obj_a.getText().toString());
                        b = Integer.parseInt(obj_b.getText().toString());
                        c = a / b;
                        res.setText(Integer.toString(c));
                        break;
                }
            }
        };
        btn1.setOnClickListener(onClickListener);
        btn2.setOnClickListener(onClickListener);
        btn3.setOnClickListener(onClickListener);
        btn4.setOnClickListener(onClickListener);

    }


}

