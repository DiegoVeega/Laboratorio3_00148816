package com.veegadiego.laboratorio3_00148816;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class NewActivity extends AppCompatActivity {

    TextView mText1;
    Button mSUbmitACtion;
    String text_aux;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new);

        mText1 = findViewById(R.id.tv_prueba);
        mSUbmitACtion = findViewById(R.id.bt_actionnew);

        text_aux = "Texto Quemado";

        Intent m_newintent = getIntent();

        if(m_newintent != null){
            //mText1.setText(m_newintent.getStringExtra(AppConstant.Text1_key));
            text_aux=m_newintent.getStringExtra(AppConstant.Text1_key);
        }

        mText1.setText(text_aux);
        mSUbmitACtion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mintent2 = new Intent();

                mintent2.setAction(Intent.ACTION_SEND);
                mintent2.setType("text/plain");

                mintent2.putExtra(Intent.EXTRA_TEXT, text_aux);

                startActivity(mintent2);

            }
        });

    }
}
