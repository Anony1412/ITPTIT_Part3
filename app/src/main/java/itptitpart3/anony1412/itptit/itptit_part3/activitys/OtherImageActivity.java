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

public class OtherImageActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {

    private GridView gridView_OtherImage;
    private GirdViewAdapter adapter;
    private String[] urls = new String[]{
            "https://i.imgur.com/tnbG65l.jpg", "https://i.imgur.com/tnbG65l.jpg",
            "https://i.imgur.com/tnbG65l.jpg", "https://i.imgur.com/tnbG65l.jpg",
            "https://i.imgur.com/tnbG65l.jpg", "https://i.imgur.com/tnbG65l.jpg",
            "https://i.imgur.com/tnbG65l.jpg", "https://i.imgur.com/tnbG65l.jpg",
            "https://i.imgur.com/tnbG65l.jpg", "https://i.imgur.com/tnbG65l.jpg",
            "https://i.imgur.com/tnbG65l.jpg", "https://i.imgur.com/tnbG65l.jpg",
            "https://i.imgur.com/tnbG65l.jpg", "https://i.imgur.com/tnbG65l.jpg",
            "https://i.imgur.com/tnbG65l.jpg", "https://i.imgur.com/tnbG65l.jpg",
            "https://i.imgur.com/tnbG65l.jpg", "https://i.imgur.com/tnbG65l.jpg",
            "https://i.imgur.com/tnbG65l.jpg", "https://i.imgur.com/tnbG65l.jpg",
            "https://i.imgur.com/tnbG65l.jpg", "https://i.imgur.com/tnbG65l.jpg",
            "https://i.imgur.com/tnbG65l.jpg", "https://i.imgur.com/tnbG65l.jpg",
            "https://i.imgur.com/tnbG65l.jpg", "https://i.imgur.com/tnbG65l.jpg",
            "https://i.imgur.com/tnbG65l.jpg", "https://i.imgur.com/tnbG65l.jpg",
            "https://i.imgur.com/tnbG65l.jpg", "https://i.imgur.com/tnbG65l.jpg",
            "https://i.imgur.com/tnbG65l.jpg", "https://i.imgur.com/tnbG65l.jpg",
            "https://i.imgur.com/tnbG65l.jpg", "https://i.imgur.com/tnbG65l.jpg",
            "https://i.imgur.com/tnbG65l.jpg", "https://i.imgur.com/tnbG65l.jpg",
            "https://i.imgur.com/tnbG65l.jpg", "https://i.imgur.com/tnbG65l.jpg",
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
        Toast.makeText(this, "" + position,
                Toast.LENGTH_SHORT).show();
    }
}

