//package itptitpart3.anony1412.itptit.itptit_part3.members.member_d16;
//
//import android.content.Context;
//import android.support.v7.widget.RecyclerView;
//import android.view.LayoutInflater;
//import android.view.View;
//import android.view.ViewGroup;
//import android.widget.TextView;
//
//import com.squareup.picasso.Picasso;
//
//import de.hdodenhof.circleimageview.CircleImageView;
//import itptitpart3.anony1412.itptit.itptit_part3.R;
//
///**
// * Created by Anony1412 on 11/28/2017.
// */
//
//public class test {
//
//        private Context context;
//    private ArrayList<Member> membersD16;
//    private LayoutInflater inflater;
//
//    public D16Adapter(Context context, ArrayList<Member> objects) {
//        this.context = context;
//        this.membersD16 = objects;
//        this.inflater = LayoutInflater.from(context);
//    }
//
//    public D16Adapter() {
//
//    }
//
//    @Override
//    public D16Adapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
//        // tạo ra một object View kiểu ViewHolder
//        // thổi một layout vào gắn không trực tiếp lên View parent == RecyclerView
//        View view = inflater.inflate(R.layout.memberd16ngoquangbao, parent, false);
//        return ( new D16Adapter.ViewHolder(view));
//    }
//
//    @Override
//    public void onBindViewHolder(final D16Adapter.ViewHolder holder, final int position) {
//        final Member memberd16ngoquangbao = membersD16.get(position);
//        Picasso.with(context).load(memberd16ngoquangbao.getUrls()).resize(200, 200).centerCrop().into(holder.cvImg);
//        holder.txtMemberName.setText(memberd16ngoquangbao.getMemberName());
//        holder.txtDateOfBirth.setText(memberd16ngoquangbao.getBirthDay());
//        holder.txtAddress.setText(memberd16ngoquangbao.getQueQuan());
//        holder.txtTeamName.setText(memberd16ngoquangbao.getTeamName());
//        holder.txtPosition.setText(memberd16ngoquangbao.getChucVu());
//        holder.txtNickName.setText(memberd16ngoquangbao.getBietHieu());
//        holder.txtMeaningOfIT.setText(memberd16ngoquangbao.getITtrongToi());
//
//        holder.itemView.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
////                Intent intent = new Intent(context, DemoMemberActivity.class);
////                context.startActivity(intent);
//            }
//        });
//    }
//
//    @Override
//    public int getItemCount() {
//        return membersD16.size();
//    }
//
//    class ViewHolder extends RecyclerView.ViewHolder {
//        private CircleImageView cvImg;
//        private TextView txtMemberName;
//        private TextView txtDateOfBirth;
//        private TextView txtAddress;
//        private TextView txtTeamName;
//        private TextView txtPosition;
//        private TextView txtNickName;
//        private TextView txtMeaningOfIT;
//
//        public ViewHolder(View itemView) {
//            super(itemView);
//            cvImg           = itemView.findViewById(R.id.avatar);
//            txtMemberName   = itemView.findViewById(R.id.name);
//            txtDateOfBirth  = itemView.findViewById(R.id.date_of_birth);
//            txtAddress      = itemView.findViewById(R.id.address);
//            txtTeamName     = itemView.findViewById(R.id.teamName);
//            txtPosition     = itemView.findViewById(R.id.position);
//            txtNickName     = itemView.findViewById(R.id.nickname);
//            txtMeaningOfIT  = itemView.findViewById(R.id.meaning_of_it);
//        }
//    }
//}
//}
