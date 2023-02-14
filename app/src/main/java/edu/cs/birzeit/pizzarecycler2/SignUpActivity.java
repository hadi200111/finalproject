package edu.cs.birzeit.pizzarecycler2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ComponentActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class SignUpActivity extends AppCompatActivity{

    private EditText sigName,sigEmail,sigPassword;
    public static ArrayList<Client> clients = new ArrayList<Client>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);
        setupViews();
    }
    private void setupViews(){
        sigName = findViewById(R.id.SignName);
        sigEmail = findViewById(R.id.SignEmail);
        sigPassword = findViewById(R.id.SignPassword);
    }

    public void Sign_Click(View view){
        String name = sigName.getText().toString();
        String email = sigEmail.getText().toString();
        String password = sigPassword.getText().toString();

        boolean exist = false;
        for(int i = 0; i < clients.size(); i++){
            if(name.equals(clients.get(i).getName()) || email.equals(clients.get(i).getEmail())){
                exist = true;
            }
        }
        if(name.equals("") || email.equals("") || password.equals("")){
            Context context = getApplicationContext();
            CharSequence text = "Blank Field";
            int duration = Toast.LENGTH_SHORT;

            Toast toast = Toast.makeText(context, text, duration);
            toast.show();
        }else if(exist){
            Context context = getApplicationContext();
            CharSequence text = "Name or Phone Already Exists";
            int duration = Toast.LENGTH_SHORT;

            Toast toast = Toast.makeText(context, text, duration);
            toast.show();
        }else{
            Client client = new Client(name,email,password);
            clients.add(client);

            sigName.setText("");
            sigEmail.setText("");
            sigPassword.setText("");
            startActivity(new Intent(SignUpActivity.this, AcitivityLogin.class));

        }
    }
    public void Login_Click(View view){
        startActivity(new Intent(SignUpActivity.this, AcitivityLogin.class));
    }
}