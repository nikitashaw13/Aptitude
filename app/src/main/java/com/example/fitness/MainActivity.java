package com.example.fitness;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.fitness.ui.login.LoginActivity;

public class MainActivity extends AppCompatActivity {

    private Button btn,btn1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn= (Button)findViewById(R.id.button);
        btn1=(Button) findViewById(R.id.button2);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this, LoginActivity.class);
                startActivity(intent);
            }
        });
         btn1.setOnClickListener(new View.OnClickListener(){
             @Override
             public void onClick(View v){
                 Intent intent=new Intent(MainActivity.this,Main3Activity.class);
                 startActivity(intent);

             }

         });
    }
}
