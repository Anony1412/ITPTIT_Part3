package itptitpart3.anony1412.itptit.itptit_part3;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;

/**
 * Created by Anony1412 on 11/15/2017.
 */

public class ImageAdapter extends BaseAdapter {

    private Context mContext;

    private Integer [] mThumpIds = {
            R.drawable.mn_banh, R.drawable.mn_banh,
            R.drawable.mn_banh, R.drawable.mn_banh,
            R.drawable.mn_banh, R.drawable.mn_banh,
            R.drawable.mn_banh, R.drawable.mn_banh,
            R.drawable.mn_banh, R.drawable.mn_banh,
            R.drawable.mn_banh, R.drawable.mn_banh,
            R.drawable.mn_banh, R.drawable.mn_banh,
            R.drawable.mn_banh, R.drawable.mn_banh,
            R.drawable.mn_banh, R.drawable.mn_banh,
            R.drawable.mn_banh, R.drawable.mn_banh,
            R.drawable.mn_banh, R.drawable.mn_banh
    };

    public ImageAdapter(Context context) {
        this.mContext = context;
    }

    @Override
    public int getCount() {
        return mThumpIds.length;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    // create a new ImageView for each item referenced by the Adapter
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ImageView imageView;
        if (convertView == null) {
            imageView = new ImageView(mContext);
            imageView.setLayoutParams(new GridView.LayoutParams(85, 85));
            imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
            imageView.setPadding(8, 8, 8, 8);
        } else {
            imageView = (ImageView) convertView;
        }
        imageView.setImageResource(mThumpIds[position]);
        return imageView;
    }
}
