package com.miramicodigo.studyjam_ii_animations;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    /**
     * @author Gustavo Lizarraga
     * @version 1.0
     * #DevStudyJam
     * */

    private ImageView ivAndroid;
    private ImageView ivTux;

    private Animation animacion;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ivAndroid = (ImageView) findViewById(R.id.ivAndroid);
        ivTux = (ImageView) findViewById(R.id.ivTux);
    }

    public void zoomin(View v) {
        animacion = AnimationUtils.loadAnimation(
                getApplicationContext(), R.anim.zoom_in);
        ivAndroid.startAnimation(animacion);
    }
    public void zoomout(View v) {
        animacion = AnimationUtils.loadAnimation(
                getApplicationContext(), R.anim.zoom_out);
        ivAndroid.startAnimation(animacion);
    }
    public void fadein(View v) {
        animacion = AnimationUtils.loadAnimation(
                getApplicationContext(), R.anim.fade_in);
        ivAndroid.startAnimation(animacion);
    }
    public void fadeout(View v) {
        animacion = AnimationUtils.loadAnimation(
                getApplicationContext(), R.anim.fade_out);
        ivAndroid.startAnimation(animacion);
    }
    public void rotate(View v) {
        animacion = AnimationUtils.loadAnimation(
                getApplicationContext(), R.anim.rotate);
        ivAndroid.startAnimation(animacion);
    }
    public void move(View v) {
        animacion = AnimationUtils.loadAnimation(
                getApplicationContext(), R.anim.move);
        ivAndroid.startAnimation(animacion);
    }
    public void slideup(View v) {
        animacion = AnimationUtils.loadAnimation(
                getApplicationContext(), R.anim.slide_up);
        ivAndroid.startAnimation(animacion);
    }
    public void slidedown(View v) {
        animacion = AnimationUtils.loadAnimation(
                getApplicationContext(), R.anim.slide_down);
        ivAndroid.startAnimation(animacion);
    }
    public void blink(View v) {
        animacion = AnimationUtils.loadAnimation(
                getApplicationContext(), R.anim.blink);
        ivAndroid.startAnimation(animacion);
    }
    public void bounce(View v) {
        animacion = AnimationUtils.loadAnimation(
                getApplicationContext(), R.anim.bounce);
        ivAndroid.startAnimation(animacion);
    }
    public void crossfade(View v){
        animacion = AnimationUtils.loadAnimation(
                getApplicationContext(), R.anim.fade_out);
        Animation animacion2 = AnimationUtils.loadAnimation(
                getApplicationContext(), R.anim.fade_in);
        ivAndroid.startAnimation(animacion);
        ivTux.startAnimation(animacion2);
    }
    public void sequential(View v) {
        animacion = AnimationUtils.loadAnimation(
                getApplicationContext(), R.anim.sequential);
        ivAndroid.startAnimation(animacion);
    }
    public void together(View v) {
        animacion = AnimationUtils.loadAnimation(
                getApplicationContext(), R.anim.together);
        ivAndroid.startAnimation(animacion);
    }
    public void stop(View v){
        ivAndroid.clearAnimation();
        ivTux.clearAnimation();
    }
}
