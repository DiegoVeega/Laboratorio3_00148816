package com.veegadiego.laboratorio3_00148816;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button mbt_submit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mbt_submit=findViewById(R.id.bt_action);
        mbt_submit.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                Intent m_intent = new Intent(MainActivity.this,NewActivity.class);

                m_intent.putExtra(AppConstant.Text1_key, "Texto desde MainActivity");

                startActivity(m_intent);
            }
        });
    }
}
