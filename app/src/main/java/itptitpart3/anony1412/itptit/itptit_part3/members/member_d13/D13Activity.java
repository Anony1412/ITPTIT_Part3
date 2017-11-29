package itptitpart3.anony1412.itptit.itptit_part3.members.member_d13;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

import itptitpart3.anony1412.itptit.itptit_part3.R;
import me.relex.circleindicator.CircleIndicator;

/**
 * Created by Anony1412 on 11/25/2017.
 */

public class D13Activity extends AppCompatActivity implements ViewPager.OnPageChangeListener {

    private ViewPager vpD13;
    private D13Adapter adapter;
    CircleIndicator indicator;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.viewpager);
        init();
        vpD13.setCurrentItem(getPosition());
    }

    private void init() {
        vpD13 = findViewById(R.id.viewPager);
        adapter = new D13Adapter(getSupportFragmentManager());
        vpD13.setAdapter(adapter);
        vpD13.getCurrentItem();
        indicator = findViewById(R.id.circleindicator);
        indicator.setViewPager(vpD13);
        vpD13.addOnPageChangeListener(this);
    }

    private int getPosition() {
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
