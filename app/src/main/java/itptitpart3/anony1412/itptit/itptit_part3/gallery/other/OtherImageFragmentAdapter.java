package itptitpart3.anony1412.itptit.itptit_part3.gallery.other;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by Anony1412 on 11/24/2017.
 */

public class OtherImageFragmentAdapter extends FragmentPagerAdapter {

    public OtherImageFragmentAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0: {
                return new FragmentOtherImage0();
            }
            case 1: {
                return new FragmentOtherImage1();
            }
            case 2: {
                return new FragmentOtherImage2();
            }
            case 3: {
                return new FragmentOtherImage3();
            }
            case 4: {
                return new FragmentOtherImage4();
            }
            case 5: {
                return new FragmentOtherImage5();
            }
            case 6: {
                return new FragmentOtherImage6();
            }
            case 7: {
                return new FragmentOtherImage7();
            }
            case 8: {
                return new FragmentOtherImage8();
            }
            case 9: {
                return new FragmentOtherImage9();
            }
            case 10: {
                return new FragmentOtherImage10();
            }
            case 11: {
                return new FragmentOtherImage11();
            }
            case 12: {
                return new FragmentOtherImage12();
            }
            case 13: {
                return new FragmentOtherImage13();
            }
            case 14: {
                return new FragmentOtherImage14();
            }
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return 15;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return null;
    }
}
