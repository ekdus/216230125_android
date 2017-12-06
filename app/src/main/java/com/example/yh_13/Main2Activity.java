package com.example.yh_13;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {
    EditText e1, e2;
    Button b1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        setTitle("price");
        init();
    }

    void init() {
        e1 = (EditText) findViewById(R.id.editText);
        e2 = (EditText) findViewById(R.id.editText2);
        b1 = (Button) findViewById(R.id.btn);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String price = e1.getText().toString();
                String count = e2.getText().toString();
                int result = Integer.parseInt(price) * Integer.parseInt(count);

                Toast.makeText(getApplicationContext(), "price is " + result, Toast.LENGTH_SHORT).show();
            }
        });
    }
}