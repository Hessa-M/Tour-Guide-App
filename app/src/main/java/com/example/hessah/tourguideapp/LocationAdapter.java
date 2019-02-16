package com.example.hessah.tourguideapp;


import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class LocationAdapter extends ArrayAdapter<Location> {


    public LocationAdapter(Activity context, ArrayList<Location> androidLocation) {
        super(context, 0, androidLocation);

    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        Location locationDetails = getItem(position);

        TextView nameTextView = (TextView) listItemView.findViewById(R.id.name_location);
        nameTextView.setText(locationDetails.getNameLocation());

        TextView infoTextView = (TextView) listItemView.findViewById(R.id.info_location);
        infoTextView.setText(locationDetails.getInfoLocation());

        ImageView imageView = (ImageView) listItemView.findViewById(R.id.image_location);
        if (locationDetails.hasImage()) {
            imageView.setImageResource(locationDetails.getImageResourceId());
            imageView.setVisibility(View.VISIBLE);
        } else {
            imageView.setVisibility(View.GONE);
        }



        return listItemView;
    }

}
