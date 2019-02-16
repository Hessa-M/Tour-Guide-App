package com.example.hessah.tourguideapp;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

public class CoffeeShopsFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View rootView = inflater.inflate(R.layout.fragment_coffee_shops, container, false);

        ArrayList<Location> locations = new ArrayList<Location>();
        locations.add(new Location("Cafe Bateel ", "Tahlia Street, Opposite Localizer Mall "));
        locations.add(new Location("Java Time", " King Abdul Aziz Rd, Al Muruj"));
        locations.add(new Location("Chorisia Lounge ", "The Ritz-Carlton"));
        locations.add(new Location("Eric Kayser ", "Eastern Ring Road, Granada Center Gate 1"));
        locations.add(new Location("Paul ", "Prince Mohammad Ibn Abdul Aziz Road"));
        locations.add(new Location("Laduree ", "Olaya Street, Luxury Sweet Co."));

        LocationAdapter adapter = new LocationAdapter(this.getActivity(), locations);
        ListView listView = rootView.findViewById(R.id.list);

        listView.setAdapter(adapter);

        return rootView;
    }

}