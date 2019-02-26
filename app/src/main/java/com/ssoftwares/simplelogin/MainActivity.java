package com.ssoftwares.simplelogin;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public  class MainActivity extends AppCompatActivity {
    private Button b;
    private EditText username,pass;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        run();
    }




    public void run(){
        b=(Button)findViewById(R.id.button);
        username=(EditText)findViewById(R.id.editText);
        pass=(EditText)findViewById(R.id.editText2);

        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(username.getText().toString().equals("user")&&pass.getText().toString().equals("pass"))
                {
                  Intent loggedin = new Intent(".loggedIn");
                  startActivity(loggedin);
                }
                else{
                    Toast.makeText(getApplicationContext(),"You entered wrong password/ username", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
