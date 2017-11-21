package itptitpart3.anony1412.itptit.itptit_part3.activitys;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import itptitpart3.anony1412.itptit.itptit_part3.MainActivity;
import itptitpart3.anony1412.itptit.itptit_part3.R;


/**
 * Created by Anony1412 on 11/15/2017.
 */

public class FirstScreenActivity extends AppCompatActivity {

    private TextView txt_waiting;
    private ImageView img_itptitFristScreen;
    private ImageView img_itptit;
    private LinearLayout linearLayout;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_firstscreen);
        init();
    }

    private void init() {
        img_itptitFristScreen = findViewById(R.id.img_itptitfirstscreen);
        txt_waiting = findViewById(R.id.txt_waiting);
        img_itptit = findViewById(R.id.img_itptit);
        linearLayout = findViewById(R.id.linearLayoutFirstScreen);

        Typeface myFont = Typeface.createFromAsset(getAssets(), "fawn.ttf");
        txt_waiting.setTypeface(myFont);

        Animation animation = AnimationUtils.loadAnimation(this, R.anim.anim_zoomin);
        img_itptitFristScreen.setAnimation(animation);
        animation.setAnimationListener(new Animation.AnimationListener() {
            @Override
            public void onAnimationStart(Animation animation) {

            }

            @Override
            public void onAnimationEnd(Animation animation) {
                linearLayout.setVisibility(View.GONE);
                Animation animation1 = AnimationUtils.loadAnimation(FirstScreenActivity.this, R.anim.anim_alpha_item);
                img_itptit.setAnimation(animation1);
                img_itptit.setImageResource(R.drawable.itptit);
                animation1.setAnimationListener(new Animation.AnimationListener() {
                    @Override
                    public void onAnimationStart(Animation animation) {

                    }

                    @Override
                    public void onAnimationEnd(Animation animation) {
                        Intent intent = new Intent(FirstScreenActivity.this, MainActivity.class);
                        startActivity(intent);
                    }

                    @Override
                    public void onAnimationRepeat(Animation animation) {

                    }
                });
            }

            @Override
            public void onAnimationRepeat(Animation animation) {

            }
        });
    }
}
