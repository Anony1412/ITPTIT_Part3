package itptitpart3.anony1412.itptit.itptit_part3.members.member_d15;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by Anony1412 on 11/25/2017.
 */

public class D15Adapter extends FragmentPagerAdapter {

    public D15Adapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0: {
                return new D15NguyenThanhLuan();
            }
            case 1: {
                return new D15LeDinhLoi();
            }
            case 2: {
                return new D15BuiThiCuc();
            }
            case 3: {
                return new D15DangBaoChien();
            }
            case 4: {
                return new D15NguyenVanThanh();
            }
            case 5: {
                return new D15DuyQui();
            }
            case 6: {
                return new D15HoangDucThanh();
            }
            case 7: {
                return new D15TaTaiLinh();
            }
            case 8: {
                return new D15NguyenThiMinhHuyen();
            }
            case 9: {
                return new D15NguyenTheMinhThang();
            }
            case 10: {
                return new D15DinhLenhQuangHuy();
            }
            case 11: {
                return new D15ChuXuanThang();
            }
            case 12: {
                return new D15NguyenNgocAnh();
            }
            case 13: {
                return new D15TranHoangViet();
            }
            case 14: {
                return new D15HaVanDuong();
            }
            case 15: {
                return new D15ToMinhHien();
            }
            case 16: {
                return new D15NguyenThiTuyetMai();
            }
            case 17: {
                return new D15DaoVanThang();
            }
            case 18: {
                return new D15VuThiThuyDung();
            }
            case 19: {
                return new D15TrinhNgocThach();
            }
            case 20: {
                return new D15PhamTrungThanh();
            }
            case 21: {
                return new D15NguyenDinhTai();
            }
            case 22: {
                return new D15PhungTienSy();
            }
            case 23: {
                return new D15PhamDucCuong();
            }
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return 24;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return null;
    }
}

