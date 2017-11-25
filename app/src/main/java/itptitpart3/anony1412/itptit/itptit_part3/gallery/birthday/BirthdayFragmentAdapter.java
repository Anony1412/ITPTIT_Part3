package itptitpart3.anony1412.itptit.itptit_part3.gallery.birthday;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by Anony1412 on 11/24/2017.
 */

public class BirthdayFragmentAdapter extends FragmentPagerAdapter {

    public BirthdayFragmentAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0: {
                return new FragmentBirthday0();
            }
            case 1: {
                return new FragmentBirthday1();
            }
            case 2: {
                return new FragmentBirthday2();
            }
            case 3: {
                return new FragmentBirthday3();
            }
            case 4: {
                return new FragmentBirthday4();
            }
            case 5: {
                return new FragmentBirthday5();
            }
            case 6: {
                return new FragmentBirthday6();
            }
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return 7;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return null;
    }
}
