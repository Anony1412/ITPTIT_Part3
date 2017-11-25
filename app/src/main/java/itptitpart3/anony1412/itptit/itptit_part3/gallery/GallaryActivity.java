package itptitpart3.anony1412.itptit.itptit_part3.gallery;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import itptitpart3.anony1412.itptit.itptit_part3.R;
import itptitpart3.anony1412.itptit.itptit_part3.gallery.biggame.BigGameActivity;
import itptitpart3.anony1412.itptit.itptit_part3.gallery.birthday.BirthdayActivity;
import itptitpart3.anony1412.itptit.itptit_part3.gallery.mrandmrs.MrAndMrsActivity;
import itptitpart3.anony1412.itptit.itptit_part3.gallery.other.OtherImageActivity;
import itptitpart3.anony1412.itptit.itptit_part3.gallery.tuyenthanhvien.TuyenThanhVienActivity;


/**
 * Created by Anony1412 on 11/15/2017.
 */

public class GallaryActivity extends AppCompatActivity implements View.OnClickListener {

    private CardView cardView_BirthDay;
    private CardView cardView_BigGame;
    private CardView cardView_TuyenThanhVien;
    private CardView cardView_MrAndMrs;
    private CardView cardView_OtherImage;
    private CardView cardView_AddAlbum;

    private TextView txt_cardView_BirthDay;
    private TextView txt_cardView_BigGame;
    private TextView txt_cardView_TuyenThanhVien;
    private TextView txt_cardView_MrAndMrs;
    private TextView txt_cardView_OtherImage;
    private TextView txt_cardView_AddAlbum;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gallery);

        init();
    }

    private void init() {
        // method maps
        maps();
        // method setOnClick
        setOnClick();
    }

    private void maps() {
        cardView_BirthDay = findViewById(R.id.cardView_BirthDay);
        txt_cardView_BirthDay = findViewById(R.id.txt_cardView_BirthDay);


        cardView_BigGame = findViewById(R.id.cardView_BigGame);
        txt_cardView_BigGame = findViewById(R.id.txt_cardView_BigGame);


        cardView_TuyenThanhVien = findViewById(R.id.cardView_TuyenThanhVien);
        txt_cardView_TuyenThanhVien = findViewById(R.id.txt_cardView_TuyenThanhVien);


        cardView_MrAndMrs = findViewById(R.id.cardView_MrAndMrs);
        txt_cardView_MrAndMrs = findViewById(R.id.txt_cardView_MrAndMrs);


        cardView_OtherImage = findViewById(R.id.cardView_OtherImage);
        txt_cardView_OtherImage = findViewById(R.id.txt_cardView_OtherImage);

        cardView_AddAlbum = findViewById(R.id.cardView_AddAlbum);
        txt_cardView_AddAlbum = findViewById(R.id.txt_cardView_AddAlbum);
    }


    private void setOnClick() {
        cardView_BirthDay.setOnClickListener(this);
        txt_cardView_BirthDay.setOnClickListener(this);

        cardView_BigGame.setOnClickListener(this);
        txt_cardView_BigGame.setOnClickListener(this);

        cardView_TuyenThanhVien.setOnClickListener(this);
        txt_cardView_TuyenThanhVien.setOnClickListener(this);

        cardView_MrAndMrs.setOnClickListener(this);
        txt_cardView_MrAndMrs.setOnClickListener(this);

        cardView_OtherImage.setOnClickListener(this);
        txt_cardView_OtherImage.setOnClickListener(this);

        cardView_AddAlbum.setOnClickListener(this);
        txt_cardView_AddAlbum.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        int id = v.getId();
        switch (id) {
            case R.id.cardView_BirthDay: {
                // move to birthday activity
                Intent intent = new Intent(GallaryActivity.this, BirthdayActivity.class);
                startActivity(intent);
                break;
            }
            case R.id.txt_cardView_BirthDay: {
                // move to birthday activity
                Intent intent = new Intent(GallaryActivity.this, BirthdayActivity.class);
                startActivity(intent);
                break;
            }
            case R.id.cardView_BigGame: {
                // move to biggame activity
                Intent intent = new Intent(GallaryActivity.this, BigGameActivity.class);
                startActivity(intent);
                break;
            }
            case R.id.txt_cardView_BigGame: {
                // move to biggame activity
                Intent intent = new Intent(GallaryActivity.this, BigGameActivity.class);
                startActivity(intent);
                break;
            }
            case R.id.cardView_TuyenThanhVien: {
                // move to tuyenthanhvien activity
                Intent intent = new Intent(GallaryActivity.this, TuyenThanhVienActivity.class);
                startActivity(intent);
                break;
            }
            case R.id.txt_cardView_TuyenThanhVien: {
                // move to tuyenthanhvien activity
                Intent intent = new Intent(GallaryActivity.this, TuyenThanhVienActivity.class);
                startActivity(intent);
                break;
            }
            case R.id.cardView_MrAndMrs: {
                // move to mr&mrs activity
                Intent intent = new Intent(GallaryActivity.this, MrAndMrsActivity.class);
                startActivity(intent);
                break;
            }
            case R.id.txt_cardView_MrAndMrs: {
                // move to mr&mrs activity
                Intent intent = new Intent(GallaryActivity.this, MrAndMrsActivity.class);
                startActivity(intent);
                break;
            }
            case R.id.cardView_OtherImage: {
                // move to otherImage activity
                Intent intent = new Intent(GallaryActivity.this, OtherImageActivity.class);
                startActivity(intent);
                break;
            }
            case R.id.txt_cardView_OtherImage: {
                // move to otherImage activity
                Intent intent = new Intent(GallaryActivity.this, OtherImageActivity.class);
                startActivity(intent);
                break;
            }
            case R.id.cardView_AddAlbum: {
                Toast.makeText(this, "Sorry! This functionality not available", Toast.LENGTH_SHORT).show();
                break;
            }
            case R.id.txt_cardView_AddAlbum: {
                Toast.makeText(this, "Sorry! This functionality not available", Toast.LENGTH_SHORT).show();
                break;
            }
        }
    }
}
