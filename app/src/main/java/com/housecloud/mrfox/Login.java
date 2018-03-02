package com.housecloud.mrfox;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

/**
 * Created by 21642432 on 02/03/2018.
 */

public class Login extends AppCompatActivity{

    private TextView titulo;
    private EditText Username;
    private EditText Pass;
    private Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        titulo = findViewById(R.id.tvTitulo);
        Username = findViewById(R.id.email);
        Pass = findViewById(R.id.pass);
        btn = findViewById(R.id.loginbutton);
    }


    public void login (View v){
        Intent i = new Intent(this, MainActivity.class);
        startActivity(i);
    }
}
