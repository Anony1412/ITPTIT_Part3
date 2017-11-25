package itptitpart3.anony1412.itptit.itptit_part3.members;

import android.graphics.Typeface;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.TextView;

import com.google.firebase.database.ChildEventListener;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.ArrayList;

import itptitpart3.anony1412.itptit.itptit_part3.R;

/**
 * Created by Anony1412 on 11/22/2017.
 */

public class MemberActivity extends AppCompatActivity {

    private RecyclerView recyclerViewD12;
    private RecyclerView recyclerViewD13;
    private RecyclerView recyclerViewD14;
    private RecyclerView recyclerViewD15;
    private RecyclerView recyclerViewD16;

    private MembersD12Adapter adapterD12;
    private MembersD13Adapter adapterD13;
    private MembersD14Adapter adapterD14;
    private MembersD15Adapter adapterD15;
    private MembersD16Adapter adapterD16;

    private ArrayList<Member> membersD12 = new ArrayList<>();
    private ArrayList<Member> membersD13 = new ArrayList<>();
    private ArrayList<Member> membersD14 = new ArrayList<>();
    private ArrayList<Member> membersD15 = new ArrayList<>();
    private ArrayList<Member> membersD16 = new ArrayList<>();

    private TextView txt_memberITPTITClub;
    private TextView txt_D12;
    private TextView txt_D13;
    private TextView txt_D14;
    private TextView txt_D15;
    private TextView txt_D16;

