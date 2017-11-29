package itptitpart3.anony1412.itptit.itptit_part3.gallery.mrandmrs;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

import itptitpart3.anony1412.itptit.itptit_part3.R;
import me.relex.circleindicator.CircleIndicator;

/**
 * Created by Anony1412 on 11/24/2017.
 */

public class MrAndMrsViewPagerActivity extends AppCompatActivity implements ViewPager.OnPageChangeListener {

    ViewPager viewPager;
    CircleIndicator indicator;
    MrAndMrsFragmentAdapter adapter;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.viewpager);
        init();
        viewPager.setCurrentItem(getPosition());
    }

    private void init() {
        adapter = new MrAndMrsFragmentAdapter(getSupportFragmentManager());
        viewPager= findViewById(R.id.viewPager);
        viewPager.setAdapter(adapter);
        indicator = findViewById(R.id.circleindicator);
        indicator.setViewPager(viewPager);
        viewPager.addOnPageChangeListener(this);
    }

    private int getPosition(){
        Intent intent = this.getIntent();
        Bundle bundle = intent.getExtras();
        int position = bundle.getInt("position");
        return position;
    }

    @Override
    public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

    }

    @Override
    public void onPageSelected(int position) {

    }

    @Override
    public void onPageScrollStateChanged(int state) {

    }
}

