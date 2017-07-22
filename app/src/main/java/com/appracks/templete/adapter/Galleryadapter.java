package com.appracks.templete.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.appracks.templete.Gallerygridview;
import com.appracks.templete.R;
import com.appracks.templete.dataobject.Gallery;

import java.util.ArrayList;

/**
 * Created by rezwan on 6/28/2016.
 */
public class Galleryadapter extends BaseAdapter{
    Context context;
    ArrayList<Gallery>galleryArrayList;

    public Galleryadapter(Context context, ArrayList<Gallery> galleryArrayList) {
        this.context = context;
        this.galleryArrayList = galleryArrayList;
    }

    @Override
    public int getCount() {
        return galleryArrayList.size();
    }

    @Override
    public Object getItem(int position) {
        return galleryArrayList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if(convertView==null){
            convertView = LayoutInflater.from(context).inflate(R.layout.custom_gridview, parent, false);
        }

        ImageView img_view=(ImageView)convertView.findViewById(R.id.img_view);
        Gallery g=galleryArrayList.get(position);

        img_view.setImageResource(g.getPictures());


        return convertView;
    }
}
