package com.veegadiego.laboratorio3_00148816;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText mUsername;
    EditText mPassword;
    EditText mEmail;
    EditText mGender;

    Button mbt_submit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mUsername=findViewById(R.id.user);
        mPassword=findViewById(R.id.pass);
        mEmail=findViewById(R.id.email);
        mGender=findViewById(R.id.gender);
        mbt_submit=findViewById(R.id.bt_action);

        mbt_submit.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                Intent m_intent = new Intent(MainActivity.this,NewActivity.class);

                //m_intent.putExtra(AppConstant.Text1_key, "Texto desde MainActivity");
                m_intent.putExtra(AppConstant.USER_KEY,mUsername.getText().toString());
                m_intent.putExtra(AppConstant.PASS_KEY,mPassword.getText().toString());
                m_intent.putExtra(AppConstant.EMAIL_KEY,mEmail.getText().toString());
                m_intent.putExtra(AppConstant.GENDER_KEY,mGender.getText().toString());

                startActivity(m_intent);
            }
        });
    }
}
