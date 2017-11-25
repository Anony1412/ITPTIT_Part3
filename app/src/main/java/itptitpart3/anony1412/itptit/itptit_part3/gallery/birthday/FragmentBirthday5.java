package itptitpart3.anony1412.itptit.itptit_part3.gallery.birthday;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

import itptitpart3.anony1412.itptit.itptit_part3.R;

/**
 * Created by Anony1412 on 11/24/2017.
 */

public class FragmentBirthday5 extends Fragment {

    private ImageView img_Fragment_Birthday;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_birthday_5, container, false);
    }

    @Override
    public void onStart() {
        super.onStart();
        init();
    }

    private void init() {
        img_Fragment_Birthday = getActivity().findViewById(R.id.img_fragment_birthday_5);
        Picasso.with(getContext()).load("https://i.imgur.com/Puua31Y.jpg").into(img_Fragment_Birthday);
    }
}
