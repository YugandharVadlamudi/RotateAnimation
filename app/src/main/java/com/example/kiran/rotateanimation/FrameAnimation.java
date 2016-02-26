package com.example.kiran.rotateanimation;

import android.app.Activity;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.Log;
import android.view.animation.Animation;
import android.widget.ImageView;

/**
 * Created by Kiran on 25-11-2015.
 */
public class FrameAnimation extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.frameanimation);
        ImageView iv=(ImageView)findViewById(R.id.IV_frameanimation);
iv.setBackgroundResource(R.drawable.frameanimation);
        AnimationDrawable frameanimation=(AnimationDrawable)iv.getBackground();
        frameanimation.start();
    }
}
