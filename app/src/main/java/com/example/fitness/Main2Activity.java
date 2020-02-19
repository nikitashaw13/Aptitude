package com.example.fitness;

import android.content.Intent;
import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.widget.RadioGroup;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

public class Main2Activity extends AppCompatActivity {

    private RadioGroup radioGroup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        RadioGroup radioGroup = (RadioGroup) findViewById(R.id.radioGroup);
        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener()
        {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if(checkedId==R.id.radioButton)
                {
                    Intent intent=new Intent(Main2Activity.this,ScrollingActivity.class);
                    startActivity(intent);
                }
                if(checkedId==R.id.radioButton2)
                {
                    Intent intent=new Intent(Main2Activity.this,Main4Activity.class);
                    startActivity(intent);
                }
            }
        });

        ConstraintLayout constraintLayout=findViewById(R.id.root);
        AnimationDrawable animationDrawable= (AnimationDrawable) constraintLayout.getBackground();
        animationDrawable.setEnterFadeDuration(2);
        animationDrawable.setExitFadeDuration(2000);
        animationDrawable.start();
    }
}
