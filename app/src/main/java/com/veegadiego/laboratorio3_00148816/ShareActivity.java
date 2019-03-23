package com.veegadiego.laboratorio3_00148816;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class ShareActivity extends AppCompatActivity {

    private String Aux_Text;
    TextView mSharedText;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_share);

        mSharedText=findViewById(R.id.tv_shared);

        Intent Intent_shared = getIntent();

        if(Intent_shared != null){
            Aux_Text = Intent_shared.getStringExtra(Intent.EXTRA_TEXT);
        }

        mSharedText.setText(Aux_Text);
    }
}
