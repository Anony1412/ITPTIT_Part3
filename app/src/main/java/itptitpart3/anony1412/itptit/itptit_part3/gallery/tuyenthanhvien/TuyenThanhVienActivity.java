package itptitpart3.anony1412.itptit.itptit_part3.gallery.tuyenthanhvien;

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

public class TuyenThanhVienActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {

    private GridView gridView_TuyenThanhVien;
    private GirdViewAdapter adapter;
    private String[] urls = new String[]{
            "https://i.imgur.com/u1baSQ5.jpg", "https://i.imgur.com/rB4hYl5.jpg",
            "https://i.imgur.com/jcYrxeA.jpg", "https://i.imgur.com/ZfeWST9.jpg",
            "https://i.imgur.com/Tn493Fc.jpg", "https://i.imgur.com/V7ZV0Ig.jpg",
            "https://i.imgur.com/I8YV1i0.jpg", "https://i.imgur.com/fOt2Exu.jpg",
            "https://i.imgur.com/mMWqolF.jpg", "https://i.imgur.com/MqEaLRA.jpg"
    };

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_biggame);
        init();
    }

    private void init() {
        gridView_TuyenThanhVien = findViewById(R.id.gridView_Biggame);
        adapter = new GirdViewAdapter(TuyenThanhVienActivity.this, urls);
        gridView_TuyenThanhVien.setAdapter(adapter);
        gridView_TuyenThanhVien.setOnItemClickListener(this);
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        Intent intent = new Intent(TuyenThanhVienActivity.this, TuyenThanhVienViewPagerActivity.class);
        startActivity(intent);
    }
}
