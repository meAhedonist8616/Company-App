package com.example.companyapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class AddEmpActivity extends AppCompatActivity {

    EditText et1,et2,et3,et4,et5;
    Button b1,b2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_add_emp);
        et1=(EditText) findViewById(R.id.empcode);
        et2=(EditText) findViewById(R.id.ename);
        et3=(EditText) findViewById(R.id.desig);
        et4=(EditText) findViewById(R.id.mail);
        et5=(EditText) findViewById(R.id.sal);
        b1=(Button) findViewById(R.id.subbut);
        b2=(Button) findViewById(R.id.backmenbut);
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(getApplicationContext(), MenuActivity.class);
                startActivity(i);
            }
        });
    }
}