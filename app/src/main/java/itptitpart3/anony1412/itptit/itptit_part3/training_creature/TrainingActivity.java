package itptitpart3.anony1412.itptit.itptit_part3.training_creature;

import android.graphics.Typeface;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.ScrollView;
import android.widget.TextView;

import itptitpart3.anony1412.itptit.itptit_part3.R;

/**
 * Created by Anony1412 on 11/25/2017.
 */

public class TrainingActivity extends AppCompatActivity {

    private ScrollView svTraining;
    private TextView txt_devC;
    private TextView txt_android;
    private TextView txt_photoshop;
    private TextView txt_game;
    private TextView txt_web;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_training);

        init();

    }

    private void init() {

        Typeface font = Typeface.createFromAsset(getAssets(), "UVNThoiDai2.TTF");

        svTraining = findViewById(R.id.svTraining);
        svTraining.smoothScrollTo(0, 0);

        txt_android = findViewById(R.id.txt_android);
        txt_android.setTypeface(font);

        txt_devC = findViewById(R.id.txt_devC);
        txt_devC.setTypeface(font);

        txt_game = findViewById(R.id.txt_game);
        txt_game.setTypeface(font);

        txt_photoshop = findViewById(R.id.txt_photoshop);
        txt_photoshop.setTypeface(font);

        txt_web = findViewById(R.id.txt_web);
        txt_web.setTypeface(font);
    }
}
