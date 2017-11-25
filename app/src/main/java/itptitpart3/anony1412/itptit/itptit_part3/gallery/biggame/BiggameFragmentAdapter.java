package itptitpart3.anony1412.itptit.itptit_part3.gallery.biggame;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by Anony1412 on 11/24/2017.
 */

public class BiggameFragmentAdapter extends FragmentPagerAdapter {

    public BiggameFragmentAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0: {
                return new FragmentBiggame0();
            }
            case 1: {
                return new FragmentBiggame1();
            }
            case 2: {
                return new FragmentBiggame2();
            }
            case 3: {
                return new FragmentBiggame3();
            }
            case 4: {
                return new FragmentBiggame4();
            }
            case 5: {
                return new FragmentBiggame5();
            }
            case 6: {
                return new FragmentBiggame6();
            }
            case 7: {
                return new FragmentBiggame7();
            }
            case 8: {
                return new FragmentBiggame8();
            }
            case 9: {
                return new FragmentBiggame9();
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
