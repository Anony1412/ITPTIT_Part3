package itptitpart3.anony1412.itptit.itptit_part3.gallery.other;

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

public class OtherImageActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {

    private GridView gridView_OtherImage;
    private GirdViewAdapter adapter;
    private String[] urls = new String[]{
            "https://i.imgur.com/rCvb8QV.jpg", "https://i.imgur.com/deNV5h7.jpg",
            "https://i.imgur.com/bmf5qoj.jpg", "https://i.imgur.com/nLwY995.jpg",
            "https://i.imgur.com/m0Adzrv.jpg", "https://i.imgur.com/mIoi6LH.jpg",
            "https://i.imgur.com/9OrEAOG.jpg", "https://i.imgur.com/uKm2GvP.jpg",
            "https://i.imgur.com/I1QUifD.jpg", "https://i.imgur.com/L7PkUGu.jpg",
            "https://i.imgur.com/OirDJJU.jpg", "https://i.imgur.com/e4vrXNq.jpg",
            "https://i.imgur.com/PxAIcBy.jpg", "https://i.imgur.com/Chmeh2w.jpg",
            "https://i.imgur.com/RiD9OG6.jpg"
    };

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_biggame);
        init();
    }

    private void init() {
        gridView_OtherImage = findViewById(R.id.gridView_Biggame);
        adapter = new GirdViewAdapter(OtherImageActivity.this, urls);
        gridView_OtherImage.setAdapter(adapter);
        gridView_OtherImage.setOnItemClickListener(this);
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        Intent intent = new Intent(OtherImageActivity.this, OtherImageViewPagerActivity.class);
        intent.putExtra("position", position);
        startActivity(intent);
    }
}

