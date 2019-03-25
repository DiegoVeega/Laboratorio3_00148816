package com.veegadiego.laboratorio3_00148816;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.widget.TextView;

public class ShareActivity extends AppCompatActivity {

    private String Aux_Text;
    TextView mSharedText;
    TextView JSONText;

    //TIEMPO
    private static final int tiempo=1000;
    private static final int despues=1000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_share);

        mSharedText=findViewById(R.id.tv_shared);
        JSONText=findViewById(R.id.JSON_text);

        //Animacion para texto enviado.
        AlphaAnimation fadeIn = new AlphaAnimation(0.0f,1.0f);
        fadeIn.setDuration(tiempo);
        fadeIn.setStartOffset(despues);
        fadeIn.setFillAfter(true);
        //Animacion para texto "A JSON"
        AlphaAnimation fadeIn2 = new AlphaAnimation(0.0f,1.0f);
        fadeIn2.setDuration(tiempo+600);
        fadeIn2.setStartOffset(despues+600);
        fadeIn2.setFillAfter(true);

        //Obteniendo el Intent de New Activity.
        Intent Intent_shared = getIntent();

        if(Intent_shared != null){
            Aux_Text = Intent_shared.getStringExtra(Intent.EXTRA_TEXT);
        }
        //Seteando mSharedText con el texto Auxiliar (Contiene la cadena enviada e New Activity)
        mSharedText.setText(Aux_Text);

        //Creando el FadeIn de la animacion
        fadeIn.setAnimationListener(new Animation.AnimationListener() {
            @Override
            public void onAnimationStart(Animation animation) {

            }

            @Override
            public void onAnimationEnd(Animation animation) {

            }

            @Override
            public void onAnimationRepeat(Animation animation) {

            }
        });

        mSharedText.startAnimation(fadeIn);
        JSONText.startAnimation(fadeIn2);
    }
}
