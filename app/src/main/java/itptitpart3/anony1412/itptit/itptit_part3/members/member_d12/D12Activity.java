package itptitpart3.anony1412.itptit.itptit_part3.members.member_d12;

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

import itptitpart3.anony1412.itptit.itptit_part3.R;
import itptitpart3.anony1412.itptit.itptit_part3.members.Member;

/**
 * Created by Anony1412 on 11/25/2017.
 */

public class D12Activity extends AppCompatActivity {

    private ArrayList<Member> membersD12 = new ArrayList<>();
    private RecyclerView rvD12;
    private D12Adapter adapter;

    DatabaseReference mData;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.d16recyclerviewmembers);

        mData = FirebaseDatabase.getInstance().getReference();
        init();
    }

    private void init() {

        mData.child("Member").child("D12").addChildEventListener(new ChildEventListener() {
            @Override
            public void onChildAdded(DataSnapshot dataSnapshot, String s) {
                Member member = dataSnapshot.getValue(Member.class);
                membersD12.add(member);
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

        rvD12 = findViewById(R.id.rvD16Members);
        adapter = new D12Adapter(this, membersD12);
        rvD12.setAdapter(adapter);
        LinearLayoutManager layoutManagerD12 = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false);
        rvD12.setLayoutManager(layoutManagerD12);
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
