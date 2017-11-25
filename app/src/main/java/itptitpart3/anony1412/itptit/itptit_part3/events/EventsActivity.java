package itptitpart3.anony1412.itptit.itptit_part3.events;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;

import itptitpart3.anony1412.itptit.itptit_part3.R;

/**
 * Created by Anony1412 on 11/25/2017.
 */

public class EventsActivity extends AppCompatActivity {

    private TextView txt_hpbd;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_events);

        init();
    }

    private void init() {
        txt_hpbd = findViewById(R.id.txt_hpbd);
        Animation animation = AnimationUtils.loadAnimation(EventsActivity.this,R.anim.anim_alpha_item);
        txt_hpbd.startAnimation(animation);
    }
}
