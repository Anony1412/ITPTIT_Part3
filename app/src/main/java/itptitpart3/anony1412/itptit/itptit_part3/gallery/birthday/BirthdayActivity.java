package itptitpart3.anony1412.itptit.itptit_part3.gallery.birthday;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;

import itptitpart3.anony1412.itptit.itptit_part3.R;
import itptitpart3.anony1412.itptit.itptit_part3.gallery.GirdViewAdapter;


/**
 * Created by Anony1412 on 11/16/2017.
 */

public class BirthdayActivity extends AppCompatActivity {

    private GridView gridView_Birthday;
    private GirdViewAdapter adapter;
    private String[] urls = new String[]{
            "https://i.imgur.com/b30plY1.jpg", "https://i.imgur.com/41WENc1.jpg",
            "https://i.imgur.com/vAv6Cov.jpg", "https://i.imgur.com/5VqR8sQ.jpg",
            "https://i.imgur.com/N1WdjQ6.jpg", "https://i.imgur.com/Puua31Y.jpg",
            "https://i.imgur.com/Zjos0MF.jpg"
    };

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_birthday);

        init();
    }

    private void init() {
        gridView_Birthday = findViewById(R.id.gridView_Birthday);
        adapter = new GirdViewAdapter(this, urls);
        gridView_Birthday.setAdapter(adapter);
        gridView_Birthday.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(BirthdayActivity.this, BirthdayViewPagerActivity.class);
                intent.putExtra("position", position);
                startActivity(intent);
            }
        });
    }
}
