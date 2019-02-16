package com.example.hessah.tourguideapp;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

public class EventFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View rootView = inflater.inflate(R.layout.fragment_event, container, false);

        ArrayList<Location> locations = new ArrayList<Location>();
        locations.add(new Location("Al Janadriyah Festival", "Jumada al-awwal 22"));
        locations.add(new Location("Eid al-Fitr", "Shawwal 1"));

        LocationAdapter adapter = new LocationAdapter(this.getActivity(), locations);
        ListView listView = rootView.findViewById(R.id.list);

        listView.setAdapter(adapter);

        return rootView;
    }

}
