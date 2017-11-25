package itptitpart3.anony1412.itptit.itptit_part3.gallery.tuyenthanhvien;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by Anony1412 on 11/24/2017.
 */

public class TuyenThanhVienFragmentAdapter extends FragmentPagerAdapter {

    public TuyenThanhVienFragmentAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0: {
                return new FragmentTuyenThanhVien0();
            }
            case 1: {
                return new FragmentTuyenThanhVien1();
            }
            case 2: {
                return new FragmentTuyenThanhVien2();
            }
            case 3: {
                return new FragmentTuyenThanhVien3();
            }
            case 4: {
                return new FragmentTuyenThanhVien4();
            }
            case 5: {
                return new FragmentTuyenThanhVien5();
            }
            case 6: {
                return new FragmentTuyenThanhVien6();
            }
            case 7: {
                return new FragmentTuyenThanhVien7();
            }
            case 8: {
                return new FragmentTuyenThanhVien8();
            }
            case 9: {
                return new FragmentTuyenThanhVien9();
            }
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return 10;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return null;
    }
}
