package com.example.vinove.tablayoutwithicononly;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


public class NearbyFragment extends android.support.v4.app.Fragment {
    View view;

    public NearbyFragment() {


    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {

        view = inflater.inflate(R.layout.nearby_layout, container, false);

        return view;

    }
}
