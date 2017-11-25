package itptitpart3.anony1412.itptit.itptit_part3.members;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.util.List;

import itptitpart3.anony1412.itptit.itptit_part3.R;
import itptitpart3.anony1412.itptit.itptit_part3.members.member_d14.D14Activity;

/**
 * Created by Anony1412 on 11/23/2017.
 */

public class MembersD14Adapter extends RecyclerView.Adapter<MembersD14Adapter.ViewHolder> {

    private Context context;
    private List<Member> membersD14;
    private LayoutInflater inflater;

    public MembersD14Adapter(Context context, List<Member> objects) {
        this.context = context;
        this.membersD14 = objects;
        this.inflater = LayoutInflater.from(context);
    }

    public MembersD14Adapter() {

    }

    @Override
    public MembersD14Adapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        // tạo ra một object View kiểu ViewHolder
        // thổi một layout vào gắn không trực tiếp lên View parent == RecyclerView
        View view = inflater.inflate(R.layout.item, parent, false);
        return ( new MembersD14Adapter.ViewHolder(view));
    }

    @Override
    public void onBindViewHolder(final MembersD14Adapter.ViewHolder holder, final int position) {
        final Member member = membersD14.get(position);
        Picasso.with(context).load(member.getUrls()).resize(200, 200).centerCrop().into(holder.img);
        holder.txt_name.setText(member.getMemberName());

        // xóa item khi click
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(context, D14Activity.class);
                context.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return membersD14.size();
    }

    class ViewHolder extends RecyclerView.ViewHolder {
        private ImageView img;
        private TextView txt_name;
        public ViewHolder(View itemView) {
            super(itemView);
            img = itemView.findViewById(R.id.img_Member);
            txt_name = itemView.findViewById(R.id.txt_nameMemberFirst);
        }
    }
}
