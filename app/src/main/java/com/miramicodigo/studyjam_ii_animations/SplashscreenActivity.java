package com.miramicodigo.studyjam_ii_animations;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class SplashscreenActivity extends AppCompatActivity {

    /**
     * @author Gustavo Lizarraga
     * @version 1.0
     * #DevStudyJam
     * */

    private ImageView ivLogo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_splashscreen);

        ivLogo = (ImageView) findViewById(R.id.ivLogotipo);

        Animation animacion = AnimationUtils.loadAnimation(
                getApplicationContext(), R.anim.splashscreen);
        ivLogo.startAnimation(animacion);
        animacion.setAnimationListener(new Animation.AnimationListener() {
            @Override
            public void onAnimationStart(Animation animation) {
            }
            @Override
            public void onAnimationEnd(Animation animation) {
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(intent);
                finish();
            }
            @Override
            public void onAnimationRepeat(Animation animation) {
            }
        });
    }
}
