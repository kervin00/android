package com.tolentino.carlotools;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText One;
    private EditText Two;
    private Button Tools;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }
    private void initView() {
        One=findViewById(R.id.One);
        Two=findViewById(R.id.Two);
        Tools=findViewById(R.id.Tools);
        Tools.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int Num1 = Integer.parseInt(One.getText().toString());
                int Num2 = Integer.parseInt(Two.getText().toString());

                int sum = Num1 + Num2;
                Toast.makeText(MainActivity.this, "Number:" +String.valueOf(sum).toString(),Toast.LENGTH_SHORT).show();




            }
        });

    }
}
