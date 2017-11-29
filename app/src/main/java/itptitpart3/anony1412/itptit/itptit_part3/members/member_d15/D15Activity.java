package itptitpart3.anony1412.itptit.itptit_part3.members.member_d15;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

import java.util.ArrayList;

import itptitpart3.anony1412.itptit.itptit_part3.R;
import itptitpart3.anony1412.itptit.itptit_part3.members.Member;
import me.relex.circleindicator.CircleIndicator;

/**
 * Created by Anony1412 on 11/25/2017.
 */

public class D15Activity extends AppCompatActivity implements ViewPager.OnPageChangeListener {

    private ArrayList<Member> membersD15 = new ArrayList<>();
    private ViewPager vpD15;
    private D15Adapter adapter;
    CircleIndicator indicator;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.viewpager);
        init();
        vpD15.setCurrentItem(getPosition());
    }

    private void init() {
        vpD15 = findViewById(R.id.viewPager);
        adapter = new D15Adapter(getSupportFragmentManager());
        vpD15.setAdapter(adapter);
        vpD15.getCurrentItem();
        indicator = findViewById(R.id.circleindicator);
        indicator.setViewPager(vpD15);
        vpD15.addOnPageChangeListener(this);
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
