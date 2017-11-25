package itptitpart3.anony1412.itptit.itptit_part3;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.text.Spannable;
import android.text.SpannableString;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.SubMenu;
import android.view.View;
import android.widget.ImageView;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.VideoView;

import itptitpart3.anony1412.itptit.itptit_part3.events.EventsActivity;
import itptitpart3.anony1412.itptit.itptit_part3.gallery.GallaryActivity;
import itptitpart3.anony1412.itptit.itptit_part3.members.MemberActivity;
import itptitpart3.anony1412.itptit.itptit_part3.training_creature.TrainingActivity;

public class MainActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {

    private VideoView videoView;
    private ImageView img_PlayYoutube;

    private TextView txt_contentmain1;
    private TextView txt_contentmain2;

    private NavigationView navView;

    private ScrollView scrollView_contentMain;

    private boolean isPlaying;

    @SuppressLint("ResourceAsColor")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        // Write a message to the database
//        FirebaseDatabase database = FirebaseDatabase.getInstance();
//        DatabaseReference myRef = database.getReference("message");
//
//        myRef.setValue("Hello, World!");

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setImageResource(R.drawable.facebook_messenger);
        fab.setBackgroundColor(R.color.white);
        fab.setBackgroundTintList(ColorStateList.valueOf(R.color.pink100));
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri uri = Uri.parse("https://www.facebook.com/messages/t/ITPTIT"); // missing 'http://' will cause crashed
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
//                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
//                        .setAction("Action", null).show();

            }
        });

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);

        isPlaying = false;
        init();
        changeFontsNavigation();
        setCrollViewOnTop();
    }

    private void setCrollViewOnTop() {
        scrollView_contentMain = findViewById(R.id.scrollView_contentMain);
//        scrollView_contentMain.fullScroll(View.FOCUS_UP);  // nếu di chuyển nó ở cuối cuộn
//        scrollView_contentMain.pageScroll(View.FOCUS_UP);  // nếu di chuyển ở giữa cuộn

        // this statement handling problem
        scrollView_contentMain.smoothScrollTo(0, 0);
    }

    private void init() {

        // change font for txt contentMain
        txt_contentmain1 = findViewById(R.id.txt_contentmain1);
        txt_contentmain2 = findViewById(R.id.txt_contentmain2);
        Typeface myFont = Typeface.createFromAsset(getAssets(), "circle.ttf");
        txt_contentmain1.setTypeface(myFont);
        txt_contentmain2.setTypeface(myFont);

        // set link local for videoView in homePage

        videoView = findViewById(R.id.videoView_contentmain);
        String path = "android.resource://" + getPackageName() + "/" + R.raw.video;
        videoView.setVideoURI(Uri.parse(path));

        img_PlayYoutube = findViewById(R.id.img_buttonPlayYoutube);
        img_PlayYoutube.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (isPlaying == false) {
                    img_PlayYoutube.setVisibility(View.GONE);
                    videoView.resume();
                    videoView.start();
                    isPlaying = true;
                }
            }
        });

        videoView.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                if (isPlaying == true) {
                    videoView.stopPlayback();
                    img_PlayYoutube.setVisibility(View.VISIBLE);
                    isPlaying = false;
                }
                return false;
            }
        });
    }

    private void changeFontsNavigation() {
        // change font menu navigation
        navView = (NavigationView) findViewById(R.id.nav_view);
        Menu m = navView.getMenu();
        for (int i = 0; i < m.size(); i++) {
            MenuItem mi = m.getItem(i);

            //for aapplying a font to subMenu ...
            SubMenu subMenu = mi.getSubMenu();
            if (subMenu != null && subMenu.size() > 0) {
                for (int j = 0; j < subMenu.size(); j++) {
                    MenuItem subMenuItem = subMenu.getItem(j);
                    applyFontToMenuItem(subMenuItem);
                }
            }
            //the method we have create in activity
            applyFontToMenuItem(mi);
        }
    }

    private void applyFontToMenuItem(MenuItem mi) {
        Typeface font = Typeface.createFromAsset(getAssets(), "dadha___.ttf");
        SpannableString mNewTitle = new SpannableString(mi.getTitle());
        mNewTitle.setSpan(new CustomTypefaceSpan("", font), 0, mNewTitle.length(), Spannable.SPAN_INCLUSIVE_INCLUSIVE);
        mi.setTitle(mNewTitle);
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            Toast.makeText(this, "Sorry! This functionality not available", Toast.LENGTH_SHORT).show();
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.nav_member) {
            Intent intent = new Intent(getApplicationContext(), MemberActivity.class);
            startActivity(intent);
        } else if (id == R.id.nav_gallery) {

            Intent intent = new Intent(getApplicationContext(), GallaryActivity.class);
            startActivity(intent);

        } else if (id == R.id.nav_training) {
            Intent intent = new Intent(MainActivity.this, TrainingActivity.class);
            startActivity(intent);
        } else if (id == R.id.nav_events) {
            Intent intent = new Intent(MainActivity.this, EventsActivity.class);
            startActivity(intent);
        } else if (id == R.id.nav_facebook) {
            Uri uri = Uri.parse("https://www.facebook.com/ITPTIT/"); // missing 'http://' will cause crashed
            Intent intent = new Intent(Intent.ACTION_VIEW, uri);
            startActivity(intent);
        } else if (id == R.id.nav_gmail) {
            Uri uri = Uri.parse("https://clb.it.ptit@gmail.com/"); // missing 'http://' will cause crashed
            Intent intent = new Intent(Intent.ACTION_VIEW, uri);
            startActivity(intent);
        } else if (id == R.id.nav_website) {
            Uri uri = Uri.parse("https://www.itptit.com/"); // missing 'http://' will cause crashed
            Intent intent = new Intent(Intent.ACTION_VIEW, uri);
            startActivity(intent);
        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
