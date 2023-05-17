package com.example.pockethatori;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.view.View;
import android.os.Bundle;
import android.widget.Button;
public class Menu extends AppCompatActivity {
    Button button;
    Button button1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        button = (Button) findViewById(R.id.calculator_button);
        button1 = (Button) findViewById(R.id.API_button);
        button1.setOnClickListener(v -> openNewActivity1());
        button.setOnClickListener(v -> openNewActivity());
    }

    public  void openNewActivity1(){
        Intent intent = new Intent(this,API.class );
        startActivity(intent);
    }
    public void openNewActivity(){
        Intent intent = new Intent(this, Calculator.class);
        startActivity(intent);
    }
}


