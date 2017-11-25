package itptitpart3.anony1412.itptit.itptit_part3.members.member_d15;

import android.content.Context;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.google.firebase.database.ChildEventListener;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.ArrayList;
import java.util.List;

import itptitpart3.anony1412.itptit.itptit_part3.R;
import itptitpart3.anony1412.itptit.itptit_part3.members.Member;

/**
 * Created by Anony1412 on 11/25/2017.
 */

public class D15Activity extends AppCompatActivity {

    private List<Member> membersD15 = new ArrayList<>();
    private RecyclerView rvD15;
    private D15Adapter adapter;

    DatabaseReference mData;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.d16recyclerviewmembers);

        mData = FirebaseDatabase.getInstance().getReference();
        init();
    }

    private void init() {

        mData.child("Member").child("D15").addChildEventListener(new ChildEventListener() {
            @Override
            public void onChildAdded(DataSnapshot dataSnapshot, String s) {
                Member member = dataSnapshot.getValue(Member.class);
                membersD15.add(member);
            }

            @Override
            public void onChildChanged(DataSnapshot dataSnapshot, String s) {

            }

            @Override
            public void onChildRemoved(DataSnapshot dataSnapshot) {

            }

            @Override
            public void onChildMoved(DataSnapshot dataSnapshot, String s) {

            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });

        rvD15 = findViewById(R.id.rvD16Members);
        adapter = new D15Adapter(this, membersD15);
        rvD15.setAdapter(adapter);
        LinearLayoutManager layoutManagerD15 = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false);
        rvD15.setLayoutManager(layoutManagerD15);
    }

    // change font to all textview in activity
    private void overrideFonts(final Context context, final View v) {
        try {
            if (v instanceof ViewGroup) {
                ViewGroup vg = (ViewGroup) v;
                for (int i = 0; i < vg.getChildCount(); i++) {
                    View child = vg.getChildAt(i);
                    overrideFonts(context, child);
                }
            } else if (v instanceof TextView) {
                ((TextView) v).setTypeface(Typeface.createFromAsset(context.getAssets(), "font.ttf"));
            }
        } catch (Exception e) {
        }
    }
}
