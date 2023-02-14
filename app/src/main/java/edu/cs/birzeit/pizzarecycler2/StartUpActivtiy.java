package edu.cs.birzeit.pizzarecycler2;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

public class StartUpActivtiy extends AppCompatActivity {
    private TextView txt;
    private ImageView img2;
    private Animation top,bottom;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start_up_activtiy);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);

        txt=findViewById(R.id.txt2);
        img2=findViewById(R.id.img2);
        top= AnimationUtils.loadAnimation(this,R.anim.top_ani);
        bottom= AnimationUtils.loadAnimation(this,R.anim.bottom_ani);
        img2.setAnimation(top);
        txt.setAnimation(bottom);
        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent =  new Intent(StartUpActivtiy.this,AcitivityLogin.class);
                startActivity(intent);
                finish();
            }
        },3000);

    }
}