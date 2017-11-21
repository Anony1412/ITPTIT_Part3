package itptitpart3.anony1412.itptit.itptit_part3.activitys;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.Toast;

import itptitpart3.anony1412.itptit.itptit_part3.GirdViewAdapter;
import itptitpart3.anony1412.itptit.itptit_part3.R;

/**
 * Created by Anony1412 on 11/18/2017.
 */

public class BigGameActivity extends AppCompatActivity {

    private GridView gridView_Biggame;
    private GirdViewAdapter adapter;
    private String[] urls = new String[]{
            "https://i.imgur.com/OAU9Sn6.jpg", "https://i.imgur.com/OAU9Sn6.jpg",
            "https://i.imgur.com/OAU9Sn6.jpg", "https://i.imgur.com/OAU9Sn6.jpg",
            "https://i.imgur.com/OAU9Sn6.jpg", "https://i.imgur.com/OAU9Sn6.jpg",
            "https://i.imgur.com/OAU9Sn6.jpg", "https://i.imgur.com/OAU9Sn6.jpg",
            "https://i.imgur.com/OAU9Sn6.jpg", "https://i.imgur.com/OAU9Sn6.jpg",
            "https://i.imgur.com/OAU9Sn6.jpg", "https://i.imgur.com/OAU9Sn6.jpg",
            "https://i.imgur.com/OAU9Sn6.jpg", "https://i.imgur.com/OAU9Sn6.jpg",
            "https://i.imgur.com/OAU9Sn6.jpg", "https://i.imgur.com/OAU9Sn6.jpg",
            "https://i.imgur.com/OAU9Sn6.jpg", "https://i.imgur.com/OAU9Sn6.jpg",
            "https://i.imgur.com/OAU9Sn6.jpg", "https://i.imgur.com/OAU9Sn6.jpg",
            "https://i.imgur.com/OAU9Sn6.jpg", "https://i.imgur.com/OAU9Sn6.jpg",
            "https://i.imgur.com/OAU9Sn6.jpg", "https://i.imgur.com/OAU9Sn6.jpg",
            "https://i.imgur.com/OAU9Sn6.jpg", "https://i.imgur.com/OAU9Sn6.jpg",
            "https://i.imgur.com/OAU9Sn6.jpg", "https://i.imgur.com/OAU9Sn6.jpg",
            "https://i.imgur.com/OAU9Sn6.jpg", "https://i.imgur.com/OAU9Sn6.jpg"
    };

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_biggame);

        init();
    }

    private void init() {
        gridView_Biggame = findViewById(R.id.gridView_Biggame);
        adapter = new GirdViewAdapter(this, urls);
        gridView_Biggame.setAdapter(adapter);
        gridView_Biggame.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(getApplicationContext(), "" + position, Toast.LENGTH_SHORT).show();
            }
        });
    }
}
