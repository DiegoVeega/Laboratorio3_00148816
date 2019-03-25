package com.veegadiego.laboratorio3_00148816;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class NewActivity extends AppCompatActivity {

    TextView mtv_user, mtv_pass,mtv_email,mtv_gender;
    Button mShareButton;
    String Aux_Text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new);

        mtv_user =findViewById(R.id.et_user);
        mtv_pass=findViewById(R.id.et_pass);
        mtv_email=findViewById(R.id.et_email);
        mtv_gender=findViewById(R.id.et_gender);

        mShareButton=findViewById(R.id.share_action);

        Intent m_newintent = getIntent();

        if(m_newintent != null){
            //mText1.setText(m_newintent.getStringExtra(AppConstant.Text1_key)); Setea el texto en el lugar asignado.
            //text_aux=m_newintent.getStringExtra(AppConstant.Text1_key);

            mtv_user.setText(m_newintent.getStringExtra(AppConstant.USER_KEY));
            mtv_pass.setText(m_newintent.getStringExtra(AppConstant.PASS_KEY));
            mtv_email.setText(m_newintent.getStringExtra(AppConstant.EMAIL_KEY));
            mtv_gender.setText(m_newintent.getStringExtra(AppConstant.GENDER_KEY));
        }

        mShareButton.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                Intent m_intent2 = new Intent();

                Aux_Text= "{\n"+"\"Username\": "+"\""+mtv_user.getText()+"\",\n"+"\"Password\": "+"\""+mtv_pass.getText()+"\",\n"+"\"E-mail\": "+"\""+mtv_email.getText()+"\",\n"+"\"Gender\": "+"\""+mtv_gender.getText()+"\" \n}";
                m_intent2.setAction(Intent.ACTION_SEND);
                m_intent2.setType("text/plain");
                m_intent2.putExtra(Intent.EXTRA_TEXT, Aux_Text);

                startActivity(m_intent2);
            }
        });

    }

}
