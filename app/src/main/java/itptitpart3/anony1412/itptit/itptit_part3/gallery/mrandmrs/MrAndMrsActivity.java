package itptitpart3.anony1412.itptit.itptit_part3.gallery.mrandmrs;

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

public class MrAndMrsActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {

    private GridView gridView_MrandMrs;
    private GirdViewAdapter adapter;
    private String[] urls = new String[]{
            "https://i.imgur.com/hyKxm2M.jpg", "https://i.imgur.com/aCC6JR1.jpg",
            "https://i.imgur.com/g9p99vK.jpg", "https://i.imgur.com/CKXsoZR.jpg",
            "https://i.imgur.com/s2ht9lO.jpg", "https://i.imgur.com/4CqF2yX.jpg",
            "https://i.imgur.com/jF8LZip.jpg", "https://i.imgur.com/CRiNG7U.jpg",
            "https://i.imgur.com/cfRWT16.jpg", "https://i.imgur.com/Am6855b.jpg"
    };

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_biggame);
        init();
    }

    private void init() {
        //  dùng chung của biggame để đỡ phải viết lại
        gridView_MrandMrs = findViewById(R.id.gridView_Biggame);
        adapter = new GirdViewAdapter(MrAndMrsActivity.this, urls);
        gridView_MrandMrs.setAdapter(adapter);
        gridView_MrandMrs.setOnItemClickListener(this);
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        Intent intent = new Intent(MrAndMrsActivity.this, MrAndMrsViewPagerActivity.class);
        intent.putExtra("position", position);
        startActivity(intent);
    }
}