    private DatabaseReference mData;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_member);

        mData = FirebaseDatabase.getInstance().getReference();

        maps();
        init();
        changeFonts();
    }

    private void maps() {
        recyclerViewD12 = findViewById(R.id.recyclerView_memberD12);
        recyclerViewD13 = findViewById(R.id.recyclerView_memberD13);
        recyclerViewD14 = findViewById(R.id.recyclerView_memberD14);
        recyclerViewD15 = findViewById(R.id.recyclerView_memberD15);
        recyclerViewD16 = findViewById(R.id.recyclerView_memberD16);

        txt_memberITPTITClub = findViewById(R.id.txt_membersITPTITClub);
        txt_D12 = findViewById(R.id.txt_D12);
        txt_D13 = findViewById(R.id.txt_D13);
        txt_D14 = findViewById(R.id.txt_D14);
        txt_D15 = findViewById(R.id.txt_D15);
        txt_D16 = findViewById(R.id.txt_D16);
    }

    private void changeFonts() {
        Typeface myFont = Typeface.createFromAsset(getAssets(), "fawn.ttf");
        txt_memberITPTITClub.setTypeface(myFont);
        txt_D12.setTypeface(myFont);
        txt_D13.setTypeface(myFont);
        txt_D14.setTypeface(myFont);
        txt_D15.setTypeface(myFont);
        txt_D16.setTypeface(myFont);
    }

    private void init() {
        initD12();
        initD13();
        initD14();
        initD15();
        initD16();
    }

    private void initD16() {
        upDataMemberD16();
        loadDataMemberD16();
    }

    private void initD15() {
//        upDataMemberD15();
        loadDataMemberD15();
    }

    private void initD14() {
//        upDataMemberD14();
        loadDataMemberD14();
    }

    private void initD13() {
//        upDataMemberD13();
        loadDataMemberD13();
    }

    private void initD12() {
//        upDataMemberD12();
        loadDataMemberD12();
    }

    private void upDataMemberD14() {
        Member ngoDucHung = new Member("https://i.imgur.com/6Fn2cgB.jpg",
                "Hưng Đức Ngô",
                "21",
                "Em không biết",
                "Team 1",
                "Guitarist",
                "Anh trai quốc dân",
                "Em không biết");
        mData.child("Member").child("D14").push().setValue(ngoDucHung);

        Member thuThuy = new Member("https://i.imgur.com/giddmOC.jpg",
                "Thu Thủy",
                "07/10/1996",
                "Hà Nội",
                "Em không biết",
                "Cựu trưởng ban Thủ quỹ",
                "chị Thủy đáng yêu",
                "Em không biết");
        mData.child("Member").child("D14").push().setValue(thuThuy);

        Member dangQuangHuy = new Member("https://i.imgur.com/ahuBCIj.jpg",
                "Đặng Quang Huy",
                "02/08/1996",
                "Ân Thi - Hưng Yên",
                "Team 4",
                "Mr IT 2016",
                "Huy Dubai",
                "IT cho mình cảm giác như đang ở nhà vậy - dubai của tôi");
        mData.child("Member").child("D14").push().setValue(dangQuangHuy);
    }

    private void loadDataMemberD14() {
        mData.child("Member").child("D14").addChildEventListener(new ChildEventListener() {
            @Override
            public void onChildAdded(DataSnapshot dataSnapshot, String s) {
                Member member = dataSnapshot.getValue(Member.class);
                membersD14.add(member);
//                Toast.makeText(MemberActivity.this, "" + member.getMemberName(), Toast.LENGTH_SHORT).show();
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

        adapterD14 = new MembersD14Adapter(this, membersD14);
        recyclerViewD14.setAdapter(adapterD14);
        LinearLayoutManager layoutManagerD14 = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false);
        recyclerViewD14.setLayoutManager(layoutManagerD14);
    }

    private void upDataMemberD15() {
        Member duyQui = new Member("https://i.imgur.com/BeYNS5V.jpg",
                "Duy Quí",
                "08/09/1997",
                "Hưng Yên",
                "Team 1",
                "Mentor tiểu ban Android - Ứng dụng band",
                "",
                "IT giống như Trần Duy Hưng");
        mData.child("Member").child("D15").push().setValue(duyQui);

        Member hoangDucThanh = new Member("https://i.imgur.com/7Yqj0xm.jpg",
                "Hoàng Đức Thành",
                "20",
                "",
                "Team 4",
                "Mentor tiểu ban Android - Ứng dụng band",
                "",
                "IT giống như Trần Duy Hưng");
        mData.child("Member").child("D15").push().setValue(hoangDucThanh);

        Member minhHuyen = new Member("https://i.imgur.com/IBfrZIx.jpg",
                "Minh Huyền",
                "20",
                "Hà Nội",
                "Team 4",
                "Menber",
                "",
                "");
        mData.child("Member").child("D15").push().setValue(minhHuyen);
    }

    private void loadDataMemberD15() {
        mData.child("Member").child("D15").addChildEventListener(new ChildEventListener() {
            @Override
            public void onChildAdded(DataSnapshot dataSnapshot, String s) {
                Member member = dataSnapshot.getValue(Member.class);
                membersD15.add(member);
//                Toast.makeText(MemberActivity.this, "" + member.getMemberName(), Toast.LENGTH_SHORT).show();
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

        adapterD15 = new MembersD15Adapter(this, membersD15);
        recyclerViewD15.setAdapter(adapterD15);
        LinearLayoutManager layoutManagerD15 = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false);
        recyclerViewD15.setLayoutManager(layoutManagerD15);
    }

    private void upDataMemberD16() {
        Member ngoQuangBao = new Member("https://i.imgur.com/LgKONvw.jpg",
                "Ngọ Quang Bảo",
                "16/04/1998",
                "Hiệp Hòa - Bắc Giang",
                "Team 4",
                "Member",
                "",
                "Cô là ai? Cháu không biết! Cô đi ra đi >.<");
        mData.child("Member").child("D16").push().setValue(ngoQuangBao);

        Member phuongLinh = new Member("https://i.imgur.com/6JYN3T3.jpg",
                "Phạm Thị Phương",
                "16/12/1998",
                "Hà Nội",
                "Team 2",
                "Phó ban Sự Kiện",
                "",
                "IT trong tôi");
        mData.child("Member").child("D16").push().setValue(phuongLinh);

        Member thanhTam = new Member("https://i.imgur.com/Y6r5ouF.jpg",
                "Thanh Tâm",
                "19",
                "Hải Dương",
                "Team 4",
                "Phó ban Cơ Bản",
                "",
                "");
        mData.child("Member").child("D16").push().setValue(thanhTam);
    }

    private void loadDataMemberD16() {
        mData.child("Member").child("D16").addChildEventListener(new ChildEventListener() {
            @Override
            public void onChildAdded(DataSnapshot dataSnapshot, String s) {
                Member member = dataSnapshot.getValue(Member.class);
                membersD16.add(member);
//                Toast.makeText(MemberActivity.this, "" + member.getMemberName(), Toast.LENGTH_SHORT).show();
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

        adapterD16 = new MembersD16Adapter(this, membersD16);
        recyclerViewD16.setAdapter(adapterD16);
        LinearLayoutManager layoutManagerD16 = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false);
        recyclerViewD16.setLayoutManager(layoutManagerD16);
    }

    private void upDataMemberD13() {
        Member hungManhDao = new Member("https://i.imgur.com/Ps1I6BI.jpg",
                "Đào Mạnh Hùng",
                "18/10/1995",
                "Ninh Bình",
                "Team 4",
                "Boss Team 4",
                "Hùng Mèo",
                "Tôi không quan tâm, việc của tôi là giải cứu thế giới!");
        mData.child("Member").child("D13").push().setValue(hungManhDao);
    }

    private void loadDataMemberD13() {
        mData.child("Member").child("D13").addChildEventListener(new ChildEventListener() {
            @Override
            public void onChildAdded(DataSnapshot dataSnapshot, String s) {
                Member member = dataSnapshot.getValue(Member.class);
                membersD13.add(member);
//                Toast.makeText(MemberActivity.this, "" + member.getMemberName(), Toast.LENGTH_SHORT).show();
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

        adapterD13 = new MembersD13Adapter(this, membersD13);
        recyclerViewD13.setAdapter(adapterD13);
        LinearLayoutManager layoutManagerD13 = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false);
        recyclerViewD13.setLayoutManager(layoutManagerD13);
    }

    private void loadDataMemberD12() {
        mData.child("Member").child("D12").addChildEventListener(new ChildEventListener() {
            @Override
            public void onChildAdded(DataSnapshot dataSnapshot, String s) {
                Member member = dataSnapshot.getValue(Member.class);
                membersD12.add(member);
//                Toast.makeText(MemberActivity.this, "" + member.getMemberName(), Toast.LENGTH_SHORT).show();
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

        adapterD12 = new MembersD12Adapter(this, membersD12);
        recyclerViewD12.setAdapter(adapterD12);
        LinearLayoutManager layoutManagerD12 = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false);
        recyclerViewD12.setLayoutManager(layoutManagerD12);
    }

    private void upDataMemberD12() {
        Member luyenNguyen = new Member("https://i.imgur.com/RRH9C7o.jpg",
                "Luyện Nguyễn",
                "10/04/1994",
                "Tân Yên - Bắc Giang",
                "Team ??",
                "Cựu chủ nhiệm",
                "",
                "");
        mData.child("Member").child("D12").push().setValue(luyenNguyen);
    }
}
