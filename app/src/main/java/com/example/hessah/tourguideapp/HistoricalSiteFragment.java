package com.example.hessah.tourguideapp;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

public class HistoricalSiteFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View rootView = inflater.inflate(R.layout.fragment_historical_site, container, false);

        ArrayList<Location> locations = new ArrayList<Location>();
        locations.add(new Location("Al Rajhi Grand Mosque", "Al Akheyar, Al Jazirah"));
        locations.add(new Location("National Museum", "Al-Muraba - King Abdul Aziz Historical Center"));
        locations.add(new Location("Masmak Citadel", "Al-Bathaa"));
        locations.add(new Location("Heet Cave", "Alkharj Road"));
        locations.add(new Location("Al Ma'athar Cave Park", "King Turki Bin Abdulaziz Road"));
        locations.add(new Location("Riyadh Zoo", "Al Malaz"));
        locations.add(new Location("Kingdom Centre Tower", "King Fahad Road"));
        locations.add(new Location("King Abdullah Park", "Al Amin Abdullah Al Ali Al Naeem"));
        locations.add(new Location("Old Dir'aiyah", "Thumeiry Street"));

        LocationAdapter adapter = new LocationAdapter(this.getActivity(), locations);
        ListView listView = rootView.findViewById(R.id.list);

        listView.setAdapter(adapter);

        return rootView;
    }
}