package itptitpart3.anony1412.itptit.itptit_part3.gallery.biggame;

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
 * Created by Anony1412 on 11/18/2017.
 */

public class BigGameActivity extends AppCompatActivity {

    private GridView gridView_Biggame;
    private GirdViewAdapter adapter;
    private String[] urls = new String[]{
            "https://i.imgur.com/uO71TTB.jpg", "https://i.imgur.com/nDAAgq1.jpg",
            "https://i.imgur.com/CiUlLIR.jpg", "https://i.imgur.com/NdYZWjV.jpg",
            "https://i.imgur.com/USUVxa7.jpg", "https://i.imgur.com/6giN6Z7.jpg",
            "https://i.imgur.com/YqanSmr.jpg", "https://i.imgur.com/KlJceCx.jpg",
            "https://i.imgur.com/cLAxHJh.jpg", "https://i.imgur.com/jMh8DTl.jpg"
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
                Intent intent = new Intent(BigGameActivity.this, BiggameViewPagerActivity.class);
                startActivity(intent);
            }
        });
    }
}
