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


public class HistoricalFragment extends Fragment {
    private RecyclerView recyclerView;
    private List<Items> mList;
    View view;

    public HistoricalFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_historical, container, false);
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
        mList.add(new Items(getString(R.string.Petra), R.drawable.petra, getString(R.string.petra_det)));
        mList.add(new Items(getString(R.string.Jerash), R.drawable.jerash, getString(R.string.jerash_det)));
        mList.add(new Items(getString(R.string.Ajloun_Castle), R.drawable.ajloun, getString(R.string.ajloun_det)));
        mList.add(new Items(getString(R.string.Roman_Theater), R.drawable.amman, getString(R.string.roman_theater_det)));
        mList.add(new Items(getString(R.string.Amman_Castle), R.drawable.amman_castal, getString(R.string.Amman_Castle_desc)));
        mList.add(new Items(getString(R.string.AlKarak_Castle), R.drawable.karak_castle, getString(R.string.karak_det)));

    }
}