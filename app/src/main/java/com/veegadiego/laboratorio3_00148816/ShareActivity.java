package com.veegadiego.laboratorio3_00148816;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class ShareActivity extends AppCompatActivity {


    TextView mSharedText;

    private String text_aux;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_share);

        mSharedText=findViewById(R.id.share);

        text_aux = "ESto es un texto quemado";

        Intent new_intent = getIntent();

        if(new_intent != null){
            text_aux = new_intent.getStringExtra(Intent.EXTRA_TEXT);


        }

        mSharedText.setText(text_aux);
    }
}
