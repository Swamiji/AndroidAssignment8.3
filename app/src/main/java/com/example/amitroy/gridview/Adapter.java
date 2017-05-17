package com.example.amitroy.gridview;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;

/**
 * Created by AMIT ROY on 17-May-17.
 */

public class Adapter extends BaseAdapter {
    Context context;
    int[]img;
    public Adapter(Context context,int[]img){
    this.context=context;
        this.img=img;
    }
    @Override
    public int getCount() {
        return img.length;
    }

    @Override
    public Object getItem(int position) {
        return img[position];
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ImageView iv=new ImageView(context);
        iv.setImageResource(img[position]);
        iv.setScaleType(ImageView.ScaleType.CENTER_CROP);
        iv.setLayoutParams(new GridView.LayoutParams(200,200));
        return iv;
    }
}
