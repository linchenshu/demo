package com.example.administrator.demo;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.ActivityCompat;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by Administrator on 2017/10/16.
 */

public class LoginActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        TextView tx=(TextView) findViewById(R.id.Login_TextView_Send);


        tx.setOnClickListener(new View.OnClickListener(){
            EditText et1=(EditText)findViewById(R.id.et_username);
            EditText et2=(EditText)findViewById(R.id.et_password);
            @Override
            public void onClick(View v) {
                if ((et1!=null) && (et2!=null)) {
                    Intent intent = new Intent(LoginActivity.this, MainActivity.class);
                    startActivity(intent);
                }
                else{
                    Intent intent = new Intent(LoginActivity.this, MistakeActivity.class);
                    startActivity(intent);
                }
            }
        });

    }
}
