package itptitpart3.anony1412.itptit.itptit_part3.members.member_d12;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;
import com.squareup.picasso.Picasso;

import de.hdodenhof.circleimageview.CircleImageView;
import itptitpart3.anony1412.itptit.itptit_part3.R;
import itptitpart3.anony1412.itptit.itptit_part3.members.Member;

/**
 * Created by Anony1412 on 11/25/2017.
 */

public class D12Activity extends AppCompatActivity {

    private CircleImageView cvImg;
    private TextView txtMemberName;
    private TextView txtDateOfBirth;
    private TextView txtAddress;
    private TextView txtTeamName;
    private TextView txtPosition;
    private TextView txtNickName;
    private TextView txtMeaningOfIT;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.memberd12luyennguyen);
        init();
    }

    private void init() {
        cvImg = findViewById(R.id.avatarLN);
        txtMemberName = findViewById(R.id.nameLN);
        txtDateOfBirth = findViewById(R.id.date_of_birthLN);
        txtAddress = findViewById(R.id.addressLN);
        txtTeamName = findViewById(R.id.teamNameLN);
        txtPosition = findViewById(R.id.positionLN);
        txtNickName = findViewById(R.id.nicknameLN);
        txtMeaningOfIT = findViewById(R.id.meaning_of_itLN);

        loadData();
    }

    private void loadData() {
        //Get datasnapshot at your "users" root node
        DatabaseReference ref = FirebaseDatabase.getInstance().getReference().child("Member").child("D12").child("-L-3Qt7BjIjO2eTKWXyH");
        ref.addListenerForSingleValueEvent(
                new ValueEventListener() {
                    @Override
                    public void onDataChange(DataSnapshot dataSnapshot) {
                        Member member = dataSnapshot.getValue(Member.class);
                        String path = member.getUrls().toString();
                        Picasso.with(D12Activity.this).load(path).into(cvImg);
                        txtMemberName.setText(member.getMemberName());
                        txtDateOfBirth.setText(member.getBirthDay());
                        txtAddress.setText(member.getQueQuan());
                        txtTeamName.setText(member.getTeamName());
                        txtPosition.setText(member.getChucVu());
                        txtNickName.setText(member.getBietHieu());
                        txtMeaningOfIT.setText(member.getITtrongToi());
                    }

                    @Override
                    public void onCancelled(DatabaseError databaseError) {
                        //handle databaseError
                    }
                });
    }
}
