package itptitpart3.anony1412.itptit.itptit_part3.members;

/**
 * Created by Anony1412 on 11/22/2017.
 */

public class Member {
    private String urls;
    private String memberName;
    private String birthDay;
    private String queQuan;
    private String teamName;
    private String chucVu;
    private String bietHieu;
    private String ITtrongToi;

    public String getMemberName() {
        return memberName;
    }

    public void setMemberName(String memberName) {
        this.memberName = memberName;
    }

    public String getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(String birthDay) {
        this.birthDay = birthDay;
    }

    public String getQueQuan() {
        return queQuan;
    }

    public void setQueQuan(String queQuan) {
        this.queQuan = queQuan;
    }

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public String getChucVu() {
        return chucVu;
    }

    public void setChucVu(String chucVu) {
        this.chucVu = chucVu;
    }

    public String getBietHieu() {
        return bietHieu;
    }

    public void setBietHieu(String bietHieu) {
        this.bietHieu = bietHieu;
    }

    public String getITtrongToi() {
        return ITtrongToi;
    }

    public void setITtrongToi(String ITtrongToi) {
        this.ITtrongToi = ITtrongToi;
    }

    public Member(String urls, String memberName, String birthDay, String queQuan, String teamName, String chucVu, String bietHieu, String ITtrongToi) {

        this.urls = urls;
        this.memberName = memberName;
        this.birthDay = birthDay;
        this.queQuan = queQuan;
        this.teamName = teamName;
        this.chucVu = chucVu;
        this.bietHieu = bietHieu;
        this.ITtrongToi = ITtrongToi;
    }

    public String getUrls() {
        return urls;
    }

    public void setUrls(String urls) {
        this.urls = urls;
    }

    public Member() {

    }

    public Member(String urls, String memberName) {
        this.urls = urls;
        this.memberName = memberName;
    }
}
