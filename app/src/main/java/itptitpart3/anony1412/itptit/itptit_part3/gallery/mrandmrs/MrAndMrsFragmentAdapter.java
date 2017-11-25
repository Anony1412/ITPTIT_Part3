package itptitpart3.anony1412.itptit.itptit_part3.gallery.mrandmrs;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by Anony1412 on 11/24/2017.
 */

public class MrAndMrsFragmentAdapter extends FragmentPagerAdapter {

    public MrAndMrsFragmentAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0: {
                return new FragmentMrAndMrs0();
            }
            case 1: {
                return new FragmentMrAndMrs1();
            }
            case 2: {
                return new FragmentMrAndMrs2();
            }
            case 3: {
                return new FragmentMrAndMrs3();
            }
            case 4: {
                return new FragmentMrAndMrs4();
            }
            case 5: {
                return new FragmentMrAndMrs5();
            }
            case 6: {
                return new FragmentMrAndMrs6();
            }
            case 7: {
                return new FragmentMrAndMrs7();
            }
            case 8: {
                return new FragmentMrAndMrs8();
            }
            case 9: {
                return new FragmentMrAndMrs9();
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
