package com.example.hessah.tourguideapp;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

public class RestaurantFragment extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View rootView = inflater.inflate(R.layout.fragment_restaurant, container, false);

        ArrayList<Location> locations = new ArrayList<Location>();
        locations.add(new Location("Cabrito", "King Abdulaziz Road", R.drawable.ic_cabrito));
        locations.add(new Location("Burj Al Hamam", "akhassusi Street, at Aljawhri", R.drawable.ic_burj_al_hamam));
        locations.add(new Location("Al Orjouan", "Mekkah Road, Al Hada Area",  R.drawable.ic_al_orjouan));
        locations.add(new Location("Najd Village", "At Takhassusi St, Al Olaya", R.drawable.ic_najd_village));

        LocationAdapter adapter = new LocationAdapter(this.getActivity(), locations);
        ListView listView = rootView.findViewById(R.id.list);

        listView.setAdapter(adapter);

        return rootView;
    }
}
