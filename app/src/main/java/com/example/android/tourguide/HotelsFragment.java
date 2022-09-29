package com.example.android.tourguide;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;


public class HotelsFragment extends Fragment {

    private RecyclerView recyclerView;
    private List<Items> mList;

    public HotelsFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view;
        view = inflater.inflate(R.layout.fragment_hotels, container, false);
        recyclerView = view.findViewById(R.id.recyclerView_xml);
        RecyclerViewAdapter recyclerAdapter = new RecyclerViewAdapter(getContext(), mList);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        recyclerView.setAdapter(recyclerAdapter);
        return view;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        mList = new ArrayList<>();
        mList.add(new Items(getString(R.string.Rotana_Hotel), R.drawable.royal, getString(R.string.Rotana_Hotel_desc)));
        mList.add(new Items(getString(R.string.Royal_Hotel), R.drawable.hiatamman, getString(R.string.Royal_Hotel_desc)));
        mList.add(new Items(getString(R.string.Marriott_hotel_petra), R.drawable.marriott_hotel_petra, getString(R.string.Marriott_hotel_petra_desc)));
        mList.add(new Items(getString(R.string.Holiday_inn_dead_sea_hotel), R.drawable.holiday_inn_dead_sea_hotel, getString(R.string.Holiday_inn_dead_sea_hotel_desc)));
        mList.add(new Items(getString(R.string.Marriott_hotel_dead_sea), R.drawable.marriott_hotel_dead_sea, getString(R.string.Marriott_hotel_dead_sea_desc)));
        mList.add(new Items(getString(R.string.Intercontinental_hotel_aqaba), R.drawable.intercontinental_hotel_aqaba, getString(R.string.Intercontinental_hotel_aqaba_desc)));
    }
}