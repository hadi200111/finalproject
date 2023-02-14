package edu.cs.birzeit.pizzarecycler2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


import com.google.android.material.button.MaterialButton;

import java.util.ArrayList;

public class AcitivityLogin extends AppCompatActivity {


    private EditText username,password;
    private Button login,signup;
    public static String hisname,hisphone;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        SetupViews();
    }
    private void SetupViews(){
        username = findViewById(R.id.username);
        password = findViewById(R.id.password);
    }

    public void Login_Click(View view){
            String name = username.getText().toString();
            String pass = password.getText().toString();
            hisname = name;
            for(int i = 0; i < SignUpActivity.clients.size(); i++){
                if(name.equals(SignUpActivity.clients.get(i).getName())){
                    hisphone = SignUpActivity.clients.get(i).getEmail();
                }
            }

        boolean exist = false;
        for(int i = 0; i < SignUpActivity.clients.size(); i++){
            if(name.equals(SignUpActivity.clients.get(i).getName()) || pass.equals(SignUpActivity.clients.get(i).getPassword())){
                exist = true;
            }
        }

            if(name.equals("") || pass.equals("")){
                Context context = getApplicationContext();
                CharSequence text = "Blank Field";
                int duration = Toast.LENGTH_SHORT;

                Toast toast = Toast.makeText(context, text, duration);
                toast.show();
            } else if(name.equals("admin") && pass.equals("admin")){
                startActivity(new Intent(AcitivityLogin.this, MainActivity.class));
            }else if(exist){
                for(int i = 0; i < SignUpActivity.clients.size(); i++){
                    if(name.equals(SignUpActivity.clients.get(i).getName()) && pass.equals(SignUpActivity.clients.get(i).getPassword())){
                        startActivity(new Intent(AcitivityLogin.this, MainMenu.class));
                    }
                }
            }else{
                Context context = getApplicationContext();
                CharSequence text = "This Acount Doesn't Exist";
                int duration = Toast.LENGTH_SHORT;

                Toast toast = Toast.makeText(context, text, duration);
                toast.show();
            }
    }
    public void SignUp_Click(View view){
        startActivity(new Intent(AcitivityLogin.this, SignUpActivity.class));
    }
}


