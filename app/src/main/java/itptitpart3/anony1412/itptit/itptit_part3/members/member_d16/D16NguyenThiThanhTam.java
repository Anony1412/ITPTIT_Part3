package itptitpart3.anony1412.itptit.itptit_part3.members.member_d16;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
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
 * Created by Anony1412 on 11/29/2017.
 */

public class D16NguyenThiThanhTam extends Fragment {
    private CircleImageView cvImg;
    private TextView txtMemberName;
    private TextView txtDateOfBirth;
    private TextView txtAddress;
    private TextView txtTeamName;
    private TextView txtPosition;
    private TextView txtNickName;
    private TextView txtMeaningOfIT;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.memberd16nguyenthithanhtam, container, false);
    }

    @Override
    public void onStart() {
        super.onStart();
        init();
    }

    private void init() {
        cvImg = getActivity().findViewById(R.id.avatarNTTT);
        txtMemberName = getActivity().findViewById(R.id.nameNTTT);
        txtDateOfBirth = getActivity().findViewById(R.id.date_of_birthNTTT);
        txtAddress = getActivity().findViewById(R.id.addressNTTT);
        txtTeamName = getActivity().findViewById(R.id.teamNameNTTT);
        txtPosition = getActivity().findViewById(R.id.positionNTTT);
        txtNickName = getActivity().findViewById(R.id.nicknameNTTT);
        txtMeaningOfIT = getActivity().findViewById(R.id.meaning_of_itNTTT);

        loadData();
    }

    private void loadData() {
        //Get datasnapshot at your "users" root node
        DatabaseReference ref = FirebaseDatabase.getInstance().getReference().child("Member").child("D16").child("-L-3Qt7ZQfImJjQAuexa");
        ref.addListenerForSingleValueEvent(
                new ValueEventListener() {
                    @Override
                    public void onDataChange(DataSnapshot dataSnapshot) {
                        Member member = dataSnapshot.getValue(Member.class);
                        String path = member.getUrls().toString();
                        Picasso.with(getContext()).load(path).into(cvImg);
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
