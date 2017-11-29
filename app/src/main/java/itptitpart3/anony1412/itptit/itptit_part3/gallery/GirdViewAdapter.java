package itptitpart3.anony1412.itptit.itptit_part3.gallery;

import android.content.Context;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

/**
 * Created by Anony1412 on 11/18/2017.
 */

public class GirdViewAdapter extends BaseAdapter {

    private Context context;
    private String[] items;

    public GirdViewAdapter(Context context, String[] urls) {
        super();
        this.context = context;
        this.items = urls;
    }

    @Override
    public int getCount() {
        return items.length;
    }

    @Override
    public Object getItem(int position) {
        return items[position];
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN)
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ImageView imageView;
        if (convertView == null) {
            imageView = new ImageView(context);
            convertView = imageView;
            imageView.setPadding(2, 2, 2, 2);
        } else {
            imageView = (ImageView) convertView;
        }
        Picasso.with(context)
                .load(items[position])
                .resize(150, 150)
                .centerCrop()
                .into(imageView);
        return convertView;
    }
}
