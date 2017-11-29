package itptitpart3.anony1412.itptit.itptit_part3.members.member_d16;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by Anony1412 on 11/25/2017.
 */

public class D16Adapter extends FragmentPagerAdapter {

    public D16Adapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0: {
                return new D16NguyenThiThanhTam();
            }
            case 1: {
                return new D16BuiDucPhi();
            }
            case 2: {
                return new D16PhamThiPhuong();
            }
            case 3: {
                return new D16NghiemPhuThiet();
            }
            case 4: {
                return new D16DinhCongHuy();
            }
            case 5: {
                return new D16NghiemXuanHop();
            }
            case 6: {
                return new D16VuDucTrieu();
            }
            case 7: {
                return new D16VuongVuBacSon();
            }
            case 8: {
                return new D16NguyenNgocTiep();
            }
            case 9: {
                return new D16TrinhThiNgocAnh();
            }
            case 10: {
                return new D16TaThiHuong();
            }
            case 11: {
                return new D16NguyenKhacMinh();
            }
            case 12: {
                return new D16TranNgocNam();
            }
            case 13: {
                return new D16HoangThiThuUyen();
            }
            case 14: {
                return new D16NguyenThiAnh();
            }
            case 15: {
                return new D16NguyenThaiDuong();
            }
            case 16: {
                return new D16TranQuangLinh();
            }
            case 17: {
                return new D16DoTienCuong();
            }
            case 18: {
                return new D16NguyenThiLanAnh();
            }
            case 19: {
                return new D16NguyenKhacThanh();
            }
            case 20: {
                return new D16NgoThanhCong();
            }
            case 21: {
                return new D16HoangThiLanAnh();
            }
            case 22: {
                return new D16NguyenTienPhong();
            }
            case 23: {
                return new D16DuongThiLan();
            }
            case 24: {
                return new D16PhamDucGiang();
            }
            case 25: {
                return new D16HaThanhQuang();
            }
            case 26: {
                return new D16NguyenPhuongNam();
            }
            case 27: {
                return new D16NhuThiHuyen();
            }
            case 28: {
                return new D16NguyenThiQuynh();
            }
            case 29: {
                return new D16NgoQuangBao();
            }
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return 30;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return null;
    }
}

