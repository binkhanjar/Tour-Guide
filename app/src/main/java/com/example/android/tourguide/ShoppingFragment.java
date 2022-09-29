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

public class ShoppingFragment extends Fragment {

    View view;
    private RecyclerView recyclerView;
    private List<Items> mList;

    public ShoppingFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_shopping, container, false);
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
        mList.add(new Items(getString(R.string.Boulevard), R.drawable.boulevard, getString(R.string.Boulevard_desc)));
        mList.add(new Items(getString(R.string.City_Mall), R.drawable.city_mall, getString(R.string.City_Mall_desc)));
        mList.add(new Items(getString(R.string.Amman_Center), R.drawable.amman_center, getString(R.string.Amman_Center_desc)));
        mList.add(new Items(getString(R.string.Aqaba), R.drawable.aqaba, getString(R.string.Aqaba_desc)));
        mList.add(new Items(getString(R.string.Jerash_Markets), R.drawable.jerashshop, getString(R.string.Jerash_Markets_desc)));
        mList.add(new Items(getString(R.string.Taj_Mall), R.drawable.taj_mall, getString(R.string.Taj_Mall_desc)));
    }
}

