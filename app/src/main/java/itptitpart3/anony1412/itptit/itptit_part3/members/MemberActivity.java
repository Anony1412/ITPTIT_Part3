package itptitpart3.anony1412.itptit.itptit_part3.members;

import android.graphics.Typeface;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
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

    private static final String TAG = "";
    private RecyclerView recyclerViewD12;
    private RecyclerView recyclerViewD13;
    private RecyclerView recyclerViewD14;
    private RecyclerView recyclerViewD15;
    private RecyclerView recyclerViewD16;

    private MembersD12Adapter adapterD12;
    private MembersD13Adapter adapterD13;
    private MembersD14Adapter adapterD14;
    private MembersD15Adapter adapterD15;
    private MembersD16Adapter adapterD16;//???? D12 D13 D14 D15 khác nhau cái gì mà tận 5 class

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
        maps();
        mData = FirebaseDatabase.getInstance().getReference();

        //mData.child("Member").getDatabase().getReference(); cái dogn này em mới thêm
        loadData();

        changeFonts();
    }

    @Override
    protected void onStart() {
        super.onStart();
//        loadData();
    }

    private void init() {
//        upData();
        loadData();
    }

    private void loadData() {
        Log.d(TAG, "loadData: ");
        loadDataMemberD12();
        loadDataMemberD13();
        loadDataMemberD14();
        loadDataMemberD15();
        loadDataMemberD16();
    }

    private void upData() {
//        upDataMemberD12();
//        upDataMemberD13();
//        upDataMemberD14();
//        upDataMemberD15();
//        upDataMemberD16();
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

    private void upDataMemberD14() {

        Member vuDinhHoang = new Member("https://i.imgur.com/bzPb8ad.jpg",
                "Vũ Đình Hoàng",
                "10/06/1996",
                "Thanh Hóa",
                "D14 - Team 5",
                "Member, Nguyên phó ban sự kiện + Trưởng ban sự kiện + Chủ tịch, Cố vấn cấp cao ban nội các",
                "Chủ tịch vĩ đại :3",
                "Là một ngày nắng rực rỡ rọi lên những bờ vai đang cùng sát cánh!!!");
        mData.child("Member").child("D14").push().setValue(vuDinhHoang);

        Member nguyenThaiSon = new Member("https://i.imgur.com/4Kl3rU6.jpg",
                "Nguyễn Thái Sơn",
                "04/01/1996",
                "Hà Nội",
                "D14 - Team 1",
                "(Nguyên) Phó chủ nhiệm + Trưởng Ban thuật toán + Phó Ban Cơ Bản, Hội trưởng Hội em gái",
                "Sơn Núi",
                "Hers");
        mData.child("Member").child("D14").push().setValue(nguyenThaiSon);

        Member nguyenQuyThuc = new Member("https://i.imgur.com/4DHK2iW.jpg",
                "Nguyễn Quy Thức",
                "29/02/1996",
                "Hải Dương",
                "D14 - Team 2",
                "Nguyên phó chủ nhiệm + Trưởng ban Cơ bản",
                "Soái ca lạnh lùng",
                "IT với tôi là Ice-Tea");
        mData.child("Member").child("D14").push().setValue(nguyenQuyThuc);

        Member ngoDucHung = new Member("https://i.imgur.com/pMOoxyk.jpg",
                "Ngô Đức Hưng",
                "08/09/1995",
                "Nam Định",
                "D14 - Team 1",
                "Member",
                "",
                "Nó là gia đình");
        mData.child("Member").child("D14").push().setValue(ngoDucHung);

        Member thuThuy = new Member("https://i.imgur.com/giddmOC.jpg",
                "Thu Thủy",
                "07/10/1996",
                "Hà Nội",
                "D14 - Team 1",
                "Nguyên trưởng ban Tài chính",
                "chị Thủy đáng yêu",
                "Yêu mọi người <3");
        mData.child("Member").child("D14").push().setValue(thuThuy);

        Member dangQuangHuy = new Member("https://i.imgur.com/NxHz2ip.jpg",
                "Đặng Quang Huy",
                "02/08/1996",
                "Ân Thi - Hưng Yên",
                "D14 - Team 4",
                "Boss Team 4, Mr IT 2016",
                "Huy Dubai",
                "IT là ngôi nhà thứ 2 của mình - Dubai là nơi còn lại");
        mData.child("Member").child("D14").push().setValue(dangQuangHuy);

        Member tranCongKhanh = new Member("https://i.imgur.com/tn9FL7o.jpg",
                "Trần Công Khánh",
                "23/02/1996",
                "Nam Định",
                "D14 - Team 3",
                "Member",
                "Khánh công chúa, Khánh dậu",
                "Cả quãng đời đại học của tôi là IT.");
        mData.child("Member").child("D14").push().setValue(tranCongKhanh);
    }

    private void loadDataMemberD14() {
        mData.child("Member").child("D14").addChildEventListener(new ChildEventListener() {
            @Override
            public void onChildAdded(DataSnapshot dataSnapshot, String s) {
                Member member = dataSnapshot.getValue(Member.class);
                membersD14.add(member);
                adapterD14.notifyItemInserted(membersD14.size() - 1);
//                Toast.makeText(MemberActivity.this, "" + memberd16ngoquangbao.getMemberName(), Toast.LENGTH_SHORT).show();
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

        Member nguyenThanhLuan = new Member("https://i.imgur.com/UoGo0tv.png",
                "Nguyễn Thành Luân",
                "14/01/97",
                "SaPa - Lào Cai",
                "D15 - Team2",
                "Chủ nhiệm clb ITPTIT",
                "",
                "Mãi là anh em, code ít xàm nhiều");
        mData.child("Member").child("D15").push().setValue(nguyenThanhLuan);

        Member leDinhLoi = new Member("https://i.imgur.com/B5qIBJo.jpg",
                "Lê Đình Lợi",
                "08/08/1997",
                "Nghệ An",
                "D15 - Team 5",
                "Phó chủ nhiệm clb ITPTIT",
                "",
                "Nơi bán hành và ra vẻ với bọn con nít training dù chẳng biết mẹ gì :D");
        mData.child("Member").child("D15").push().setValue(leDinhLoi);

        Member buiThiCuc = new Member("https://i.imgur.com/y54XpxZ.jpg",
                "Bùi Thị Cúc",
                "26/07/1997",
                "Hà Tây",
                "D15 - Team 5",
                "Phó chủ nhiệm clb ITPTIT",
                "",
                "My youth, my Fire IT and my second family <3 ");
        mData.child("Member").child("D15").push().setValue(buiThiCuc);

        Member dangBaoChien = new Member("https://i.imgur.com/e7HSfFh.jpg",
                "Đặng Bảo Chiến",
                "14/05/1997",
                "Thọ Xuân - Thanh Hóa",
                "D15 - Team 3",
                "Phó chủ nhiệm clb ITPTIT",
                "",
                "Là những hôm ăn no hành");
        mData.child("Member").child("D15").push().setValue(dangBaoChien);

        Member nguyenVanThanh = new Member("https://i.imgur.com/vO9a3Wc.jpg",
                "Nguyễn Văn Thành",
                "17/05/1994",
                "Hưng Yên",
                "D15 - Team 5",
                "Trưởng ban Ứng dụng",
                "NA",
                ".");
        mData.child("Member").child("D15").push().setValue(nguyenVanThanh);

        Member duyQui = new Member("https://i.imgur.com/BeYNS5V.jpg",
                "Duy Quí",
                "08/09/1997",
                "Hưng Yên",
                "D15 - Team 1",
                "Mentor of Android Branch",
                "",
                "IT giống như TDH");
        mData.child("Member").child("D15").push().setValue(duyQui);

        Member hoangDucThanh = new Member("https://i.imgur.com/7Yqj0xm.jpg",
                "Hoàng Đức Thành",
                "16/11/1997",
                "Phú Thọ",
                "D15 - Team 4",
                "Mentor of Android Branch",
                "Ở nhà học đi",
                "Là việc ăn hành và đi hành");
        mData.child("Member").child("D15").push().setValue(hoangDucThanh);

        Member taTaiLinh = new Member("https://i.imgur.com/ol4PYtV.jpg",
                "Tạ Tài Linh",
                "06/08/1997",
                "Phú Thọ",
                "D15 - Team 3",
                "Trưởng ban Tài chính",
                "chị Chính :v, #Song",
                "IT là ngôi nhà ấm áp, đó là chân thành và tin tưởng, không có từ ngữ nào diễn tả được <3");
        mData.child("Member").child("D15").push().setValue(taTaiLinh);

        Member nguyenThiMinhHuyen = new Member("https://i.imgur.com/IBfrZIx.jpg",
                "Nguyễn Thị Minh Huyền",
                "1997",
                "Hà Nội",
                "D15 - Team 4",
                "Menber",
                "",
                "con đường xưa em đi...");
        mData.child("Member").child("D15").push().setValue(nguyenThiMinhHuyen);

        Member nguyenTheMinhThang = new Member("https://i.imgur.com/SW9LNCc.jpg",
                "Nguyễn Thế Minh Thắng",
                "11/11/1997",
                "Đan Phượng - Hà Nội",
                "D15 - Team 3",
                "Member",
                "",
                "IT là nơi cho tôi được sống với chính mình <3");
        mData.child("Member").child("D15").push().setValue(nguyenTheMinhThang);

        Member dinhLenhQuangHuy = new Member("https://i.imgur.com/WvGvFMp.jpg",
                "Đinh Lệnh Quang Huy",
                "07/09/1997",
                "Hoa Lư - Ninh Bình",
                "D15 - Team 2",
                "Member",
                "",
                "Câu lạc bộ học và chơi");
        mData.child("Member").child("D15").push().setValue(dinhLenhQuangHuy);

        Member chuXuanThang = new Member("https://i.imgur.com/Xu0uU0V.jpg",
                "Chu Xuân Thắng",
                "24/04/1996",
                "Quảng Ninh",
                "D15 - Team 5",
                "Member",
                "Thắng TL",
                "Well, nếu không có IT, đại học của tôi chẳng biết có gì gọi là thú vị nữa :v");
        mData.child("Member").child("D15").push().setValue(chuXuanThang);

        Member nguyenNgocAnh = new Member("https://i.imgur.com/gY3CeLq.jpg",
                "Nguyễn Ngọc Anh",
                "12/06/1997",
                "Phúc Yên-Vĩnh Phúc",
                "D15 - Team 4",
                "Member",
                "Scofield Nguyễn",
                "Nơi tình yêu bắt đầu - Bùi Anh Tuấn ");
        mData.child("Member").child("D15").push().setValue(nguyenNgocAnh);

        Member tranHoangViet = new Member("https://i.imgur.com/gXBdySo.jpg",
                "Trần Hoàng Việt",
                "30/08/1997",
                "Thanh Miện - Hải Dương",
                "D15 - Team 3",
                "Member",
                "Vịt :3",
                "Ngảy xửa ngày xưa, ở 1 khu rừng nọ có bộ tộc người IT, và có một cậu bé No Name bị bắt cóc...");
        mData.child("Member").child("D15").push().setValue(tranHoangViet);

        Member haVanDuong = new Member("https://i.imgur.com/QBN01mo.jpg",
                "Hà Văn Dương",
                "02/09/1997",
                "Mê Linh - Hà Nội",
                "D15-Team 2",
                "Member",
                "",
                "IT trong tôi nó đơn giản lắm. IT PTIT cảm xúc chỉ có thể tốt hơn");
        mData.child("Member").child("D15").push().setValue(haVanDuong);

        Member toMinhHien = new Member("https://i.imgur.com/hUqsh35.png",
                "Tô Minh Hiển",
                "28/09/1997",
                "Kim Sơn - Ninh Bình",
                "D15 - Team 4",
                "Member",
                "",
                "Mình thích IT thì mình nhích thôi =))");
        mData.child("Member").child("D15").push().setValue(toMinhHien);

        Member nguyenThiTuyetMai = new Member("https://i.imgur.com/8VI86tG.jpg",
                "Nguyễn Thị Tuyết Mai",
                "23/03/1997",
                "Kinh Môn - Hải Dương",
                "D15 - Team 4",
                "Member",
                "",
                "Cá chép om dưa - mãi là anh em");
        mData.child("Member").child("D15").push().setValue(nguyenThiTuyetMai);

        Member daoVanThang = new Member("https://i.imgur.com/8Prx5YU.jpg",
                "Đào Văn Thắng",
                "03/071997",
                "Vĩnh Tường - Vĩnh phúc",
                "D15 -Team2,3",
                "Member",
                "Thắng kimchi",
                "Cám ơn IT, nhờ IT mà mình có thêm nhiều bạn bè, học hỏi được nhiều");
        mData.child("Member").child("D15").push().setValue(daoVanThang);

        Member vuThiThuyDung = new Member("https://i.imgur.com/M3mMwfa.jpg",
                "Vũ Thị Thùy Dung",
                "27/02/1997",
                "Nga Sơn - Thanh Hóa",
                "D15 - Team 2",
                "Member",
                "Cục trưởng cục thính học itpit",
                "Nhiều lắm kể không hết đâu, tóm lại IT với mình là gia đình. và mình yêu gia đình ấy :D ");
        mData.child("Member").child("D15").push().setValue(vuThiThuyDung);

        Member trinhNgocThach = new Member("https://i.imgur.com/UiQsz3W.jpg",
                "Trịnh Ngọc Thạch",
                "18/08/1996",
                "Bỉm Sơn - Thanh Hóa",
                "D15 - Team3",
                "Phó Ban SK cũ",
                "",
                "IT trong tôi là thanh xuân, là một cái gì đó na ná người yêu vậy, nhiều kỉ niệm");
        mData.child("Member").child("D15").push().setValue(trinhNgocThach);

        Member phamTrungThanh = new Member("https://i.imgur.com/YN12cTP.jpg",
                "Phạm Trung Thành",
                "19/10/1997",
                "Cửa Ông -Quảng Ninh",
                "D15 - Team 1",
                "Phó ban Thuật toán",
                "",
                "(IT)");
        mData.child("Member").child("D15").push().setValue(phamTrungThanh);

        Member nguyenDinhTai = new Member("https://i.imgur.com/r1FtDGS.jpg",
                "Nguyễn Đình Tài",
                "04/05/1997",
                "Hà Tĩnh",
                "D15 - Team 2",
                "Member",
                "oc",
                "Mãi là anh em.");
        mData.child("Member").child("D15").push().setValue(nguyenDinhTai);

        Member phungTienSi = new Member("https://i.imgur.com/eFBBexB.jpg",
                "Phùng Tiến Sỹ",
                "13/01/1997",
                "Ba Vì - Hà Nội",
                "D15 - Team5",
                "Member",
                "",
                "<3 ");
        mData.child("Member").child("D15").push().setValue(phungTienSi);

        Member phamDucCuong = new Member("https://i.imgur.com/JVeygwc.jpg",
                "Phạm Đức Cường",
                "07/11/1997",
                "Hà Nội 2",
                "D15 - Team 1",
                "Member",
                "Phạm Đức Bốn",
                "The World");
        mData.child("Member").child("D15").push().setValue(phamDucCuong);
    }

    private void loadDataMemberD15() {
        mData.child("Member").child("D15").addChildEventListener(new ChildEventListener() {
            @Override
            public void onChildAdded(DataSnapshot dataSnapshot, String s) {
                Member member = dataSnapshot.getValue(Member.class);
                membersD15.add(member);
                adapterD15.notifyItemInserted(membersD15.size() - 1);
//                Toast.makeText(MemberActivity.this, "" + memberd16ngoquangbao.getMemberName(), Toast.LENGTH_SHORT).show();
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

        Member nguyenThiThanhTam = new Member("https://i.imgur.com/sk0PBVT.jpg",
                "Nguyễn Thị Thanh Tâm",
                "09/06/1998",
                "Hải Dương",
                "D16 - Team 4",
                "Phó ban Cơ Bản",
                "",
                "Là chi họ Tứ - Băng đảng giang hồ to nhất Bưu chính :))");
        mData.child("Member").child("D16").push().setValue(nguyenThiThanhTam);

        Member buiDucPhi = new Member("https://i.imgur.com/YA8AfGu.jpg",
                "Bùi Đức Phi",
                "28/06/1998",
                "Nam Định",
                "D16 - Team 5",
                "Phó ban Cơ bản",
                "",
                "Đây là gia đình thứ 2 của tôi");
        mData.child("Member").child("D16").push().setValue(buiDucPhi);

        Member phamThiPhuong = new Member("https://i.imgur.com/YQmIyHm.jpg",
                "Phạm Thị Phương",
                "16/12/1998",
                "Thanh Oai - Hà Nội",
                "D16 - Team 2",
                "Phó ban Sự kiện",
                "Giang Thần thiếu niên đẹp trai",
                "IT trong tôi là gì??? Là những buổi đi chơi vui vẻ...Nhiều lắm...");
        mData.child("Member").child("D16").push().setValue(phamThiPhuong);

        Member nghiemPhuThiet = new Member("https://i.imgur.com/uZuWybY.jpg",
                "Nghiêm Phú Thiết",
                "14/12/1998",
                "Thanh Oai - Hà Tây",
                "D16 - Team 2",
                "Phó ban Sự kiện",
                "",
                "IT PTIT - Mãi là anh em :)))");
        mData.child("Member").child("D16").push().setValue(nghiemPhuThiet);

        Member dinhCongHuy = new Member("https://i.imgur.com/Bck7Qbq.jpg",
                "Đinh Công Huy",
                "21/01/1998",
                "Phú Thọ",
                "D16 - Team1",
                "Phó ban Sự kiện",
                "Anh trai quốc dân",
                "IT trong tôi là gia đình, là bạn bè, là anh em, và là ngôi nhà thứ 2");
        mData.child("Member").child("D16").push().setValue(dinhCongHuy);

        Member nghiemXuanHop = new Member("https://i.imgur.com/JSk2B0s.jpg",
                "Nghiêm Xuân Hợp",
                "26/05/1998",
                "Ứng Hòa - Hà Nội ",
                "D16- Team 4",
                "Member",
                "",
                "IT mang lại cho tôi những kỉ niệm và món quà quý giá là những người bạn");
        mData.child("Member").child("D16").push().setValue(nghiemXuanHop);

        Member vuDucTrieu = new Member("https://i.imgur.com/dr95B4b.jpg",
                "Vũ Đức Triều",
                "31/01/1998",
                "Hải Hậu - Nam Định",
                "D16 - Team 2",
                "Member",
                "",
                "ITPTIT là nơi để tôi được vui chơi, học tập giao lưu, nó đã trở thành nguồn sống của tôi");
        mData.child("Member").child("D16").push().setValue(vuDucTrieu);

        Member vuongVuBacSon = new Member("https://i.imgur.com/ctoDSZw.jpg",
                "Vương Vũ Bắc Sơn",
                "13/01/1998",
                "Thừa Thiên - Huế",
                "D16 - Team 5",
                "Member",
                "",
                "Do mới vào nên chưa có gì đặc biệt, nhưng hi vọng nó sẽ là quãng thời gian đẹp nhất của thời sinh viên ");
        mData.child("Member").child("D16").push().setValue(vuongVuBacSon);

        Member nguyenNgocTiep = new Member("https://i.imgur.com/WBTpyjL.jpg",
                "Nguyễn Ngọc Tiệp",
                "04/08/1998",
                "Bắc Từ Liêm - Hà Nội",
                "D16 - Team4 ",
                "Member",
                "Tiep Nguyen PTIT",
                "ITPTIT mãi là anh em");
        mData.child("Member").child("D16").push().setValue(nguyenNgocTiep);

        Member trinhNgocAnh = new Member("https://i.imgur.com/CAxSZvK.jpg",
                "Trịnh Thị Ngọc Ánh",
                "19/09/1998",
                "Thanh Hóa",
                "D16 - Team 2",
                "Member",
                "Khủng bố IS",
                "IT trong tôi là ma sói :3");
        mData.child("Member").child("D16").push().setValue(trinhNgocAnh);

        Member taThiHuong = new Member("https://i.imgur.com/I52LyWR.jpg",
                "Tạ Thị Hường",
                "17/05/1998",
                "Hoài Đức - Hà Nội",
                "D16 - Team 2",
                "Member",
                "",
                "IceTea");
        mData.child("Member").child("D16").push().setValue(taThiHuong);

        Member nguyenKhacMinh = new Member("https://i.imgur.com/JSNsXJa.jpg",
                "Nguyễn Khắc Minh",
                "18/10/1998",
                "Hà Nội",
                "D16 - Team 2",
                "Member",
                "",
                "Yêu");
        mData.child("Member").child("D16").push().setValue(nguyenKhacMinh);

        Member tranNgocNam = new Member("https://i.imgur.com/MJPabt7.jpg",
                "Trần Ngọc Nam",
                "18/07/1998",
                "Thanh Hóa",
                "D16 - Team 2",
                "Member",
                "",
                "Em luôn tự hào mình là một thành viên của clb IT.\n" +
                        "<IT mãi trong tôi>");
        mData.child("Member").child("D16").push().setValue(tranNgocNam);

        Member hoangThiThuUyen = new Member("https://i.imgur.com/k46A4Ph.jpg",
                "Hoàng Thị Thu Uyên",
                "24/01/1998",
                "Đan phượng - Hà Nội",
                "D16 - Team 2",
                "Member",
                "",
                "IT PTIT <3");
        mData.child("Member").child("D16").push().setValue(hoangThiThuUyen);

        Member nguyenThiAnh = new Member("https://i.imgur.com/pIg7eQj.jpg",
                "Nguyễn Thị Ánh",
                "16/07/1998",
                "Nam Trực - Nam Định",
                "D16 - Team 2",
                "Member",
                "",
                "Tôi đã có những người bạn mà tôi không thể thiếu. IT club có sức trẻ, sự hài hước, nhiệt huyết và hoài bão");
        mData.child("Member").child("D16").push().setValue(nguyenThiAnh);

        Member nguyenThaiDuong = new Member("https://i.imgur.com/2ACAh2Z.jpg",
                "Nguyễn Thái Dương",
                "06/09/1998",
                "Bắc Ninh",
                "D16 - Team 5",
                "Member",
                "dương vật óc chó...",
                "\"Tôi là ai và đây là đâu ?\" - Đây là câu tóm gọn hết những gì về em trong clb IT");
        mData.child("Member").child("D16").push().setValue(nguyenThaiDuong);

        Member tranQuangLinh = new Member("https://i.imgur.com/TsDNqjS.jpg",
                "Trần Quang Linh",
                "30/06/1998",
                "Thanh Oai - Hà Nội",
                "D16 - Team 3",
                "Member",
                "Linh Trần",
                "Mãi là anh em <3");
        mData.child("Member").child("D16").push().setValue(tranQuangLinh);

        Member doTienCuong = new Member("https://i.imgur.com/NYnJY76.jpg",
                "Đỗ Tiến Cường",
                "30/09/1998",
                "Quốc Oai - Hà Nội",
                "D16 - Team 5",
                "Member",
                "Vượn Quẩy",
                "Mặc dù là thành viên mới, nhưng tôi cảm nhận được sự ấm áp của gia đình ITPTIT mang lại <3");
        mData.child("Member").child("D16").push().setValue(doTienCuong);

        Member nguyenThiLanAnh = new Member("https://i.imgur.com/TjpImof.jpg",
                "Nguyễn Thị Lan Anh",
                "01/06/1998",
                "Hải Dương - Hải Dương",
                "D16 - Team 1",
                "Member",
                "",
                "Tôi có thêm những người bạn, những người anh người chị luôn nhiệt tình không bao giờ ngừng truyền lửa cho đàn em. Cảm ơn IT");
        mData.child("Member").child("D16").push().setValue(nguyenThiLanAnh);

        Member nguyenKhacThanh = new Member("https://i.imgur.com/GjsypuY.jpg",
                "Nguyễn Khắc Thành",
                "16/06/1997",
                "Tuyên Quang",
                "D16 - Team 3(4)",
                "Member",
                "",
                ":)");
        mData.child("Member").child("D16").push().setValue(nguyenKhacThanh);

        Member ngoThanhCong = new Member("https://i.imgur.com/w6vdxvb.jpg",
                "Ngô Thành Công",
                "13/03/1998",
                "Vĩnh Phúc",
                "D16 - Team4 ",
                "Member",
                "Ken",
                "Là tuổi thanh xuân, là những trải nghiệm, là những người bạn, người anh em");
        mData.child("Member").child("D16").push().setValue(ngoThanhCong);

        Member hoangThiLanAnh = new Member("https://i.imgur.com/T3ajbIw.jpg",
                "Hoàng Thị Lan Anh",
                "17-03-1998",
                "Thiệu Hoá - Thanh Hoá",
                "D16 - team 3",
                "Member",
                "Ninja",
                "Yêu thương <3");
        mData.child("Member").child("D16").push().setValue(hoangThiLanAnh);

        Member nguyenTienPhong = new Member("https://i.imgur.com/5NWAyS6.jpg",
                "Nguyễn Tiến Phong",
                "23/04/1998",
                "Triệu Sơn - Thanh Hóa",
                "D16 - Team 1",
                "Member",
                "",
                "Code và hành là hai thứ tôi không thể nào quên được ở IT, chính những thứ ấy làm tôi yêu IT nhiều hơn");
        mData.child("Member").child("D16").push().setValue(nguyenTienPhong);

        Member duongThiLan = new Member("https://i.imgur.com/Vi66Kjj.jpg",
                "Dương Thị Lan",
                "20/07/1997",
                "Lục Nam - Bắc Giang",
                "D16 - Team 3",
                "Member",
                "",
                "IT là một gia đình mới của tôi và tôi sẽ cố gắng sống hết mình với nó <3");
        mData.child("Member").child("D16").push().setValue(duongThiLan);

        Member phamDucGiang = new Member("https://i.imgur.com/XVkSZ3Q.jpg",
                "Phạm Đức Giang",
                "05/03/1998",
                "Bình Lục - Hà Nam",
                "D16 - Team4 ",
                "Member",
                "",
                "...");
        mData.child("Member").child("D16").push().setValue(phamDucGiang);

        Member haThanhQuang = new Member("https://i.imgur.com/ggQMwkq.jpg",
                "Hà Thanh Quang",
                "15/03/1997",
                "Ý Yên - Nam Định",
                "D16 - Team 2",
                "Member",
                "Anh trai quốc dân",
                "ITPTIT Club với tôi thật tuyệt vời, nơi tôi được sống với đam mê của mình, được cháy với những dòng code");
        mData.child("Member").child("D16").push().setValue(haThanhQuang);

        Member nguyenPhuongNam = new Member("https://i.imgur.com/CmMmvoU.jpg",
                "Nguyễn Phương Nam",
                "02/10/1998",
                "Mỹ Hào - Hưng Yên",
                "D16 - Team 2",
                "Member",
                "",
                "ITPTIT Club isn't only a club, it's also a big family. We're brothers.");
        mData.child("Member").child("D16").push().setValue(nguyenPhuongNam);

        Member nhuThiHuyen = new Member("https://i.imgur.com/ff2wpB3.jpg",
                "Nhữ Thị Huyền",
                "11/06/1998",
                "Thanh Miện - Hải Dương",
                "D16 - Team1",
                "Member",
                "",
                "Là những lần hội họp cùng cả team, là có thêm nhiều bạn mới ......");
        mData.child("Member").child("D16").push().setValue(nhuThiHuyen);

        Member nguyenThiQuynh = new Member("https://i.imgur.com/UrzG0Id.png",
                "Nguyễn Thị Quỳnh",
                "14/04/1997",
                "Phú Thọ",
                "D16 - Team 1",
                "Member",
                "",
                "IT trong tôi là hành và hành của anh Cường");
        mData.child("Member").child("D16").push().setValue(nguyenThiQuynh);

        Member ngoQuangBao = new Member("https://i.imgur.com/LgKONvw.jpg",
                "Ngọ Quang Bảo",
                "16/04/1998",
                "Hiệp Hòa - Bắc Giang",
                "Team 4",
                "Member",
                "",
                "Những điều giản dị và những con người đáng yêu");
        mData.child("Member").child("D16").push().setValue(ngoQuangBao);
    }

    private void loadDataMemberD16() {
        mData.child("Member").child("D16").addChildEventListener(new ChildEventListener() {
            @Override
            public void onChildAdded(DataSnapshot dataSnapshot, String s) {
                Member member = dataSnapshot.getValue(Member.class);
                membersD16.add(member);
                adapterD16.notifyItemInserted(membersD16.size() - 1);
//                Toast.makeText(MemberActivity.this, "" + memberd16ngoquangbao.getMemberName(), Toast.LENGTH_SHORT).show();
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
                "D13 - Team 4",
                "Big Boss Team 4, Cựu phó Leader",
                "Mèo",
                "Tớ không quan tâm đâu, việc của tớ là giải cứu thế giới!");
        mData.child("Member").child("D13").push().setValue(hungManhDao);
    }

    private void loadDataMemberD13() {
        mData.child("Member").child("D13").addChildEventListener(new ChildEventListener() {
            @Override
            public void onChildAdded(DataSnapshot dataSnapshot, String s) {
                Member member = dataSnapshot.getValue(Member.class);
                membersD13.add(member);
                adapterD13.notifyItemInserted(membersD13.size() - 1);
//                Toast.makeText(MemberActivity.this, "" + memberd16ngoquangbao.getMemberName(), Toast.LENGTH_SHORT).show();
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
                Log.e("onChildAdded", member.getQueQuan());//load đc luôn còn gì vậy sao lần thứ 2 nó mới hiển thị ạ :(
                membersD12.add(member);
                adapterD12.notifyItemInserted(membersD12.size() - 1);
//                Toast.makeText(MemberActivity.this, "" + memberd16ngoquangbao.getMemberName(), Toast.LENGTH_SHORT).show();
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
                "Team",
                "Cựu chủ nhiệm",
                "",
                "(Anh Luyện là chủ nhiệm đời đầu của clb)");
        mData.child("Member").child("D12").push().setValue(luyenNguyen);
    }
}
