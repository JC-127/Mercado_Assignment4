package edu.temple.mercado_assignment4;


import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class PictureAdapter extends BaseAdapter
{
    Context context;
    ArrayList<Picture> pics;
    LayoutInflater inflater;

    public PictureAdapter(Context context, ArrayList pics)
    {
        this.context = context;
        this.pics = pics;
        inflater = LayoutInflater.from(context);
    }

    @Override
    public int getCount()
    {
        return pics.size();
    }

    @Override
    public Object getItem(int position)
    {
        return pics.get(position);
    }


    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent)
    {
        convertView = inflater.inflate(R.layout.gridview_layout, null);

        ImageView picImg = convertView.findViewById(R.id.riderimg);
        picImg.setImageResource(pics.get(position).getImgID());

        TextView rideText = convertView.findViewById(R.id.riderText);
        rideText.setText(pics.get(position).getName());

        return convertView;
    }

}
