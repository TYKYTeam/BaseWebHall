package com.tyky.basewebhall.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;

import com.tyky.basewebhall.R;


/**
 * Created by lianghuiyong on 2016/7/20.
 */
public class GridViewAdapter extends BaseAdapter {
    private int[] imgids;
    private Context context;

    public GridViewAdapter(Context context, int[] imgs) {
        this.context = context;
        this.imgids = imgs;
    }

    @Override
    public int getCount() {
        return imgids.length;
    }

    @Override
    public Object getItem(int position) {
        return imgids[position];
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        MenuItem item;
        if (null == convertView) {
            item = new MenuItem();
            convertView = LayoutInflater.from(context).inflate(R.layout.gridview_item, null);
            item.img = (ImageView) convertView.findViewById(R.id.image);
            convertView.setTag(item);
        } else {
            item = (MenuItem) convertView.getTag();
        }
        item.img.setImageResource(imgids[position]);
        return convertView;
    }

    public final class MenuItem {
        ImageView img;
    }
}
