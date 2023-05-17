package com.example.pockethatori;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
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
        button.setOnClickListener(v -> openNewActivity1());
        button1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                Intent viewIntent =
                        new Intent("android.intent.action.VIEW",
                                Uri.parse("https://codeforces.com/"));
                startActivity(viewIntent);
            }
        });
    }

    public  void openNewActivity1(){
        Intent intent = new Intent(this,MainActivity.class );
        startActivity(intent);
    }

}
