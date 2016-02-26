package com.example.kiran.rotateanimation;

import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.transition.Fade;
import android.util.Log;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ImageView b=(ImageView)findViewById(R.id.IV_pig);
        ImageView c=(ImageView)findViewById(R.id.IV_pink);
        TextView tv=(TextView)findViewById(R.id.TV_objectAnimator);
        Animation a=AnimationUtils.loadAnimation(this,R.anim.alpha);
        b.startAnimation(a);
//        Animation a1=AnimationUtils.loadAnimation(this,R.anim.objectanimator);
//        ObjectAnimator.ofInt()
        ObjectAnimator oa=ObjectAnimator.ofInt(tv, "textColour", Color.BLACK,Color.GREEN);
        oa.setDuration(10000);
        oa.start();
        /*AnimatorSet animSet = (AnimatorSet) AnimatorInflater.loadAnimator(this, R.animator.objectanimator);
        animSet.setTarget(tv);
        animSet.start();*/
        AnimatorSet $anim=(AnimatorSet) AnimatorInflater.loadAnimator(this,R.animator.valueanimator);
        Log.d("lsdkflsd",$anim.toString());
        $anim.setTarget(c);
        $anim.start();



    }
}
