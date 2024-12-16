package com.example.companyapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    EditText et1,et2;
    Button b1;
    String getUname,getPass,alert;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        et1=(EditText)findViewById(R.id.uname1);
        et2=(EditText)findViewById(R.id.pass1);
        b1=(Button)findViewById(R.id.logbut);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getUname=et1.getText().toString();
                getPass=et2.getText().toString();
                if(getUname.equals("admin")&&getPass.equals("12345"))
                {
                    Intent i=new Intent(getApplicationContext(), MenuActivity.class);
                    startActivity(i);
                }
                else
                {
                    Toast.makeText(getApplicationContext(),"Invalid Credentials!",Toast.LENGTH_LONG).show();
                }
            }
        });
    }
}